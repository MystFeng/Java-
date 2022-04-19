package chapter2;

//九九乘法表
public class N6_3 {
	public static void main(String[] args) {
		int i, j, n = 9;
		//ui part
		System.out.print(" * |");
		for (i = 1; i <= n; i++) {
			System.out.print(" " + i);
		}
		System.out.print("\n---|--------------------------\n");

		//计算 part
		for (i = 1; i <= n; i++) {
			System.out.print(" " + i + " |");
			for (j = 1; j <= i; j++) {
				System.out.print(" " + i * j);
			}
			System.out.println();
		}

	}
}
