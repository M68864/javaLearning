package classVariable;


class Car
{
	void Car()	//default constructor
	{
		System.out.println("Car Object generated");
	}
}



public class ClassVariableNull
{

	public static void main(String[] args)
	{
		Car car1 = new Car();

		Car car2;
		car2 = car1;

		car1 =null;		//nullを代入するとcar1はCarオブジェクトを指し示さなくなる

		//car1はオブジェクトを指していないがcar2は生きているのでメソッドが使用できる

		car2.Car();

	}

}
