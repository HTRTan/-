/**
 * 
 */
package ����ѵ��.Բ�����;

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
		BigDecimal Cin_Dec = new BigDecimal(cin.nextInt());
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		BigDecimal PI_Dec = new BigDecimal("3.14159265358979323");
		String ans = (Cin_Dec.pow(2)).multiply(PI_Dec).setScale(7, BigDecimal.ROUND_HALF_UP).toPlainString();
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����Բ�İ뾶r����Բ�������
 * �����ʽ
 * �������һ������r����ʾԲ�İ뾶��
 * �����ʽ
 * ���һ�У�����һ��ʵ�����������뱣��С�����7λ����ʾԲ�������
 * ˵�����ڱ����У�������һ�����������������һ��ʵ����
 * 
 * ����ʵ����������⣬��һ�������ʵ�������Ҫ�󣬱��籾����Ҫ����С�����7λ������ĳ�������ϸ�����7λС�������������߹��ٵ�С��λ�����ǲ��еģ����ᱻ��Ϊ����
 * 
 * ʵ��������������û���ر�˵�������붼�ǰ�����������С�
 * 
 * ��������
 * 4
 * �������
 * 50.2654825
 * ���ݹ�ģ��Լ��
 * 1 <= r <= 10000��
 * ��ʾ
 * ����Ծ���Ҫ��ϸߣ���ע��е�ֵӦ��ȡ�Ͼ�ȷ��ֵ�������ʹ�ó�������ʾ�У�����PI=3.14159265358979323��Ҳ����ʹ����ѧ��ʽ����У�����PI=atan(1.0)*4��
 * 
 */