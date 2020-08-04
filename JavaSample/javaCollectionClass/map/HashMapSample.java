package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample
{
	public static void main(String[] args)
	{
		// String型のキー、Integer型の値を持つHashMapオブジェクトを生成
		Map<String, Integer> map = new HashMap<String, Integer>();

		// putメソッドを用いmapに要素を追加
		map.put("pencil", 100);
		map.put("book", 1500);

		// getメソッドを用い指定したキーを持つ要素の値を取得
		System.out.println(map.get("pencil"));
		System.out.println(map.get("book"));
		System.out.println(map);
	}
}