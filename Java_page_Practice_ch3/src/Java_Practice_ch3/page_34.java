package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�/**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class page_34 {
	public static void main(String[] args) throws IOException{
		System.out.println("�п�J�@���");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		int num = Integer.parseInt(str1);
		
		System.out.println("�z��J���Ʀr��:" +num);
	}
}	