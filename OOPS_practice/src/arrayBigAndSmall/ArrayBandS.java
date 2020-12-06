package arrayBigAndSmall;

import java.util.Scanner;

public class ArrayBandS {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[]number= new double[5];

		double sum =0;

		System.out.println("Please Enter 5 numbers : ");

		for(int i = 0; i<number.length; i++) {

			number[i]=  input.nextDouble();

		}

		//		number[1]=  input.nextDouble();
		//		number[2]=  input.nextDouble();
		//		number[3]=  input.nextDouble();
		//		number[4]=  input.nextDouble();

		for(int i = 0; i <number.length ; i++) {

			sum = sum+number[i]; 
		}

		//sum =number[0]+number[1]+number[2]+number[3]+number[4];


		double avg = sum/number.length;
		System.out.println("Total number sum is :"   + sum);
		System.out.println("The average is   :  "+avg);

		double max = number[0];
		double min = number[0];

		for(int i = 1; i<number.length; i++ ) {

			if(max<number[i]) {

				max = number[i];
			}

			if(min>number[i]) {

				min = number[i];
			}

		}
		System.out.println("The biggest number is :  "+ max);
		System.out.println("The Smallest number is :  "+ min);
		System.out.println("--------------------------------");
	}

}
