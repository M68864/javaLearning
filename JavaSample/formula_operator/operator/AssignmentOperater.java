package operator;

import java.io.IOException;

public class AssignmentOperater
{

	public static void main(String[] args)throws IOException
	{
		/*  代入演算子のバリエーション	p85
		 *1. += :加算代入
		 *2. -= :減算代入
		 *3. *= :乗算代入
		 *4. /= :除算代入
		 *5. %= :剰余代入
		 *6. &= :論理積代入
		 *7. |= :論理和代入
		 *8. ^= :排他的論理和代入
		 *9. <<=:左シフト代入
		 *10.>>=:右シフト代入
		 *11.>>>=:符号なし右シフト代入
		 */


		//5. %= : 剰余代入の例
		byte remainder = 3;
		remainder %= 2;
		// remainder = remainder % 2;
		//と同様の動作
		System.out.println("remainder = " + remainder + "\n");


		//6. &= : 論理積代入の例
		boolean binaryAND = true;
		binaryAND &= false;
		System.out.println("binaryAND = " + binaryAND + "\n");


		//7. |= : 論理和代入の例 : 論理演算は2進数値でも可能
		byte binaryOR  = 1;
		binaryOR |= 0;
		System.out.println("binaryOR = " + binaryOR + "\n");



		//整数を代入した場合はビットごとの演算になる
		// 5 = 101
		// 2 = 010 ビット積
		byte numAND = 5;
		numAND &= 2;
		System.out.println("numAND = " + numAND);

		//こちらはビット和
		byte numOR = 5;
		numOR |= 2;
		System.out.println("numOR = " + numOR + "\n");



		//8. ^= : 排他的論理和代入の例
		boolean binaryXOR1 = true;
		binaryXOR1 ^= false;
		System.out.println("binaryXOR1 = " + binaryXOR1);

		boolean binaryXOR2 = true;
		binaryXOR2 ^= true;
		System.out.println("binaryXOR2 = " + binaryXOR2 + "\n");


		//やっぱり2進数値でも可能
		byte numXOR1 = 1;
		numXOR1 ^= 0;

		//ビットごとのXOR演算
		// 5 = 101
		// 2 = 010
		byte numXOR2 = 5;
		numXOR2 ^= 2;

		System.out.println("numXOR1 = " + numXOR1);
		System.out.println("numXOR2 = " + numXOR2);



	}

}
