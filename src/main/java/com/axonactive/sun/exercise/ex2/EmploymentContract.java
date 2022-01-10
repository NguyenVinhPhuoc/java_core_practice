package com.axonactive.sun.exercise.ex2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmploymentContract {
    double annualSalary;
    double timeInAgency;

    public boolean isEligibleForALoan() {
        return (annualSalary > 29999.99999) && (timeInAgency > 1.99999);
    }
}