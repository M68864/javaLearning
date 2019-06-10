package collections;

public class ArrayVariableSubsitution
{
	//配列変数の配列を代入してみる

	public static void main(String[] args)
	{
		int[] test1 = new int[3];	//1つ目の配列セットを宣言

		test1[0] = 80;
		test1[1] = 50;
		test1[2] = 40;

		int[] test2; //2つ目の配列変数だけを宣言

		test2 = test1;	//test2にtest1を代入

		for(int i=0; i<3; i++)
		{
			System.out.println("test1の配列内容は" + (i+1) +"番目が"+ test1[i] );
		}

		for(int i=0; i<3; i++)
		{
			System.out.println("test2の配列内容は" + (i+1) +"番目が"+ test2[i] );
		}

		System.out.println("test1の配列要素の値を変更してみる");

		test1[2]=100;

		//再度test1、test2を表示させてみる

		for(int i=0; i<3; i++)
		{
			System.out.println("test1の配列内容は" + (i+1) +"番目が"+ test1[i] );
		}

		for(int i=0; i<3; i++)
		{
			System.out.println("test2の配列内容は" + (i+1) +"番目が"+ test2[i] );
		}

		//test2の値も変更されている。これは配列変数は参照型変数であり、test2はtest1の配列内容を参照渡しされているため、test1及びtest2ともに同じ配列を参照していることから



	}

}
