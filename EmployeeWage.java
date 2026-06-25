package com.oops.employeewage;

public class EmployeeWage {

    static final int PART_TIME_HOURS = 4;
    static final int FULL_TIME_HOURS = 8;

    public static int computeEmployeeWage(
            String company,
            int wagePerHour,
            int maxWorkingDays,
            int maxWorkingHours) {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < maxWorkingHours
                && totalDays < maxWorkingDays) {

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

        int totalWage = totalHours * wagePerHour;

        System.out.println("Company : " + company);
        System.out.println("Total Days : " + totalDays);
        System.out.println("Total Hours : " + totalHours);
        System.out.println("Employee Wage : " + totalWage);
        System.out.println("--------------------------------");

        return totalWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        computeEmployeeWage("DMart", 20, 20, 100);

        computeEmployeeWage("Reliance", 25, 22, 120);
    }
}