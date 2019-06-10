package inheritance;

	//スーパークラスの変数を使ってサブクラスのオブジェクトを扱う

class SuperClass
{
	void show()
	{
		System.out.println("SuperClass show method");
	}
}

class SubClass extends SuperClass
{
	void show()
	{
		System.out.println("SubClass show method");
	}
}

public class UsingSuperClassVariable
{

	public static void main(String[] args)
	{
		SuperClass var;
		var = new SubClass();	//スーパークラスの変数でサブクラスのオブジェクトを扱う

		var.show();	//サブクラスのshowメソッドが呼び出される

	}

}
