package chapter2;

public class N7 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				break; // 此句改为 continue 结果又会怎样？
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
