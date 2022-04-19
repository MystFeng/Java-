package chapter2;

public class N9_1 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}
		
		System.out.println("利用for语句实现数组元素的输出");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("利用foreach语句实现数组元素的输出");
		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
