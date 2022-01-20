package systemDateTimeBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日時の書式を設定するSimpleDateFormatClass
 *
 * @author M68864
 * @since 2022/01/20
 *
 * @see java.text.SimpleDateFormat
 * @see <a href="https://docs.oracle.com/javase/jp/8/docs/api/java/text/SimpleDateFormat.html">クラスSimpleDateFormat</a>
 */
public class SimpleDateFormatClass {

	public static void main(String[] args) {

		// Date基本取得と表示
		Date date = new Date();
		System.out.println("現在日時DateTime:" + date.toString());

		// Dateのデフォルト表示を「YYYY/MM/DD」という表示にしたい
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD");
		String strDate = sdf.format(date);
		System.out.println("YYYY/MM/DD書式の現在日時" + strDate);

		// 書式形式をStringで取得もできる
		System.out.println(sdf.toPattern());

		// 書式設定における英字の意味合いは以下の通り
		/**	文字	日付または時刻のコンポーネント	表示		例
		 *	G		紀元							テキスト	AD
		 *	y		年								年			1996; 96
		 *	Y		暦週の基準年					年			2009; 09
		 *	M		年における月(状況依存)			月			July; Jul; 07
		 *	L		年における月(スタンドアロン形式)月			July; Jul; 07
		 *	w		年における週					数値		27
		 *	W		月における週					数値		2
		 *	D		年における日					数値		189
		 *	d		月における日					数値		10
		 *	F		月における曜日					数値		2
		 *	E		曜日の名前						テキスト	Tuesday; Tue
		 *	u		曜日の番号(1 =月曜、...、7 =日曜)	数値	1
		 *	a		午前/午後						テキスト	PM
		 *	H		一日における時(0 - 23)			数値		0
		 *	k		一日における時(1 - 24)			数値		24
		 *	K		午前/午後の時(0 - 11)			数値		0
		 *	h		午前/午後の時(1 - 12)			数値		12
		 *	m		分								数値		30
		 *	s		秒								数値		55
		 *	S		ミリ秒							数値		978
		 *	z		タイムゾーン		一般的なタイムゾーン	Pacific Standard Time; PST; GMT-08:00
		 *	Z		タイムゾーン		RFC 822タイムゾーン		-0800
		 *	X		タイムゾーン		ISO 8601タイムゾーン	-08; -0800; -08:00
		 */

		// 例として、MMMMはロケールが日本なのでMM月、HHは24h表記
		String strDateTime_YYYYMMMMDD_HHmmssSSS = new SimpleDateFormat("YYYY年MMMMDD日 HH:mm:ss.SSS").format(date);
		System.out.println("YYYY年MM月DD日 HH:mm:ss.SSS形式の時刻:" + strDateTime_YYYYMMMMDD_HHmmssSSS);

		/** ロケールをUSに設定、calendarクラスを使用した別バージョン
		 *  hhは12h表記
		 *
		 * @see java.util.Calendar
		 * @see java.util.Calendar#getTime
		 * @see java.util.Locale
		 */
		Calendar cal = Calendar.getInstance();
		Date calDateTime = cal.getTime();

		SimpleDateFormat sdf_US_Cal = new SimpleDateFormat("YYYY MMM dd hh:mm:ss z", Locale.US);
		String strDateTime_YYYYMMMdd_hhmmss = sdf_US_Cal.format(calDateTime);
		System.out.println("YYYY MMM dd hh:mm:ss z形式の時刻:" + strDateTime_YYYYMMMdd_hhmmss);
	}
}
