package com.oops.employeewage;

import java.util.ArrayList;

public class EmpWageBuilder implements IComputeEmpWage {

    private static final int PART_TIME_HOURS = 4;
    private static final int FULL_TIME_HOURS = 8;

    private ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {

        companyEmpWageList = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(String company,
                                  int wagePerHour,
                                  int maxWorkingDays,
                                  int maxWorkingHours) {

        CompanyEmpWage companyEmpWage =
                new CompanyEmpWage(
                        company,
                        wagePerHour,
                        maxWorkingDays,
                        maxWorkingHours);

        companyEmpWageList.add(companyEmpWage);
    }

    private int computeEmployeeWage(
            CompanyEmpWage company) {

        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < company.maxWorkingHours
                && totalDays < company.maxWorkingDays) {

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

            int dailyWage =
                    workHours * company.wagePerHour;

            company.dailyWages.add(dailyWage);

            totalHours += workHours;
        }

        return totalHours * company.wagePerHour;
    }

    @Override
    public void computeEmployeeWages() {

        for (CompanyEmpWage company
                : companyEmpWageList) {

            company.totalEmployeeWage =
                    computeEmployeeWage(company);

            System.out.println(company);

            System.out.println(
                    "Daily Wages : "
                            + company.dailyWages);

            System.out.println("-------------------");
        }
    }
}