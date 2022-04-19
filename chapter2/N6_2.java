package chapter2;

public class N6_2 {
	public static void main(String[] args) {
		int sum = 0, result = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				result *= j;
			}
			sum += result;
			result = 1;
		}
		System.out.println("1到10的阶乘和是 " + sum + " 。");
	}
}
