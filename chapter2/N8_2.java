//编写一个 Java 程序，创建一个长度为 5 的整型数组，要求用户从键盘中为数组中每个元素输入一个值，然后输出数组元素中最大值和最小值
package chapter2;

import java.util.Scanner;

public class N8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min;
		int[] score = new int[5];
		// 输入部分
		for (int temp1 = 0; temp1 < score.length; temp1++) {
			System.out.print("请输入数组中第 " + (temp1 + 1) + " 个元素的值：");
			score[temp1] = sc.nextInt();
		}
		// 如果 a[i]大于 max，则把 a[i]赋值给 max，如果 a[i]小于 min，则把 a[i]赋值给 min
		max = min = score[0];
		System.out.println(max + " | " + min);
		// 计算部分
		for (int temp1 = 0; temp1 < score.length; temp1++) {
			max = score[temp1] > max ? score[temp1] : max;
			min = score[temp1] < min ? score[temp1] : min;
		}
		System.out.println("最大的数是：" + max + "\n最小的数是：" + min);
		sc.close();
	}
}