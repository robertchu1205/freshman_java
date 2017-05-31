package ce1002.a7.s103502548;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame("LaMarCus AGG is me!!!");//µøµ¡
		JTextField [][]jt =new JTextField[50][50];//«ö¶s
		JPanel panel=new JPanel();//ªO¤l
		jf.setSize(500, 500);
		panel.setLayout(new GridLayout(50,50));
		for(int i=0;i<50;i++)
		{
			for(int j=0;j<50;j++)
			{
				jt[i][j]=new JTextField("");
				panel.add(jt[i][j]);
			}
		}
		//ipad
		for(int i=1;i<=5;i++)
		{
			for(int j=9;j<41;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		for(int i=6;i<=32;i++)
		{
			for(int j=9;j<12;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		for(int i=6;i<=32;i++)
		{
			for(int j=38;j<41;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		for(int i=33;i<=39;i++)
		{
			for(int j=9;j<41;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		//«ö¶s
		jt[34][25].setBackground(new Color(255,255,255));
		jt[35][26].setBackground(new Color(255,255,255));
		jt[35][24].setBackground(new Color(255,255,255));
		jt[36][27].setBackground(new Color(255,255,255));
		jt[36][23].setBackground(new Color(255,255,255));
		jt[37][24].setBackground(new Color(255,255,255));
		jt[37][26].setBackground(new Color(255,255,255));
		jt[38][25].setBackground(new Color(255,255,255));
		//i
		jt[41][10].setBackground(new Color(0,0,0));
		for(int i=44;i<=49;i++)
		{
			for(int j=10;j<11;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		//p
		for(int i=41;i<=49;i++)
		{
			for(int j=16;j<18;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		jt[41][18].setBackground(new Color(0,0,0));
		jt[42][19].setBackground(new Color(0,0,0));
		jt[43][20].setBackground(new Color(0,0,0));
		jt[44][19].setBackground(new Color(0,0,0));
		jt[45][18].setBackground(new Color(0,0,0));
		//A
		int a=41,b=30;
		while(a<=49)
		{
				jt[a][b].setBackground(new Color(0,0,0));
				a++;
				b--;
		}
		int i2=41,j2=30;
		while(i2<=49)
		{
				jt[i2][j2].setBackground(new Color(0,0,0));
				i2++;
				j2++;
		}
		for(int i=45;i<=45;i++)
		{
			for(int j=26;j<=34;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		//D
		for(int i=41;i<=49;i++)
		{
			for(int j=42;j<=42;j++)
			{
				jt[i][j].setBackground(new Color(0,0,0));
			}
		}
		int d1=41,d2=42;
		int count=0;
		while(count<5)
		{
			jt[d1][d2].setBackground(new Color(0,0,0));
			d1++;
			d2++;
			count++;
		}
		jt[49][43].setBackground(new Color(0,0,0));
		jt[48][44].setBackground(new Color(0,0,0));
		jt[47][45].setBackground(new Color(0,0,0));
		jt[46][46].setBackground(new Color(0,0,0));
		jf.add(panel);
		jf.setVisible(true);//¿é¥X
		
	}

}
