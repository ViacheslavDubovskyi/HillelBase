package org.hillel.lessons.employeeApp;

import java.util.Scanner;

public class App {

    private Employee[] employeeArray;

    private void initEmployeeArray() {
        Employee first = new Employee("First", 15);
        Employee second = new Employee("Second", 20);

        employeeArray = new Employee[]{first, second};
    }

    private void calculateIncome() {
        IncomeCalculator incomeCalculator = new IncomeCalculator();
        Scanner scanner = new Scanner(System.in);
        for (Employee employee : employeeArray) {
            System.out.println("Please input hour for employee " + employee.getName());
            int hours = scanner.nextInt();
            double netIncome = incomeCalculator.getNetIncome(employee.getHourlyRate(), hours);
            employee.addIncomeSum(netIncome);
        }
        scanner.close();
    }

    private void printEmployees() {
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
    }

    public void runApp() {
        initEmployeeArray();
        calculateIncome();
        printEmployees();
    }
}

