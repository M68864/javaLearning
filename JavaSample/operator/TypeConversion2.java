package operator;

public class TypeConversion2
{

	public static void main(String[] args)
	{

		//数値文字列→基本データ型に変換
        byte by = Byte.parseByte("123");
        short sh = Short.parseShort("123");
        int in = Integer.parseInt("123");
        long ln = Long.parseLong("123");
        float fl = Float.parseFloat("123");
        double db = Double.parseDouble("123");
        boolean bo = Boolean.parseBoolean("true");

        //数値→文字列に変換
        String str1 = Integer.toString(123); //こちらを使った方が良いらしい
        String str2 = String.valueOf(123);


        //画面表示
        System.out.println("byte:" + by);
        System.out.println("short:" + sh);
        System.out.println("int:" + in);
        System.out.println("long:" + ln);
        System.out.println("float:" + fl);
        System.out.println("double:" + db);
        System.out.println("boolean:" + bo);
        System.out.println("String:" + str1);
        System.out.println("String:" + str2);



	}

}
