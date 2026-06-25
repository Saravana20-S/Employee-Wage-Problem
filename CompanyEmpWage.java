package com.oops.employeewage;

import java.util.ArrayList;

public class CompanyEmpWage {

    public final String company;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;

    public int totalEmployeeWage;

    // UC13
    public ArrayList<Integer> dailyWages;

    public CompanyEmpWage(String company,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;

        dailyWages = new ArrayList<>();
    }

    @Override
    public String toString() {

        return "Company = " + company
                + ", Total Wage = "
                + totalEmployeeWage;
    }
}