package chapter2;

import java.util.Scanner;

public class N5_3_1 {
	public static void main(String[] args) {
		int nu = -1, bit = 0;
		System.out.print("请输入一个int型整数:");
		Scanner sc = new Scanner(System.in);
		nu = sc.nextInt();

		// 1.判断数字是几位数
		int nu1 = nu;
		while (nu1 != 0) {
			nu1 /= 10;
			++bit;
		}
		System.out.println("数字 " + nu + " 是 " + bit + " 位数。");

		// 2.顺序输出每一位数字
		nu1 = nu;
		int a = 0;
		int[] nus = new int[bit];
		System.out.print("顺序输出各位数值是：");

		if (nu1 < 0) {
			nu1 *= -1;
			System.out.print("-");
		}
		do {
			nus[a] = nu1 % 10;
			nu1 /= 10;
			a++;
		} while (nu1 != 0);

		for (a = bit - 1; a >= 0; --a) {
			System.out.print(nus[a]);
		}
		System.out.print("。\n");

		// 3.逆序输出每一位数字
		nu1 = nu;
		a = 0;
		System.out.print("逆序输出各位数值是：");

		if (nu1 < 0) {
			nu1 *= -1;
			System.out.print("-");
		}

		do {
			a = nu1 % 10;
			nu1 /= 10;
			System.out.print(a);
		} while (nu1 != 0);

		System.out.print("。\n");

		sc.close();
	}
}
