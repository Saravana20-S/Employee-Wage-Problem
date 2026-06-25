package com.oops.employeewage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int PART_TIME_HOURS = 4;
    static final int FULL_TIME_HOURS = 8;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;


    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

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
            totalWage += workHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Days = " + totalDays);
        System.out.println("Total Hours = " + totalHours);
        System.out.println("Monthly Wage = " + totalWage);
    }

}