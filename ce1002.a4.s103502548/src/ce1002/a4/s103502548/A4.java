package ce1002.a4.s103502548;
import java.util.Scanner;

public class A4 {	
	public static void main(String[] args) {
		String s=" ";
		int a1=0,b1=0;
		int a2=0,b2=0;
		int choose=0;
		Boolean check1=false;
		Scanner scanner=new Scanner(System.in);
		while(check1==false)//���2�N���X�j��
		{
			choose=0;
			System.out.println("1. Start game");
			System.out.println("2. Exit game");
			System.out.print("Select your choice:");
			choose=scanner.nextInt();
				if(choose==1)
				{
					int a=0;//a�stic.winner() �Ytic.winner()��Jif�P�_���ܷ|�h�Ƥ@��
					TicTacToe tic=new TicTacToe();
						while(a==0)
						{	
							System.out.print("Input Player 1's position in the format as a,b: ");
							s=scanner.next();//��,�屼
							String [] x=s.split(",");
							a1=Integer.parseInt(x[0]);
							b1=Integer.parseInt(x[1]);
							
							if(tic.i_error(a1, b1))//�p�G��J�S��
							{
								tic.p1(a1,b1);//��J
								tic.print();//�L�X�{�D
								a=tic.winner();
								System.out.print("\n");
								if(a==1)
								{
									System.out.println("Player 1 WIN!!\n");
									break;
								}
								if(a==0)
								{
									while(true)
									{	
										System.out.print("Input Player 2's position in the format as a,b: ");
										s=scanner.next();
										String [] y=s.split(",");
										a2=Integer.parseInt(y[0]);
										b2=Integer.parseInt(y[1]);
										if(tic.i_error(a2, b2))
										{
											tic.p2(a2, b2);
											tic.print();
											a=tic.winner();
											System.out.print("\n");
											if(a==2)
											{
												System.out.println("Player 2 WIN!!\n");
											}
											break;
										}
										else
										{
											System.out.println("Input error!!");
											continue;
										}
									}
								}
							}
								else
								{
									System.out.println("Input error!!");
									continue;
								}
						}
						
					
				}
				else if(choose==2)
				{
					System.out.println("bye bye");
					check1=true;
				}
				else
				{
					System.out.println("Input error.");//��ܿ��~�h���X
				}
		}			
		// TODO Auto-generated method stub

	}

}
