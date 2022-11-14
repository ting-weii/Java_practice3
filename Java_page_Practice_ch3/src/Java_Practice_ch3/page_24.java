package Java_Practice_ch3;
//109360127_電子三甲_許廷維
public class page_24 {
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		car1.setCar(131254, 20.5);
		car1.show();
		
		System.out.println("-------------------------");
		System.out.println("只變更車號");
		car1.setCar(3654423);
		car1.show();
		
		System.out.println("-------------------------");
		System.out.println("只變更汽油量");
		car1.setCar(8492.6);
		car1.show();
	}
}
/*
class Car
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
			num =n;
			System.out.println("將車號設為" + num);
	}
	
	public void setCar(double g)
	{
			gas = g;
			System.out.println("將汽油量設為" +gas);
	}
	
	public void setCar(int n,double g)
	{
			num =n;
			gas = g;
			System.out.println("將車號設為" + num + "汽油量設為" +gas);
	}
	
	public void show() 
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
*/