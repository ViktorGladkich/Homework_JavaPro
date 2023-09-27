package HR_Management;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Generator.empGen();
        ServiceCollection serviceCollection = new ServiceCollection(employees);


        System.out.println("Список сотрудников, отсортированных по имени: ");
        serviceCollection.sortName().forEach(employee ->
                System.out.println(employee.getName() + " " + employee.getSurName())
        );


        System.out.println("\nСписок сотрудников, отсортированных по зарплате: ");
        serviceCollection.sortSalary().forEach(employee ->
                System.out.println(employee.getName() + " " + employee.getSurName() + ": " + employee.getSalary())
        );


        System.out.println("\nИмя, фамилия, департамент и грейд: ");
        serviceCollection.emplInfo().forEach(System.out::println);


        System.out.println("\nСредняя зарплата по департаментам: ");
        serviceCollection.averageSalaryDepartment().forEach((department, avgSalary) ->
                System.out.println(department + ": " + avgSalary)
        );


        System.out.println("\nИмя, фамилия и грейд у тех, кто выполнил план: ");
        serviceCollection.emplCompletedPlan().forEach(System.out::println);

        // Повысить бонуса для сотрудников лучшего департамента
        serviceCollection.bonusForTopDepartment();
        System.out.println("Бонусы для лучшего департамента ");




        // Понизить бонуса для сотрудников худшего департамента
        serviceCollection.minusBonusDepartment();
        System.out.println("Минус бонусы для худшего департамента ");



        // Обрабатывает департамент продаж которые выполнили план и повышает зарплату или грейд
        serviceCollection.EmplSaleDepartment();
        System.out.println("Департамент продаж обработан ");
    }
}

