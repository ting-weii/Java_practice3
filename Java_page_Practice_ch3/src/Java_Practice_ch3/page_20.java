package Java_Practice_ch3;
//109360127_電子三甲_許廷維
public class page_20 {
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = -10.23;
		
		System.out.println("車號是" + car1.num);
		System.out.println("汽油量是" + car1.gas);
	}
}
/*
class Car
{
	int num;
	double gas;
	
	void show() 
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
*/