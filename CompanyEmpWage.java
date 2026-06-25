package com.oops.employeewage;

public class CompanyEmpWage {

    public final String company;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;

    public int totalEmployeeWage;

    public CompanyEmpWage(String company,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for "
                + company + " = "
                + totalEmployeeWage;
    }
}