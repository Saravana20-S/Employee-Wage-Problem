package com.oops.employeewage;

public interface IComputeEmpWage {

    void addCompanyEmpWage(String company,
                           int wagePerHour,
                           int maxWorkingDays,
                           int maxWorkingHours);

    void computeEmployeeWages();
}
