package ifSwitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseIf
{

	public static void main(String[] args) throws IOException
	{
		//javaにおける複数条件分岐の1つはif-else if-elseで実現できる

		System.out.println("Input integer next line.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Long res = Long.parseLong(str);

		//boolean型の演算子をif文の条件判定の中で用いる場合
		//if(flg) if(!flg)のように用いる

		int i = 2;

		if( res%2 == 0)
		{
			System.out.println("It's even number!");
			return;
			//プログラムを途中で強制的に終了させたい場合はreturn文を挿入する
		}
		else
		{
			while( i<(res^(1/2)) )
			{
				if( res % i == 0 )
				{
					System.out.println("It's composite number!");
					return;
					//ここも途中で強制的に終了させたいのでreturn文を挿入する
				}

					i++;
			}

			System.out.println("It's prime number!");

		}

		//System.out.println("It's prime number!");


	}

}
