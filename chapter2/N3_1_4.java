package chapter2;

import java.util.Scanner;

public class N3_1_4 { // 比较三个数的大小
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数:");
		a = sc.nextInt();
		System.out.print("请输入第二个数:");
		b = sc.nextInt();
		System.out.print("请输入第三个数:");
		c = sc.nextInt();

		int max = (max = (a > b ? a : b)) > c ? max : c;
		int min = (min = (a > b ? b : a)) > c ? c : min;
		int mid = a + b + c - max - min;
		System.out.println("那么从大到小排序， " + max + " 最大， "+mid+" 其次， "+min+" 最小。");
		sc.close();
	}
}
