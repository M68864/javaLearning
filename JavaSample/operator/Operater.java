package operator;

//各演算子を種類ごとに挙げておく

public class Operater
{

	public static void main(String[] args)
	{
		/*
		 *  + :加算（文字列連結）
		 * - :減算
		 * * :乗算
		 * / :除算
		 * % :剰余
		 * + :プラス(単項)
		 * - :マイナス（単項）
		 *
		 * 下の4つはビット演算子と呼ばれる
		 * ~ :補数（単項）ビット反転(bitNOT)
		 * & :ビット論理積(bitAND)
		 * | :ビット論理和(bitOR)
		 * ^ :ビット排他的論理和(bitXOR)
		 * <<:左ビットシフト
		 * >>:右ビットシフト
		 * >>>:符号なし右ビットシフト
		 * 説明は後述
		 *
		 * instanceof:型比較
		 * ! :論理否定（単項）
		 * && :論理積
		 * || :論理和
		 * ?: :条件
		 * new:オブジェクト生成
		 *
		 */


		//~ :補数（単項）ビット反転(bitNOT)は各ビットを反転した結果が得られる
		String num1 = Integer.toBinaryString(24); //24 = 1100(binary)
		String num2 = Integer.toBinaryString(~24);
		byte num3 = ~24;
		System.out.println("24の2進数表記 :" + num1);
		//補数の2進数表現の際には、IntegerラッパークラスのMax桁まで表示される模様
		System.out.println("24の補数の2進数表記 :" + num2);
		System.out.println("24の補数の10進数表記 :" + num3 + "\n");



		//&, |, ^ は各々ビット列に対するAND, OR, XOR演算を処理する
		byte and = 12 & 4; //12 = 1100, 4 = 0100
		String andBinary = Integer.toBinaryString(and);
		System.out.println("ビット論理積の10進数結果：" + and);
		System.out.println("ビット論理積の2進数結果：" + andBinary + "\n");

		byte or = 12 | 3; //12 = 1100, 3 = 0011
		String orBinary = Integer.toBinaryString(or);
		System.out.println("ビット論理和の10進数結果：" + or);
		System.out.println("ビット論理和の2進数結果：" + orBinary + "\n");

		byte xor = 12 ^ 5;
		//12 = 1100
		// 5 = 0101
		String xorBinary = Integer.toBinaryString(xor);
		System.out.println("ビット排他的論理和の10進数結果：" + xor);
		System.out.println("ビット排他的論理和の2進数結果：" + xorBinary + "\n");



		//シフト演算子 << (>>)
		//2進数表記において5(101)の値を2bit分左(右)にずらす(10100)ことを意味する
		byte shifter1 = 5 << 2;
		byte shifter2 = 5 >> 2;

		System.out.println("左ビットシフト:" + shifter1);
		System.out.println("右ビットシフト:" + shifter2 + "\n");


		//値が負値の場合の右ビットシフト(>>)
		String mainusBinary = Integer.toBinaryString(-8);
		byte rightShift = -8 >> 2;
		System.out.println("-8のバイナリー表記：" + mainusBinary);
		String rsBinary = Integer.toBinaryString(rightShift);
		System.out.println("-8 >> 2のバイナリー表記：" + rsBinary);
		System.out.println("10進数表記：" + rightShift + "\n");


	}

}
