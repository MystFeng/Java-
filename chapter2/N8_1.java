package chapter2;

public class N8_1 {
	public static void main(String[] args) {
		// 声明一个整型数组 a,初始化为{1,2,3,4,5,6,7,8,9,10}
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("顺序输出：");
		for (int b = 1; b <= a.length; b++)
			System.out.print(a[b - 1] + " ");
		System.out.print("\n逆序输出：");
		for (int b = a.length; b > 0; b--)
			System.out.print(a[b - 1] + " ");
		
		System.out.print("\n利用 foreach 进行数组顺序输出："); 
		for(int b:a) {
		System.out.print(b + " "); }
	}
}
