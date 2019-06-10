package whileFor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForPyramidVer
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("何段ピラミッドを作りたい？？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);

		for(int i=1; i<=res; i++)
		{
			for(int j=1; j<=res-i; j++)
			{
				System.out.print(" ");
			}

			for(int k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}

			System.out.println();

		}
	}
}
