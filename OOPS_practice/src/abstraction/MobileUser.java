package abstraction;

/* Abstraction is the process of hiding the implimentation details and showing only the functionality-
 * to the user.
 * 
 * There are 2 ways to achieve abstraction in java-
 * 1).Abstract class (0 to 100%).
 * 2).Interface (Achieve 100% Abstraction).
 * 
 * If the method is abstract, Class should be abstract.
 * Abstract method has no body.
 * Abstract method ends with a  semicolon.
 * It must be in Abstract class.
 * It must be overridden.
 * It can never be Final and static.
 * Abstract class have abstract and non abstract method.
 *
 */

public abstract class MobileUser {
	
	 abstract void sendMessage();
	
	
	
	void call() {   // non abstract method.
		
		System.out.println("call method");
	}

}
