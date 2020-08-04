	//equals()メソッド：二つの変数がさしているオブジェクトが同じである場合に、trueを戻り値として返す

class Object2
{
	protected int num2A;
	protected double num2B;

	public Object2()
	{
		num2A = 0;
		num2B = 0.0;
		System.out.println("DefaultConstructor");
	}
}

public class EqualsMethod
{

	public static void main(String[] args)
	{
		Object2 var1 = new Object2();
		Object2 var2 = new Object2();

		Object2 var3;
		var3 = var1;

		boolean bl1 = var1.equals(var2);
		boolean bl2 = var1.equals(var3);

		System.out.println("var1とvar2が同じか調べたところ" + bl1 + "でした");
		System.out.println("var1とvar3が同じか調べたところ" + bl2 + "でした");

		//equals()メソッドは複数のオブジェクトが同じものであるかどうかを調べたい場合に便利です

	}

}
