/**
 * 
 */
package �㷨ѵ��.����k������ѯ;

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
		int[] Cin_Int = new int[Index_Int];
		for(int TemInd = 0 ; TemInd < Index_Int ; TemInd++){
			Cin_Int[TemInd] = cin.nextInt();
		}
		int Index2_Int = cin.nextInt();
		int[][] Cin2_Int = new int[Index2_Int][3];
		for(int TemInd = 0 ; TemInd < Index2_Int ; TemInd++){
			Cin2_Int[TemInd][0] = cin.nextInt();
			Cin2_Int[TemInd][1] = cin.nextInt();
			Cin2_Int[TemInd][2] = cin.nextInt();
		}
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		
		
		for(int TemInd = 0 ; TemInd < Cin2_Int.length ; TemInd++){
			int[] ans = getIntArray(Cin_Int,Cin2_Int[TemInd][0],Cin2_Int[TemInd][1]);
			System.out.println(ans[Cin2_Int[TemInd][2]-1]);
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
	
	private static int[] getIntArray(int[] TemCin_Int , int startInd , int endInd) {
		int[] Cin_Int = new int[endInd - startInd +1];
		for(int TemInd = 0 ; TemInd < Cin_Int.length ; TemInd++){
			Cin_Int[TemInd] = TemCin_Int[startInd-1+TemInd];
		}
		for(int Count = 1 ; Count < Cin_Int.length ; Count++){
			int TemCount = Count;
			while (Cin_Int[TemCount-1]<Cin_Int[TemCount]) {
				int TemNum = Cin_Int[TemCount-1];
				Cin_Int[TemCount-1] = Cin_Int[TemCount];
				Cin_Int[TemCount] = TemNum;
				TemCount -=1;
				if(TemCount<1){
					break;
				}
			}
		}
		return Cin_Int;
	}

}
/**
 * ��������
 * ����һ�����У�ÿ��ѯ�������е�l��������r�����е�K��������ĸ���
 * 
 * �����ʽ
 * ��һ�а���һ����n����ʾ���г��ȡ�
 * 
 * �ڶ��а���n������������ʾ���������С�
 * 
 * ����������һ��������m����ʾѯ�ʸ�����
 * 
 * ������m�У�ÿ��������l,r,K����ʾѯ�����д������ҵ�l��������r�����У��Ӵ���С��K��������ĸ�������Ԫ�ش�1��ʼ��š�
 * 
 * �����ʽ
 * �ܹ����m�У�ÿ��һ��������ʾѯ�ʵĴ𰸡�
 * ��������
 * 5
 * 1 2 3 4 5
 * 2
 * 1 5 2
 * 2 3 2
 * �������
 * 4
 * 2
 * ���ݹ�ģ��Լ��
 * ����30%�����ݣ�n,m<=100��
 * 
 * ����100%�����ݣ�n,m<=1000��
 * 
 * ��֤k<=(r-l+1)�������е���<=106��
 */