package vrinda_OOPsLabSolution;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee("inda", "K");
		CredentialService s = new CredentialService();
		
		System.out.println("Please Enter Deparatment From the following:\r\n"
				+ "1. Technical\r\n"
				+ "2. Admin \r\n"
				+ "3. Human Resource\r\n"
				+ "4. Legal");
		
		/*
		 System.out.println("Please Enter Deparatment From the following:\r\n"
				+ "Enter 1 for Technical\r\n"
				+ "Enter 2 for Admin \r\n"
				+ "Enter 3 for Human Resource\r\n"
				+ "Enter 4 for Legal");
		*/
		
		int deptChoice = sc.nextInt();
		sc.close();
		
		s.showCredentials(employee.getFirstName(), employee.getLastName(), deptChoice);

	}

}
