package A12;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageProducer;

import javax.swing.*;

public class A12 extends JFrame implements ActionListener{
	public static ImageIcon [] i=new ImageIcon[8];
	public static JLabel [] l=new JLabel[8];
	public static JRadioButton [] rb=new JRadioButton[8];
	public static JButton sent=new JButton("Sent");
	public static JPanel image=new JPanel();
	public static JPanel b=new JPanel();
	public static ScrollPane jsp=new ScrollPane();
	public A12()
	{
		for(int j=0;j<8;j++)
		{
			i[j]=new ImageIcon("src/A12/"+j+".jpg");
			l[j] =new JLabel(i[j]);
			image.add(l[j]);
			rb[j]=new JRadioButton();
			image.add(rb[j]);
			rb[j].addActionListener(this);
		}
		rb[0].setText("Basketball   1000");
		rb[1].setText("Baseball   500");
		rb[2].setText("Volley ball   200");
		rb[3].setText("Table tennis   750");
		rb[4].setText("Bowling bowl   800");
		rb[5].setText("Golf   10");
		rb[6].setText("Soccer   100");
		rb[7].setText("Tennis   700");
		jsp.add(image);
		//int policy=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
	    //jsp.setVerticalScrollBarPolicy(policy);
		add(jsp);
		sent.setPreferredSize(new Dimension(100,30));
		sent.addActionListener(this);
		b.add(sent);
		image.setLayout(new GridLayout(4,2));
		add(b,BorderLayout.SOUTH);
		setSize(1200,500);
		setTitle("在我心中的球類價值");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A12();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str="Total:";
		int total=0;
		String s="";
		if(rb[0].isSelected()==true)
		{
			s=s+"\nBasketball:1000";
			total+=1000;
		}
		else if (rb[1].isSelected()==true)
		{
			s=s+"\nBaseball:500";
			total+=500;
		}
		else if (rb[2].isSelected()==true)
		{
			s=s+"\nVolley ball:200";
			total+=200;
		}
		else if (rb[3].isSelected()==true)
		{
			s=s+"\nTable tennis:750";
			total+=750;
		}
		if(e.getSource()==sent) {
		JOptionPane.showMessageDialog(null, str+total+s, "VALUE", JOptionPane.PLAIN_MESSAGE );
		System.out.println("haha");
		}
		}

}
