package collections;

public class ArrayEtendedFor
{

	public static void main(String[] args)
	{
		int[] test = new int[3];

		test[0] = 2;
		test[1] = 5;
		test[2] = 9;

		//拡張for文
		//for(取り出した要素を格納する変数 ： ループさせたい配列変数)
		for(int num:test)
		{
			System.out.println(num);
		}

	}

}
