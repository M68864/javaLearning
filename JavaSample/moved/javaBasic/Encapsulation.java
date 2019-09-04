package javaBasic;

/**
 * setter, getterを実装することにより、クラス外からprivateフィールドにアクセスする手段を得る
 * このprivateフィールドへのアクセスを制限する実装をカプセル化という
 */
public class Encapsulation {
	
	private String str;
	private int num;

	//publicなsetterを用意することにより、privateなメンバに値を設定できる
	public void setValue(String str, int num) {
		this.str = str;
		this.num = num;	
	}
	
	//各々のメンバに対応したgetterを用意することにより、値の取り出しができる
	public String getStr() {
		return this.str;
	}
	public int getNum() {
		return this.num;
	}
}
