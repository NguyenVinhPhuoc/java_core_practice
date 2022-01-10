package com.axonactive.sun.exercise.ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmploymentContractTest {
    @Test
    @DisplayName("Should return False when Annual salary = 0 and Time in agency = 0")
    public void isEligibleForALoan_0AnnualSalary0TimeInAgency_ShouldReturnFalse(){
        //Arrange
        var employeeContract = new EmploymentContract(0,0);
        //Act
        var result = employeeContract.isEligibleForALoan();
        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return False when Annual salary = 29000 and Time in agency = 2")
    public void isEligibleForALoan_29000AnnualSalary2TimeInAgency_ShouldReturnFalse(){
        //Arrange
        var employeeContract = new EmploymentContract(29000,2);
        //Act
        var result = employeeContract.isEligibleForALoan();
        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return True when Annual salary = 30000 and Time in agency = 2")
    public void isEligibleForALoan_30000AnnualSalary2TimeInAgency_ShouldReturnFalse(){
        //Arrange
        var employeeContract = new EmploymentContract(30000,2);
        //Act
        var result = employeeContract.isEligibleForALoan();
        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return True when Annual salary = 31000 and Time in agency = 2")
    public void isEligibleForALoan_31000AnnualSalary2TimeInAgency_ShouldReturnFalse(){
        //Arrange
        var employeeContract = new EmploymentContract(31000,2);
        //Act
        var result = employeeContract.isEligibleForALoan();
        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return False when Annual salary = 30000 and Time in agency = 1.99")
    public void isEligibleForALoan_3000AnnualSalary199TimeInAgency_ShouldReturnFalse(){
        //Arrange
        var employeeContract = new EmploymentContract(31000,1.99);
        //Act
        var result = employeeContract.isEligibleForALoan();
        //Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return True when Annual salary = 30000 and Time in agency = 2.01")
    public void isEligibleForALoan_30000AnnualSalary201TimeInAgency_ShouldReturnFalse(){
        //Arrange
        var employeeContract = new EmploymentContract(31000,2);
        //Act
        var result = employeeContract.isEligibleForALoan();
        //Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return False when Annual salary = null and Time in agency = null")
    public void isEligibleForALoan_NullAnnualSalaryNullTimeInAgency_ShouldReturnFalse(){
        //Arrange
        var employeeContract = new EmploymentContract();
        //Act
        var result = employeeContract.isEligibleForALoan();
        //Assert
        assertFalse(result);
    }
}