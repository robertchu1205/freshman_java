package ce1002.a5.s103502548;
import java.util.*;
public class Employee extends BasicEmployee{
		Employee(String n,int a,int w,int h,String ads,String s)
		{
			name=n;
			age=a;
			wage=w;
			add_hour=h;
			address=ads;
			sex=s;
		}
		public int getMonthMoney()          //(�L�X����o�쪺�~��)
		{	
				System.out.println("Employee monthly salary: "+getTotalSalary());
				return getTotalSalary();
		}
}
