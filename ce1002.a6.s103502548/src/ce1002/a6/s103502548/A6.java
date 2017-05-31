package ce1002.a6.s103502548;
import java.util.*;
import java.text.*;
public class A6 {
	public static String wrong = "Wrong input format! Please use only '/' or '-' symbol to separate numbers."
			+"\nPlease enter correct date format again, or enter 'Exit' to end the program.";//錯誤輸出wrong
	public static void main(String[] args) {
		String s;
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			
			while(true)
			{
				System.out.println("===Week day inquire system===");
				System.out.print("Enter a day (ex: 2015-04-02 or 2015/04/02): ");
				s=scanner.nextLine();
				if(s.equals("Exit"))//結束
				{
					System.out.println("===exit system===");
					System.exit(0);
				}
				else
				{
					if(dofw(s)==wrong)
						System.out.println(wrong);
					else
					{
						System.out.println("Week day of "+s+" is "+dofw(s));
					}
				}
			}
		}
	}
	public static String dofw(String s) //判斷兩次
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	//	SimpleDateFormat d = new SimpleDateFormat("u");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try{
		Date date =sdf.parse(s);
//		String day = d.format(date);
		Calendar c=Calendar.getInstance();//取得目前時間
		c.setTime(date);//設定指定時間
		int day=c.get(Calendar.DAY_OF_WEEK);
		if(day==1) //1~7 -> 禮拜日至禮拜六
			return "Sunday";
		else if(day==2)
			return "Monday";
		else if(day==3)
			return "Tuesday";
		else if(day==4)
			return "Wednesday";
		else if(day==5)
			return "Thursday";
		else if(day==6)
			return "Friday";
		else 
			return "Saturday";
		} catch(ParseException ex){
			try{
				Date date =sdf2.parse(s);
//				String day = d.format(date);
				Calendar c=Calendar.getInstance();//取得目前時間
				c.setTime(date);//設定指定時間
				int day=c.get(Calendar.DAY_OF_WEEK);
				if(day==1) //1~7 -> 禮拜日至禮拜六
					return "Sunday";
				else if(day==2)
					return "Monday";
				else if(day==3)
					return "Tuesday";
				else if(day==4)
					return "Wednesday";
				else if(day==5)
					return "Thursday";
				else if(day==6)
					return "Friday";
				else 
					return "Saturday";
			} catch(ParseException e){//錯誤則輸出wrong
			return wrong; }
		}
	}
}
