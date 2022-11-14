package Java_Practice_ch3;
//109360127_電子三甲_許廷維
public class page_45 {
	public static void main(String[] args) 
	{
		System.out.println("宣告Car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 452.3);
		
		System.out.println("-------------------------------------");
		System.out.println("宣告Car2");
		Car car2;
		
		System.out.println("將Car1指定給Car2");
		car2 = car1;
		
		System.out.println("-------------------------------------");
		System.out.println("Car1的");
		car1.show();
		
		System.out.println("-------------------------------------");
		System.out.println("Car2的");
		car2.show();
		
		System.out.println("-------------------------------------");
		System.out.println("改變Car1的相關資料");
		car1.setCar(5678, 30.5);
		
		System.out.println("-------------------------------------");
		System.out.println("Car1的");
		car1.show();
		
		System.out.println("-------------------------------------");
		System.out.println("Car2的");
		car2.show();
	}
}
/*
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" +num +"，將汽油量設為" +gas);
	}
	
	public void show() 
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
*/