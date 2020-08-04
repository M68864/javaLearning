package OverrideOfMethod;


//サブクラスで新たにスーパークラスに存在する同名メソッドを定義するとサブクラスの新しいメソッドが呼び出される

public class OverrideOfMethod
{
	public static void main(String[] args)
	{
		SubClass var = new SubClass();

		var.show();
		//このファイルを実行するとスーパークラスのshowメソッドがサブクラスのshowメソッドで上書きされる

	}

}
