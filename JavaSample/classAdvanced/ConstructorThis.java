package classAdvanced;

	//this();を用いてあるコンストラクタ内で別のコンストラクタを特別に呼び出す

class Object7
{
	private int num1;
	private double num2;

	public Object7()	//引数のないコンストラクタ:デフォルトコンストラクタ
	{
		num1 = 0;
		num2 = 0.0;
		System.out.println("Object4を作成しました");
	}

	public Object7(int c, double d)	//引数を２こもつコンストラクタ
	{
		this();	//引数２個のコンストラクタの先頭で、引数のないコンストラクタを呼び出す
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


public class ConstructorThis
{

	public static void main(String[] args)
	{
		Object7 parameter1 = new Object7();	//オブジェクト生成時に引数のないコンストラクタ（デフォルトコンストラクタ）が呼び出される
		parameter1.show();

		Object7 parameter2 = new Object7(69, 3.1415);	//引数２個のコンストラクタが呼び出される
		parameter2.show();

	}

}
