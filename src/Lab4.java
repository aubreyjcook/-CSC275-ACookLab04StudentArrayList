import java.util.*;

public class Lab4 {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Lab4();
	}
	
	public Lab4() {
		/* debug note: testing object
		Student george = new Student();
		*/
		
		/* debug note: testing object output
		System.out.println(george.firstName);
		System.out.println(george.lastName);
		System.out.println(george.major);
		System.out.println(george.gpa);
		System.out.println(george.UIN);
		System.out.println(george.netID);
	    System.out.println(george.age);
        System.out.println(george.gender);
		*/
		
		ArrayList<Student> personalInfo = new ArrayList<Student>();
		
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
	
	private void addStudent(Student personalInfo[]) {
		for (int j = 0; j < personalInfo.length; j++) {
			if (personalInfo[j].name.equals("none")) {
				System.out.println("Enter the Student name below.");
				String userInput = input.nextLine();
				personalInfo[j].name = userInput;
				System.out.println("Enter the Student weight below.");
				userInput = input.nextLine();
				personalInfo[j].weight = userInput;
				System.out.println("Enter the Student value below.");
				userInput = input.nextLine();
				personalInfo[j].value = userInput;
				System.out.println("Enter the Student durability below.");
				userInput = input.nextLine();
				personalInfo[j].durability = userInput;
				System.out.println(personalInfo[j].name + " has been added successfully.");
				break;
			} else if (j == personalInfo.length - 1) {
				System.out.println("The personalInfo is full. You need to remove an Student to add a new one.");
			}
		}
		return;
	}

	private void removeStudent(Student personalInfo[]) {
		System.out.println("Enter the name of the Student to be removed.");
		String userInput = input.nextLine();
		
		for(int i = 0; i < personalInfo.length; i++) {
			if(personalInfo[i].name.equals(userInput)) {
				personalInfo[i].name = "none";
				personalInfo[i].weight = "none";
				personalInfo[i].value = "none";
				personalInfo[i].durability = "none";
				System.out.println("Student removed.");
				break;
			} else if (i == personalInfo.length - 1) {
				System.out.println("That Student is not in the personalInfo.");
			}
		}
		return;
	}

	private void sortStudents(Student personalInfo[]) {
		//checking for null values in the array
		int nullCounter = 0;
		
		for(int i= 0; i < personalInfo.length; i++) {
			if(personalInfo[i].name.equals("none")) {
				nullCounter++;					
			}
		}
		
		//moves all null values to the end of the array
		while(nullCounter > 0) {
			for(int i = 0; i < personalInfo.length; i++) {
				if(personalInfo[i].name.equals("none")) {
					for (int j = (i + 1); j < personalInfo.length; j++) {
						personalInfo[j - 1] = personalInfo[j];
					}
					personalInfo[personalInfo.length-1].name.equals("none");
					break;
				}
			}
			nullCounter--;
		}
		
		
		//sorting after moving null values to the end of the array
		for(int x = 0; x < personalInfo.length; x++) { //this for loop repeats the sorting process according to the length of the array to enhance sorting accuracy
			for (int i = 0; i < personalInfo.length-1; i++) {
				int minimum = i;
				//System.out.println(minimum);
				for (int j = i + 1; j < personalInfo.length; j++) {
					//System.out.println(j);
					//System.out.println(personalInfo[i].compareTo(personalInfo[minimum]));
					if(!personalInfo[j].name.equals("none")) {
						if(personalInfo[j].name.compareTo(personalInfo[minimum].name) < 0) {
							minimum = j;
							//Debug Note: Outputs array reassignments in real time. 
							//System.out.println("Swapping " + personalInfo[i] + " with " + personalInfo[minimum]);
							//System.out.println(Arrays.asList(personalInfo));
							Student transfer = personalInfo[i];
							personalInfo[i] = personalInfo[minimum];
							personalInfo[j] = transfer;
						}
					}
				}
			}
		}
		System.out.println("personalInfo sorted.");
		return;
	}

	private void searchStudents(Student personalInfo[]) {
		System.out.println("Enter the Student you wish to search for.");
		String userInput = input.nextLine();
		
		for(int i = 0; i < personalInfo.length; i++) {
			if(personalInfo[i].name.equals("none")) {
				continue;
			} else if (userInput.equals(personalInfo[i].name)) {
				System.out.println("The Student was found at section number " + (i + 1));
				return;
			}
		}
		System.out.println("The Student was not found in the cargo hold.");
	}

	private void displayStudents(Student personalInfo[]) {
		/*int count = 1;
		
		for(int i = 0; i < personalInfo.length; i++) {
			if(personalInfo[i].name.equals("none")) {
				count++;
			}
		}
		
		Student[] StudentsFound = new Student[10];
		
		if(count > 0) {
			System.out.println("There are " + count + " empty spaces in the personalInfo.");
		}
		
		for (int i = 0; i < personalInfo.length; i++) {
			if (!personalInfo[i].name.equals("none") && !(Arrays.asList(StudentsFound).contains(personalInfo[i]))) {
				
				count = Collections.frequency(Arrays.asList(personalInfo), personalInfo[i].name);					
				System.out.println("There are " + count + " " + personalInfo[i].name + " Students in the personalInfo.");
				StudentsFound[i] = personalInfo[i];
				
			}
		}*/
		 //simple output
		for(int i = 0; i<personalInfo.length; i++) {
			System.out.println(personalInfo[i].firstName);
			System.out.println(personalInfo[i].lastName);
			System.out.println(personalInfo[i].major);
			System.out.println(personalInfo[i].gpa);
			System.out.println(personalInfo[i].UIN);
			System.out.println(personalInfo[i].netID);
		    System.out.println(personalInfo[i].age);
	        System.out.println(personalInfo[i].gender);
		}
		
		
		
	}
}
