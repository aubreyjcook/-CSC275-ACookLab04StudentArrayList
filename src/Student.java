
public class Student {
	// Declare attributes here
	public String firstName = "none";
	public String lastName = "none";
	public String major = "none";
	public String gpa = "4.0";
	public String UIN = "0";
	public String netID = "none";
	public String age = "0";
	public String gender = "none";
		
	// Create an overridden constructor here
	Student(){}
	
	public Student(String firstName, String lastName, String major, String gpa, String UIN, String netID, String age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.gpa = gpa;
		this.UIN = UIN;
		this.netID = netID;
		this.age = age;
		this.gender = gender;
	}	
		
	// Create accessors and mutators for your traits
	
	//accessors/getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getGPA() {
		return gpa;
	}
	
	public String getUIN() {
		return UIN;
	}
	
	public String getNetID() {
		return netID;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	//mutators/setters
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public void setMajor(String newMajor) {
		this.major = newMajor;
	}
	
	public void setGPA(String newGPA) {
		this.gpa = newGPA;
	}
	
	public void setUIN(String newUIN) {
		this.UIN = newUIN;
	}
	
	public void setNetID(String newNetID) {
		this.netID = newNetID;
	}
	
	public void setAge(String newAge) {
		this.age = newAge;
	}
	
	public void setGender(String newGender) {
		this.gender = newGender;
	}	
	
	/*
	public void addInfo(String addfirstName, String addlastName, String addmajor, String addgpa, String addUIN, String addnetID, String addage, String addgender) {
		firstName = addfirstName;
		lastName = addlastName;
		major = addmajor;
		gpa = addgpa;
		UIN = addUIN;
		netID = addnetID;
		age = addage;
		gender = addgender;
	}
	
	public void addInfo(String addfirstName, String addlastName, String addmajor, String addgpa, String addUIN, String addnetID, String addage, String addgender) {
		firstName = addfirstName;
		lastName = addlastName;
		major = addmajor;
		gpa = addgpa;
		UIN = addUIN;
		netID = addnetID;
		age = addage;
		gender = addgender;
	}
	*/
}
