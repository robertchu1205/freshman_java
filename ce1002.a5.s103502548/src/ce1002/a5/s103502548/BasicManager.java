package ce1002.a5.s103502548;
import java.util.*;
public class BasicManager extends BasicEmployee{
	public void setBonusSalary()        //(�]�w�g�z���B�~�~��)
	{
		wage=wage+5000;
	}

	 public int getMonthMoney()     //(�p�⦹��@�o�쪺�~���æL�X)
	 {
		 	setBonusSalary();
		 	
			System.out.println("Employee monthly salary: "+getTotalSalary());
			return getTotalSalary();
	 }

}
