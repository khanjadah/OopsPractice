package encapsulation;

/*Encapsulation is a process of packaging variables and methods into a single unit.
 * protecting data by declaring them as private.
 */

public class Person {
	
	private String name;
     private int age;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		
		this.name = name;
		
		
	}
	
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	
	public int getAge() {
		
		return age;
	}

}
