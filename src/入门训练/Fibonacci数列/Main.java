/**
 * 
 */
package ����ѵ��.Fibonacci����;

import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/14
 */
public class Main {

	static double[] FnT;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		int a = 1, b = 1, ans = 1,c=cin.nextInt();		
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for (int i = 1; i <=  c- 2; i++) {
			ans = (a + b) % 10007;
			a = b;
			b = ans;
		}
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 *��������
 *Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��
 *
 *��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�
 *
 *�����ʽ
 *�������һ������n��
 *�����ʽ
 *���һ�У�����һ����������ʾFn����10007��������
 *˵�����ڱ����У�����Ҫ��Fn����10007���������������ֻҪ���������������ɣ�������Ҫ�ȼ����Fn��׼ȷֵ���ٽ�����Ľ������10007ȡ������ֱ�Ӽ������������������ԭ����ȡ��򵥡�
 *
 *��������
 *10
 *�������
 *55
 *��������
 *22
 *�������
 *7704
 *���ݹ�ģ��Լ��
 *1 <= n <= 1,000,000��
 *
 */