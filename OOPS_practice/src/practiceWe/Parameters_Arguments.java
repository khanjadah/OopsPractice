package practiceWe;

//Parameter- when we can request user to give value/argument when they use method.

public class Parameters_Arguments {

	public static void main(String[] args) {

		argument("Hurayra");
		System.out.println(add(5,6));
		
		Constructor cr = new Constructor("Hurayra",29);
		
		System.out.println(cr.name+"  "+cr.age);

	}

	public static void argument(String name) {

		System.out.println(name);
	}

	public static int add( int a, int b ) {

		return a+b;

	}



}
