package classUtilization;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample
{
	public static void main(String[] args)
	{
		// String型のArrayListオブジェクトを生成
		List<String> list = new ArrayList<String>();

		// addメソッドを用いlistに要素を追加
		list.add("GoodMorning");
		list.add("Hello");
		list.add("GoodBye");

		// removeメソッドを用い先頭要素を削除
		list.remove(0);

		// sizeメソッドを用いlistの要素数を取得
		for (int i = 0; i < list.size(); i++)
		{
			// getメソッドを用いlistの要素を取得
			System.out.println(list.get(i));
		}

		// 上記の処理を拡張for文で実装した場合
		for (String str : list)
		{
			System.out.println(str);
		}
	}
}