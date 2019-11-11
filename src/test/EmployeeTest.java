package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.exercise33employee.model.Employee;

class EmployeeTest {

	/*@Test
	void testCalculateBrute1() {
		fail("Not yet implemented");
		
	}*/

	@Test
	void testCalculateBrute2() {
		//fail("Not yet implemented");
		Employee myEmployee =  new Employee();
		//System.out.println("Brute Salary: "+myEmployee.calculateBrute("salesEmployee",0 , 0));
		double actualValue=myEmployee.calculateBrute("salesEmployee",0, 0);
		double expectedValue=1000.0;
		assertEquals(expectedValue, actualValue);
		
	}
	@Test
	void testCalculateBrute3() {
		//fail("Not yet implemented");
		Employee myEmployee =  new Employee();
		//System.out.println("Brute Salary: "+myEmployee.calculateBrute("salesEmployee",0 , 0));
		double actualValue=myEmployee.calculateBrute("salesEmployee",0, 0);
		double expectedValue=1200.0;
		assertEquals(expectedValue, actualValue);
		
	}
}
