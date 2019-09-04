package javaBasic;

import java.math.BigDecimal;

public class BigDecimalUsage {

	public static void main(String[] args) {
		
		//厳密な計算を行いたい場合には、BigDecimal型を使用して演算する
		//基本的にBigDecimal型変数の生成はvalueOf()で行う
		BigDecimal three = BigDecimal.valueOf(3);
		
		//特にdouble型をnewで生成すると、この時点で末尾に誤差が生じる
		BigDecimal doubleNum = new BigDecimal(3.463);
		//result → 3.46300000000000007815970093361102044582366943359375
		System.out.println("double→BigDecimalのnewによる生成" + doubleNum);
		
		BigDecimal div = three.divide(BigDecimal.TEN);
		System.out.print(div);
		//System.out.print(three2);
		

	}



}
