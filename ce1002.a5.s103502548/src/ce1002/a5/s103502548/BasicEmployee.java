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
	public int getOvertimeSalary()     //(�p�⦹��[�Z�`�@�o�쪺�[�Z�O)
	{
		wage+=500*add_hour;
		return wage;
	}

	public int getTotalSalary()    //(�p�⦹���`�@�o�쪺�~��)
	{
		getOvertimeSalary();
		return wage;
	}

	public void printData()    //(�L�X�m�W,�~��,�ʧO,�a�},�L��ƪ��ɶ�)
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Sex: "+sex);
		System.out.println("Address: "+address);
		System.out.println("Printed Date: "+nowdate);

	}

}
