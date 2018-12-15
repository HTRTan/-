/**
 * 
 */
package ������ϰ.ʮ������ת�˽���;

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
	private static String[] Binary_Hex = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	private static String[] Binary_Oct = {"000","001","010","011","100","101","110","111"};
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		int Index_Int = cin.nextInt();
		String[] Cin_Str = new String[Index_Int];
		for(int Ind = 0; Ind < Index_Int ; Ind++){
			Cin_Str[Ind] = cin.next().toUpperCase();
		}
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		ArrayList<String> Hexadecimal_Arr = new ArrayList<>(Arrays.asList(Hexadecimal)) ;
		ArrayList<String> Binary_Hex_Arr = new ArrayList<>(Arrays.asList(Binary_Hex)) ;
		ArrayList<String> Binary_Oct_Arr = new ArrayList<>(Arrays.asList(Binary_Oct)) ;
		for(int Ind = 0; Ind < Index_Int ; Ind++){
			StringBuilder ans_Bin = new StringBuilder();
			for(int Count = 0 ; Count < Cin_Str[Ind].length() ;Count++){
				String TemNum = Character.toString(Cin_Str[Ind].charAt(Count)) ;
				ans_Bin.append(Binary_Hex_Arr.get(Hexadecimal_Arr.indexOf(TemNum)).toString());
			}
			while(ans_Bin.length()%3!=0){
				ans_Bin.insert(0, "0");
			}
			StringBuilder ans_Oct = new StringBuilder();
			for(int Count = 0 ; Count < ans_Bin.length()/3 ;Count++){
				String TemStr = null;
				if(Count+1 >= ans_Bin.length()/3){
					TemStr = ans_Bin.substring(Count*3);
				}else{
					TemStr = ans_Bin.substring(Count*3,Count*3+3);
				}
				ans_Oct.append(Binary_Oct_Arr.indexOf(TemStr));
			}
			while (ans_Oct.charAt(0)=='0') {
				ans_Oct.deleteCharAt(0);
			}
			System.out.println(ans_Oct);
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
}
/**
 * ��������
 * ��������n��ʮ��������������������Ƕ�Ӧ�İ˽�������
 * 
 * �����ʽ
 * ��������ĵ�һ��Ϊһ��������n ��1<=n<=10����
 * ����������n�У�ÿ��һ����0~9����д��ĸA~F��ɵ��ַ�������ʾҪת����ʮ��������������ÿ��ʮ�����������Ȳ�����100000��
 * 
 * �����ʽ
 * �������n�У�ÿ��Ϊ�����Ӧ�İ˽�����������
 * 
 * ������ע�⡿
 * ���������ʮ��������������ǰ��0������012A��
 * ��������İ˽�����Ҳ������ǰ��0��
 * 
 * ��������
 * ����2
 * ����39
 * ����123ABC
 * 
 * �������
 * ����71
 * ����4435274
 * 
 * ��������ʾ��
 * �����Ƚ�ʮ��������ת����ĳ������������ĳ������ת���ɰ˽��ơ�
 * 
 * ��⣺(���)ÿ��ʮ�����������Ȳ�����100000
 * 		 ���ֱ����long��int��BigInteger ��ֱ�ӳ�����������ʮ������ת����ʮ������ת���ɰ˽��ƣ������쳣
 * 		������ת���ɶ����Ƶ��ַ����������ַ������˽��Ƶ�ƥ�䣬Ч�ʻ����
 */