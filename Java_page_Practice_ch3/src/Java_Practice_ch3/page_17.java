package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_17 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setNumGas(1243, 24.7);
		
		int number = car1.getnum();
		double gasoline = car1.getgas();
		
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("������" + number + "�A�T�o�q��" + gasoline);
	}
}
/*
class Car
{
	int num;
	double gas;
	
	int getnum() 
	{
		System.out.println("�լd����");
		return num;
	}
	double getgas() 
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�N�T�o�q�]��" + gas);
	}
}
*/