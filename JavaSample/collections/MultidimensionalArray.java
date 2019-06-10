package collections;

public class MultidimensionalArray
{

	//多次元配列：2次元配列であれば、1次配列の箱の中に2次元配列の箱が入っているイメージ
	//ｎ次元座標のイメージで捉えてもＯＫ

	public static void main(String[] args)
	{
		/*
		 * このように変数を用意できるが・・・
		 * int[][] test = new int[2][3];
		 *
		 * test[0][0] = 80;
		 * test[0][1] = 70;
		 * test[0][2] = 60;
		 * test[1][0] = 1;
		 * test[1][1] = 2;
		 * test[1][2] = 3;
		 */

		int[][] test = {{80,70,60},{1,2,3}};

		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("配列["+i+"]"+"["+j+"]の要素は"+ test[i][j]);
			}
		}

		//多次元配列に対する.lengthの使い方

		System.out.println("一次元の要素数:" + test.length);	//一次元軸の要素数を出力する

		System.out.println("二次元の要素数:" + test[1].length);	//二次元軸の要素数を出力する書き方

	}

}
