package interFace;

	//インターフェースを二つ以上実装できることを学ぶ

interface InterFace1
{
	void show1();
}

interface InterFace2
{
	void show2();
}

class ObjectLolipop implements InterFace1, InterFace2
{
	private int num;
	private double pi;

	public ObjectLolipop(int n, double p)
	{
		num = n;
		pi = p;
		System.out.println("ObjectLolipop constructor num:"+num+"pi:"+pi);
	}

	public void show1()
	{
		System.out.println("ObjectLolipop show1Method");
	}

	public void show2()
	{
		System.out.println("ObjectLolipop show2Method");
	}

}

public class MultiInterFace
{

	public static void main(String[] args)
	{
		ObjectLolipop ObjectLolipop1 = new ObjectLolipop(3, 3.14159);
		ObjectLolipop1.show1();
		ObjectLolipop1.show2();
	}

}
