/**
 * 
 */
package ������ϰ.������;

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
		for(int Row1 = 1 ; Row1<10 ; Row1++){
			for(int Row2 = 0 ; Row2<10 ; Row2++){
				System.out.print(Row1);
				System.out.print(Row2);
				System.out.print(Row2);
				System.out.println(Row1);
			}
		}
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("Time��" + (endTime - startTime) + "ms");    //�����������ʱ��
	}

}
/**
 * ��������
 * ����1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������
 * �����ʽ
 * ��������С�����˳�����������������λʮ������
 */