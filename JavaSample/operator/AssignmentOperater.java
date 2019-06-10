package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AssignmentOperater
{

	public static void main(String[] args)throws IOException
	{
		/*  代入演算子のバリエーション	p85
		 * 	+= :加算代入
		 * 	-= :減算代入
		 * 	*= :乗算代入
		 * 	/= :除算代入
		 * 	%= :剰余代入
		 * 	&= :論理積代入
		 *  |= :論理和代入
		 *  ^= :排他的論理和代入
		 *  <<=:左シフト代入
		 *  >>=:右シフト代入
		 *  >>>=:符号なし右シフト代入
		 */


		//複合的な代入演算子の例
		System.out.println("整数を3つ入力してみよ？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();

		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);

		System.out.println("複合演算子さんのおかげで " + sum + " が計算されたyo");
	}

}
