package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�/**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page_37 {
	public static void main(String[] args) throws IOException{
		System.out.println("�п�J�^��r��");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		String stru = str1.toUpperCase();
		String strl = str1.toLowerCase();
		
		System.out.println("�ഫ���j�g�ɬ�:" +stru);
		System.out.println("�ഫ���j�g�ɬ�:" +strl);
	}
}	