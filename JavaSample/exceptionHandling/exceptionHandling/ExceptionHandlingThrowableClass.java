package exceptionHandling;

	//どんな例外が起きているのかを知らせる手法をシステムに組み込む

public class ExceptionHandlingThrowableClass
{

	public static void main(String[] args)
	{
		try
		{
			int[] test = new int[5];

			test[10] = 90;

		}
		catch (ArrayIndexOutOfBoundsException e)	//変数eに例外を受け取る
		{
			System.out.println("Over the number of Array elements");
			System.out.println("The category of Exception:" + e);
		}
		catch(Exception e)
		{
			//スーパークラスの変数を使うと、その下のサブクラスの例外全てを受け止めて処理できる
		}
		finally	//例外の有無に関わらず、必ず最後に実行される文
		{
			System.out.println("End of sequence");
		}

		//tryブロックでおきた例外に対するcatchブロックがみつからなかった場合には、処理中のメソッドの呼び出し元のメソッドに戻って、catchブロックが探されることになっている
	}
}
