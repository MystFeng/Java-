package chapter2;

import java.util.Scanner;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
*/
public class N5_2 {
	public static void main(String[] args) {
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"欢迎来到 Steam 控制台！\nSteam —— 顶级在线游戏平台！\n在代理控制台中，我们将真正与 Steam 客户端联络，真正打开您的游戏！当然，前提是您拥有并下载了这个游戏，没有下载的话您将被引导到下载页面，哈哈。\n\n");
		System.out.println("热门游戏：");
		System.out.println("1 赛博朋克 2077");
		System.out.println("2 反恐精英：全球攻势");
		System.out.println("3 糖豆人：终极淘汰赛");
		System.out.println("4 双人成行");
		System.out.println("5 Mirror");
		System.out.println("6 Apex 英雄");
		System.out.println("7 绝地求生");
		System.out.println("8 英雄联盟");
		System.out.println("\nQ 退出");

		System.out.print("\n你要玩什么? ");
		while ((key = sc.nextLine()) != null) {
			switch (key) {
			case "Q":
			case "q":
				System.out.print("确定要退出 Steam 代理控制台? 按 Y 继续 按任意键取消： ");
				if (sc.nextLine().equalsIgnoreCase("y"))
					System.exit(0);
				else
					break;
			case "1":
				System.out.println("正在启动 赛博朋克 2077...");
				// steam://run/1091500
				break;
			case "2":
				System.out.println("正在启动 反恐精英：全球攻势...");
				break;
			case "3":
				System.out.println("正在启动 糖豆人: 终极淘汰赛...");
				break;
			case "4":
				System.out.println("正在启动 It takes two...");
				break;
			case "5":
				System.out.println("正在启动 Mirror...\n嗯？嗯？？？！你是什么成分！");
				break;
			case "6":
				System.out.println("正在启动 Apex 英雄...\n注意：Origin可能会导致您启动失败");
				break;
			case "7":
				System.out.println("正在启动 PUBG : BATTLEGROUNDS...");
				break;
			case "8":
				System.out.println("正在启动 英雄联盟...");
				break;
			case "sb":
				System.out.println("隐藏指令：你是傻逼！哈哈哈哈哈你是傻逼。\n我才不管呢，输入了隐藏指令就是大傻逼。");
				break;
			default:
				System.out.println("你到底想玩什么啊...");
				break;
			}
			System.out.print("\n你要玩什么? ");
		}
		sc.close();
	}
}
