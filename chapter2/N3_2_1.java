package chapter2;

import java.util.Scanner;

public class N3_2_1 {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份：");

		year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + "年是闰年");
		else
			System.out.println(year + "年不是闰年");
		sc.close();
	}
}