package org.hillel.lessons.employeeApp;

public class Employee {

    private String name;

    private double hourlyRate;

    private double incomeSum;

    public Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void addIncomeSum(double incomeSum) {
        this.incomeSum += incomeSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", incomeSum=" + incomeSum +
                '}';
    }
}
