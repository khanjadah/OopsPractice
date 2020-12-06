package methodOverload;

public class OverloadTest {

	public static void main(String[] args) {
		
		Overload ob = new Overload();
        ob.add();
        ob.add(20.5, 5.6);
        ob.add(5, 6, 7);
        ob.add(5, 5);

	}

}
