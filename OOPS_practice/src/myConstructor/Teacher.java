package myConstructor;

public class Teacher {

	String name;
	int age;
	Long phone;



	// parameter constructor
	Teacher(String name,int age,Long phone){ 

		this.name = name;
		this.age = age;
		this.phone = phone;


		//String car = "honda";
		//String car = "mercidiez";




	}


	Teacher(){  //default constructor

		System.out.println("No value");
	}

	void displayInformation() {

		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Phone : "+phone);
		System.out.println("\n");


	}

}
