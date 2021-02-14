package abstructClass;

//抽象クラスの説明と使い方について記述する

//抽象クラスはオブジェクト生成ができないので、サブクラスで定義してオブジェクト生成する

/**
 * 抽象クラス本体
 *
 * @author M68864
 * @since 2021/02/13
 */
abstract class AbstractClass {

	protected int num1A;

	public void setMethod(int s) {
		num1A = s;
		System.out.println("setMethod num1A:" + num1A);
	}

	abstract void show(); //抽象クラスにはメソッドの内容が何も書かれていない抽象メソッドが存在する
}

/**
 * 抽象クラスを継承した実体クラス
 *
 * @author M68864
 * @since 2021/02/13
 */
class EntityClass extends AbstractClass {

	private int num1B;
	private double num1C;

	//パブリックなコンストラクタ
	public EntityClass(int n, double g) {
		num1B = n;
		num1C = g;
		System.out.println("EntityClass constructor num1B:" + num1B + "num1C:" + num1C);
	}

	public void show() {
		System.out.println("EntityClass showMethod num1A:" + num1A + "num1B:" + num1B + "num1C:" + num1C);
	}
	//抽象クラスを拡張したサブクラスはどれも、抽象クラスの抽象メソッド（show()method）と同じ名前のメソッドを必ずもっている

}

/**
 * 抽象クラスを継承した実体クラス
 *
 * @author M68864
 * @since 2021/02/13
 */
class Object2 extends AbstractClass {

	private int num1D;

	public Object2(int f) {
		num1D = f;
		System.out.println("Object2 constructor num1D:" + num1D);
	}

	public void show() {
		System.out.println("Object2 show Method");
	}
}

/**
 * 各クラスの検証クラス
 *
 * @author M68864
 * @since 2021/02/13
 */
public class AbstractClassMain {

	public static void main(String[] args) {
		AbstractClass[] ac = new AbstractClass[2]; //抽象クラスの配列を用意する

		ac[0] = new EntityClass(1, 3.14); //一番目のオブジェクト
		ac[0].setMethod(5);

		ac[1] = new Object2(99); //二番目のオブジェクト
		ac[1].setMethod(500);

		for (int i = 0; i < ac.length; i++) {
			ac[i].show();
		}
	}
}
