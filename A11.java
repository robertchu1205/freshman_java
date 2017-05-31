package ce1002.a11.s103502543;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class A11 implements ActionListener{
	

	private static  JFrame frame = new JFrame();
	private static  JPanel panel = new JPanel();
	private static  JPanel panel2 = new JPanel();
	private static  JButton btn = new JButton("Flip");
	public static  ImageIcon[] icon = new ImageIcon[10];
	public static  JLabel[] label = new JLabel[9];
	public static 	int banana = 0;
	public static CheckLine c =new CheckLine();
	public A11(){
		for(int i = 0 ; i < 10 ; i ++){
			icon[i] = new ImageIcon("src/ce1002/a11/s103502543/"+i+".png");
		}
		for(int i = 0 ; i < 9 ; i ++){
			label[i] = new JLabel(icon[0]); // set original icon
			panel.add(label[i]);
			panel.setLayout(new GridLayout(3,3));
		}
		btn.setSize(100, 100);
		panel2.add(btn);
		btn.addActionListener(this);
		frame.add(panel);
		frame.add(panel2,BorderLayout.SOUTH);	// set btn to the southest part
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//關閉視窗就關閉程式
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn){
			start();
		}
	}
	public static void main(String[] args) {
		new A11();
	}
	public static void start(){
		Random rand = new Random();
		for(int i = 0 ; i < 9 ; i++){
			label[i].setIcon(icon[rand.nextInt(9)+1]);
		}
		c.getbanana(label);
	}
	
}
