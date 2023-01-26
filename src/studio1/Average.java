package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for integer 1:");
		int n1 = in.nextInt();
		System.out.println("Enter value for integer 2:");
		int n2 = in.nextInt();
		int total = n1 + n2;
		double average = total / 2;
		System.out.print("the average of your integers is " + average);
		
	
	}

}
