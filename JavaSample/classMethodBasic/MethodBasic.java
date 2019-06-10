package classMethodBasic;

	//ファイル名はメインクラス名とすること；メインではないクラスのクラス名をファイル名にすると実行不可となる

class Object2
{
	int num2;
	String string2;

	void show()
	{
		System.out.println("variableのnum属性は"+ num2 );
		System.out.println("variableのstring属性は"+ string2 );
	}

	void showMethod()
	{
		System.out.println("自分自身のメソッドを呼び出します");

		show();	//自分自身のメソッドを呼び出し
		this.show();	//クラス内では、メソッド名をそのまま記述するか、this.をつけて呼び出す

	}

}


class MethodBasic
{
	public static void main(String[] args)
	{
		Object2 variable = new Object2();
	  //オブジェクト作成：　クラス名　変数名　= new クラス名();

		variable.num2 = 1;	//variableの数値属性である数字を代入する .numでvariableの数値属性を取得できる
		variable.string2 = "mojiretsu";	//variableの文字列属性である文字列を代入する .stringでvariableの文字列属性を取得できる

		System.out.println("variableの数値情報は"+ variable.num2 );
		System.out.println("variableの文字列情報は"+ variable.string2 );

		//メソッドを呼び出す
		variable.showMethod();
		//クラス外では、オブジェクトをさす変数名をつけてメソッドを呼び出す

	}
}
