/**
 * 
 */
package ������ϰ.��������;

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
		int[] Cin_Str = new int[Index_Int];
		for(int Ind = 0; Ind < Index_Int ; Ind++){
			Cin_Str[Ind] = cin.nextInt();
		}
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for(int Count = 1 ; Count < Cin_Str.length ; Count++){
			int TemInd = Count;
			while(Cin_Str[TemInd-1]>Cin_Str[TemInd]) {
					int TemInt = Cin_Str[TemInd-1];
					Cin_Str[TemInd-1] = Cin_Str[TemInd];
					Cin_Str[TemInd] = TemInt;
					TemInd -=1;
					if(TemInd<1){
						break;
					}
				}
		}
		for(int Count = 0 ; Count < Cin_Str.length ; Count++){
			if(Count== Cin_Str.length-1){
				System.out.println(Cin_Str[Count]);
			}else{
				System.out.print(Cin_Str[Count] + " ");
			}
			
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
}
/**
 * ��������
 * ��������һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
 * �����ʽ
 * ������һ��Ϊһ������n��
 * �����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
 * �����ʽ
 * �������һ�У�����С�����˳��������������С�
 * ��������
 * 5
 * 8 3 6 4 9
 * �������
 * 3 4 6 8 9
 * 
 * ��⣺���ʹ�õ��ǳ��׷����Դ���--ð�ݷ� �����ӱȽ�˳�ִ�0��ʼ
 * 
 */