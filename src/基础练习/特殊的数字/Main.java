/**
 * 
 */
package ������ϰ.���������;

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
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		for(int Count = 100 ; Count < 1000 ; Count++){
			int bit = Integer.valueOf(Integer.toString(Count).substring(2));//��λ
			int dec = Integer.valueOf(Integer.toString(Count).substring(1,2));//ʮλ
			int hun = Integer.valueOf(Integer.toString(Count).substring(0,1));//��λ
			if(Count == Math.pow(bit, 3)+Math.pow(dec, 3)+Math.pow(hun, 3)){
				System.out.println(Count);
			}
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3���������������������������λʮ��������
 * �����ʽ
 * ��������С�����˳�����������������λʮ��������ÿ����ռһ�С�
 */