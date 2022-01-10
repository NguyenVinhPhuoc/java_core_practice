package com.axonactive.sun.exercise.ex3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FoodPricingTest {
    @Test
    @DisplayName("Should return food price = 30 when food grade = A ")
    public void foodPrice_AFoodGrade_ShouldReturnPrice30(){
        //Arrange
        var food= new FoodPricing("A");
        //Act
        var result = food.foodPrice();
        //Assert
        assertEquals(result,30);
    }

    @Test
    @DisplayName("Should return food price = 20 when food grade = B ")
    public void foodPrice_BFoodGrade_ShouldReturnPrice20(){
        //Arrange
        var food= new FoodPricing("B");
        //Act
        var result = food.foodPrice();
        //Assert
        assertEquals(result,20);
    }

    @Test
    @DisplayName("Should return food price = 10 when food grade = C ")
    public void foodPrice_CFoodGrade_ShouldReturnPrice10(){
        //Arrange
        var food= new FoodPricing("C");
        //Act
        var result = food.foodPrice();
        //Assert
        assertEquals(result,10);
    }

    @Test
    @DisplayName("Should throw NoSuchElementException when food grade = D ")
    public void foodPrice_DFoodGrade_ShouldReturnNoSuchElementException(){
        //Arrange
        var food= new FoodPricing("D");
        //Act
        var thrown = assertThrows(NoSuchElementException.class, food::foodPrice);
        //Assert
        assertEquals(thrown.getMessage(),"No such food grade value");
    }

    @Test
    @DisplayName("Should throw NoSuchElementException when food grade = Null ")
    public void foodPrice_NullFoodGrade_ShouldReturnNoSuchElementException(){
        //Arrange
        var food= new FoodPricing();
        //Act
        var thrown = assertThrows(NoSuchElementException.class, food::foodPrice);
        //Assert
        assertEquals(thrown.getMessage(),"No such food grade value");
    }
}