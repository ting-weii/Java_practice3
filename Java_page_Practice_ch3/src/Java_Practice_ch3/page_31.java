package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_31 {
	public static void main(String[] args) 
	{
		Car.showSum();
		
		Car car1;
		car1 = new Car();
		car1.setCar(5425,960.4);
		
		Car.showSum();
		
		Car car2;
		car2 = new Car();
		car2.setCar(4567,30.5);
	}
}
/*
class Car
{
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������" +num +"�A�T�o�q��" +gas+ "�����l");
		System.out.println("-------------------------------------");
	}
	
	public static void showSum() 
	{
		System.out.println("���l�`�@��" +sum + "�x");
	}
	
	public void show() 
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}
*/
