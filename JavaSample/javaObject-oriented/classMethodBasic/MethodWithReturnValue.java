package classMethodBasic;

class Object4
{
	int num4Int;
	double num4Double;

	int getNum2A()	//入力引数付のメソッドその1
	{
		System.out.println("フィールドint情報はnum4Intで" + num4Int);
		return num4Int;
	}
	double getNum2B()	//入力引数付のメソッドその2
	{
		System.out.println("フィールドdouble情報num4Doubleで" + num4Double);
		return num4Double;
	}
	void setNum(int a, double b)
	{
		num4Int = a;
		num4Double = b;

		System.out.println("引数から入力されたint情報は" + num4Int);
		System.out.println("引数から入力されたdouble情報は" + num4Double);
	}
}


public class MethodWithReturnValue
{

	public static void main(String[] args)
	{

		Object4 variable = new Object4();

		variable.setNum(5, 1.123);	//どうやらsetメソッドは引数を代入するときに用いるらしい

		//戻り値を利用するには、メソッドの呼び出し元で変数に代入する必要がある
		//どうやらgetメソッドは戻り値のあるメソッドをmain methodで出力したいときに用いるらしい
		int numberInt = variable.getNum2A();
		double numberDouble = variable.getNum2B();

		System.out.println("getNum2Aのreturnはnum4Intで" + numberInt +"getNum2Bのreturnはnum4Doubleで"+ numberDouble);

	}

}
