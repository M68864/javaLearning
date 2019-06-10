package inheritance;

	//extendsを使うことでsubClassからSuperClassの内容が継承できる

class SuperClass
{
	private int num1A;
	private double num1B;

	public SuperClass()	//親クラスのデフォルトコンストラクタ
	{
		num1A = 0;
		num1B = 0.0;
		System.out.println("DefaultConstructor in SuperClass");
	}

	public void setSuperClass(int n, double m)	//引数アリのコンストラクタ
	{
		num1A = n;
		num1B = m;
		System.out.println("setMethod SuperClass num1A:"+num1A+",num1B:"+num1B);
	}
}

class SubClass extends SuperClass	//extendsで継承できる
{
	private int addNum1;

	public SubClass()	//子クラスのデフォルトコンストラクタ
	{
		addNum1 = 0;
		System.out.println("DefaultConstructor in SubClass");
	}

	public void setSubClass(int x)
	{
		addNum1 = x;
		System.out.println("setMethod SubClass addNum1:"+ addNum1);
	}
}

public class Extends
{

	public static void main(String[] args)
	{
		SubClass subvar = new SubClass();

		subvar.setSuperClass(1, 3.14);
		subvar.setSubClass(5);


	}

}
