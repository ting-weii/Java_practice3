package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_15 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		int numI = 5312;
		double gasI = 52.6;
		
		car1.setNumGas(numI, gasI);
	}
}
/*
class Car
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�N�T�o�q�]��" + gas);
	}
	
	void show()
	{
		System.out.println("������" + num);
		System.out.println("�T�o�q��" + gas);
	}
}
*/