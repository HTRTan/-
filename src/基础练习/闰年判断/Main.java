/**
 * 
 */
package ������ϰ.�����ж�;

import java.math.BigDecimal;
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
		int Cin_Int = cin.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		String ans = ((Cin_Int%4==0 && Cin_Int%100!=0) || Cin_Int%400==0)?"yes":"no";
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����һ����ݣ��ж���һ���ǲ������ꡣ
 * 
 * ���������֮һ����ʱ����һ�������꣺
 * 
 * 1. �����4�ı���������100�ı�����
 * 
 * 2. �����400�ı�����
 * 
 * ��������ݶ��������ꡣ
 * 
 * �����ʽ
 * �������һ������y����ʾ��ǰ����ݡ�
 * �����ʽ
 * ���һ�У������������������꣬�����yes���������no��
 * ˵����������ָ�������һ���ַ�����Ϊ��������籾���yes����no������Ҫ�ϸ��������и����Ĵ�Сд��д���Сд�����÷֡�
 * 
 * ��������
 * 2013
 * �������
 * no
 * ��������
 * 2016
 * �������
 * yes
 * ���ݹ�ģ��Լ��
 * 1990 <= y <= 2050��
 */

