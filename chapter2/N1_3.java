package chapter2;
import java.util.Scanner;
public class N1_3 {
	public static void main(String[] args) {
		Scanner pen=new Scanner(System.in);
		
		int a;				//整型变量
		System.out.print("从键盘输入一个整数：");
		a=pen.nextInt();
		System.out.println("你输入的整数是："+a);
		
		float b;			//单精度浮点变量
		System.out.print("从键盘输入一个单精度浮点数：");
		b=pen.nextFloat();
		System.out.println("你输入的单精度浮点数是："+b);
		
		double c;			//双精度浮点变量
		System.out.print("从键盘输入一个双精度浮点数：");
		c=pen.nextDouble();
		System.out.println("你输入的双精度浮点数是："+c);
		
		String s;			//字符串变量	//ERROR
		System.out.print("从键盘输入一个字符串：");
		s=pen.nextLine();
		s=pen.nextLine();
		System.out.println("你输入的字符串是："+s);
		pen.close();
	}
}