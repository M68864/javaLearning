package classAdvanced;

	//クラス変数、クラスメソッド
	//クラス変数・クラスメソッドにはstaticを付加する

	//クラス変数：クラス全体で扱うデータを格納しておくフィールド
	//クラスメソッドはオブジェクトが作成されていなくともメソッドを呼び出すことができる

	//オブジェクトに直接紐付かない変数・メソッドはstaticを付加してクラス変数・クラスメソッドにしておくと楽？

	//クラス変数は各オブジェクトから共有されるフィールドである

class Object6
{

	public static int sum = 0;	//クラス変数の設定:staticをつける

	private int num1;
	private double num2;
	//これらのフィールドはインスタンス変数である

	public Object6()	//コンストラクタ
	{
		num1 = 0;
		num2 = 0.0;
		sum++;	//コンストラクタが呼び出されたときにクラス変数sumの値を1増やす	//クラス変数は各オブジェクトから共有されるフィールドである

		System.out.println("Object6を作成しました");
	}

	/*
	public void setObject6(int c, double d)	//インスタンスメソッド
	{
		num1 = c;
		num2 = d;
		System.out.println("mun1:"+num1+" num2:"+num2+",に設定した");
	}
	*/

	public static void showSum()	//クラスメソッド staticをつける
	{
		System.out.println("Object6は"+ sum +"コ存在しています");
	}

	/*
	public void show()	//インスタンスメソッド
	{
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}
	*/

}	//実はInteger.parseInt(), System.out.println()はクラスメソッドである


public class ClassVariableClassMethod {

		public static void main(String[] args)
		{
			//クラスメソッドはオブジェクトが作成されていなくともメソッドを呼び出すことができる
			System.out.println("クラスメソッドを呼び出し");
			Object6.showSum();
			//クラスメソッドの呼び出し： ClassName.ClassMethod();

			//Object6 parameter1 = new Object6();	//オブジェクトごとにメソッドを呼び出せる
			//parameter1.setObject6(1, 3.1);


			System.out.println("もう一度クラスメソッドを呼び出し");
			Object6.showSum();

			//Object6 parameter2 = new Object6();	//オブジェクトごとにメソッドを呼び出せる
			//parameter2.setObject6(2, 3.1415);


			System.out.println("しつこくクラスメソッドを呼び出し");
			Object6.showSum();

		}

	}

