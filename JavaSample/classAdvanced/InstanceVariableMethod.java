package classAdvanced;

//インスタンス変数・インスタンスメソッド

//オブジェクトに関連付けられているフィールドをインスタンス変数
//オブジェクトに関連付けられているメソッドをインスタンスメソッド

class Object5
{

	private int num1;
	private double num2;
	//これらのフィールドはインスタンス変数であって、num1,num2はオブジェクトに関連付けられている。

	public Object5()	//コンストラクタ
	{
		num1 = 0;
		num2 = 0.0;
		System.out.println("Object4を作成しました");
	}

	public void setObject5(int c, double d)	//インスタンスメソッド
	{
		num1 = c;
		num2 = d;
		System.out.println("mun1:"+num1+" num2:"+num2+",に設定した");
	}

	public void show()	//インスタンスメソッド
	{
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}

}

public class InstanceVariableMethod
{

	public static void main(String[] args)
	{
		Object5 parameter1 = new Object5();	//オブジェクトごとにメソッドを呼び出せる
		parameter1.setObject5(1, 3.1);
		parameter1.show();

		Object5 parameter2 = new Object5();	//オブジェクトごとにメソッドを呼び出せる
		parameter2.setObject5(2, 3.1415);
		parameter2.show();

	}

}
