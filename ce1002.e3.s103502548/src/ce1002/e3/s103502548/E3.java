package ce1002.e3.s103502548;
import java.util.Scanner;

public class E3 {

	public static void main(String[] args) {
		int lowrange=0,uprange=0,input,time=0;
		Scanner scanner=new Scanner(System.in);
		Prime prime=new Prime();
		boolean b=false;
		while(b==false)
		{
			while(true)
			{
				System.out.print("Set the range: ");
				lowrange=scanner.nextInt();
				uprange=scanner.nextInt();
				if(lowrange<uprange&&lowrange>0&&uprange>0)
					break;
				System.out.println("Out of range! ");
			}
			prime.setRange(lowrange, uprange);
			b=prime.check();//輸入正確範圍則跳出迴圈
		}	
		int ans=prime.getRandomPrime();
		System.out.println("(Ans:"+ans+")\n");
		while(true)
		{
		System.out.print("Please try the range("+lowrange+"~"+uprange+").\n");
		System.out.print("Input an integer: ");
		input=scanner.nextInt();
		if(input<ans&&input>=lowrange)
		{
			lowrange=input+1;
			prime.setRange(lowrange, uprange);
			time++;//次數+1
		}
		else if(input>ans&&input<=uprange)
		{
			uprange=input-1;
			prime.setRange(lowrange, uprange);
			time++;//次數+1
		}
		else if(input==ans)
		{
			System.out.print("You Win!");
			System.exit(0);//結束
		}
		else if(input<lowrange||input>uprange||input<=0)
		{
			System.out.print("Out of range!\n");
		}
		if(time>=5) 
		{
			System.out.print("You Lose!");
			System.exit(0);//結束
		}
		}
		// TODO Auto-generated method stub
	}

}
