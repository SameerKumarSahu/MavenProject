package LabBook;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Fibonacci Series :");
		int num = sc.nextInt();
		Fibonacci fib = new Fibonacci();
		fib.fibonacci(num);
		fib.fibo(num);
		sc.close();
	}

	public void fibonacci(int num) {
		int a = 1;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i <= num; i++) {
			int sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}
	}

	public void fibo(int num) {
		int a = 1;
		int b = 1;
		System.out.print("\n"+a + " "+b);
		for (int i = 2; i <= num; i++) {
			
			//fibo(i);
			
		}

	}
}
