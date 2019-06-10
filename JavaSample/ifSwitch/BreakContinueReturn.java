package ifSwitch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakContinueReturn
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("1でbreak文を体験");
		System.out.println("2でcontinue文を体験");
		System.out.println("3でreturn文を体験");
		System.out.println("体験したい番号を入力してね！");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		short res = Short.parseShort(str);

		for(int i=1; i<=5; i++)
		{
			System.out.println("Yes!We can!USA!USA!" + i +"回目・・・");

			if( res==1 && i==2 )
			{
				System.out.println("うるさいなあ！おまえら！");
				System.out.println("Gomennasaaai!");
				break;
				//breakで処理の流れを強制的に終了し、ブロックから抜ける
			}

			if( res==2 && i==3 )
			{
				System.out.println("まだまだ！いくぞー！Comoooooon!!");
				continue;
				//continueで繰り返し内の処理を飛ばし、ブロックの先頭位置に戻って次の処理を続ける
			}

			if( res==3 && i==4 )
			{
				System.out.println("こらー！おまえたちそこで何をやっている！");
				return;
				//returnでプログラムを強制的に終了する
			}

			System.out.println("ニッポン！ニッポン！ニッポン！"+ i +" 回目！");

		}


	}

}
