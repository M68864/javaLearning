package classAdvanced;

	//各々のコンストラクタにprivate、publicの修飾子を付加してみる

class Object8
{
	private int num1;
	private double num2;

	//privateにするとクラス外でこのコンストラクタは使用できなくなる
	private Object8()	//引数のないコンストラクタ:デフォルトコンストラクタ	//privateなコンストラクタ
	{
		num1 = 0;
		num2 = 0.0;
		System.out.println("Object8を作成しました");
	}

	public Object8(int c, double d)	//引数を２こもつコンストラクタ		//publicなコンストラクタ
	{
		num1 = c;
		num2 = d;
		System.out.println("mun1:"+num1+" num2:"+num2+",Object8を作成しました");
	}

	public void show()
	{
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}

}


public class ConstructorWithModifier
{

	public static void main(String[] args)
	{
		//privateなコンストラクタが呼び出されるようなオブジェクトは作成できない
		//実際、下2行のコメントアウトをはずすとエラーを吐き出す

		//Object8 parameter1 = new Object8();	//引数のないコンストラクタが呼び出される
		//parameter1.show();


		Object8 parameter2 = new Object8(69, 3.1415);	//引数２個のコンストラクタが呼び出される
		parameter2.show();

	}

}
