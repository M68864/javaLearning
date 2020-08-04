package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySort
{

	//配列要素を大きい順にソートするコード

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] test = new int[3];

		System.out.println("要素数"+ test.length +"コ分のデータを入力してみよ？");

		for(int i=0; i<test.length; i++)
		{
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}

		//以下はソートの記述
		for(int s=0; s<test.length-1; s++)
		{
			for(int t=s+1; t<test.length; t++)
			{
				if(test[t] > test[s])
				{
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}


		for(int j=0; j<test.length; j++)
		{
			System.out.println((j+1) +"番目の要素は"+ test[j]);
		}

	}

}
