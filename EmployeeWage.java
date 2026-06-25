package com.oops.employeewage;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Employee Wage Computation Program");

        EmpWageBuilder empWageBuilder =
                new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage(
                "DMart", 20, 20, 100);

        empWageBuilder.addCompanyEmpWage(
                "Reliance", 25, 22, 120);

        empWageBuilder.addCompanyEmpWage(
                "Infosys", 30, 24, 140);

        empWageBuilder.computeEmployeeWages();

        empWageBuilder.displayEmployeeWages();
    }
}