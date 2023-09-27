package HR_Management;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private static final Random random = new Random();

    public static String empIdGen() {
        return "EMP" + String.format("%278x", random.nextInt(93156136));
    }

    public static List<Employee> empGen() {
        List<Employee> employees = new ArrayList<>();
        Faker faker = new Faker();

        for (int i = 0; i < 50; i++) {
            Department department = Department.values()[random.nextInt(Department.values().length)];
            employees.add( new Employee (
                    empIdGen(),
                    faker.name().firstName(),
                    faker.name().lastName(),
                    Grade.values()[random.nextInt(Grade.values().length)],
                    67000 + random.nextInt(67000),
                    random.nextDouble() * 10.0,
                    random.nextBoolean(),
                    department

            ));
        }
        return employees;
    }
}