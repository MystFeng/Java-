package chapter2;
public class N2_1 {
	public static void main(String[] args) {
		int a=5,b=6;
		double c=5.0,d=6.0;
		//演示加法运算
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(c+"+"+d+"="+(c+d));
		//演示减法运算
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(c+"-"+d+"="+(c-d));
		//演示乘法运算
		System.out.println(a+"*"+b+"="+a*b);
		System.out.println(c+"*"+d+"="+c*d);
		//演示除法运算
		System.out.println(a+"/"+b+"="+a/b);
		System.out.println(c+"/"+d+"="+c/d);
		//演示取模运算
		System.out.println(a+"%"+b+"="+a%b);
		System.out.println(c+"%"+d+"="+c%d);
		//演示自增与自减运算
		System.out.println("a++="+(a++));
		System.out.println("++b="+(++b));
		System.out.println("-a++="+(-a++));
		System.out.println("-++b="+(-++b));
		System.out.println("(a++)+(++b)="+((a++)+(++b)));
		System.out.println("(-++c)+(-d++)="+((-++c)+(-d++)));
	}
}