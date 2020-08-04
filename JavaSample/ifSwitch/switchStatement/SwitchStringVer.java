package switchStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchStringVer
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Input a or b");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char res = str.charAt(0);	//入力した文字列から文字を取り出す

		switch(res)
		{
		case 'a':
			System.out.println("You input a!");
			break;
		case 'b':
			System.out.println("You input b!");
			break;
		default:
			System.out.println("Input a or b!");
			break;
		}

	}

}
