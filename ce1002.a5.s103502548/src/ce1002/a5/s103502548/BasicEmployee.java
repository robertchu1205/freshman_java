package ce1002.a5.s103502548;
import java.util.*;
import java.text.*;
public class BasicEmployee {
	String name;
	int age;
	int wage;
	int add_money;
	int add_hour;
	String address;
	String sex;
	Date nowdate=new Date();
	public int getOvertimeSalary()     //(計算此月加班總共得到的加班費)
	{
		wage+=500*add_hour;
		return wage;
	}

	public int getTotalSalary()    //(計算此月總共得到的薪水)
	{
		getOvertimeSalary();
		return wage;
	}

	public void printData()    //(印出姓名,年齡,性別,地址,印資料的時間)
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Sex: "+sex);
		System.out.println("Address: "+address);
		System.out.println("Printed Date: "+nowdate);

	}

}
