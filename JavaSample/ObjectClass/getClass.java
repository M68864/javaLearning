package ObjectClass;

	//getClass()メソッド： オブジェクトが属するクラスの情報を返す

class Object3
{
	protected int num3A;
	protected double num3B;

	public Object3()
	{
		num3A = 0;
		num3B = 0.0;
		System.out.println("DefaultConstructor");
	}
}

class SubObject3 extends Object3
{
	private int addNum3;

	public SubObject3()
	{
		addNum3 = 0;
		System.out.println("SubObject3 generated");
	}
}

public class getClass
{
	public static void main(String[] args)
	{
		Object3[] x = new Object3[2];

		x[0] = new Object3();
		x[1] = new SubObject3();

		for(int i=0; i<x.length; i++)
		{
			Class y = x[i].getClass();
			System.out.println((i+1) + "番目のオブジェクトのクラスは"+ y +"です");
		}
	}
}
