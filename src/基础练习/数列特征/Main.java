/**
 * 
 */
package ������ϰ.��������;

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
		int Index_Int = cin.nextInt();
		int[] Arr_Int = new int[Index_Int];
		for(int TemIndex = 0 ; TemIndex < Index_Int ; TemIndex++){
			Arr_Int[TemIndex] = cin.nextInt();
		}
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		int ans_max = -10000 , ans_min = 10000, ans_sum = 0;
		for(int Count = 0 ; Count < Arr_Int.length ; Count++){
			ans_sum += Arr_Int[Count];
			ans_max = Arr_Int[Count] > ans_max ? Arr_Int[Count] : ans_max ;
			ans_min = Arr_Int[Count] < ans_min ? Arr_Int[Count] : ans_min ;
		}
		System.out.println(ans_max + "\n" + ans_min + "\n" + ans_sum);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����n�������ҳ���n���������ֵ����Сֵ���͡�
 * 
 * �����ʽ
 * ��һ��Ϊ����n����ʾ���ĸ�����
 * 
 * �ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��
 * 
 * �����ʽ
 * ������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
 * ��������
 * 5
 * 1 3 -2 4 5
 * �������
 * 5
 * -2
 * 11
 * ���ݹ�ģ��Լ��
 * 1 <= n <= 10000��
 * 
 * ��⣺��Ŀ���ѣ��ؼ���������Ż�����
 */