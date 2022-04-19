package chapter2;

import java.util.Scanner;

public class N3_2_2 {
	public static void main(String[] args) {
		boolean leap;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		year = sc.nextInt();

		if (year % 4 != 0)
			leap = false;
		else if (year % 100 != 0)
			leap = true;
		else if (year % 400 != 0)
			leap = false;
		else
			leap = true;
		sc.close();
		if (leap == true)
			System.out.println(year + "年是闰年");
		else
			System.out.println(year + "年不是闰年");
		sc.close();
	}
}
