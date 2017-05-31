package ce1002.e7.s103502548;
import javax.swing.*;
import java.awt.*;

public class E7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JButton []button =new JButton[10];//«ö¶s
		
		JFrame frame =new JFrame("LaMarCus AGG is me!!!");//µøµ¡
		
		JPanel panel=new JPanel();//ªO¤l
		
		frame.setSize(1000,1000);
		
		//frame.setLocationRelativeTo(null);
		panel.setLayout(new GridLayout(1,10));
		for(int i=0;i<10;i++)
		{
			button[i]= new JButton(""+i);
			//button[i].setPreferredSize(new Dimension(100,1000));
			
			button[i].setBackground(new Color(249,80,80+15*i));

			
			panel.add(button[i]);
			
		}
		
		frame.add(panel);
		frame.setVisible(true);//¿é¥X
	}

}
