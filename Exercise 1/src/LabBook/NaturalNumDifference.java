package LabBook;

import java.util.Scanner;

public class NaturalNumDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int i = sc.nextInt();
		NaturalNumDifference natural = new NaturalNumDifference();
		int result = natural.calculateDifference(i);
		System.out.println(result);
		sc.close();
	}

	public int calculateDifference(int num) {
		int sumOfSquare = 0;
		int squareOfSum = 0;
		for (int i = 1; i <= num; i++) {
			sumOfSquare += (int) Math.pow(i, 2);

		}
		System.out.println(sumOfSquare);
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			sum = sum + i;

		}
		squareOfSum = (int) Math.pow(sum, 2);
		System.out.println(squareOfSum);
		return sumOfSquare - squareOfSum;
	}

}
