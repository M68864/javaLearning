package classAdvanced;

	//アクセス制限とカプセル化について
	//クラスの中にデータ（フィールド）と機能（メソッド）をひとまとめにし、保護したいメンバにprivateをつけて勝手にアクセスできなくする機能をカプセル化という
	//フィールド　→　privateメンバ、　メソッド　→　publicメンバ

class Object
{
	//フィールド値をprivateで指定することにより、クラス外からフィールド値を設定はできなくなる
	//このことでクラス外からの勝手なフィールド操作ができなくなる
	private int num;
	private double num2;

	void show()
	{
		System.out.println("Everything will turn out to be fine.");
	}

	//実は外からアクセスできる方法が存在する
	//setメソッドにpublicメンバを設定することにより外からフィールド値の設定ができるようになる
	public void setNums(int x, double y)
	{
		num = x;
		num2 = y;

		System.out.println("num:"+ x + "\nnum2:" + y);
	}
	//どうしても値の代入制限を設けたい場合はsetメソッド内でif文などを用いて設定可能な値の範囲を指定する

}
public class AccessRestricion
{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Object variable = new Object();

		variable.setNums(-10, -1.234);


	}

}
