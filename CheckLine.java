package ce1002.a11.s103502543;

import javax.swing.*;

public class CheckLine {
	static JFrame frame2 = new JFrame("BaBaBaBaBanana~~");
	public void getbanana(JLabel[] label){
		
	    int banana = 0;
		if(label[0].getIcon() == label[1].getIcon()&&label[0].getIcon()==label[2].getIcon())
			banana +=1;
		if(label[3].getIcon() == label[4].getIcon()&&label[3].getIcon()==label[5].getIcon())
			banana +=1;
		if(label[6].getIcon() == label[7].getIcon()&&label[6].getIcon()==label[8].getIcon())
			banana +=1;
		if(label[0].getIcon() == label[3].getIcon()&&label[0].getIcon()==label[6].getIcon())
			banana +=1;
		if(label[1].getIcon() == label[4].getIcon()&&label[4].getIcon()==label[7].getIcon())
			banana +=1;
		if(label[2].getIcon() == label[5].getIcon()&&label[5].getIcon()==label[8].getIcon())
			banana +=1;
		if(label[0].getIcon() == label[4].getIcon()&&label[0].getIcon()==label[8].getIcon())	//±×
			banana +=1;
		if(label[2].getIcon() == label[4].getIcon()&&label[2].getIcon()==label[6].getIcon())	//±×
			banana +=1;
		if(banana == 0 ){
			;
		}
		else{
			JTextField text = new JTextField("You got Banana:"+banana+"Lines");
			frame2.add(text);
			frame2.setSize(200, 200);
			frame2.setVisible(true);
		}
	}
}
