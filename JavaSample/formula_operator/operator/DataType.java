package operator;

public class DataType
{

	public static void main(String[] args)
	{
		boolean TrueOrFalse = true; //true or falseの二択

		char character = 'A'; //2バイト文字のための変数型、あくまで「文字」である

		String string = "mojiretsu"; //文字列のための変数型

		byte Byte = 127 ;	//１バイト整数( -128 ～ 127 )のための変数型

		short Short = 32767; //２バイト整数( -32768 ～ 32767 )

		int Int = 2147483647; //４バイト整数( -2147483648 ～ 2147483647 )

		long Long = 9223372036854775806L; //８バイト整数( -9223372036854775808 ～ 9223372036854775807)
		//int型を超える整数を代入するときは代入値の末尾に l or L をつける


		//４バイト単精度浮動少数点数
		float a = 0.1234e2f;   // 0.1234×10^2 である 12.34 が格納される
		float b = 10e-4f;      // 10×10^-4 である 0.0010 が格納される
		float c = 5.6705e-6f;  // ステファン・ボルツマン定数 5.6705×10^6
		//float型を格納したい時は末尾に f or F をつける
		//「e2、e-10」は「10^2、10^-10」を指定する

		double d = 3.5747e-10; //８バイト倍精度浮動少数点数



		System.out.println(TrueOrFalse);
		System.out.println(character);
		System.out.println(string);
		System.out.println(Byte);
		System.out.println(Short);
		System.out.println(Int);
		System.out.println(Long);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
