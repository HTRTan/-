/**
 * 
 */
package ������ϰ.ʮ������תʮ����;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/15
 */
public class Main {

	/**
	 * @param args
	 */
	private static String[] Hexadecimal = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		String Cin_Str = cin.next().toUpperCase();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		BigDecimal ans = new BigDecimal(0);
		ArrayList<String> Hexadecimal_Arr = new ArrayList<>(Arrays.asList(Hexadecimal)) ;
		for(int Count = 0 ; Count < Cin_Str.length() ; Count++){
			String Num = Character.toString(Cin_Str.charAt(Cin_Str.length() - 1 - Count)); 
			ans = ans.add((new BigDecimal(Hexadecimal_Arr.indexOf(Num))).multiply((new BigDecimal(16)).pow(Count)));
		}
		System.out.println(ans.toString());
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
}
/**
 * ��������
 * �����Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
 * ����ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��
 * ��������
 * FFFF
 * �������
 * 65535
 * 
 * ��⣺�������㶼ʹ��BigDecimal����о������㣬��ֹ���ݹ���ʧ
 * 		ʹ��CharAt��ÿλ��ȡ��������
 */