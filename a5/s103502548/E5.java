package ce1002.e5.s103502548;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
public class E5 {
    	
	public static void main(String[] args) {
		int choose;
		int num;
		boolean check=false;
		Scanner scanner=new Scanner(System.in);
		E5 e5=new E5();
		ArrayList<Integer> ele = new ArrayList<Integer>();
		for(int i=0;i<20;i++)
		{
			ele.add(e5.random());
		}
		while(check==false)
		{
			System.out.print("Please choose (1)Check all elements (2)reset all elements (3)find Prime numbers (4)sort all numbers (5)exit : ");
			choose=scanner.nextInt();
			if(choose==5)
			{
				check=true;
				break;
			}
			else if(choose==1)//�L�X
			{
				System.out.print("Random numbers are: ");
				for(int i=0;i<ele.size();i++)
				{
					System.out.print(ele.get(i)+" ");
				}
				System.out.print("\n");
			}
			else if(choose==2)//�M���í��s���L
			{
				ele.clear();
				for(int i=0;i<20;i++)
				{
					ele.add(e5.random());
				}
			}
			else if(choose==3)
			{
				for(int i=ele.size()-1;i>=0;i--)//����ơA�}�C���׷|�ܩҥH�n�q�᭱�}�l��
				{
					if((Integer)ele.get(i)==1)
						ele.remove(i);
					if((Integer)ele.get(i)!=2)
					{
						for(int j=2;j<(Integer)ele.get(i);j++)
						{
							if((Integer)ele.get(i)%j==0)
							{
								ele.remove((Integer)ele.get(i));
								break;
							}
						}
					}
				}
				System.out.print("Prime numbers are : ");
				for(int i=0;i<ele.size();i++)
				{
					System.out.print(ele.get(i)+" ");
				}
				System.out.print("\n");
			}
			else if(choose==4)//�q�p�ƨ�j
			{
				Collections.sort(ele);
				System.out.print("Now numbers are: ");
				for(int i=0;i<ele.size();i++)
				{
					System.out.print(ele.get(i)+" ");
				}
				System.out.print("\n");
			}
			else//���b�ﶵ���~
			{
				System.out.println("Input error");
			}
		}	
		// TODO Auto-generated method stub
	}
	public int random()//��0~100���ü�
	{
		Random ran = new Random();
		return ran.nextInt(101);
	}

}
