package LabBook;

import java.util.Scanner;

public class sumOfCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take the input from the console
		System.out.println("Enter a number to find the sum of cube :-");
		int num = sc.nextInt();
		//calling the method
		sumofCube(num);
		sc.close();
	}
	public static void sumofCube(int num) {
		int sum = 0;
		while (num > 0) {
			int temp = num;
			// Getting the last digit
			int rem = temp % 10;
			// int cube = rem * rem * rem;
			// Type casting
			int cube = (int) Math.pow(rem, 3);// Math.pow() method returns a double data type
			sum += cube;
			// removing the last digit from the given number
			num /= 10;
		}
		System.out.println(sum);
	}
}
