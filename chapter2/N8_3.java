package chapter2;

public class N8_3 {
	public static void main(String[] args) {
		int[] a = { 10, 50, 30, 20, 70, 40, 60, 80 };
		// 利用冒泡方法进行由小到大排序，小数在前。
		for (int i = 1; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int l = a[j];
					a[j] = a[j + 1];
					a[j + 1] = l;
					temp = 1;
				}
			}
			if (temp == 0)// 节省资源
				break;
		}
		System.out.print("数组排序后：");
		for (int k : a)
			System.out.print(k + " ");
	}
}
