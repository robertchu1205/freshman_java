package ce1002.a4.s103502548;

public class TicTacToe {
		int [][] tic = new int [3][3];
		int count=0;
		boolean i_error(int a,int b)//�P�_���L���Ƹ�W�X�d��
		{
			if(a<1||a>3||b<1||b>3)
				return false;
			if(tic[a-1][b-1]!=0)
				return false;
			return true;
		}
		int winner()//1��P1��� 2��P2��� 0�O����X�ӭt 4�O����
		{
			for(int i=0;i<3;i++)
			{
				if(tic[i][0]==1&&tic[i][1]==1&&tic[i][2]==1)
				{
					count=0;
					return 1;
				}
				if(tic[i][0]==2&&tic[i][1]==2&&tic[i][2]==2)
				{
					count=0;
					return 2;
				}
				if(tic[0][i]==1&&tic[1][i]==1&&tic[2][i]==1)
				{
					count=0;
					return 1;
				}
				if(tic[0][i]==2&&tic[1][i]==2&&tic[2][i]==2)
				{
					count=0;
					return 2;
				}
			}
			if(tic[0][0]==1&&tic[1][1]==1&&tic[2][2]==1)
			{
				count=0;
				return 1;
			}
			if(tic[0][2]==1&&tic[1][1]==1&&tic[2][0]==1)
			{
				count=0;
				return 1;
			}
			if(tic[0][0]==2&&tic[1][1]==2&&tic[2][2]==2)
			{
				count=0;
				return 2;
			}
			if(tic[0][2]==2&&tic[1][1]==2&&tic[2][0]==2)
			{
				count=0;
				return 2;
			}
			if(count>=9)
			{
				count=0;
				return 4;
			}
			return 0;
		}
		void print()//�L�X���r
		{
			count++;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(" ");
					if(tic[i][j]==0)
						System.out.print("  ");
					else if(tic[i][j]==1)
						System.out.print("o ");
					else if(tic[i][j]==2)
						System.out.print("x ");
							if(j<2)
							System.out.print("|");
				}
				if(i<2)
				System.out.println("\n---+---+---");
			}
		}
		void p1(int a, int b)//player1�s��o
		{
			tic[a-1][b-1]=1;
		}
		void p2(int a, int b)//player2�s��x
		{
			tic[a-1][b-1]=2;
		}
		
}
