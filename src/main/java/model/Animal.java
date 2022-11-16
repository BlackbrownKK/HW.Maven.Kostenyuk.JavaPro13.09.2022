package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String kindOfAnimal;
    private String breed;
    private int age;
    private boolean gender;
    private String nameOfAnimal;
}
