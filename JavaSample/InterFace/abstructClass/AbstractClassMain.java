package abstructClass;

	//抽象クラスの説明と使い方について記述する

	//抽象クラスはオブジェクト生成ができないので、サブクラスで定義してオブジェクト生成する



abstract class AbstractClass
{
	protected int num1A;

	public void setMethod(int s)
	{
		num1A = s;
		System.out.println("setMethod num1A:"+num1A);
	}

	abstract void show();	//抽象クラスにはメソッドの内容が何も書かれていない抽象メソッドが存在する
}

class Object1 extends AbstractClass
{
	private int num1B;
	private double num1C;

	public Object1(int n, double g)	//パブリックなコンストラクタ
	{
		num1B = n;
		num1C = g;
		System.out.println("Object1 constructor num1B:"+num1B+"num1C:"+num1C);
	}

	public void show()
	{
		System.out.println("Object1 showMethod num1A:"+num1A+"num1B:"+num1B+"num1C:"+num1C);
	}
	//抽象クラスを拡張したサブクラスはどれも、抽象クラスの抽象メソッド（show()method）と同じ名前のメソッドを必ずもっている

}

class Object2 extends AbstractClass
{
	private int num1D;

	public Object2(int f)
	{
		num1D = f;
		System.out.println("Object2 constructor num1D:"+num1D);
	}

	public void show()
	{
		System.out.println("Object2 show Method");
	}
}

public class AbstractClassMain
{

	public static void main(String[] args)
	{
		AbstractClass[] ac = new AbstractClass[2];	//抽象クラスの配列を用意する

		ac[0] = new Object1(1, 3.14);	//一番目のオブジェクト
		ac[0].setMethod(5);

		ac[1] = new Object2(99);	//二番目のオブジェクト
		ac[1].setMethod(500);

		for(int i=0; i<ac.length; i++)
		{
			ac[i].show();
		}
	}

}
