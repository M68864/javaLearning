package enumClass;

public class EnumClass extends StringClass {

	private static final String str2 = "ストリング";

	enum CarBrand {TOYOTA,
					NISSAN,
					SUBARU,
					AUDI,
					BMW,
					HONDA}

	public static void main(String[] args) {

		String str1 = "avengers";

		StringClass strClass = new StringClass();

		if (STR == strClass.getStr()) {
			System.out.println("比較結果1：" + true);
		}

		if (str1.equals(strClass.getStr())) {
			System.out.println("比較結果2：" + true);
		}
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(strClass.getStr());
		System.out.println(strClass.getStr().hashCode());

	}
}

class StringClass {
	static final String STR = "ストリング";

	public String getStr() {

		StringBuilder strBld = new StringBuilder("aven");
		strBld.append("gers");

		return strBld.toString();
	}

}

