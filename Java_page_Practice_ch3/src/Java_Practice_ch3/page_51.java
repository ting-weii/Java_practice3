package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_51 {
	public static void main(String[] args) 
	{
		Car car1 = new Car();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 25.4;
		String str1 = "1����";
		
		car1.setCar(number, gasoline);
		car1.setName(str1);
		
		car1.show();
	}
}
/*
class Car
{
	private int num;
	private double gas;
	private String name;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "�S���W��";
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("-------------------------------------");
		System.out.println("�N�����]��" +num +"�A�N�T�o�q�]��" +gas);
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("�N���W�]��" +name);
	}
	
	public void show() 
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("���W�O" + name);
	}
}
*/
