/**
 * 
 */
package ������ϰ.��������;

import java.util.ArrayList;
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
		ArrayList<Integer> Arr_Int =new ArrayList<Integer>();
		for(int TemIndex = 0 ; TemIndex < Index_Int ; TemIndex++){
			Arr_Int.add(cin.nextInt());
		}
		int Search_Int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		System.out.println(Arr_Int.indexOf(Search_Int) >= 0 ? Arr_Int.indexOf(Search_Int)+1:-1);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
 * 
 * �����ʽ
 * ��һ�а���һ������n��
 * 
 * �ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��
 * 
 * �����а���һ������a��Ϊ�����ҵ�����
 * 
 * �����ʽ
 * ���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1��
 * ��������
 * 6
 * 1 9 4 8 3 9
 * 9
 * �������
 * 2
 * ���ݹ�ģ��Լ��
 * 1 <= n <= 1000��
 * 
 * ��⣺��ArrayList�е�indexof���ɵó��±꣨��0��ʼ��
 * 		��ʹ��int[]һά������Ҫʹ��forѭ��ƥ�䣬����ֵ�����Ӱ���������ʱ��
 */