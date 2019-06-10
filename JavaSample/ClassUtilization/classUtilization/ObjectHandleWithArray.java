package classUtilization;

	//オブジェクトを配列に代入して扱う方法を学ぶ

class ObjectArray
{
	private int numA;
	private double numB;

	public ObjectArray()
	{
		numA = 0;
		numB = 0.0;
		System.out.println("ObjectArray generated");
	}

	public void setObjectArray(int n, double m)
	{
		numA = n;
		numB = m;
		System.out.println("setObjectArray method numA:"+numA+", numB"+numB);
	}

	public void show()
	{
		System.out.println("ObjectArray show method");
	}
}

public class ObjectHandleWithArray
{

	public static void main(String[] args)
	{
		ObjectArray[] ObjectArrays = new ObjectArray[3];	//配列の生成

		for(int i=0; i<ObjectArrays.length; i++)
		{
			ObjectArrays[i] = new ObjectArray();	//オブジェクトの生成
		}

		ObjectArrays[0].setObjectArray(1, 3.1);
		ObjectArrays[1].setObjectArray(2, 3.14);
		ObjectArrays[2].setObjectArray(3, 3.141);

		for(int i=0; i<ObjectArrays.length; i++)
		{
			ObjectArrays[i].show();
		}

	}

}
