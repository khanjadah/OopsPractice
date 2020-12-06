package methodOverride;

/*Declaring a method in subclass, which is already present in parent class is known as method overriding.
 * Benifit:- Code reuse,One Interface,multiple implement.Runtime polymorphism,
 * Rules:-Name,signature type,parameter must be same,a method declared as Final or static can't be overridden.
 * If a method can not be inherited , then it can't be overridden.
 */

public class Person {
	
	static String name;
	
	 static int age;
	
	void displayInformation() {
		
		System.out.println("Name : " + name);
		System.out.println("Age  : "+age);
		
	}

}
