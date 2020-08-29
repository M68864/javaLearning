package stdIO;

//標準入出力(standardIO)を行うときに必要なメソッド
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author M68864
 * @see java.io.InputStreamReader
 * @see java.io.BufferedReader
 * @see stdIO.SystemInOutClass
 * @since 2020/08/08
 */
public class StdIO {

	public static void main(String[] args) throws IOException { //標準入出力においは throws IOException でのハンドリングが必要

		System.out.println("何か入力してみよ？？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//これも標準入出力に必要

		String str1 = br.readLine();	//キーボードから入力した文字列をstrに読み込む

		System.out.println("「" + str1 + "」" + "が入力されたyo");



		//２つ以上の入力を行うとき
		System.out.println("下になんか整数を入力してみよ？？");

		String str2 = br.readLine();	//新しく変数宣言をした一行を足していけばいくつもの入力ができるようになる

		int num = Integer.parseInt(str2);	//標準入力は文字列として入力されるので扱うデータに沿った型変換が必要

		System.out.println("int型整数「" + num + "」" + "として出力されたyo");

		System.out.println(1 + 2 + ":" + 1 + 2);

	}

}
