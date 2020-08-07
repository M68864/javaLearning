package stdIO;

import java.io.IOException;

/**
 * コンソール出力でよく使うSystem.out.printやSystemクラスについて
 *
 * @author M68864
 * @see java.lang.System
 * @since 2020/08/08
 */
public class SystemInOutClass {

	/**
	 * System.in のフィールドinの定義は次の通り<br>
	 * public final static InputStream in = null;
	 *
	 * @return 入力値をasciiコード10進数に変換したもの
	 * @see java.lang.System
	 * @see java.io.InputStreamReader
	 * @see java.io.BufferedReader
	 * @see stdIO.StdIO
	 */
	public static void systemIn() {
		// 初歩的な使用例
		System.out.print("System.in.read()のinput:");
		int input;
		try {
			input = System.in.read(); // キー入力を input に代入
			System.out.println("input:" + input); // inputを出力
		} catch (IOException e) {
			System.out.println("エラーが起きました");
		}

		// これだと標準入力として使えないので、BufferedReaderクラスでラップすることで入力文字を
		// バッファに格納し、まとめて読み込めるようにしているのが、研修などでよく見た標準入力のコード
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * System.out のフィールドoutの定義は次の通り<br>
	 * public final static PrintStream out = null;
	 *
	 * @see java.lang.System
	 * @see java.io.PrintStream
	 */
	public static void systemOut() {
		// 初歩的な使用例は以下の通り
		System.out.println("System.out.println:" + 1 + 2);
		// 1 + 2 は引数内で後置されると演算されないので注意
		// javaでは + 演算子の働きは左辺の型を元にして判断される。
		// なので、"System.out.println:" + 1 → 文字列連結
		// <先程の文字列> + 2 → 文字列連結 という論理になる

		/**
		 * 書式を指定して出力もできる
		 * @see java.util.Formatter
		 * @see http://www.ne.jp/asahi/hishidama/home/tech/java/formatter.html
		 */
		String name = "西海岸";
		int carb = 45;
		System.out.printf("System.out.printf:%sでは%d口径が主流だ%n", name, carb);
	}

	/**
	 * System.err のフィールドerrの定義は次の通り<br>
	 * public final static PrintStream err = null;<br>
	 * これはSystem.outとは異なるエラーとしての出しわけができる<br>
	 * スタンドアローンの動作では同じコンソール上に表示されて、赤字で出力される
	 */
	public static void systemErr() {

		System.err.println("エラー文言の出力テスト");
	}

	/**
	 * 因みにSystemClassには端末やJava環境情報を出力してくれるメソッドが存在したりする
	 * @see java.lang.System
	 */
	public static void systemClass() {
		System.out.println("getProperties():" + System.getProperties());
		System.out.println("getenv():" + System.getenv());
	}

	public static void main(String[] args) {
		systemIn();
		systemOut();
		systemErr();
		systemClass();
	}
}
