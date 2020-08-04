package variable;

	//参照渡し：二つの変数が一つの同じオブジェクトを指し示す変数の代入

public class ObjectClass
{
	private int num1;
	private double num2;

	public ObjectClass()
	{
		num1 = 0;
		num2 = 0.0;
		System.out.println("ObjectClassを作成したyo");
	}

	public void setObject(int n, double m)
	{
		num1 = n;
		num2 = m;
		System.out.println("setObjectで引数設定 num1:"+num1+", num2:"+num2);
	}
	//引数を有するメソッドにおける値の受け渡しは呼び出し元の変数と呼び出し先の変数が異なるものを意味する「値渡し」である

	public void show()
	{
		System.out.println("showMethod num1:"+num1+", num2:"+num2);
	}


}
