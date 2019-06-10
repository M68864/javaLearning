package classAdvanced;

	//オーバーロード：同じクラスの中に、同じ名前をもつメソッドを２つ以上定義する

class Object2
{
	private int num1;
	private double num2;

	public void setMethod(int x)
	{
		num1 = x;
		System.out.println("setMethod(int)でnum1を設定：" + num1);
	}

	public void setMethod(double y)
	{
		num2 = y;
		System.out.println("setMethod(double)でnum2を設定：" + num2);
	}

	public void setMethod(int x, double y)
	{
		num1 = x;
		num2 = y;
		System.out.println("setMethod(int, double)で次の値を設定num1：" + num1 +",num2:"+num2);
	}
	//このように同じ名前の複数のメソッドを、同じクラス内に定義することができる
	//但し、各メソッドの引数の型・個数は異なるようにしておく必要がある

	public void show()
	{
		System.out.println("showメソッド表示num1:"+num1+",num2："+num2);
	}
}

public class OverLoading
{

	public static void main(String[] args)
	{
		Object2 var = new Object2();

		var.setMethod(1, 3.1415);
		var.show();

		System.out.println("num1だけ変更したい時");
		var.setMethod(2);
		var.show();

		System.out.println("num2だけ変更したい時");
		var.setMethod(3.14159);
		var.show();

		//setMethodのような１つの名前が、その状況に応じて別々の働きをもつことを多態性（ポリモフィズム）という
	}

}
