/**
 * 
 */
package �㷨ѵ��.�����С������;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/17
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
		String ans ;
		if(Cin_Int%2==0){
			if(Cin_Int%3==0 && (Cin_Int-3)%3==0){
				ans = (new BigInteger(Integer.toString(Cin_Int-1)).multiply(new BigInteger(Integer.toString(Cin_Int-2)))).multiply(new BigInteger(Integer.toString(Cin_Int-3))).toString();
			}else{
				ans = (new BigInteger(Integer.toString(Cin_Int)).multiply(new BigInteger(Integer.toString(Cin_Int-1)))).multiply(new BigInteger(Integer.toString(Cin_Int-3))).toString();
			}
		}else{
			ans = (new BigInteger(Integer.toString(Cin_Int)).multiply(new BigInteger(Integer.toString(Cin_Int-1)))).multiply(new BigInteger(Integer.toString(Cin_Int-2))).toString();
		}
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ��֪һ��������N���ʴ�1~N����ѡ�������������ǵ���С������������Ϊ���١�
 * 
 * �����ʽ
 * ����һ��������N��
 * 
 * �����ʽ
 * ���һ����������ʾ���ҵ�����С��������
 * ��������
 * 9
 * �������
 * 504
 * ���ݹ�ģ��Լ��
 * 1 <= N <= 106��
 * 
 * ��⣺�����С�����������뵽���������������С�����������������ĳ˻����ص㣺������������Ȼ���ǻ���ģ���
 *		ͬ�������ǿ���������������������ǡ�
 *		1.��nΪ����ʱ��n��n-1��n-2Ϊ��ż�棬����ֻ��һ��ż�������Բ�����2������ӡ�������������3������Ҳ����������3���ʷ������⡣
 *		2.��nΪż��ʱ��n��n-1��n-2Ϊż��ż����ʱn��n-2�϶���������2�����Գ���2��ֵ�á����Կ��ǽ�n-2 ����n-3�������ż�棬��ʱҲ��һ�����⣬
 *      n��n-3�����n%3==0�������3����ֵ�á��Ը�����ż���ԭ�򣬱䶯ż��nΪn-2����ʱ����n-1��n-2��n-3��1���һ�����ʴ�ʱ�������⡣
 */