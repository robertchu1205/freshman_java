package ce1002.a3.s103502548;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		
		Boolean check1=false;
		Boolean check2=false;
		String name;
		String pass;
		int money,choose;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to NCU Bank System,");
		System.out.println("please enter your name and pass.");
		Bank bank=new Bank("user1","user1",100);
		while(check1==false)
		{
			System.out.print("Name: ");
			name= scanner.nextLine();//含空格的字串輸入方式
			System.out.print("Password: ");
			pass= scanner.nextLine();//含空格的字串輸入方式
			if((bank.check(name,pass))==true)//防呆
			{
				check1=true;
				System.out.println("Login Success.");
			}
			else if(bank.check(name,pass)==false)
			{
				System.out.println("Login Fail, please check your name/pass.");
			}
		}
		while(check2==false)
		{
			System.out.print("Menu\n1.Balance Check\n2.Withdraw\n3.Deposit\n4.Exit\nEnter a number:");
			choose= scanner.nextInt();
			if(choose==1)
			{
				System.out.print("Balance left NT");
				bank.getBalance();
			}
			else if(choose==2)
			{
				System.out.print("Please enter amount: ");
				money= scanner.nextInt();
				bank.withdraw(money);
			}
			else if(choose==3)
			{
				System.out.print("Please enter amount: ");
				money= scanner.nextInt();
				bank.deposit(money);
			}
			else if(choose==4)
			{
				System.out.print("GoodBye!");
				check2=true;
			}
			System.out.print("\n");
		}
		// TODO Auto-generated method stub

	}

}
