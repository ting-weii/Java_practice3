package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_24 {
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		car1.setCar(131254, 20.5);
		car1.show();
		
		System.out.println("-------------------------");
		System.out.println("�u�ܧ󨮸�");
		car1.setCar(3654423);
		car1.show();
		
		System.out.println("-------------------------");
		System.out.println("�u�ܧ�T�o�q");
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
			System.out.println("�N�����]��" + num);
	}
	
	public void setCar(double g)
	{
			gas = g;
			System.out.println("�N�T�o�q�]��" +gas);
	}
	
	public void setCar(int n,double g)
	{
			num =n;
			gas = g;
			System.out.println("�N�����]��" + num + "�T�o�q�]��" +gas);
	}
	
	public void show() 
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}
*/