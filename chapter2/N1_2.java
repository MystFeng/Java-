package chapter2;
public class N1_2 {
	public static void main(String[] args) {
		int a=100;//声明一个整型常量 a，赋值为 100
		int b=0100;//声明一个整型常量 b，赋值为 0100
		int c=0x100;//声明一个整型常量 c，赋值为 0x100
		int d=0b100;//声明一个整型常量 d，赋值为 0b100
		int e=1_000_000;//声明一个整型常量 e，赋值为 1_000_000
		double f=1.496E8;//声明一个双精度型常量 f，赋值为 1.496E8
		 /*声明一个字符串常量，内容是如下两句话：
		"How are you?"
		"you said 'how are you?'"
		*/
		String g="How are you?\"\\n\"You said 'how are you?'";
		System.out.println("十进制常量		a="+a);
		System.out.println("八进制常量		b="+b);
		System.out.println("十六进制常量	c="+c);
		System.out.println("二进制常量		d="+d);
		System.out.println("加下划线的常量	e="+e);
		System.out.println("科学计数法双精度型常量 f="+f);
		System.out.println("字符串常量		g="+g);
		System.out.println("正无穷="+Double.POSITIVE_INFINITY);
		System.out.println("负无穷="+Double.NEGATIVE_INFINITY);
		System.out.println("判断常量a是否是非数字"+Double.isNaN(a));
		}
}