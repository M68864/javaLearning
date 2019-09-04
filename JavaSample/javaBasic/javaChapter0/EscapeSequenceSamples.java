package javaChapter0;

public class EscapeSequenceSamples
{

	/**
	 * エスケープシーケンスとそのパターンに関する説明
	 */
	public static void main(String[] args)
	{

		//エスケープシーケンス(\)を使って特殊な文字を表したり、処理を実行することができる

		System.out.println("以下では＜＞内にエスケープシーケンス(\\)の表出を記載\n");

		//\b：バックスペース
		System.out.println("バックスペース:＜\b＞\n");


		//\t:水平タブ
		System.out.println("水平タブ:＜\t＞\n");


		//\n：改行
		System.out.println("改行:＜\n＞\n");


		//\f：改ページ
		System.out.println("改ページ:＜\f＞\n");


		//\r：復帰
		//カーソルを同じ行内の行頭に戻す機能だが、なぜ改行になるのかは謎
		//MacOS系のCR(\r)がwinの出力ではLF(\n)に変換されている？？
		System.out.println("復帰:＜\r＞\n");


		//\'：アポストロフィ
		System.out.println("アポストロフィ:＜\'＞\n");


		//\"：ダブルクオーテーション
		System.out.println("ダブルクオーテーション:＜\"＞\n");


		//\\：\\マーク
		System.out.println("\\マーク:＜\\＞\n");


		//8進数○○○の文字コードをもつ文字、ここではunicodeの8進数「101」の文字コードでAが出力される
		System.out.println("8進数○○○の文字コードに相当する文字：\\101 = ＜\101＞\n");


		//;ここではunicodeの16進数「u0061」の文字コードでaが出力される
		System.out.println("16進数hhhhの文字コードをもつ文字：\\u0061 = ＜\u0061＞\n");


		System.out.print("Ex: 少年老い易く　学成り難し\n\t一寸の光陰軽んずべからず");

	}
}
