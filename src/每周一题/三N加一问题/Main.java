/**
 * 
 */
package ÿ��һ��.��N��һ����;

import java.util.Scanner;

/**
 * @author HTRTan
 * @date 2018/12/18
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int[] cin_Int = new int[2];
			cin_Int[0] = cin.nextInt();
			cin_Int[1] = cin.nextInt();
			int ans_max = 0 , ans_X = cin_Int[0], ans_Y = cin_Int[1];
			if(cin_Int[0] > cin_Int[1]){
				ans_X = cin_Int[1];
				ans_Y = cin_Int[0];
			}
			for(int Count = ans_X ; Count <= ans_Y ; Count++){
				int res = Count;
				int whi_Cou = 1;
				while(res!=1){
					whi_Cou += 1;
					if(res%2==0){
						res = res/2;
					}else{
						res = res * 3 + 1;
					}
				}
			ans_max = whi_Cou > ans_max ? whi_Cou : ans_max;
			}
		System.out.println(cin_Int[0] + " "+ cin_Int[1] + " " + ans_max);
		}
	}

}
/**
 * [��������]
 * 
 * �������µ����������㷨�������� n ��ʼ����� n ��ż������������ 2����� n �������������� 3 ��1�����µõ���ֵ�ظ��������裬ֱ�� n = 1 ʱֹͣ�����磬n = 22 ʱ���㷨���ɵ������ǣ�
 * 
 * 22��11��34��17��52��26��13��40��20��10��5��16��8��4��2��1
 * 
 * ���ǲ��루û�еõ�֤���������������� n�����㷨������ֹ�� n = 1���������������� 1 000 000�ڵ�����������ȷ�ġ�
 * 
 * ���ڸ����� n�������е�Ԫ�أ����� 1����������Ϊ n ��ѭ���ڳ��ȡ������������У�22 ��ѭ���ڳ���Ϊ 16������������ i �� j����������Ǽ��� i �� j������ i �� j��֮��������У�ѭ���ڳ��ȵ����ֵ��
 * 
 * [����]
 * 
 * ����ÿ�а����������� i �� j�������������� 0��С�� 1 000 000��
 * 
 * [���]
 * 
 * ����ÿ������ i �� j����ԭ����˳����� i �� j��Ȼ���������֮��������е����ѭ���ڳ��ȡ�����������Ӧ���õ����ո����������ͬһ����������ڶ����ÿһ�����ݣ��������Ӧλ�ڵ�����һ�С�
 * 
 * [��������]
 * 1 10
 * 100 200
 * 201 210
 * 900 1000
 * 
 * [�������]
 * 1 10 20
 * 100 200 125
 * 201 210 89
 * 900 1000 174
 */