package _2023_09_29;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Monkey {
    private String name;
    private int age;
    private String colour;
    private boolean isHungry;
    private double weight;
}
