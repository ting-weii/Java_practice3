package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_27 {
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		car1.show();
		
		Car car2;
		car2 = new Car(1234,24.3);
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
		System.out.println("�Ͳ��F���l");
	}
	
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("-------------------------------------");
		System.out.println("�Ͳ��F������" +num +"�A�T�o�q��" +gas+ "�����l");
	}
	
	public void show() 
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}
*/