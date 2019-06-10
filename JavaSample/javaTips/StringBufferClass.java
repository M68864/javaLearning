package javaTips;

//文字列を追加するStringBufferクラスを下記する

public class StringBufferClass
{

	public static void main(String[] args)
	{
		String str = "Everything";

		StringBuffer sb1 = new StringBuffer(str);
		sb1 = sb1.append(".");	//append(char or String): 引数の文字,文字列を末尾に追加する
		System.out.println("sb1:"+ sb1);

		StringBuffer sb2 = new StringBuffer(str);
		sb2 = sb2.deleteCharAt(0);	//deleteCharAt(int): 引数の位置の文字を削除する
		System.out.println("sb2:"+sb2);

		StringBuffer sb3 = new StringBuffer(str);
		sb3 = sb3.insert(0, "E");	//insert(int, string or char): 引数の位置に文字または文字列を追加する
		System.out.println("sb3:"+sb3);

		StringBuffer sb4 = new StringBuffer(str);
		int i = sb4.length();	//length(): 文字数を返す
		System.out.println("sb4:"+ i );

		StringBuffer sb5 = new StringBuffer(str);
		sb5 = sb5.replace(0, 5, "HOGE");	//replace(int start, int end, string): 引数の位置の文字列を引数の文字列で置換する
		System.out.println("sb5:"+sb5);

		StringBuffer sb6 = new StringBuffer(str);
		sb6 = sb6.reverse();	//reverse(): 文字順を逆にする
		System.out.println("sb6:"+sb6);

		StringBuffer sb7 = new StringBuffer(str);
		sb7.setCharAt(0,'H');	//setCharAt(int ,char): 引数の位置の文字を引数の文字にする void型なので注意
		System.out.println("sb7:"+sb7);

		StringBuffer sb8 = new StringBuffer(str);
		sb8.toString();	//toString(): Stringクラスのオブジェクトに変換する
		System.out.println("sb8:"+sb8);

	}

}
