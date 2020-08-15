package operator;

public class TypeConversion
{
	//型変換のお約束

	public static void main(String[] args)
	{
		//大きなサイズの型に小さなサイズの型を代入することはそのまま可能
		int inum = 160;
		double dnum = inum;
		System.out.println("dnum= " + dnum);


		//小さなサイズの型に大きなサイズの型を代入するときはキャスト演算子が必要
		double dnum2 = 160.5;
		int inum2 = (int)dnum2; //int型にキャストした。ただし、小数部分はint型に適合するように切り捨てられる
		System.out.println("inum2=" + inum2);


		//異なる型同士の演算：　一方のオペランドは大きなサイズの型に変換される
		int d = 2;
		double pi = 3.14;
		System.out.println("Circle Round is " + (d*pi)); //この演算ではint型のdはdouble型に変換される


		//同じ型同士の演算
		int num1 = 5;
		int num2 = 4;
		double div = num1 / num2;
		System.out.println(div + ":Wrong Ans");
		//実はきちんとした表記になっていない状態で答えが出力される

		//この場合は少なくとも一方のnumをdoubleに型変換する必要がある
		int num3 = 5;
		int num4 = 4;

		double div2 = (double)num3 / num4;
		double div3 = num3 / (double)num4;
		double div4 = (double)num3 / (double)num4;

		System.out.println(div2 + ":Appropriate Ans1");
		System.out.println(div3 + ":Appropriate Ans2");
		System.out.println(div4 + ":Appropriate Ans3");

	}

}
