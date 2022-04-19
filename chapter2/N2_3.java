package chapter2;
public class N2_3 {
	public static void main(String[] args) {
		int a=5,b=6;
		//声明一个布尔类型变量 x,并赋值为 a>b 的结果
		boolean x=a>b;
		System.out.println("x="+x);
		//声明一个布尔类型变量 y,并赋值为变量 x 的逻辑非运算
		boolean y=!x;
		System.out.println("y="+y);
		//声明一个布尔类型变量 z,并赋值为变量 x 与 y 的逻辑与运算
		boolean z=x&&y;
		System.out.println("z="+z);
		//声明一个布尔类型变量 w,并赋值为变量 x 与 y 的逻辑或运算
		boolean w=x||y;
		System.out.println("w="+w);
		//逻辑与短路
		System.out.println("逻辑与短路");
		boolean m=true;
		boolean n=(a!=0&&(m=!m));
		System.out.println("n="+n+";m="+m);
		m=true;
		n=(a==0&&(m=!m));
		System.out.println("n="+n+";m="+m);
		//位与运算
		System.out.println("位与运算");
		m=true;
		n=(a!=0&(m=!m));
		System.out.println("n="+n+";m="+m);
		m=true;
		n=(a==0&(m=!m));
		System.out.println("n="+n+";m="+m);
		//逻辑或短路
		System.out.println("逻辑或短路");
		m=true;
		n=(a!=0||(m=!m));
		System.out.println("n="+n+";m="+m);
		m=true;
		n=(a==0||(m=!m));
		System.out.println("n="+n+";m="+m);
		//位或运算
		System.out.println("位或操作");
		m=true;
		n=(a!=0|(m=!m));
		System.out.println("n="+n+";m="+m);
		m=true;
		n=(a==0|(m=!m));
		System.out.println("n="+n+";m="+m);
		}
}
