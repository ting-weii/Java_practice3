package Java_Practice_ch3;
//109360127_電子三甲_許廷維/**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class page_34 {
	public static void main(String[] args) throws IOException{
		System.out.println("請輸入一整數");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		
		System.out.println("您輸入的數字為:" +num);
	}
}	