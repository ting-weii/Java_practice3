package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�/**/
public class page_16 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setnum(421432);
		int carnumber = car1.getnum();
		
		System.out.println("�z��������:" + carnumber);	
	}
}
/*
class Car
{
	int num;
	
	int getnum()
	{
		System.out.println("���b�]�w��......");
		return num;
	}
	
	void setnum(int n) 
	{
		System.out.println("�г]�w�z������");
		num = n;
	}
	
}
*/