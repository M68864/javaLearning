package generalMathClass;

public class MathClass
{

	//数値演算に使うであろうMathクラスを列記する

	public static void main(String[] args)
	{
		double n1 = Math.abs(-3.14);	//double型の引数の絶対値を返す
		System.out.println("n1:"+n1);

		int n2 = Math.abs(-3);	//int型の引数の絶対値を返す
		System.out.println("n2:"+n2);

		double n3 = Math.ceil(3.1415);	//double型の引数以上で最も小さい整数値をdouble型で返す
		System.out.println("n3:"+n3);

		double n4 = Math.cos(Math.PI/3);	//引数の角度のコサイン値を返す
		System.out.println("n4:"+n4);		//円周率πは Math.PI で取り出せるらしい

		double n5 = Math.floor(3.1415);	//double型の引数以下で最も大きい整数値をdouble型で返す
		System.out.println("n5:"+n5);

		double n6 = Math.max(3.14, 3.1415);	//二つのdouble型の引数のうち大きい値を返す
		System.out.println("n6:"+n6);

		int n7 = Math.max(3, 4);	//二つのint型の引数のうち大きい値を返す
		System.out.println("n7:"+n7);

		double n8 = Math.min(3.14, 3.1415);	//二つのdouble型の引数のうち小さい値を返す
		System.out.println("n8:"+n8);

		int n9 = Math.min(3, 4);	//二つのint型の引数のうち小さい値を返す
		System.out.println("n9:"+n9);

		double n10 = Math.pow(2, 10);	//一番目の引数を二番目の引数で累乗した結果を返す
		System.out.println("n10:"+n10);

		double n11 = Math.random();	//乱数を返す
		System.out.println("n11:"+n11);

		double n12 = Math.rint(3.1415);	//double型の引数に最も近い整数値を返す
		System.out.println("n12:"+n12);

		double n13 = Math.sin(Math.PI/4);	//引数の角度のサイン値を返す
		System.out.println("n13:"+n13);		//円周率πは Math.PI で取り出せるらしい

		double n14 = Math.sqrt(3);	//double型の引数の平方根を返す
		System.out.println("n14:"+n14);

		double n15 = Math.tan(Math.PI/4);	//引数の角度のタンジェント値を返す
		System.out.println("n15:"+n15);		//円周率πは Math.PI で取り出せるらしい
	}

}
