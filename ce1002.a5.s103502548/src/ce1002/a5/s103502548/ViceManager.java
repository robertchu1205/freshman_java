package ce1002.a5.s103502548;
import java.util.*;
public class ViceManager extends BasicManager{
	public void setBonus()     //(設定額外薪資)
	{
		wage=wage+2000;
	}
	ViceManager(String n,int a,int w,int h,String ads,String s)
	{
		name=n;
		age=a;
		wage=w;
		add_hour=h;
		address=ads;
		sex=s;
		setBonus();
	}
	
}
