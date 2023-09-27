package HR_Management;

import java.util.List;

public class SetUP {
    public static void setUp(List<Employee> employees) {
        Generator generator = new Generator();
        List<Employee> generatorEmpl = generator.empGen();
        employees.addAll(generatorEmpl);
    }
}
