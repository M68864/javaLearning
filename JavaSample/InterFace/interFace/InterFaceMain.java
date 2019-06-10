package interFace;

	//抽象メソッドと同様の働きをもつインターフェースについて学習する

	//インターフェースのメンバには何も修飾子をつけない
	//しかしながら、フィールドはpublic static final、 メソッドにはabstractがついたのと同じ状態になる

interface InterFace
{
	void show();
}

class Object3 implements InterFace
{
	private int num2A;
	private double num2B;

	public Object3(int n, double g)
	{
		num2A = n;
		num2B = g;
		System.out.println("Object3 constructor num2A:"+num2A+"num2A:"+num2A);
	}

	public void show()
	{
		System.out.println("Object3 showMethod");
	}
}

class Object4 implements InterFace
{
	private int num2C;

	public Object4(int f)
	{
		num2C = f;
		System.out.println("Object4 constructor");
	}

	public void show()
	{
		System.out.println("Object4 showMethod");
	}
}

class InterFaceMain
{
	public static void main(String[] args)
	{
		InterFace[] IF = new InterFace[2];

		IF[0] = new Object3(10, 3.141);

		IF[1] = new Object4(5);

		for(int i=0; i<IF.length; i++)
		{
			IF[i].show();
		}
	}
}