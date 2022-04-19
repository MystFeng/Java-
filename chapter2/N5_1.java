package chapter2;

import java.util.Scanner;

public class N5_1 {
	public static void main(String[] args) {
		int a = 0, sum = 0, i = 1;
		Scanner sc = new Scanner(System.in);
		//in
		while (a == 0) {
			System.out.print("请输入一个介于 50 到 100 之间的整数：");

			if ((a = sc.nextInt()) < 50 || a > 100) {
				System.out.println("输错啦，是输入一个介于 50 到 100 之间的整数喔。");
				a = 0;
			}
		}

		//method - while
		sum = 0;
		i = 1;
		while (i <= a) {
			sum += i;
			i++;
		}
		System.out.println("利用 while 循环，求 1 到 " + a + " 之间的和是：" + sum + "。");

		//method - do while
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while (i <= a);
		System.out.println("利用 do-while 循环，求 1 到 " + a + " 之间的和是：" + sum + "。");
		sc.close();
	}
}
