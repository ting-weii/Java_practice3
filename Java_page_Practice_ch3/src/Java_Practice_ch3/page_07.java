package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�
public class page_07 {
	
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 242.5;
		
		Car car2;
		car2 = new Car();
		
		car2.num = 5678;
		car2.gas = 45.2;
			
		System.out.println("car1�����O" +car1.num);
		System.out.println("car1�T�o�q�O" +car1.gas);
		
		System.out.println("car2�����O" +car2.num);
		System.out.println("car2�T�o�q�O" +car2.gas);
	}
}
/**/
class Car
{
	int num;
	double gas;
}
