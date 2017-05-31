package ce1002.e4.s103502548;

public class Theater {
	
	int [][] seat= new int [5][12];
	boolean check(int row,int col) //check the seat to know whether this seat had been bought
	{
		if(seat[row-1][col-1]==1)
			return false;
		else if(seat[row-1][col-1]==0)
			return true;
		return true;
	}
	void buy(int row,int col) //buy the ticket
	{
		seat[row-1][col-1]=1;
	}
	void refund(int row,int col) //refund the ticket
	{
		seat[row-1][col-1]=0;
	}
	void listSeat() //print the seat state
	{
		System.out.println("  A B C D E F G H I J K L");
		for(int i=0;i<5;i++)
		{
			int num=i+1;
			System.out.print(num+" ");
			for(int j=0;j<12;j++)
			{
				if(seat[i][j]==0)
				{
					System.out.print("o ");
				}
				else if(seat[i][j]==1)
				{
					System.out.print("x ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
