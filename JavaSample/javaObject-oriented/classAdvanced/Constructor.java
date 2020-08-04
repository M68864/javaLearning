package classAdvanced;

	//コンストラクタの記法と働きについて記述する

class Object3
{
	private int j;
	private double k;

	//コンストラクタの働き：そのクラスのオブジェクトが作成されたときに、定義しておいたコンストラクタ内の処理が自動的に行われる
	//以上のような事情から「コンストラクタ内にはオブジェクトのメンバに自動的に初期値を設定する」というのが定石

	public Object3()	//コンストラクタ名はクラス名と同一にする必要がある
	{
		j = 0;
		k = 0;
		System.out.println("Object3を作成しました");
	}
	//コンストラクタには戻り値はない

	public void show()
	{
		System.out.println("j:" + j + "\nk:" + k);
	}
}

public class Constructor
{

	public static void main(String[] args)
	{
		Object3 l = new Object3();	//オブジェクト作成時にコンストラクタが呼び出される

		l.show();

	}

}
