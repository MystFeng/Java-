package chapter2;

import java.util.Scanner;

public class N3_1_3 { // 比较三个数的大小并排列
	public static void main(String[] args) {
		int a, b, c, max, mid, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("输入第一个数吧:");
		a = sc.nextInt();
		System.out.print("然后输入第二个:");
		b = sc.nextInt();
		System.out.print("现在请输入最后一个数:");
		c = sc.nextInt();

		if (a > b) {
			max = a;
			mid = c;
			min = b;
		} else {
			max = b;
			mid = c;
			min = a;
		}
		if (c > max) {
			mid = max;
			max = c;
		}

		if (c < min) {
			mid = min;
			min = c;
		}
		System.out.println("\n那么我就来大发慈悲地告诉你！最大的数是 " + max + " 哦。而最小的数呢？什么，竟然是。。。是 " + min + " ！");
		System.out.println("总结：" + max + "最大，" + mid + "次之，而" + min + "最小。");
		sc.close();
	}
}
