/**
 * 
 */
package ����ѵ��.A��B����;

import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/14
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		int Cin1_int = cin.nextInt();
		int Cin2_int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		System.out.println(Cin1_int + Cin2_int);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
