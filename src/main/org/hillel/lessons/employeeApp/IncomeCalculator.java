package org.hillel.lessons.employeeApp;

public class IncomeCalculator {

    private double taxRate = 0.05;

    private double getCalculatedTaxSum(double income) {
        return income * taxRate;
    }

    public double getNetIncome(double hourlyRate, int hours) {

        double income = hourlyRate * hours;
        double calculatedTaxSum = getCalculatedTaxSum(income);

        return income - calculatedTaxSum;
    }
}
