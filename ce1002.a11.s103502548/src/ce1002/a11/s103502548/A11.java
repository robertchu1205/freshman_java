package ce1002.a11.s103502548;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class A11 implements ActionListener {
	
	public static JFrame jf=new JFrame();
	public static JPanel jp=new JPanel();//存label
	public static JPanel jp2=new JPanel();//存button
	public static JButton jb=new JButton("Flip");
	public static ImageIcon[] icon=new ImageIcon[10];
	public static JLabel[] label =new JLabel[9];
	public static int line = 0;
	public static CheckLine c =new CheckLine();
	public A11() {
		jf.setSize(800, 800);
		jb.setPreferredSize(new Dimension(100,30));
		jp2.add(jb);
		jf.add(jp2,BorderLayout.SOUTH);
		jb.addActionListener(this);
		for(int i=0;i<10;i++)
		{
			icon[i]=new ImageIcon("src/ce1002/a11/s103502548/"+i+".png");//圖片存入ICON
		}
		for(int i=0;i<9;i++)
		{
			label[i]=new JLabel(icon[0]);
			jp.add(label[i]);
			jp.setLayout(new GridLayout(3,3));
		}
		jf.add(jp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//關閉視窗即關閉程式
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==jb)
				random();
	}
	public static void random()
	{
		Random r=new Random();
		
		for(int i=0;i<9;i++)
				label[i].setIcon(icon[r.nextInt(9)+1]);
		c.getline(label);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A11();
	}

}
