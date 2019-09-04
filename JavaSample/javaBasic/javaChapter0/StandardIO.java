package javaChapter0;

//標準入出力(standardIO)を行うときに必要なメソッド
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIO
{

	public static void main(String[] args) throws IOException	//標準入出力において throws IOException の文言が必要
	{

		System.out.println("何か入力してみよ？？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//これも標準入出力に必要

		String str1 = br.readLine();	//キーボードから入力した文字列をstrに読み込む

		System.out.println("「" + str1 + "」" + "が入力されたyo");



		//２つ以上の入力を行うとき
		System.out.println("下になんか整数を入力してみよ？？");

		String str2 = br.readLine();	//新しく変数宣言をした一行を足していけばいくつもの入力ができるようになる

		int num = Integer.parseInt(str2);	//標準入力は文字列として入力されるので扱うデータに沿った型変換が必要

		System.out.println("int型整数「" + num + "」" + "として出力されたyo");

	}

}
