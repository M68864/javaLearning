package javaTips;

	//色々なクラスライブラリが存在する
	//ここではStringクラスのメソッドを習得する

public class StringClass
{

	public static void main(String[] args)
	{
		//Stringクラスはよく使われるライブラリのため、オブジェクト生成はなしで使うことができる
		//cf:https://docs.oracle.com/javase/jp/8/docs/api/java/lang/String.html

		String str = "Hello, Hello";

		//引数の位置にある文字を返す
		char ch1 = str.charAt(4);
		System.out.println("ch1: "+ch1);


		//引数の文字列で終わるかどうかを判断する
		boolean ch2 = str.endsWith("Hello");
		System.out.println("ch2: "+ch2);


		//引数の文字列かどうかを判断する
		boolean ch3 = str.equals("Hello, Hello");
		System.out.println("ch3: "+ch3);


		//引数の文字列かどうかを大文字・小文字の区別なしに判断する
		boolean ch4 = str.equalsIgnoreCase("hello, hello");
		System.out.println("ch4: "+ch4);


		//引数の文字が最初に出現する位置を返す
		int ch5 = str.indexOf('h');
		System.out.println("ch5: "+ch5);


		//引数の文字列が最初に出現する位置を返す
		int ch6 = str.indexOf("Hello");
		System.out.println("ch6: "+ch6);


		//引数の文字が最後に出現する位置を返す
		int ch7 = str.lastIndexOf('l');
		System.out.println("ch7: "+ch7);


		//引数の文字列が最後に出現する位置を返す
		//見つからなかった場合は-1を返す。
		int ch8 = str.lastIndexOf("hello");
		System.out.println("ch8: "+ch8);


		//文字列の長さを返す
		int ch9 = str.length();
		System.out.println("ch9: "+ch9);


		//引数の位置から最後までの部分文字列を返す
		String ch10 = str.substring(3);
		System.out.println("ch10: "+ch10);


		//引数の開始位置から最終位置までの部分文字列を返す
		String ch11 = str.substring(3,7);
		System.out.println("ch11: "+ch11);


		//引数の文字列ではじまるかどうかを判断する
		boolean ch12 = str.startsWith("hello");
		System.out.println("ch12: "+ch12);


		//文字列を小文字に変換した結果を返す
		String ch13 = str.toLowerCase();
		System.out.println("ch13: "+ch13);


		//文字列を大文字に変換した結果を返す
		String ch14 = str.toUpperCase();
		System.out.println("ch14: "+ch14);
	}

}
