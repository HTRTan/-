/**
 * 
 */
package ������ϰ.ʮ����תʮ������;

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
		int Cin_int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		String ans ="";
		while (Cin_int!=0) {
			ans = Hexadecimal[Cin_int%16] + ans;
			Cin_int /=16; 
		}
		System.out.println(ans.equals("")?"0":ans);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ������0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ��ֱ��ʾʮ��������0��15��ʮ�����Ƶļ�����������16��1������ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11���Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
 * ��������һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��
 * �����ʽ
 * �����������һ���Ǹ�����a����ʾҪת��������0<=a<=2147483647
 * �����ʽ
 * ����������������16���Ʊ�ʾ
 * ��������
 * 30
 * �������
 * 1E
 */