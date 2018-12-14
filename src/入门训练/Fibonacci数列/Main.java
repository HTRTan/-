/**
 * 
 */
package 入门训练.Fibonacci数列;

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
		// TODO 自动生成的方法存根
		Scanner cin = new Scanner(System.in);
		int a = 1, b = 1, ans = 1,c=cin.nextInt();		
		long startTime = System.currentTimeMillis();    //获取开始时间
		for (int i = 1; i <=  c- 2; i++) {
			ans = (a + b) % 10007;
			a = b;
			b = ans;
		}
		System.out.println(ans);
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("Time：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}

}
/**
 *问题描述
 *Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 *
 *当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 *
 *输入格式
 *输入包含一个整数n。
 *输出格式
 *输出一行，包含一个整数，表示Fn除以10007的余数。
 *说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。
 *
 *样例输入
 *10
 *样例输出
 *55
 *样例输入
 *22
 *样例输出
 *7704
 *数据规模与约定
 *1 <= n <= 1,000,000。
 *
 */