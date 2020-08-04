package classMethodBasic;

public class CallSelfMethod {
	public static void main(String[] args) {
		CalledClass calledClass = new CalledClass();
		calledClass.firstMethod();
	}
}

class CalledClass extends AbstractCalledClass {

	private void calledMethod() {
		System.out.println("Called Method");
	}

	void firstMethod() {
		//下の2つの呼出はどちらも、自クラスのメソッドを呼ぶサンプル
		calledMethod();
		this.calledMethod();

		//継承の親クラスかつ抽象クラスで定義されているメソッドも自クラスのメソッドとして呼び出せる
		abstractCalledMethod();
		this.abstractCalledMethod();
	}

	/**
	 * interfaceの実装は別のファイルで定義しておく
	 */
	public void ab(int a) {
		System.out.println("Called");
	}
}

abstract class AbstractCalledClass implements Ab {

	void abstractCalledMethod() {
		System.out.println("Called a Method in abstract class");
	}

	public void ab() {
		System.out.println("Called");
	}
}

interface Ab {

	void ab(int a);
}
