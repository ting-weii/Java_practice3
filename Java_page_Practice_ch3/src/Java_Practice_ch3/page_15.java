package Java_Practice_ch3;
//109360127_電子三甲_許廷維
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
		System.out.println("將車號設為" + num + "，將汽油量設為" + gas);
	}
	
	void show()
	{
		System.out.println("車號為" + num);
		System.out.println("汽油量為" + gas);
	}
}
*/