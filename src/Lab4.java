import java.awt.List;
import java.util.*;

public class Lab4 {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Lab4();
	}
	
	public Lab4() {
		ArrayList<Student> personalInfo = new ArrayList<>();
		
		System.out.println("Use the menu below to manage personal info held in the database.");
		System.out.println("");
		
		while (true) {
			// Give the user a list of their options
			System.out.println("1: Add a contact to the list.");
			System.out.println("2: Remove a contact from the list.");
			System.out.println("3: Display entries in the list.");
			System.out.println("0: Exit the program.");

			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			
			switch (userChoice) {
				
				case 1:
					addStudent(personalInfo);
					break;
				case 2:
					removeStudent(personalInfo);
					break;
				case 3:
					displayStudents(personalInfo);
					break;
				case 0:
					System.out.println("Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid value. Choose a number 0-3 only.");
					break;
			}
		}
	}
	
	private void addStudent(ArrayList<Student> personalInfo) {
		personalInfo.add(new Student());
		int index = personalInfo.size(); 
		Student tempStudent = new Student();
		System.out.println("Enter the student's first name");
		String userInput = input.nextLine();
		tempStudent.setFirstName(userInput);
		System.out.println("Enter the student's last name");
		userInput = input.nextLine();
		tempStudent.setLastName(userInput);
		System.out.println("Enter the student's major");
		userInput = input.nextLine();
		tempStudent.setMajor(userInput);
		System.out.println("Enter the student's GPA");
		userInput = input.nextLine();
		tempStudent.setGPA(userInput);
		System.out.println("Enter the student's UIN");
		userInput = input.nextLine();
		tempStudent.setUIN(userInput);
		System.out.println("Enter the student's netID");
		userInput = input.nextLine();
		tempStudent.setNetID(userInput);
		System.out.println("Enter the student's age");
		userInput = input.nextLine();
		tempStudent.setAge(userInput);
		System.out.println("Enter the student's gender");
		userInput = input.nextLine();
		tempStudent.setGender(userInput);
		
		personalInfo.set(index - 1, tempStudent);
		System.out.println("Student added successfully");
		return;
	}

	private void removeStudent(ArrayList<Student> personalInfo) {
		personalInfo.clear();
		System.out.println("All students removed.");
	}

	private void displayStudents(ArrayList<Student> personalInfo) {
		for(int i = 0; i < personalInfo.size(); i++) {
		System.out.println(personalInfo.get(i).firstName);
		System.out.println(personalInfo.get(i).lastName);
		System.out.println(personalInfo.get(i).major);
		System.out.println(personalInfo.get(i).gpa);
		System.out.println(personalInfo.get(i).UIN);
		System.out.println(personalInfo.get(i).netID);
		System.out.println(personalInfo.get(i).age);
		System.out.println(personalInfo.get(i).gender);
		}
	}
}
