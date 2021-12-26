package enumClass;

import java.math.BigDecimal;

public class EnumClass {

	enum CarBrand {TOYOTA,
					NISSAN,
					SUBARU,
					AUDI,
					BMW,
					HONDA}

	public static void main(String[] args) {

		Double dob1 = new Double(7);
		Double dob2 = new Double(3);
		Double dob3 = (Double)dob1/dob2;
		//char[] char1 = dob3.toString().toCharArray();
		System.out.println(dob3);

		BigDecimal num1 = new BigDecimal(7);
		BigDecimal num2 = new BigDecimal(3);
		BigDecimal num3 = num1.divide(num2).scaleByPowerOfTen(10);
		System.out.println(num3);

//		char[] char2 = num3.toString().toCharArray();
//		for (int ite = 0; ite < char1.length; ite++) {
//
//			char str1 = char1[ite];
//			char str2 = char2[ite];

			//System.out.print(str1);

//				if (str1 != str2) {
//					System.out.println(ite);
//					System.out.println(str1);
//				}

//			}
	}
}


