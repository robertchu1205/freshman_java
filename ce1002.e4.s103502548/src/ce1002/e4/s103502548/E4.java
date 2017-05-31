package ce1002.e4.s103502548;
import java.util.Scanner;
public class E4 {

	public static void main(String[] args) {
		String name;
		int row,col;
		Theater theater=new Theater();
		Scanner scanner= new Scanner(System.in);
		System.out.print("Please enter a nickname: ");
		name=scanner.nextLine();
		Boolean check=false;
		int choose;
		while(check==false)
		{
			System.out.println("Hi "+name);
			System.out.println("Welcome to CE1002 theater");
			System.out.print("(1)Buy tickets\n(2)Refund tickets\n(3)Exit\nPlease choose a Service: ");
			choose=scanner.nextInt();
			if(choose==1)
			{
				System.out.println("===Buy tickets service===\n");
				theater.listSeat();
				System.out.print("Please choose a seat: ");
				row=scanner.nextInt();
				col=scanner.nextInt();
				if(row<1||row>5||col<1||col>12)//¨¾§b
				{
					System.out.println("Out of range!\n");
					continue;
				}
				if(theater.check(row, col))
				{
					theater.buy(row, col);
					if(col==1)
					{ System.out.println("The ticket you buy is "+row+"A\n"); }
					else if(col==2)
					{ System.out.println("The ticket you buy is "+row+"B\n"); }
					else if(col==3)
					{ System.out.println("The ticket you buy is "+row+"c\n"); }
					else if(col==4)
					{ System.out.println("The ticket you buy is "+row+"D\n"); }
					else if(col==5)
					{ System.out.println("The ticket you buy is "+row+"E\n"); }
					else if(col==6)
					{ System.out.println("The ticket you buy is "+row+"F\n"); }
					else if(col==7)
					{ System.out.println("The ticket you buy is "+row+"G\n"); }
					else if(col==8)
					{ System.out.println("The ticket you buy is "+row+"H\n"); }
					else if(col==9)
					{ System.out.println("The ticket you buy is "+row+"I\n"); }
					else if(col==10)
					{ System.out.println("The ticket you buy is "+row+"J\n"); }
					else if(col==11)
					{ System.out.println("The ticket you buy is "+row+"K\n"); }
					else if(col==12)
					{ System.out.println("The ticket you buy is "+row+"L\n"); }
					else//¨¾§b
					{
						System.out.println("Input error!");
					}
				}
				else
				{
					System.out.println("Please buy another ticket\n");//¨¾§b
				}
			}
			else if(choose==2)
			{
				System.out.println("===Refund tickets service===\n");
				theater.listSeat();
				System.out.print("Please choose a seat: ");
				row=scanner.nextInt();
				col=scanner.nextInt();
				if(row<0||row>5||col<0||col>12)
				{
					System.out.println("Out of range!\n");//¨¾§b
					continue;
				}
				if(theater.check(row, col)==false)
				{
					theater.refund(row, col);
					if(col==1)
					{ System.out.println("The ticket you refund is "+row+"A\n"); }
					else if(col==2)
					{ System.out.println("The ticket you refund is "+row+"B\n"); }
					else if(col==3)
					{ System.out.println("The ticket you refund is "+row+"c\n"); }
					else if(col==4)
					{ System.out.println("The ticket you refund is "+row+"D\n"); }
					else if(col==5)
					{ System.out.println("The ticket you refund is "+row+"E\n"); }
					else if(col==6)
					{ System.out.println("The ticket you refund is "+row+"F\n"); }
					else if(col==7)
					{ System.out.println("The ticket you refund is "+row+"G\n"); }
					else if(col==8)
					{ System.out.println("The ticket you refund is "+row+"H\n"); }
					else if(col==9)
					{ System.out.println("The ticket you refund is "+row+"I\n"); }
					else if(col==10)
					{ System.out.println("The ticket you refund is "+row+"J\n"); }
					else if(col==11)
					{ System.out.println("The ticket you refund is "+row+"K\n"); }
					else if(col==12)
					{ System.out.println("The ticket you refund is "+row+"L\n"); }
					else
					{
						System.out.println("Input error!");//¨¾§b
					}
				}
				else
				{
					System.out.println("Please refund another ticket\n");//¨¾§b
				}
			}
			else if(choose==3)
			{
				System.out.println("Goodbye "+name+" Have a nice day!");
				check=true;
			}
			else
			{
				System.out.println("Input error!\n");//¨¾§b
				continue;
			}
		}
		// TODO Auto-generated method stub

	}

}
