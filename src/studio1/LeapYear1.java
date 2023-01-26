package studio1;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the current year?");
		int year = in.nextInt();
		int test1 = year % 4;
		int test2 = year % 100;
		boolean test3 = (test1 == 0 && test2 != 0 );
		System.out.print(test3);
	}

}
