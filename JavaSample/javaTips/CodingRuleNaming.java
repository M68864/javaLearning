package javaTips;

public class CodingRuleNaming
{	//クラス名：先頭と単語の区切りを大文字とする。自律と再利用性を考慮したプログラム単位と名前付けとする。

	public static void main(String[] args)
	{}

	final void updateEntryAcceptAndDeliver(){
		//別途ネーミング対応表を作成してプロジェクトの全ライフサイクルでメンテナンスする。
		//なお、識別子にはキャメルケースないしはスネークケースを用いる。
		//例：userAddress(キャメルケース)
		//例：user_address(スネークケース)


		boolean isflag = true;

		//boolean変数 ※ やさしいJava Lesson3 P47
		//接頭語としてis+形容詞、can+動詞、has+過去分詞とする。
		//例: boolean isEmpty
		//例: boolean canClose


		for(int i=0; i<10; i++);
		for(int j=0; j<10; j++);
		for(int k=0; k<10; k++);
		//ループカウンタ ※ やさしいJava Lesson6 P148
		//スコープが狭いループカウンタやイテレータ（二重、三重にネストするとき）にはi、j、kという名前をこの順に使う。




		//メソッド名 ※ やさしいJava Lesson8 P217
		//小文字で始まり単語の区切りを大文字とする。機能を表すネーミングとする。
		//例: updateEntryAcceptAndDeliver()


		//スコープが異なる変数 ※ やさしいJava Lesson8 P241
		//スコープが異なると同一名が許されるが、これが起因したバグを誘発することがある。特にインスタンス変数とローカル変数間に問題が多いため、インスタンス変数にアクセスする際には
		//thisで修飾する。


		final double BOLTZMANN_CONSTANT = 1.38;
		//定数 ※ やさしいJava Lesson11 P368
		//定数はstatic finalとし、名前は全て大文字とする。単語間は_で繋ぐ。
		//例: UPPER_CASE_WITH_UNDERSCORES


		//抽象クラス名 ※ やさしいJava Lesson12 P384
		//抽象クラス名には、接頭語としてAbstractまたはAbstを付与し、サブクラスの目的を連想させる名前とする。
		//例: AbstBaseAction


		//実装クラス名 ※ やさしいJava Lesson12 P394
		//インターフェースを実装するクラスには、接尾語としてImplを付ける。
		//例: ClassNameEndsWithImpl


		//パッケージ名 ※ やさしいJava Lesson13 P413
		//パッケージはドメインから始めること。
		//例: jp.co.sss.xxxsys.action


		//例外クラス名 ※ やさしいJava Lesson14 P451
		//接尾語をExceptionとしたクラス名とする。
		//例: ClassNameEndsWithException


		//属性の取得メソッド(getter) ※ やさしいJava 記載なし
		//接頭語としてgetを付与する。(JavaBeansの仕様に準拠)
		//booleanの属性の場合はis+形容詞、can+動詞、has+過去分詞とする。
		//例: AnyType getAnyProp()
		//例: boolean isEnabled()
		//例: boolean hasChanged()
		//悪い例: boolean empty() //空にするという動詞的な意味に取れる。


//		属性の設定メソッド(setter) ※ やさしいJava 記載なし
//		接頭語としてsetを付与する。(JavaBeansの仕様に準拠)
//		booleanの属性の場合は、onやoffを使用しても良い。
//		原則、setterの戻り値はvoidとする。
//		例: void setAnyProp (AnyType value)
//		例: void onEnable()
//		例: void setEnable(boolean flag)


//		スコープが狭い名前 ※ やさしいJava 記載なし
//		スコープが狭い変数名は、型名を略したものを使って良い。
//		例: ServeletContext sc = getServletContext();


//		大文字小文字の使い分け ※ やさしいJava 記載なし
//		大文字と小文字は異なる文字として扱われるが、それのみで区別される名前を付けてはならない。
//		大文字で始まる名前はクラス名、インターフェース名及び抽象クラス名、定数のみとする。


	}
}
