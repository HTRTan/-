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
		int Index_Int = cin.nextInt()+1;
		int[][] Pascal = new int[Index_Int][];
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for(int Count = 1 ; Count < Index_Int ; Count++){
			Pascal[Count] = new int[Count];
			for(int CountRow = 0 ; CountRow < Count ; CountRow++){
				if(CountRow-1<0){
					Pascal[Count][CountRow] = 1;
					System.out.print(Pascal[Count][CountRow]+" ");
				}else if(CountRow+1 >=Count){
					Pascal[Count][CountRow] = 1;
					System.out.print(Pascal[Count][CountRow]);
				}else{
					Pascal[Count][CountRow] = Pascal[Count-1][CountRow-1]+Pascal[Count-1][CountRow];
					System.out.print(Pascal[Count][CountRow]+" ");
				}
			}
			System.out.print("\n");
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����������ֳ�Pascal�����Σ����ĵ�i+1����(a+b)i��չ��ʽ��ϵ����
   * ��
 * ����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ�
   * ����
 * �����������������ε�ǰ4�У�
   * ����
 *    1
 *   1 1
 *  1 2 1
 * 1 3 3 1
 * ����n���������ǰn�С�
 * 
 * �����ʽ
 * �������һ����n��
 * 
  * * �����ʽ
 * �����������ε�ǰn�С�ÿһ�д���һ�еĵ�һ������ʼ����������м�ʹ��һ���ո�ָ����벻Ҫ��ǰ���������Ŀո�
 * ��������
 * 4
 * �������
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * ���ݹ�ģ��Լ��
 * 1 <= n <= 34��
 * 
 * ��⣺���ߵĶ�Ϊ1���м��ֵ���������index[x-1]+index[x]֮��
 */