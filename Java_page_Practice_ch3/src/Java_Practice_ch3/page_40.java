package Java_Practice_ch3;
//109360127_�q�l�T��_�\�ʺ�/**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page_40 {
	public static void main(String[] args) throws IOException{
		System.out.println("�п�J�r��C");
		
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		System.out.println("�п�J�n�s�W���r��C");

		String str2 = br1.readLine();
		
		StringBuffer sb1 = new StringBuffer(str1);
		sb1.append(str2);
		
		System.out.println("�b�u" +str1+ "�v��s�W�u" +str2+ "�v���ܡA�N�|�ܦ��u" +sb1+ "�v�C");
	}
}