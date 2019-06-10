package classMethodBasic;

class Object3
{
	int num3a;
	double num3b;
	String string;

	void setNumA(int n)	//入力引数付のメソッドその1
	{
		num3a = n;
		System.out.println("フィールドint情報は" + num3a);
	}
	void setNumB(double m, String string1)	//入力引数付のメソッドその2
	{
		num3b = m;
		string = string1;
		System.out.println("フィールドdouble情報は" + num3b + ",string情報は" + string);
	}
	void show()
	{
		System.out.println("フィールドint情報は" + num3a);
		System.out.println("フィールドdouble情報は" + num3b);
	}
}


class MethodWithArgument
{

	public static void main(String[] args)
	{
		Object3 variable = new Object3();

		variable.setNumA(5);
		variable.setNumB(1.263,"moji");


		/*
		 * 引数として変数を渡すこともできる
		 *
		 * int x = 5;
		 * double y = 10;
		 *
		 * variable.setNum(x);
		 * variable.setNum2(y);
		 */


	}

}
