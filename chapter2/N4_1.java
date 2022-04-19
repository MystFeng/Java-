package chapter2;

import java.util.Scanner;

public class N4_1 {
	public static void main(String[] args) {
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("请随意输入一个星期中，某天的大写汉子序数，我将告诉你那一天是星期几喔：");
	s=sc.nextLine();
	switch(s)
	{
	case "一":
		System.out.println("这天是星期一!");
	case "二":
		System.out.println("这天是星期二!");
	case "三":
		System.out.println("这天是星期三!");
	case "四":
		System.out.println("这天是星期四!");
	case "五":
		System.out.println("这天是星期五!");
	case "六":
		System.out.println("这天是星期六！");
	case "七":
		System.out.println("这天是星期日！");
	}
	 sc.close();
	}
}
