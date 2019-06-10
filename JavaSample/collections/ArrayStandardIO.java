package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayStandardIO
{

	//配列の宣言コードと要素数、配列要素を標準入力させるサンプルコード

	public static void main(String[] args) throws IOException
	{
		System.out.println("配列要素数を入力してみよ？");

		//標準入力に必要なコードセット
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);

		int[] test = new int[num];	//Ｃ言語ではint test[]だったがJavaでは左記の宣言作法にした方が良い


		//以下から配列の要素を標準入力するためのコードセット
		//配列の添字は0から始まる

		System.out.println("配列要素(int)を要素分だけ入力してみよ？");

		for(int i=0; i<num; i++)
		{
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}


		//拡張for文
		//for(取り出した要素を格納する変数 ： ループさせたい配列変数)
		for(int i: test)
		{
			System.out.println("添え字"+ i +"番目の要素は"+ test[i] );
		}

	}

}
