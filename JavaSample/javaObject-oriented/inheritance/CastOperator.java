package inheritance;

public class CastOperator {

	public static void main(String[] args) {
		double doubleNum = 160.5;

		/*
		*キャスト演算子
		*/
		int intNum = (int) doubleNum;
		//小さな型intに大きな型doubleを代入する際はキャストが必要
		System.out.println(intNum);

		/*
		*異なる型同士で演算する
		*/
		int r = 3;
		double pi = Math.PI;
		double square = (r^2)*pi;
		//大小の型が混在している場合は、大きい型doubleに戻り値が合うようになる
		System.out.println(square);

		/*
		 *同じ型同士で演算する
		 */
		int num1 = 5;
		int num2 = 4;

		double div = num1/num2;
		//この場合、num1及びnum2はint型であるため、戻り値もintで導出される
		System.out.println(div);

		//右辺を望みの型にキャストすることで正確な値を表示できる
		double div2 = (double)num1/num2;
		System.out.println(div2);

		//floatやdoubleで小数計算を行うと誤差が生じるため、厳密な計算の際にはBigDecimalクラスを利用する


	}

}
