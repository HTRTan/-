/**
 * 
 */
package ������ϰ.��һ�ִ�;

/**
 * @author HTRTan
 * @date 2018/12/14
 */
public class Main {

	/**
	 * @param args
	 * �ⷨһ ��ʮ����ת���ɶ�����
	 */
	public static void main(String[] args) {
		// TODO �ⷨһ ��ʮ����ת���ɶ�����
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for(int Count = 0 ;Count<32;Count++){
			String ans ="";
			int TemCount =Count;
			while (TemCount>1) {
				ans =Integer.toString(TemCount%2)+ans;
				TemCount /=2; 
			}
			ans=Integer.toString(TemCount)+ans;
			for(int Zero = ans.length();Zero<5;Zero++){
				ans = "0"+ans;
			}
			System.out.println(ans);
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
	
	/**
	 * @param args
	 * �ⷨ�� ������forѭ��
	 */
	public static void main2(String[] args) {
		// TODO �ⷨ�� ������forѭ��
		long startTime2 = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for(int a=0 ;a<2;a++){
			for(int b=0 ;b<2;b++){
				for(int c=0 ;c<2;c++){
					for(int d=0 ;d<2;d++){
						for(int e=0 ;e<2;e++){
							System.out.println(Integer.toString(a)+Integer.toString(b)+Integer.toString(c)+Integer.toString(d)+Integer.toString(e));
						}
					}
				}
			}
		}
		long endTime2 = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime2 - startTime2) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ���ڳ���Ϊ5λ��һ��01����ÿһλ��������0��1��һ����32�ֿ��ܡ����ǵ�ǰ�����ǣ�
 * 
 * 00000
 * 
 * 00001
 * 
 * 00010
 * 
 * 00011
 * 
 * 00100
 * 
 * �밴��С�����˳�������32��01����
 * 
 * �����ʽ
 * ������û�����롣
 * �����ʽ
 * ���32�У�����С�����˳��ÿ��һ������Ϊ5��01����
 * �������
 * 00000
 * 00001
 * 00010
 * 00011
 * <���²���ʡ��>
 * 
 * ��⣺���Կ��ó�10�ִ����Ƕ����ƣ��Ӵ�С����ʮ����0-31����ôʮ����ת�����Ϳ�����
 * 		ͬ��Ҳ�����ñ���forѭ��������Ҫע��ʱ��
 */