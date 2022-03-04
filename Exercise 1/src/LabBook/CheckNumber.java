package LabBook;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int i = sc.nextInt();
		CheckNumber check = new CheckNumber();
		boolean result = check.checkNum(i);
		System.out.println(result);
		sc.close();
	}

	public boolean checkNum(int i) {
		boolean flag = false;
		while (i % 2 == 0) {
			i = i / 2;
		}
		if (i == 1)
			flag = true;

		return flag;

	}

}
