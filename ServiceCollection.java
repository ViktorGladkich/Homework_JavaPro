package HR_Management;

import java.util.*;


public class ServiceCollection {
    private List<Employee> employees;
    private boolean bonusForTopDepartment = false;
    private boolean minusBonusDepartment = false;

    public ServiceCollection(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> sortName() {
        employees.sort(Comparator.comparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortSalary() {
        employees.sort(Comparator.comparing(Employee::getSalary));
        return employees;
    }

    public List<String> emplInfo() {
        List<String> employeesInfo = new ArrayList<>();
        for (Employee employee : employees) {
            employeesInfo.add(employee.getName() + " " + employee.getSurName() + " " + employee.getDepartment() + " " + employee.getGrade());
        }
        return employeesInfo;
    }

    // Средняя зарплата в депортаметах
    public Map<Department, Double> averageSalaryDepartment() {
        Map<Department, Double> getAverageSalary = new HashMap<>();
        Map<Department, Integer> departmentCount = new HashMap<>();
        for (Employee employee : employees) {
            Department department = employee.getDepartment();
            double salary = employee.getSalary();

            getAverageSalary.put(department, getAverageSalary.getOrDefault(department, 0.0) + salary);
            departmentCount.put(department, departmentCount.getOrDefault(department, 0) + 1);
        }
        for (Department department : getAverageSalary.keySet()) {
            double totalSalary = getAverageSalary.get(department);
            int count = departmentCount.get(department);
            double averageSalary = totalSalary / count;
            getAverageSalary.put(department, averageSalary);
        }
        return getAverageSalary;
    }

    //План работы
    public List<String> emplCompletedPlan() {
        List<String> completedPlan = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.isHasPlanBeenCompleted()) {
                String infoPlan = employee.getName() + " " + employee.getSurName() + " " + employee.getGrade();
                completedPlan.add(infoPlan);
            }
        }
        return completedPlan;
    }

    // Бонус для топ депортамента
    public void bonusForTopDepartment() {
        Map<Department, Integer> departmentCounts = new HashMap<>();
        Department topDepartment = null;
        int maxCount = 0;
        // Количество работников с выполненым планом в каждом депортаменте
        for (Employee employee : employees) {
            if (employee.isHasPlanBeenCompleted()) {
                Department department = employee.getDepartment();
                departmentCounts.put(department, departmentCounts.getOrDefault(department, 0) + 1);
            }
        }
        // Находим департамент с наибольшим числом сотрудников выполненый план
        for (Department department : departmentCounts.keySet()) {
            int count = departmentCounts.get(department);
            if (count > maxCount) {
                maxCount = count;
                topDepartment = department;
            }
        }
        // Повышаем бонуса для сотрудников в этом департаменте
        if (topDepartment != null) {
            for (Employee employee : employees) {
                if (employee.isHasPlanBeenCompleted() && employee.getDepartment() == topDepartment) {
                    double curentBonusPct = employee.getBonusPct();
                    employee.setBonusPct(curentBonusPct * 1.00);
                }
            }
            bonusForTopDepartment = true;
        }
    }

    // Понизить бонуса у департамента, у которого меньше всего сотрудников выполнило план
    public void minusBonusDepartment() {
        Map<Department, Integer> departmentCounts = new HashMap<>();
        Department bottomDepartment = null;
        int minCount = Integer.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee.isHasPlanBeenCompleted()) {
                Department department = employee.getDepartment();
                departmentCounts.put(department, departmentCounts.getOrDefault(department, 0) + 1);
            }
        }


        for (Department department : departmentCounts.keySet()) {
            int count = departmentCounts.get(department);
            if (count < minCount) {
                minCount = count;
                bottomDepartment = department;
            }
        }


        if (bottomDepartment != null) {
            for (Employee employee : employees) {
                if (employee.isHasPlanBeenCompleted() && employee.getDepartment() == bottomDepartment) {
                    double currentBonusPCT = employee.getBonusPct();
                    employee.setBonusPct(currentBonusPCT * 0.90);
                }
            }
            minusBonusDepartment = true;
        }
    }

    // У департамента продаж повышаем зарплату и бонус сотрудникам с выполненным планом
    public void EmplSaleDepartment() {
        Department salesEmplDepartment = Department.SALES;
        Map<Department, List<Employee>> emplDepartment = new HashMap<>();
        for (Employee employee : employees) {
            Department department = employee.getDepartment();
            emplDepartment.computeIfAbsent(department, i -> new ArrayList<>()).add(employee);

            // сотрудни в департаменте продаж которые выполнили план
            List<Employee> emplSalePlan = emplDepartment.get(salesEmplDepartment);
            if (emplSalePlan != null) {
                for (Employee saleEmployee : emplSalePlan) {
                    if (saleEmployee.isHasPlanBeenCompleted()) {

                        if (saleEmployee.getGrade() == Grade.A) {
                            double currentSalary = saleEmployee.getSalary();
                            double currentBonusPct = saleEmployee.getBonusPct();
                            saleEmployee.setSalary(currentSalary * 1.0);
                            saleEmployee.setBonusPct(currentBonusPct * 1.0);
                        } else {

                            int currentIndex = Arrays.asList(Grade.values()).indexOf(saleEmployee.getGrade());
                            if (currentIndex < Grade.values().length - 1) {
                                Grade newGrade = Grade.values()[currentIndex + 1];
                                saleEmployee.setGrade(newGrade);
                                double currentSalary = saleEmployee.getSalary();
                                saleEmployee.setSalary(currentSalary * 1.0);
                            }
                        }
                    }
                }
            }

        }
    }
}

