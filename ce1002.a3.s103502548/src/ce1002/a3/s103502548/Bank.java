package ce1002.a3.s103502548;

public class Bank {

	public String truename;
	public String truepass;
	public int b;
	Bank(String name,String pass,int balance) //constructor define ("user1","user1",100)
	{
		truename=name;//建構子
		truepass=pass;
		b=balance;
	}
	
	public boolean check(String name,String pass) //function check
	{
		if((name.equals(truename)==true)&&(pass.equals(truepass)==true))//相同則回傳true
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void getBalance() //print out balance
	{
		System.out.println(b);
	}
	public void deposit(int balance)
	{
		if(balance<0)//存入的錢不可為負
		{
			System.out.println("Out of amount!");
		}
		else
		{
			b+=balance;
			System.out.print("Balance left NT");
			System.out.println(b);
		}
	}
	public void withdraw(int balance)
	{
		if(balance>b||balance<0)//領出的錢不可少於存款或為負
		{
			System.out.println("Out of amount!");
		}
		else
		{
		b-=balance;
		System.out.print("Balance left NT");
		System.out.println(b);
		}
	}
	
}
