package chapter2;

import java.util.Scanner;

public class N3_3_2 {
	public static void main(String[] args) {
		double score;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个成绩：");
		score=sc.nextDouble();
		if(score<=100&&score>=0)
			if(score<90)
				if(score<80)
					if(score<70)
						if(score<60)
							System.out.println("学生成绩不及格。");
						else
							System.out.println("学生成绩及格。");
					else
						System.out.println("学生成绩为中。");
				else
					System.out.println("学生成绩为良。");
			else
				System.out.println("学生成绩为优。");
		else
			System.out.println("成绩非法，请重新输入");
		sc.close();
		}
}
