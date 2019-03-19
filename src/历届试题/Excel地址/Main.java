package 历届试题.Excel地址;

import java.util.Scanner;

public class Main {

	static String[] ZiMu = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		int cin = scan.nextInt();
		String cin_str = "";
		boolean isup = false;
			while (cin>0) {
				int index=cin%26;
				if(index==0){
					cin_str =  "Z" + cin_str ;
					cin /= 26;
					cin --;
				}else{
					cin_str =  ZiMu[index-1] + cin_str ;
					cin /= 26;
				}
			}
		
		System.out.println(cin_str);
	}

}


//问题描述
//Excel单元格的地址表示很有趣，它使用字母来表示列号。
//比如，
//A表示第1列，
//B表示第2列，
//Z表示第26列，
//AA表示第27列，
//AB表示第28列，
//BA表示第53列，
//....
//
//
//当然Excel的最大列号是有限度的，所以转换起来不难。
//如果我们想把这种表示法一般化，可以把很大的数字转换为很长的字母序列呢？
//
//
//本题目即是要求对输入的数字, 输出其对应的Excel地址表示方式。
//样例输入
//26
//样例输出
//Z
//样例输入
//2054
//样例输出
//BZZ
//数据规模和约定
//我们约定，输入的整数范围[1,2147483647]
//
//
//峰值内存消耗（含虚拟机） < 256M
//CPU消耗 < 1000ms
//
//
//
//
//请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
//
//
//注意：
//main函数需要返回0;
//只使用ANSI C/ANSI C++ 标准;
//不要调用依赖于编译环境或操作系统的特殊函数。
//所有依赖的函数必须明确地在源文件中 #include <xxx>
//不能通过工程设置而省略常用头文件。
//
//
//提交程序时，注意选择所期望的语言类型和编译器类型。
//
//
//------------------------------
//
//
//笨笨有话说：
//这有点像进制关系，又不完全是。好像末2位是以1当26，末3位是以1当26*26
//
//
//歪歪有话说：
//要是从字母序列转数字还好点，倒过来有点麻烦，不过计算机跑得快啊。