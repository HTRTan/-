/**
 * 
 */
package ����ѵ��.�������;

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
		BigDecimal One_Dec = new BigDecimal(1);
		BigDecimal Two_Dec = new BigDecimal(2);
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		String ans = ((Cin_Dec.add(One_Dec)).multiply(Cin_Dec)).divide(Two_Dec).toPlainString();
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ��1+2+3+...+n��ֵ��
 * �����ʽ
 * �������һ������n��
 * �����ʽ
 * ���һ�У�����һ����������ʾ1+2+3+...+n��ֵ��
 * ��������
 * 4
 * �������
 * 10
 * ��������
 * 100
 * ˵������һЩ������������������������԰�������õ����⡣
 * 
 * һ�����ύ֮ǰ������Щ��������Ҫ����ͨ�����У����ⲻ�����⼸���������ݶ���ȷ����ĳ��������ȫ��ȷ�ģ�Ǳ�ڵĴ��������Ȼ������ĵ÷ֽϵ͡�
 * 
 * �������
 * 5050
 * ���ݹ�ģ��Լ��
 * 1 <= n <= 1,000,000,000��
 * ˵������ע����������ݹ�ģ��
 * 
 * ����ֱ�ӵ��뷨��ֱ��ʹ��һ��ѭ�����ۼӣ�Ȼ���������ݹ�ģ�ܴ�ʱ�����֡��������ķ��������ᵼ�³�ʱ����ʱ����Ҫ���������������������һ�ԣ����ʹ��1000000000��Ϊ��ĳ�������룬��ĳ����ǲ������ڹ涨������涨��ʱ�������г�����
 * 
 * ������һ��Ҫֵ��ע��ĵط��Ǵ𰸵Ĵ�С�����������Ĭ�ϵ�����(int)��Χ�ڣ����ʹ�����������������ᵼ�½������
 * 
 * �����ʹ��C++��C���Զ���׼��ʹ��printf������������ĸ�ʽ�ַ���Ӧ��д��%I64d�����long long���͵�������
 */