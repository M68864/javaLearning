package array;

import java.util.Arrays;

/**
 * 配列を利用するにあたり便利なメソッドなど
 *
 * @author M68864
 * @see java.util.Arrays
 * @since 2020/08/30
 */
public class ArrayLength_Sort {

	/**
	 * length:配列の要素数を取得する
	 */
	private static void arrayLength() {

		String[] strAry = { "Alpha", "Beta", "charly" };

		int aryLength = strAry.length;
		System.out.println("aryLength:" + aryLength);
	}

	/**
	 * Arraysクラスを利用して配列の要素をソートする
	 * @see java.util.Arrays
	 */
	private static void arraySort() {

		int[] intArray = { 10, 30, 20 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("ソート前の配列[" + i + "]:" + intArray[i]);
		}

		// このsortメソッドは配列インスタンスの参照元をそのまま並び替えるので注意
		Arrays.sort(intArray);

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("ソート後の配列[" + i + "]:" + intArray[i]);
		}
	}

	public static void main(String[] args) {
		arrayLength();
		arraySort();
	}
}
