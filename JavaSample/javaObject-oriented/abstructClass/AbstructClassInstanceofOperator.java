package abstructClass;

//instanceof　を使うとオブジェクトのクラスを調べることが出来る

public class AbstructClassInstanceofOperator {

	public static void main(String[] args) {
		AbstractClass[] ac = new AbstractClass[2];

		ac[0] = new EntityClass(1, 3.1415);
		ac[1] = new Object2(232);

		for (int i = 0; i < ac.length; i++) {
			if (ac[i] instanceof EntityClass)
				System.out.println("No." + (i + 1) + "'s object is Object1");
			else
				System.out.println("No." + (i + 1) + "'s object is NOT Object1");

		}

	}

}
