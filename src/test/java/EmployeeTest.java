import org.junit.jupiter.api.RepeatedTest;
import org.lessons.java.calculator.Employee;

public class EmployeeTest {

	Employee emp = new Employee();

//	@RepeatedTest(5)
//	public void setNameTest() throws Exception {
//		String name = "Ali";
//		emp.setNome(name);
//	}

	@RepeatedTest(5)
	public void setNameTest1() throws Exception {
		String name = "";
		emp.setNome(name);
	}

//	@RepeatedTest(5)
//	public void setSurnameTest() throws Exception {
//		String surN = "Chouchene";
//		emp.setCognome(surN);
//	}

	@RepeatedTest(5)
	public void setSurnameTest1() throws Exception {
		String surN = "";
		emp.setCognome(surN);
	}

//	@RepeatedTest(5)
//	public void setDateTest() throws Exception {
//		String DOB = "07/08/1998";
//		emp.setDataN(DOB);
//	}

	@RepeatedTest(5)
	public void setDateTest1() throws Exception {
		String DOB = "07/08/2025";
		emp.setDataN(DOB);
	}
//
//	@RepeatedTest(5)
//	public void setRoleTest() throws Exception {
//		String role = "employee";
//		emp.setRuolo(role);
//	}

	@RepeatedTest(5)
	public void setRoleTest1() throws Exception {
		String role = "capo";
		emp.setRuolo(role);
	}
}
