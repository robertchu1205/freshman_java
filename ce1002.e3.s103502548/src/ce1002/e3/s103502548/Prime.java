package ce1002.e3.s103502548;
import java.util.Random;

public class Prime {

	int low,up,prime=0;
	public void setRange(int lowrange,int uprange) //Set the range  	 
	{
		low=lowrange;
		up=uprange;
	}
	
	public boolean check() //Check if there any prime numbers and print all prime numbers.
	{	
	
		int test=0;
			
		for(int i=low;i<=up;i++)
		{
			if(i==1)
			{ continue; }
			test=0;
			for(int j=2;j<i;j++)
			{
				if(i==2) { break; }
				if(i%j==0)
				{
					test=i;
					break;
				}
			}
			if(test==0) //借计
			{
				System.out.print(i+" ");
				prime=i;
			}
		}
		if(prime!=0) { return true; }//璶ㄤいΤ借计碞琌癸
		else 
		{
			System.out.println("No prime!");  
			System.exit(0);//
			return false;
		}
	}
	public int getRandomPrime() //Get the random prime number.
	{
		int num,ran,text2=0;
		num=up-low+1;//羆计
		Random random = new Random();
		while(true)
		{
			ran=random.nextInt(num)+low;
			for(int i=2;i<ran;i++)
			{
				text2=0;
				
				if(ran%i==0)
				{
					text2=i;
					break;
				}
		
			}
			if(text2==0&&ran!=1)
			{ 	return ran; }//繦诀计借计
		}
	}
	
	
}
