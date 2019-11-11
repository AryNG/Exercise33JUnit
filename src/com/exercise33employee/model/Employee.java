package com.exercise33employee.model;

public class Employee {
	
	private enum EmployeeType{
		salesEmployee, 
		salesManager
		
	}
	
	public double calculateBrute(String employeeType, double salesPerMonth, int extraHours) {
		double bruteSalary=0, salarySales=0, salaryHours=0;
		final double SALARY_EMPLOYEE = 1000.0;
		final double SALARY_MANAGER = 1500.0;
		final double SALES_FIRST_BONUS_LIMIT=1000.0;
		final double FIRST_BONUS=100.0;
		final double SALES_SECOND_BONUS_LIMIT=1500.0;
		final double SECOND_BONUS = 200.0;
		final double EXTRA_HOURS_PAYMENTS=20.0;
		
		if(salesPerMonth>=SALES_FIRST_BONUS_LIMIT && salesPerMonth<SALES_SECOND_BONUS_LIMIT) {
			salarySales = 100.0;
		}
		else if (salesPerMonth>=SALES_SECOND_BONUS_LIMIT) {
			salarySales = 200.0;
		}
		return bruteSalary=(employeeType.equals(EmployeeType.salesEmployee.toString()))?SALARY_EMPLOYEE+salarySales+salaryHours:SALARY_MANAGER+salarySales+salaryHours;
		
	}

}

