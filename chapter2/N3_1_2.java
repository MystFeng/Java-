package chapter2;

import java.util.Scanner;

public class N3_1_2 { // 比较三个数的大小
	public static void main(String[] args) {
		int a, b, c, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type the first number:");
		a = sc.nextInt();
		System.out.print("Please type the second number:");
		b = sc.nextInt();
		System.out.print("Please type the third number:");
		c = sc.nextInt();

		if (a > b) {
			if (b > c) {
				max = a;
				min = c;
			} else if (a > c) {
				max = a;
				min = b;
			} else {
				max = c;
				min = b;
			}
		} else if (a > c) {
			max = b;
			min = c;
		} else if (b > c) {
			max = b;
			min = a;
		} else {
			max = c;
			min = a;
		}
		System.out.println("\nThe largest number is " + max + ".");
		System.out.println("The smallest number is " + min + ".");
		sc.close();
	}
}
