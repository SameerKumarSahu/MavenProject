package LabBook;

import java.util.Scanner;

public class naturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		naturalNumber natural = new naturalNumber();

		int sum = natural.calculateSum(num);
		System.out.println("Sum of natural number which is divisible by 3 or 5 is : " + sum);
		sc.close();
	}

	public int calculateSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				// System.out.println(i);
				sum += i;
			}
		}

		return sum;
	}

}
