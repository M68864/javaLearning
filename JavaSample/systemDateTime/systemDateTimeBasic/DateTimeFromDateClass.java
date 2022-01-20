package systemDateTimeBasic;

import java.util.Date;

/**
 * java.util.Dateクラスを用いた現在日付の取得
 * java8以降では非推奨メソッドが多い
 * ロケール対応していないので、より洗練されたCalendarを使う方が無難
 *
 * @author M68864
 * @since 2022/01/16
 *
 * @see java.util.Date
 * @see java.util.Calendar
 * @see systemDateTimeBasic.DateTimeFromCalendarClass
 */
public class DateTimeFromDateClass {

	public static void main(String[] args) {

		// Date基本取得と表示
		Date date = new Date();
		System.out.println("現在日時DateTime:" + date.toString());

		// Dateオブジェクトのクローン生成
		Date dateClone = (Date) date.clone();

		// getTime()：1970年1月1日00:00:00 GMTからの経過ms数を返す
		long dateMiliScnds = dateClone.getTime();
		System.out.println("1970年1月1日00:00:00 GMTからの経過時間(ms):" + dateMiliScnds);

		// 逆に1970年1月1日00:00:00 GMTからの経過ms数をInputとしてDateオブジェクト生成もできる
		Date date20250319 = new Date(1742341207690L);
		System.out.println("1742341207690L(ms)の現在日時:" + date20250319);

		// after(Date):引数日付より後ろにあるか判定
		boolean blnAfter判定 = date.after(date20250319);
		System.out.println("afterメソッドの判定:" + blnAfter判定);

		// before(Date):引数日付より前にあるか判定
		boolean blnBefore判定 = date.before(date20250319);
		System.out.println("beforeメソッドの判定:" + blnBefore判定);

		// equals():2つの日付が等しいかどうか判定
		boolean blnEqls判定 = date.equals(dateClone);
		System.out.println("equalsメソッドの判定:" + blnEqls判定);

		// compareTo():2つのDateを比較する
		// 1:引数Date < Dateの場合
		// 0:Dateが引数Dateと同じ場合
		// -1:Date < 引数Dateの場合
		int intCompDate = date.compareTo(date20250319);
		System.out.println("compareToメソッドの判定:" + intCompDate);
	}
}
