package collections;

public class ArrayLength
{
	//配列の長さを知る

	public static void main(String[] args)
	{
		int[] test = {4,6,8,9};

		System.out.println("配列test1の要素数は" + test.length);


		//このようにtest.lengthを使える
		for(int i=0; i<test.length; i++)
		{
			System.out.println((i+1) + "番目の内容は"+ test[i]);
		}

	}

}
