package methodOverride;

public class Test {

	public static void main(String[] args) {
		

		Teacher t1 = new Teacher();
		t1.age = 69;
		t1.name = "Nayan.";
		t1.qualification = "Jack & Coke.";
		t1.displayInformation();
		
		
		Teacher t2 = new Teacher();
		t2.age =22;
		t2.name ="Hurayra";
		t2.qualification ="QA";
		t2.displayInformation();

	}

}
