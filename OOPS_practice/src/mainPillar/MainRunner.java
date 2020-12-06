package mainPillar;

import inheritancePractice.*;

public class MainRunner {

	public static void main(String[] args) {
		
		
		
		Parent p = new Parent("Black", "Blue","Hurayra");
		
		p.hair();
		p.eye();
		p.lastName();
		
		
		
		Child c = new Child("Black","Brown","Banik","nayan");
		
		c.hair();
		c.eye();
		c.lastName();
		c.firstName();
		
		

	}

}
