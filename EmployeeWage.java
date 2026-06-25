package com.oops.employeewage;

public class EmployeeWage {

    // Class Variables
    static final int WAGE_PER_HOUR = 20;
    static final int PART_TIME_HOURS = 4;
    static final int FULL_TIME_HOURS = 8;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    // Class Method
    public static int computeEmployeeWage() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < MAX_WORKING_HOURS
                && totalDays < MAX_WORKING_DAYS) {

            totalDays++;

            int empCheck = (int) (Math.random() * 3);

            int workHours;

            switch (empCheck) {

                case 1:
                    workHours = PART_TIME_HOURS;
                    break;

                case 2:
                    workHours = FULL_TIME_HOURS;
                    break;

                default:
                    workHours = 0;
            }

            totalHours += workHours;
        }

        return totalHours * WAGE_PER_HOUR;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalWage = computeEmployeeWage();

        System.out.println("Monthly Employee Wage = " + totalWage);
    }
}