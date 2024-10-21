package com.pluralsight;

import java.math.BigDecimal;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private BigDecimal payRate;
    private double hoursWorked;

    double getOvertimeHours () {
        return hoursWorked - 40;
    }

    double getRegularHours() {
        return getOvertimeHours() < 0 ? hoursWorked : hoursWorked - getOvertimeHours();
    }

    public BigDecimal getTotalPay() {

        return getOvertimeHours() < 0 ? BigDecimal.valueOf(hoursWorked).multiply(payRate)
                : (BigDecimal.valueOf(hoursWorked).multiply(payRate)).add
                (BigDecimal.valueOf(getOvertimeHours()).multiply(payRate));
    }
}
