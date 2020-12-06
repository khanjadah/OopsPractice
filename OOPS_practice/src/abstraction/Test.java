package abstraction;

/* we can't create object on abstract class.
 * we can create refference variable.
 */
public class Test {

	public static void main(String[] args) {
		
		
		
		
		MobileUser mu; // here we create refference variable.
		mu = new Rahim();
		mu.sendMessage();
		mu.call();
		
		mu = new Karim();
		mu.sendMessage();
		mu.call();
	}

}
