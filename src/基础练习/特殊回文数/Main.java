/**
 * 
 */
package ������ϰ.���������;

import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/15
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		int N_int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for(int Row1 = 1 ; Row1<10 ; Row1++){
			for(int Row2 = 0 ; Row2<10 ; Row2++){
				for(int Row3 = 0 ; Row3<10 ; Row3++){
					if(N_int == Row1+Row2+Row3+Row2+Row1){
						System.out.print(Row1);
						System.out.print(Row2);
						System.out.print(Row3);
						System.out.print(Row2);
						System.out.println(Row1);
					}
				}
			}
		}
		for(int Row1 = 1 ; Row1<10 ; Row1++){
			for(int Row2 = 0 ; Row2<10 ; Row2++){
				for(int Row3 = 0 ; Row3<10 ; Row3++){
					if(N_int == Row1+Row2+Row3+Row3+Row2+Row1){
						System.out.print(Row1);
						System.out.print(Row2);
						System.out.print(Row3);
						System.out.print(Row3);
						System.out.print(Row2);
						System.out.println(Row1);
					}
				}
			}
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
 * ��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
 * �����ʽ
 * ��������һ�У�����һ��������n��
 * �����ʽ
 * ��������С�����˳���������������������ÿ������ռһ�С�
 * ��������
 * 52
 * �������
 * 899998
 * 989989
 * 998899
 * ���ݹ�ģ��Լ��
 * ����1<=n<=54��
 */