package inheritance;

	//privateと似たようなアクセス制限であるprotectedについて学ぶ
	//予備知識
	//privateはクラス外からフィールドアクセスを制限するものであったが、スーパークラスのフィールド変数にprivateを設けたときも例外ではない

	//しかしながら、スーパークラスの変数にサブクラスからアクセスができないことは何かと不便である。
	//そこでprotectedの登場である

class ObjectProtected
{
	protected int num1;
	protected double num2;

	public ObjectProtected() //DefaultConstructor
	{
		num1 = 0;
		num2 = 0.0;
		System.out.println("Default Constructor. ObjectProtected orientated.");
	}

	public void setObjectProtected(int n, double m)
	{
		num1 = n;
		num2 = m;
		System.out.println("ObjectProtectedMethod num1:"+ num1 + "num2:" + num2);
	}

	public void show()
	{
		System.out.println("showMethod num1:"+ num1 + "num2:" + num2);
	}
}



class SubObjectProtected extends ObjectProtected
{
	private int num3;

	public SubObjectProtected()
	{
		num3 = 0;
		System.out.println("SubObjectProtected object generated.");
	}

	public void setNum3(int c)
	{
		num3 = c;
		System.out.println("SubObjectProtected num3:" + num3);
	}

	public void newShow()
	{
		System.out.println("Protected variable num1:" + num1);
		System.out.println("Protected variable num2:" + num2);
		System.out.println("subClass variable num3:" + num3);
	}
}

public class ProtectedAccessLimitation
{

	public static void main(String[] args)
	{
		SubObjectProtected childObject = new SubObjectProtected();

		childObject.newShow();

	}

}
