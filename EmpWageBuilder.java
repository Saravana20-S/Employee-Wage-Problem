package com.oops.employeewage;

public class EmpWageBuilder implements IComputeEmpWage {

    private static final int PART_TIME_HOURS = 4;
    private static final int FULL_TIME_HOURS = 8;

    private CompanyEmpWage[] companyEmpWages;
    private int numberOfCompanies;

    public EmpWageBuilder() {

        companyEmpWages = new CompanyEmpWage[10];
        numberOfCompanies = 0;
    }

    @Override
    public void addCompanyEmpWage(String company,
                                  int wagePerHour,
                                  int maxWorkingDays,
                                  int maxWorkingHours) {

        companyEmpWages[numberOfCompanies] =
                new CompanyEmpWage(
                        company,
                        wagePerHour,
                        maxWorkingDays,
                        maxWorkingHours);

        numberOfCompanies++;
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

            totalHours += workHours;
        }

        return totalHours * company.wagePerHour;
    }

    @Override
    public void computeEmployeeWages() {

        for (int i = 0; i < numberOfCompanies; i++) {

            CompanyEmpWage company =
                    companyEmpWages[i];

            company.totalEmployeeWage =
                    computeEmployeeWage(company);

            System.out.println(company);
        }
    }
}