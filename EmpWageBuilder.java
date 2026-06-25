package com.oops.employeewage;

public class EmpWageBuilder {

    private static final int PART_TIME_HOURS = 4;
    private static final int FULL_TIME_HOURS = 8;

    private CompanyEmpWage[] companyEmpWages;
    private int numberOfCompanies;

    public EmpWageBuilder() {

        companyEmpWages = new CompanyEmpWage[10];
        numberOfCompanies = 0;
    }

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

    public void computeEmployeeWages() {

        for (int i = 0; i < numberOfCompanies; i++) {

            CompanyEmpWage company = companyEmpWages[i];

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

            company.totalEmployeeWage =
                    totalHours * company.wagePerHour;
        }
    }

    public void displayEmployeeWages() {

        for (int i = 0; i < numberOfCompanies; i++) {

            System.out.println(companyEmpWages[i]);
        }
    }
}