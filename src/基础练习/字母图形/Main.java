/**
 * 
 */
package ������ϰ.��ĸͼ��;

import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/14
 */
public class Main {

	/**
	 * @param args
	 */
	private static String[] Letter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		int Rows = cin.nextInt();
		int Cols = cin.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for(int NewRow = 0 ; NewRow < Rows ; NewRow++){
			String ans = "";
			for(int NewCol = 0 ; NewCol < Cols ; NewCol++){
				ans += Letter[Math.abs(NewCol-NewRow)];
			}
			System.out.println(ans);
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}

/**
 * ��������
 * ������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
 * 
 * ABCDEFG
 * 
 * BABCDEF
 * 
 * CBABCDE
 * 
 * DCBABCD
 * 
 * EDCBABC
 * 
 * ����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
 * 
 * �����ʽ
 * ����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
 * �����ʽ
 * ���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�
 * ��������
 * 5 7
 * �������
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * ���ݹ�ģ��Լ��
 * 1 <= n, m <= 26��
 * 
 * ��⣺
 * ABCDEFG->1234567
 * BABCDEF->2123456
 * CBABCDE->3212345
 * DCBABCD->4321234
 * EDCBABC->5432123
 * Math.abs(NewCol-NewRow) //����Ҫ����������������ľ���ֵ�������ȼ��ٺ����ӵ�����
 */