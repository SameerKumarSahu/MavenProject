package LabBook;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		int i, j, count = 0;
		for (i = 2; i <= num; i++) {
			for (j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(i);
			count = 0;
		}

	}
}