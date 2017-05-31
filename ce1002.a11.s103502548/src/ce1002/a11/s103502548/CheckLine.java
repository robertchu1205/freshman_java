package ce1002.a11.s103502548;
import javax.swing.*;
public class CheckLine {
	public static JFrame jf2 =new JFrame("BaBaBaBaBanana~~");
	public void getline(JLabel[] label)
	{
		int line=0;
		if(label[0].getIcon() == label[1].getIcon()&&label[0].getIcon()==label[2].getIcon())
			line ++;
		if(label[3].getIcon() == label[4].getIcon()&&label[3].getIcon()==label[5].getIcon())
			line ++;
		if(label[6].getIcon() == label[7].getIcon()&&label[6].getIcon()==label[8].getIcon())
			line ++;
		if(label[0].getIcon() == label[3].getIcon()&&label[0].getIcon()==label[6].getIcon())
			line ++;
		if(label[1].getIcon() == label[4].getIcon()&&label[4].getIcon()==label[7].getIcon())
			line ++;
		if(label[2].getIcon() == label[5].getIcon()&&label[5].getIcon()==label[8].getIcon())
			line ++;
		if(label[0].getIcon() == label[4].getIcon()&&label[0].getIcon()==label[8].getIcon())	//±×
			line ++;
		if(label[2].getIcon() == label[4].getIcon()&&label[2].getIcon()==label[6].getIcon())	//±×
			line ++;
		if(line == 0 ) { }
		else{
			JTextField jt = new JTextField("You got Banana:"+line+"Lines");
			jf2.add(jt);
			jf2.setSize(200, 200);
			jf2.setVisible(true);
		}
	}
}
