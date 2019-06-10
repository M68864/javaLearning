package ReferenceCall_ClassVariable;

	//参照渡し：二つの変数が一つの同じオブジェクトを指し示す変数の代入

public class ReferenceCall_ClassVariable
{

	public static void main(String[] args)
	{
		ObjectClass var1 = new ObjectClass();
		System.out.println("var1を宣言,作成");
		var1.setObject(1, 3.14);

		ObjectClass var2 = new ObjectClass();
		System.out.println("var2を宣言,作成");

		var2 = var1;

		var1.show();
		var2.show();

		var1.setObject(2, 3.1415);
		var1.show();
		var2.show();

		//var2 = var1	という代入はvar2とvar1は同じオブジェクトを参照するようになることを意味する
		//このことを参照渡しという


	}

}
