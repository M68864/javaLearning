package classMethodBasic;

public class ThisAndStatic {

	//これら変数はインスタンス変数と呼ばれ、クラスオブジェクトがnewされたときに作成される
	private String instanceStr;

	//これら変数はクラス変数と呼ばれ、クラスで共通に持つことができる
	private static String classStr;


	//このメソッドはstaticがついていないので、インスタンスメソッド、クラスをnewして呼び出す
	void showIntanceMethod(String input)
	{
		instanceStr = input;

		//インスタンスメソッド内ではthis.を用いてインスタンス変数にアクセスできる
		//オブジェクト自身（自分自身）を表すことを強調してthis.という指定をつけることもある
		//this.を付加しなくても呼び出しはできるので、好みやプロジェクトでの規約によって使い分ける
		System.out.println("\ninstanceStr:" + this.instanceStr);

	}

	//「static」がくっついているメソッドをクラスメソッドという
	//このメソッドはクラスで共通に呼び出すため、newする必要性なしに呼び出すことができる
	static void showClassMethod(String input)
	{
		//クラスメソッド内ではthisを付加するインスタンス変数にアクセスできない。
		//System.out.prStringln(classStr, instanceStr);	//コメントをはずすと「非 static フィールド instanceStr を static 参照できません」になる

		classStr += input;

		System.out.println("\nclassStr:" + classStr);

	}

	public static void main(String[] args) {

		ThisAndStatic instanceObject1 = new ThisAndStatic();
		instanceObject1.showIntanceMethod("instanceObject1のinput");

		ThisAndStatic.showClassMethod("クラスメソッド呼出1回目");

		ThisAndStatic instanceObject2 = new ThisAndStatic();
		instanceObject2.showIntanceMethod("instanceObject2のinput");

		ThisAndStatic.showClassMethod("クラスメソッド呼出2回目");

		//インスタンス変数はオブジェクトごとに異なる値（厳密に言えば異なるハッシュ値？）をもつ
		//クラス変数は一貫性が保証されているので、変数の値が継続する

	}

}

