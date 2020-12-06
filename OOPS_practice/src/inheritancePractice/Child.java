package inheritancePractice;

public class Child extends Parent{
	
	String firstName;

	public Child(String hairColor, String eyeColor, String lastName,String firstName) {
		super(hairColor, eyeColor, lastName);
		
		this.firstName = firstName;
	}
	
	
	public void firstName() {
		
		System.out.println("My first name is   : "+firstName);
	}
	

}
