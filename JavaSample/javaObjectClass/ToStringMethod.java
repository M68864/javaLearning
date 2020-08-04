

	//toString()メソッドの使い方と応用例を記述
	//toString()メソッドをオーバーライドしてみる

class Object	//何も書かれていないときは、ここに extends Objectの記述が隠れている。
{
	protected int num1A;
	protected double num1B;

	public Object()
	{
		num1A = 0;
		num1B = 0.0;
		System.out.println("DefaultConstructor");
	}

	public void setObjectMehod(int n, double m)	//引数アリのコンストラクタ
	{
		num1A = n;
		num1B = m;
		System.out.println("setMethod num1A:"+num1A+",num1B:"+num1B);
	}

	public String toString()	//実はtoString()メソッドをオーバーライドしていることになっている。隠れたメソッド
	{
		String str = "num1A:"+num1A+",num1B:"+num1B;
		return str;
	}
}


public class ToStringMethod
{

	public static void main(String[] args)
	{
		Object var1 = new Object();
		var1.setObjectMehod(1, 3.14);

		System.out.println(var1);	//System.out.println()自体は、toString()の戻り値が使われるようになっている

	}

}
