package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 厳密な計算を行いたい場合には、BigDecimal型を使用して演算する
 *
 * @author M68864
 * @since 2021/12/26
 */
public class BigDecimalUsage {


	/**
	 * BigDecimal型の生成法
	 * BigDecimalの四則演算がDouble型と比較してどうなるのか見ていく
	 */
	public static void main(String[] args) {

		// String⇒BigDecimal生成
		BigDecimal bigDcimlNumFrmStr = new BigDecimal("1.23");
		System.out.println("StringからNew BigDecimal生成：OKな生成例");
		System.out.println(bigDcimlNumFrmStr + "\n");

		// Double⇒BigDecimal型変数の生成はvalueOf()で行う
		BigDecimal bigDcimlNumFrmDbl = BigDecimal.valueOf(1.23);
		System.out.println("doubleからBigDecimal.ValueOf生成：OKな生成例");
		System.out.println(bigDcimlNumFrmDbl + "\n");

		// 特にdouble型をnewで生成すると、この時点で末尾に誤差が生じる
		BigDecimal doubleNum = new BigDecimal(Double.valueOf(1.23));
		//result → 1.229999999999999982236431605997495353221893310546875
		System.out.println("double→New BigDecimalによる生成:NGな生成例");
		System.out.println(doubleNum + "\n");

		// float⇒new BigDecimal生成も同様の結果
		float fltNum = (float) 1.23;
		BigDecimal fltToBigDcmlNum = new BigDecimal(fltNum);
		//result → 1.230000019073486328125
		System.out.println("float→New BigDecimalによる生成:NGな生成例");
		System.out.println(fltToBigDcmlNum + "\n");

		// BigDecimalベースでの演算
		BigDecimal bigDcmlNumFrmDbl_1 = BigDecimal.valueOf(7.0);
		BigDecimal bigDcmlNumFrmDbl_2 = BigDecimal.valueOf(3.0);

		// BigDecimalベースでの加算
		BigDecimal bigDcmlNumAddRslt = bigDcmlNumFrmDbl_1.add(bigDcmlNumFrmDbl_2);
		System.out.println("BigDecimalベースでの加算結果:");
		System.out.println(bigDcmlNumFrmDbl_1 +" + "+ bigDcmlNumFrmDbl_2 +" = "+ bigDcmlNumAddRslt + "\n");

		// BigDecimalベースでの減算
		BigDecimal bigDcmlNumSbtrctRslt = bigDcmlNumFrmDbl_1.subtract(bigDcmlNumFrmDbl_2);
		System.out.println("BigDecimalベースでの減算結果:");
		System.out.println(bigDcmlNumFrmDbl_1 +" - "+ bigDcmlNumFrmDbl_2 +" = "+ bigDcmlNumSbtrctRslt + "\n");

		// BigDecimalベースでの乗算
		BigDecimal bigDcmlNumMltplyRslt = bigDcmlNumFrmDbl_1.multiply(bigDcmlNumFrmDbl_2);
		System.out.println("BigDecimalベースでの乗算結果:");
		System.out.println(bigDcmlNumFrmDbl_1 +" × "+ bigDcmlNumFrmDbl_2 +" = "+ bigDcmlNumMltplyRslt + "\n");

		// BigDecimalベースでの除算
		BigDecimal bigDcmlNumDivRslt = bigDcmlNumFrmDbl_1.divide(bigDcmlNumFrmDbl_2, 18, RoundingMode.HALF_UP);
		System.out.println("BigDecimalベースでの除算結果(小数位スケール18桁):");
		System.out.println(bigDcmlNumFrmDbl_1 +" ÷ "+ bigDcmlNumFrmDbl_2 +" = "+ bigDcmlNumDivRslt + "\n");

		// Doubleベースでの除算
		Double dobNum1 = new Double(7.0);
		Double dobNum2 = new Double(3.0);
		Double dobDivRslt = (Double) dobNum1 / dobNum2;
		System.out.println("※Doubleベースでの除算結果:");
		System.out.println(dobNum1 +" ÷ "+ dobNum2 +" = "+ dobDivRslt + "\n");
	}
}
