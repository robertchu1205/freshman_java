package ce1002.a3.s103502548;

public class Bank {

	public String truename;
	public String truepass;
	public int b;
	Bank(String name,String pass,int balance) //constructor define ("user1","user1",100)
	{
		truename=name;//�غc�l
		truepass=pass;
		b=balance;
	}
	
	public boolean check(String name,String pass) //function check
	{
		if((name.equals(truename)==true)&&(pass.equals(truepass)==true))//�ۦP�h�^��true
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
		if(balance<0)//�s�J�������i���t
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
		if(balance>b||balance<0)//��X�������i�֩�s�کά��t
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
