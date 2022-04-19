package chapter2;

public class N9_2 {
	public static void main(String[] args) {
		// 声明一个不规则二维字符数组 snow，数组为 5 行
		String[][] snow = new String[5][];
		// 声明 snow 数组中每一行的长度
		for (int i = 0; i < snow.length; i++) {
			snow[i] = new String[i];
		}
		// 为 snow 数组中的每一元素赋值为"*"
		for (int i = 0; i < snow.length; i++) {
			for (int j = 0; j < snow[i].length; j++) {
				snow[i][j] = "*";
			}
		}
		// 输出 5 行图案
		for (int i = 1; i <= snow.length; i++) {
			// 输出图案中每一行“*”前的空格
			for (int k =0; k <snow.length-i; k++) {
				System.out.print(" ");
			}
			// 输出图案中每行的“*”
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
