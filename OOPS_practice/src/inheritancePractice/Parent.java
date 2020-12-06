package inheritancePractice;

public class Parent {
	
	String hairColor;
	String eyeColor;
	String lastName;
	
	
	public Parent(String hairColor,String eyeColor,String lastName){
		
		this.hairColor = hairColor;
		this.eyeColor = eyeColor;
		this.lastName = lastName;
		
		}
	
	public void hair() {
		
		System.out.println("My hair color is : "+hairColor);
		
	}
	
    public void eye() {
		
		System.out.println("My Eye color is : "+eyeColor);
		
	}
    
    public void lastName() {
		
		System.out.println("My last Name  is : "+lastName);
		
		System.out.println("\n");
		
	}

}
