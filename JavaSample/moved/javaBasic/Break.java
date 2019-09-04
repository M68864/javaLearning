package javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Break {

	public static void main(String[] args) throws IOException {

		System.out.println("数字を入力して下さい。1-5");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());

		//switch文を使用するときは、breakを必ず入れること
		//breakなしだと全てのcaseを実行してしまう
		switch (num) {
		case 1:
		case 2:
			System.out.println("1 or 2");
		case 3:
		case 4:
			System.out.println("3 or 4");
		case 5:

		}
	}
}
