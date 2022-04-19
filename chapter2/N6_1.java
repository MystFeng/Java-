package chapter2;

import java.util.Scanner;

public class N6_1 {
	public static void main(String[] args) {
		int num = 0, result = 1;
		Scanner sc = new Scanner(System.in);
		while (num < 1 || num > 10) {
			System.out.print("请输入一个介于 1~10 之间的数：");
			num = sc.nextInt();
		}

		for (int a = 1; a <= num; a++) {
			result *= a;
		}

		System.out.println(num + " 的阶乘是： " + result);
		sc.close();
	}
}
