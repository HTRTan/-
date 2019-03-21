package �����㷨.�˻ʺ�����;

public class Main {

	static boolean[][] Taken ;

	public static void main(String[] args) {
		//��ʼ��
		
		Taken = new boolean[20][20];
		for(int x = 0 ; x < Taken.length ; x++){
			for(int y = 0 ; y < Taken[x].length ; y++){
				Taken[x][y]=false;
			}
		}
		eightQueens(Taken,0);
		for(int x = 0 ; x < Taken.length ; x++){
			for(int y = 0 ; y < Taken[x].length ; y++){
				System.out.print(Taken[x][y]?"��":"��");
			}
			System.out.println("");
		}
	}
	
	public static boolean eightQueens(boolean[][] ThisTaken,int num_queens){
		if(!isDontPut(ThisTaken)){
			return false;
		}
		if(num_queens==ThisTaken.length){
			return true;
		}
		
		for(int x = 0 ; x < ThisTaken.length ; x++){
			for(int y = 0 ; y < ThisTaken[x].length ; y++){
				//������λ���Ƿ��ѱ�ռ��
				if(ThisTaken[x][y]==false){
					ThisTaken[x][y]=true;
					//������һ���ʺ�ķ���
					if(eightQueens(ThisTaken,num_queens+1)){
						return true;
					}
					//���ý⣬��������
					ThisTaken[x][y]=false;
				}
			}
		}
		return false;
	}
	
	//������������Ƿ����
	public static boolean isDontPut(boolean[][] ThisToken){
		for(int temx = 0 ; temx < ThisToken.length ; temx++){
			for(int temy = 0 ; temy < ThisToken[temx].length  ; temy++){
				if(ThisToken[temx][temy]){
					for(int x = 0 ; x < ThisToken.length ; x++){
						for(int y = 0 ; y < ThisToken[x].length ; y++){
							if(ThisToken[temx][y] && temy!=y)return false;
							if(ThisToken[x][temy] && temx!=x)return false;
							if(temx-x==temy-y && ThisToken[x][y] && temx!=x && temy!=y)return false;
							if(temx+temy==x+y && ThisToken[x][y] && temx!=x && temy!=y)return false;
						}
					}
				}
			}
		}
		return true;
	}

}
