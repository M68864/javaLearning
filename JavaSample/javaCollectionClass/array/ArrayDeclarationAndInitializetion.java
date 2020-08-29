package array;

/**
*
* 配列(array)の宣言と初期化の方法について
*
* @author M68864
* @see java.util.Arrays
* @since 2020/08/30
*/
public class ArrayDeclarationAndInitializetion {

	/**
	*
	* 一次元配列の宣言と初期化
	*/
	private static void oneDimensionalArray() {

		// 配列の宣言
		int[] array1;
		int array2[];

		// 配列インスタンスの生成
		int[] array = new int[3];

		// 配列の初期化
		int[] arrayIni = { 10, 20, 30 };

		/**
		 * 配列型変数には、配列インスタンスへの参照を代入している。
		 * 変数に値が直接入るわけではない。
		 * 上の「配列インスタンスの生成」では3つのint型要素を扱う配列インスタンスを生成し、
		 * その参照を配列型変数arrayに代入している。
		 */

		/**
		 * ＜配列要素のデフォルト値＞
		 * 配列インスタンスを生成した直後は、各型において次の値で初期化されている
		 * 整数型：0
		 * 浮動小数点数型：0.0
		 * 真偽型：false
		 * 文字型：\u0000(UTF-8においてnull文字を示す)
		 * 文字列型：null
		 * オブジェクト型：null
		 */
		int[] intAry = new int[1];
		System.out.println("整数型デフォルト値：" + intAry[0]);

		double[] dblAry = new double[1];
		System.out.println("浮動小数点数型デフォルト値：" + dblAry[0]);

		boolean[] blnAry = new boolean[1];
		System.out.println("真偽型デフォルト値：" + blnAry[0]);

		char[] chrAry = new char[1];
		System.out.println("文字型デフォルト値：" + chrAry[0]);

		String[] strAry = new String[1];
		System.out.println("文字列型デフォルト値：" + strAry[0]);

		Object[] objAry = new Object[1];
		System.out.println("オブジェクト型デフォルト値：" + objAry[0]);
	}

	/**
	*
	* 多次元配列の宣言と初期化
	*/
	private static void multiDimensionalArray() {

		// 二次元配列の宣言
		int[][] mltArray2d_1;
		int mltArray2d_2[][];
		int[] mltArray2d_3[];

		// 三次元配列の宣言
		int[][][] mltArray3d_1;
		int mltArray3d_2[][][];
		int[][] mltArray3d_3[];
		int[] mltArray3d_4[][];

		/**
		 * 多次元配列のインスタンス生成
		 *
		 * 多次元のインスタンス生成においては、要素数を全ての次元で最初に定義するしなくてもOK
		 * 但し、一次元目だけは定義しておかないとエラーになる
		 */
		int[][] mltArray = new int[3][];
		// このようにn次元目以降は後から次元を定義できる
		mltArray[0] = new int[1];
		mltArray[1] = new int[2];
		mltArray[2] = new int[3];
		// またn次元目以降の要素数がバラバラの配列を「非対称な多次元配列」という
	}

	public static void main(String[] args) {
		oneDimensionalArray();
		multiDimensionalArray();
	}

}
