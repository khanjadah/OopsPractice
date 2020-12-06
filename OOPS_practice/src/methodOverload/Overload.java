package methodOverload;

/*Method Overload:- 1).Same method names, 2).Parameter List are different, 3).inside the same class
 * 
 * 
 */
public class Overload {

	void add(int a, int b) {

		System.out.println(a+b);

	}

	void add(int a, int b, int c) {

		System.out.println(a-b+c);

	}

	void add(double a, double b) {

		System.out.println(a+b);

	}

	void add() {

		System.out.println("No parameter");

	}

}
