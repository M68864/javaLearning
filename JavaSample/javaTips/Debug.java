package javaTips;

	//例外処理をさせる前に例外になりそうな入力を弾く、手順を置くことはままある

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Debug
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数値を入力してください。");
		// 数字の入力処理
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		// 入力された数値に応じて異なる文字列を出力
		if (num <= 5)
		{
			System.out.println("5以下の値です。");
		}
		else if (6 <= num && 10 >= num)
		{
			System.out.println("6～9までの値です。");
		}
		else if(10 <= num)
		{
			System.out.println("10以上の値です。");
		}
	}
}