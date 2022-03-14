package vrinda_OOPsLabSolution;

import java.util.Random;

public class CredentialService {
	String companyName = "greatlearning";

	private String generatePassword(){
		int length = 8;

		String numbers = "0123456789";
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String combinedString = Capital_chars + Small_chars + numbers + specialCharacters;
		int strLen = combinedString.length();
		Random random = new Random();

		StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++){
            int randomIndex = random.nextInt(strLen);
            sb.append(combinedString.charAt(randomIndex));
        }
 
        return sb.toString();
	}

	
	private String generateEmailAddress(String firstName, String lastName,int departmentChoice) {
		String emailAddress = firstName.toLowerCase() + lastName.toLowerCase() + "@";
		String departmentName = "";
		
		switch(departmentChoice) {
		case 1:
			departmentName = "tech";
			break;
		case 2:
			departmentName = "admin";
			break;
		case 3:
			departmentName = "hr";
			break;
		case 4:
			departmentName = "legal";
			break;
		default:
			System.out.println("Incorrect department choice!");
		}

		emailAddress = emailAddress + departmentName + "." + this.companyName + ".com";
		
		return emailAddress; 
	}

	void showCredentials(String firstName, String lastName, int departmentChoice) {
		String emailAddress = generateEmailAddress(firstName, lastName, departmentChoice);
		String password = generatePassword();
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		
		System.out.println("Dear "+ firstName + " your generated credentials are as follows");
		System.out.println("Email ---> " + emailAddress);
		System.out.println("Password ---> " + password);
	}
}
