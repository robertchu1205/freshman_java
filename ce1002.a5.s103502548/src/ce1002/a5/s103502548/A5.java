package ce1002.a5.s103502548;
import java.util.*;
public class A5 {

	public static void main(String[] args) {
//      �m�W  �~�� ���~�� �o�Ӥ�[�Z�ɼ� ��} �ʧO 

		Employee John = new Employee("John",25,40000,10,"Taoyuan","Male");
		
		John.printData();
		
		John.getMonthMoney(); 
		
		System.out.println();
		
		Employee Miley = new Employee("Miley",20,38000,5,"Taipei","Female");
		
		Miley.printData();
		
		Miley.getMonthMoney();
		
		System.out.println();
		
		//manager example
		
		ViceManager Sam = new ViceManager("Sam",30,60000,10,"Taichung","Male");
		
		Sam.printData();
		
		Sam.getMonthMoney();
		
		System.out.println();
		
		Manager Cooper = new Manager("Cooper",40,100000,20,"USA","Male");
		
		Cooper.printData();
		
		Cooper.getMonthMoney();
		
		System.out.println();
		// TODO Auto-generated method stub

	}

}
