package inheritance;

	//スーパークラスの変数を使ってサブクラスのオブジェクトを扱う

class SuperClassInheritance
{
	void show()
	{
		System.out.println("SuperClass show method");
	}
}

class SubClassInheritance extends SuperClassInheritance
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
		SuperClassInheritance var;
		var = new SubClassInheritance();	//スーパークラスの変数でサブクラスのオブジェクトを扱う

		var.show();	//サブクラスのshowメソッドが呼び出される

	}

}
