package array;

/**


/**
 * オブジェクト型の配列を扱う際に配列インスタンスは参照型であることの留意点
 *
 * @author M68864
 * @since 2020/08/30
 */
public class ObjectHandleWithArray {

	public static void main(String[] args) {
		// 配列インスタンスの生成
		// あくまで配列インスタンスの参照型が生成されたのであって、Itemインスタンスの生成ではない
		Items[] aryItems = new Items[1];

		//int price = aryItems[0].price;
		// ↑Itemsインスタンスへの参照ではないのでヌルポになる

		// 従ってオブジェクト型配列の中身のインスタンスは次のようにインスタンスを代入する必要がある
		aryItems[0] = new Items(200);
		System.out.println("price:" + aryItems[0].price);
	}
}

class Items {

	int price;

	public Items(int price) {
		this.price = price;
	}
}
