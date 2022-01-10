package com.axonactive.sun.exercise.ex3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.NoSuchElementException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodPricing {
    String foodGrade="";

    public double foodPrice() throws NoSuchElementException {
        switch (foodGrade){
            case "A" -> {
                return 30;
            }
            case "B" -> {
                return 20;
            }
            case "C" -> {
                return 10;
            }
            default -> throw new NoSuchElementException("No such food grade value");
        }
    }
}
