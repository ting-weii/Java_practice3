package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_47 {
	public static void main(String[] args) 
	{
		Car[] car1;
		car1 = new Car[3];
		
		for(int i=0;i<car1.length;i++)
		{
			car1[i] = new Car();
		}
		
		car1[0].setCar(1234, 42.5);
		car1[1].setCar(5678, 53.5);
		car1[2].setCar(9999, 89.5);
		
		for(int i=0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}
}
/*
class Car
{
	int num;
	double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" +num +"�A�N�T�o�q�]��" +gas);
	}
	
	public void show() 
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
}*/