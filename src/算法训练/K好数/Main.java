/**
 * 
 */
package �㷨ѵ��.K����;

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
		int Cin_K = cin.nextInt();
		int Cin_L = cin.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		BigInteger[] Opp_Int =new BigInteger[Cin_K];
		for(int Count_K = 0 ; Count_K < Cin_K ; Count_K++){
			Opp_Int[Count_K] = new BigInteger("1");
		}
		for(int Count_L = 1 ; Count_L < Cin_L ; Count_L++){
			BigInteger[] TemOpp_Int = new BigInteger[Cin_K];
			for(int Count_K = 0 ; Count_K < Cin_K ; Count_K++){
				TemOpp_Int[Count_K] = new BigInteger("0");
			}
			for(int Count_K = 0 ; Count_K < Cin_K ; Count_K++){
				for(int Tem_K = 0 ; Tem_K < Cin_K ; Tem_K++){
					if(Count_K-1 == Tem_K || Count_K+1 == Tem_K){
						continue;
					}else{
						TemOpp_Int[Count_K] = TemOpp_Int[Count_K].add(Opp_Int[Tem_K]);
					}
				}
			}
			Opp_Int = TemOpp_Int;
		}
		BigInteger ans  = new BigInteger("0");;
		for(int Count_K = 1 ; Count_K < Cin_K ; Count_K++){
			ans = ans.add(Opp_Int[Count_K]);
		}
		ans = ans.mod(new BigInteger("1000000007"));
		System.out.println(ans.toString());
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ���һ����Ȼ��N��K���Ʊ�ʾ����������ڵ���λ���������ڵ����֣���ô���Ǿ�˵�������K��������LλK��������K��������Ŀ������K = 4��L = 2��ʱ������K����Ϊ11��13��20��22��30��31��33 ��7�������������Ŀ�ܴ������������1000000007ȡģ���ֵ��
 * 
 * �����ʽ
 * �������������������K��L��
 * 
 * �����ʽ
 * ���һ����������ʾ�𰸶�1000000007ȡģ���ֵ��
 * ��������
 * 4 2
 * �������
 * 7
 * ���ݹ�ģ��Լ��
 * ����30%�����ݣ�KL <= 106��
 * 
 * ����50%�����ݣ�K <= 16�� L <= 10��
 * 
 * ����100%�����ݣ�1 <= K,L <= 100��
 * 
 * ��⣺ ��̬�滮--��׶ξ������⣨ÿ��һ�ξ��ߣ���һ���׶Σ��Ϳ��Եõ����һ���֣���ô�����еľ�������������Ľ�ͳ����ˡ���
 * 		
 */