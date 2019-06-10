package classMethodBasic;

//オブジェクトとクラスに関することを記述していく

//本来であれば1file/1classなのでこのファイルは分けなければならない
//Eclipse操作豆知識：Ctrlを押しながら、変数やクラスをクリックすると参照先にとべる
//Alt + ← で元の場所に戻る


//本クラスはObjectClassという物をクラスとして定義したもの
//オブジェクト指向ではオブジェクトは情報(状態・性質)と振る舞いをあらわす（機能）という2つの要素をもつ
class Object
{
	//情報（状態・性質）はフィールドである
	int num;
	String string;

	//メソッドを追記、振る舞い（機能）はメソッドに記述する
	void show()
	{
		int num = 10;
		//フィールドと同じ変数名をメソッド内で定義できるが…numはメソッド内で定義した変数を参照している
		//開発においてフィールド名と同一の変数名は避けること

		System.out.println("variableのnum属性は"+ num );
		System.out.println("variableのstring属性は"+ string );

		//this.を付け足すと自分自身のフィールドを指すことになる
		System.out.println("variableのnum属性は"+ this.num );
		System.out.println("variableのstring属性は"+ this.string );
	}

}

//ObjectClassを利用するための起動用プログ

class ObjectClassMethod
{
	public static void main(String[] args)
	{
		Object variable = new Object();
	  //オブジェクト作成：　クラス名　変数名　= new クラス名();

		variable.num = 1;	//variableの数値属性である数字を代入する .numでvariableの数値属性を取得できる
		variable.string = "mojiretsu";	//variableの文字列属性である文字列を代入する .stringでvariableの文字列属性を取得できる

		System.out.println("variableの数値情報は"+ variable.num );
		System.out.println("variableの文字列情報は"+ variable.string );

		//メソッドを呼び出す
		variable.show();

	}

}
