package exceptionHandling;

//例外処理の方法について学ぶ

public class ExceptionHandling
{
	public static void main(String[] args)
	{

		try	//try: 例外の発生を調べる文
		{
			int[] test = new int[5];

			test[10] = 90;

			// 配列要素数を超える入力
		}
		catch (ArrayIndexOutOfBoundsException e)	//例外発生時の処理を記述する文
		{
			System.out.println("Over the number of Array elements");
		}
		finally	//例外の有無に関わらず、必ず最後に実行される文
		{
			System.out.println("End of sequence");
		}

		//tryブロックでおきた例外に対するcatchブロックがみつからなかった場合には、処理中のメソッドの呼び出し元のメソッドに戻って、catchブロックが探されることになっている
	}
}
