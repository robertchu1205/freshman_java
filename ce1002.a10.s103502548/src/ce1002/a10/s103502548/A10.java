package ce1002.a10.s103502548;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class A10 extends JFrame implements ActionListener{

	public static JButton b1=new JButton ("Oval");
	public static JButton b2=new JButton ("RoundRect");
	public static JButton b3=new JButton ("Rectangle");
	public static JButton b4=new JButton ("Color filled");
	public static JButton b5=new JButton ("Color not filled");
	public static JPanel p=new JPanel();
	public static String press;//前一個案什麼徒刑
	public static boolean fill = false;
	Graphics g;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A10();
	}

	public A10()
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setTitle("Graphs");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		add(p,BorderLayout.NORTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==b1)
		{
			g=getGraphics();
			update(g);
			g.setColor(Color.red);
			g.drawOval(200, 200, 200, 400);//畫橢圓
			press="1";
		}
		else if(a.getSource()==b2)
		{
			g=getGraphics();
			update(g);
			g.setColor(Color.red);
			g.drawRoundRect(200, 200, 300, 400, 100, 200);//化緣腳舉行
			press="2";
		}
		else if(a.getSource()==b3)
		{
			g=getGraphics();
			update(g);
			g.setColor(Color.red);
			g.drawRect(200,200,300,400);//化舉行
			press="3";
		}
		else if(a.getSource()==b4)
		{
			g=getGraphics();
			update(g);
			if(press.equals("1"))
			{
				g.setColor(Color.blue);
				g.fillOval(200, 200, 200, 400);
			}
			else if(press.equals("2"))
			{
				g.setColor(Color.BLUE);
				g.fillRoundRect(200, 200, 300, 400, 100, 200);
			}
			else if(press.equals("3"))
			{
				g.setColor(Color.BLUE);
				g.fillRect(200, 200, 300, 400);
			}
		}
		else if(a.getSource()==b5)
		{
			g=getGraphics();
			update(g);
			if(press.equals("1"))
			{
				g.setColor(Color.pink);
				g.drawOval(200, 200, 200, 400);
			}
			else if(press.equals("2"))
			{
				g.setColor(Color.pink);
				g.drawRoundRect(200, 200, 300, 400, 100, 200);
			}
			else if(press.equals("3"))
			{
				
				g.setColor(Color.pink);
				g.drawRect(200,200,300,400);
			}
		}
	}
}
