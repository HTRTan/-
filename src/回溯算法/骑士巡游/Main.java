package �����㷨.��ʿѲ��;

public class Main {

	static int[][] Taken ;

	public static void main(String[] args) {
		//��ʼ��
		Taken = new int[5][5];
		for(int x = 0 ; x < Taken.length ; x++){
			for(int y = 0 ; y < Taken[x].length ; y++){
				Taken[x][y]=0;
			}
		}
		//��ʼλ��
		int startrow = 3;
		int startcol = 3;
		KnightsTour(Taken,0,startrow,startcol);
		//����λ��
		int endrow = -1;
		int endcol= -1;
		for(int x = 0 ; x < Taken.length ; x++){
			for(int y = 0 ; y < Taken[x].length ; y++){
				System.out.print("|"+Taken[x][y]);
				if(Taken[x][y]==Taken.length*Taken[0].length){
					endrow=x;
					endcol=y;
				}
			}
			System.out.println("|");
		}
		System.out.println(isFengbi(2,2,endrow,endcol)?"���":"����");
	}
	
	public static boolean KnightsTour(int[][] ThisTaken,int num_knights , int knights_row , int knights_col){
		//�ƶ���ʿ��ָ��λ��
		num_knights+=1;
		ThisTaken[knights_row][knights_col]=num_knights;
		//�ж��Ƿ�����
		if(num_knights==ThisTaken.length*ThisTaken[0].length)return true;
		//��ʿ�߹���
		int[] dRow = {2,2,1,-1,-2,-2,-1,1};
		int[] dCol = {1,-1,-2,-2,-1,1,2,2};
		
		for(int Count = 0 ; Count < dRow.length ; Count++){
			int temRow = knights_row + dRow[Count];
			int temCol = knights_col + dCol[Count];
			if(temRow>=0 && temCol>=0 && temRow<ThisTaken.length && temCol<ThisTaken[0].length){
				if(ThisTaken[temRow][temCol]==0){
					if(KnightsTour(ThisTaken,num_knights,temRow,temCol))return true;
				}
			}
		}
		//�޷�����һ������ط�����һ��
		ThisTaken[knights_row][knights_col]=0;
		return false;
	}
	//�ж��Ƿ�ջ��ǿ���
	public static boolean isFengbi(int row1 , int col1 , int row2 , int col2){
		int[] dRow = {2,2,1,-1,-2,-2,-1,1};
		int[] dCol = {1,-1,-2,-2,-1,1,2,2};
		for(int Count = 0 ; Count < dRow.length ; Count++){
			int temRow = row1 + dRow[Count];
			int temCol = col1 + dCol[Count];
			if(temRow>=0 && temCol>=0 && temRow<Taken.length && temCol<Taken[0].length){
				if(temRow==row1 && temCol==col1){
					return true;
				}
			}
		}
		return false;
	}

}
