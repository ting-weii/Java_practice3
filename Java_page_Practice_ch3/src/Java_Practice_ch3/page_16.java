package Java_Practice_ch3;
//109360127_電子三甲_許廷維/**/
public class page_16 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setnum(421432);
		int carnumber = car1.getnum();
		
		System.out.println("您的車號為:" + carnumber);	
	}
}
/*
class Car
{
	int num;
	
	int getnum()
	{
		System.out.println("正在設定中......");
		return num;
	}
	
	void setnum(int n) 
	{
		System.out.println("請設定您的車號");
		num = n;
	}
	
}
*/