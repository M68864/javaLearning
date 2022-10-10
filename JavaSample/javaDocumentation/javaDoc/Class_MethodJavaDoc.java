package javaDoc;

import java.util.HashMap;

/**
 * Classに対するJavaDoc書式
 *
 * @author M68864, MizuhoMutoh :[, ]区切りで複数名を記述できる
 * @since 2022/01/21 				:1.0など導入されたバージョンを書く、日付でも良い
 * @version 1.0 				:現在のバージョンを表す
 *
 * @see java.util.HashMap :参照したい資料名など記述する
 */
public class Class_MethodJavaDoc {


	/**
	 * Methodに対するJavaDoc書式
	 *
	 * @author M68864, MizuhoMutoh :[, ]区切りで複数名を記述できる
	 * @since 20200830 				:1.0など導入されたバージョンを書く、日付でも良い
	 * @version 1.0 				:現在のバージョンを表す
	 *
	 * @see java.util.HashMap :参照したい資料名など記述する
	 *
	 * @param int num :引数、パラメータに関する説明を入れる
	 * @param HashMap<String, Object> hm
	 * @return String :返り値に関する説明を記述する
	 *
	 * @throws
	 * @exception
	 */
	public String method(int num, HashMap<String, Object> hm) throws Exception{
		// 何か処理

		return new String();
	}


	@Deprecated //XXX:非推奨メソッドを指定する時に付ける
	public void method2 () {
		// 何か処理
	}


	 @category
	 @serialData
	 {@code}
	 {@docroot}
	 {@inheritDoc}
	 {@linkplain}
	 {@link}
	 {@literal}
	 {@value}

}
