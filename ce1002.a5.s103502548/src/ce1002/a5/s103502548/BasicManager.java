package ce1002.a5.s103502548;
import java.util.*;
public class BasicManager extends BasicEmployee{
	public void setBonusSalary()        //(設定經理級額外薪資)
	{
		wage=wage+5000;
	}

	 public int getMonthMoney()     //(計算此月共得到的薪水並印出)
	 {
		 	setBonusSalary();
		 	
			System.out.println("Employee monthly salary: "+getTotalSalary());
			return getTotalSalary();
	 }

}
