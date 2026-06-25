package com.oops.employeewage;

public class EmployeeWage {

    private final String company;
    private final int wagePerHour;
    private final int maxWorkingDays;
    private final int maxWorkingHours;

    private int totalEmployeeWage;

    private static final int PART_TIME_HOURS = 4;
    private static final int FULL_TIME_HOURS = 8;

    public EmployeeWage(String company,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void computeEmployeeWage() {

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

        totalEmployeeWage = totalHours * wagePerHour;
    }

    public void displayEmployeeWage() {

        System.out.println("Company Name : " + company);
        System.out.println("Total Employee Wage : " + totalEmployeeWage);
        System.out.println("--------------------------------");
    }
}