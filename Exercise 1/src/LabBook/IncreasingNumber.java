package LabBook;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a increasing number or not :");
		int i = sc.nextInt();
		IncreasingNumber in = new IncreasingNumber();
		boolean result = in.checkNumber(i);
		System.out.println(result);
		sc.close();
	}

	public boolean checkNumber(int num) {
		boolean flag = false;
		int rem1 = num % 10;
		num = num / 10;
		int rem2 = num % 10;
		if (rem1 > rem2)
			flag = true;
		return flag;
	}

}
