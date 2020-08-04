package classAdvanced;

//コンストラクターをオーバーロードしてみる

class Object4
{
	private int num1;
	private double num2;

	public Object4()	//引数のないコンストラクタ:デフォルトコンストラクタ
	{
		num1 = 0;
		num2 = 0.0;
		System.out.println("Object4を作成しました");
	}

	public Object4(int c, double d)	//引数を２こもつコンストラクタ
	{
		num1 = c;
		num2 = d;
		System.out.println("mun1:"+num1+" num2:"+num2+",Object4を作成しました");
	}

	public void show()
	{
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}

}

public class OverloadWithConstructor
{

	public static void main(String[] args)
	{
		Object4 parameter1 = new Object4();	//引数のないコンストラクタが呼び出される
		parameter1.show();

		Object4 parameter2 = new Object4(69, 3.1415);	//引数２個のコンストラクタが呼び出される
		parameter2.show();

	}

}
