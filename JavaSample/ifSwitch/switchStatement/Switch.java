package switchStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Input integer next line.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res%2)
		{
		case 0:
			System.out.println("Even Number");
			break;
		case 1:
			System.out.println("Even1 Number");
			break;
		default:
			System.out.println("Odd Number");
			break;

			//break文が抜けていると全ての条件分岐が実行されてしまうので注意
		}

	}

}
