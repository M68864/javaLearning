package exceptionHandling;

//自ら例外を生じさせるコードをクラスとして作成することができる
//この利点はクラス設計者と利用者が分担している場合に、利用者に例外クラスを記述してもらい柔軟な設計を可能にできる点である

class ObjectException extends Exception	//独自の例外クラスを宣言
{

}

class Object
{
	private int numX;
	private double numY;

	public Object()
	{
		numX = 0;
		numY = 0.0;
		System.out.println("Object generated");
	}

	public void setObject(int n, double m) throws ObjectException	//throws ObjectException:例外を送出する可能性があるメソッドであることを宣言
	{
		if( m < 0)
		{
			ObjectException e = new ObjectException();
			throw e;	//throw: 特定条件下で例外を送出する
		}
		else
		{
			numX = n;
			numY = m;
			System.out.println("numX:" + numX + "numY:" + numY);
		}
	}

	public void show()
	{
		System.out.println("Object method show()");
	}

}

public class ExceptionClassThrowable
{

	public static void main(String[] args)
	{
		Object object1 = new Object();

		try
		{
			object1.setObject(1, -Math.E);	//この呼び出しは例外送出条件に当てはまるので、例外送出処理となる
		}
		catch(ObjectException e)
		{
			System.out.println("Exception detected & deployed:" + e);
		}

		object1.show();

	}

	//例外処理には二つの方法がある
	/*
	 * ①try-catchを使って例外処理をメソッド内で完結してしまう
	 *
	 * ②例外を有する可能性のあるメソッドにthrow-を付加して、他のメソッドに例外処理を投げてしまう。
	 */

}
