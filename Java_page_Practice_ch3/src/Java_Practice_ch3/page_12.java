package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_12 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 242.5;
		
		car1.show2();
	}
}
/*
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�T�o�q�O" + gas);
	}
	
	void show2()
	{
		System.out.println("�}�l��ܨ��l���");
		show();
	}
}
*/