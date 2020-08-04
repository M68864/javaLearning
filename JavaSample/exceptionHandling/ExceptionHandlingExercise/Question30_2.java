package ExceptionHandlingExercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question30_2 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字を入力してください");
		String str = null;
		try {
			str = br.readLine();

			int num = Integer.parseInt(str);
			System.out.println(num + "が入力されました");
		} catch (Exception e) {
			System.out.println("例外が発生しました");
		} finally{
			System.out.println("システムを終了します");
		}
	}
}
