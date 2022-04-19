package chapter2;

import java.util.Scanner;

public class N4_2 {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数的成绩：");
		score = sc.nextInt();
		switch (score / 10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println(score + "分是不及格");
			break;
		case 6:
			System.out.println(score + "分是及格");
			break;
		case 7:
			System.out.println(score + "分是中等");
			break;
		case 8:
			System.out.println(score + "分是良好");
			break;
		case 9:
		case 10:
			System.out.println(score + "分是优秀");
			break;
		default:
			System.out.println("数据错误");
		}
		sc.close();
	}
}
