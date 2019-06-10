package inheritance;

	//サブクラス側のコストラクタで最初に呼び出されるコンストラクタを指定する方法
	//super(n, m)で指定できる

class SuperClass2
{
	private int num2A;
	private double num2B;

	public SuperClass2()	//親クラスのデフォルトコンストラクタ
	{
		num2A = 0;
		num2B = 0.0;
		System.out.println("DefaultConstructor in SuperClass2");
	}

	public SuperClass2(int n, double m)	//引数アリのコンストラクタ
	{
		num2A = n;
		num2B = m;
		System.out.println("SuperClass2Method num2A:"+num2A+",num2B:"+num2B);
	}

	public void setSuperClass2(int n, double m)	//引数アリのコンストラクタ
	{
		num2A = n;
		num2B = m;
		System.out.println("setMethod SuperClass2 num2A:"+num2A+",num2B:"+num2B);
	}
}

class SubClass2 extends SuperClass2	//extendsで継承できる
{
	private int addNum2;

	public SubClass2()	//子クラスのデフォルトコンストラクタ
	{
		addNum2 = 0;
		System.out.println("DefaultConstructor in SubClass2");
	}

	public SubClass2(int n, double m, int x)
	{
		super(n ,m);	//この1行を付加するとスーパークラスのコンストラクタを最初に呼び出すように指定できる
						//super()はコンストラクタの先頭に記述する必要がある
		//this(n,m);

		addNum2 = x;
		System.out.println("setMethod SubClass2 addNum2:"+ addNum2);
	}
}

public class ExtendsSuperCall
{

	public static void main(String[] args)
	{
		SubClass2 subvar1 = new SubClass2(1, 3.14, 3);

		//this(): そのクラスの別のコンストラクタを呼び出す
		//super(): そのクラスのスーパークラスのコンストラクタを呼び出す

	}

}
