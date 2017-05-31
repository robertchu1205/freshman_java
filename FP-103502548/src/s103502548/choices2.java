package s103502548;

import java.awt.*;

import javax.swing.*;

import java.util.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.geom.*;

import javax.swing.JRadioButton;

public class choices2 extends FP {
	public static int count = 0;
	public static int[][] Balx = { { 230 }, { 120 }, { 120 },{350},{350},{350} ,{420},{400},{310},{234}};
	public static int[][] Baly = { { 275 }, { 255}, { 255} ,{280},{280},{280},{220},{110},{52},{59}};
	public static int[][][] Bloc = {
			{ { 227, 290 }, { 79, 247 }, { 373, 247 }, { 334, 75 }, { 140, 75 } },
			{ { 116,270}, { 30,180},{ 395,266},{ 164,180 },{ 312,174} } ,
			{ { 30,180 }, { 116,270 }, { 352,298}, {194,231 },{ 292,220 } },
			{{ 30,180 }, { 116,270 }, { 352,298}, { 292,220 },{ 194,231 } },
			{{ 66,227 }, { 99,263}, { 352,298}, { 334,216 },{ 229,217} },
			{{ 116,270 }, { 30,180}, { 352,298}, { 369,224 },{ 229,217} },
			{{ 116,270 }, { 30,180}, {420,234}, { 369,224 },{ 229,217} },
			{{ 116,270 }, { 30,180}, {397,98}, { 369,224 },{ 229,217} },
			{{ 116,270 }, { 30,180}, {310,69}, { 369,224 },{ 229,217} },
			{{ 116,270 }, { 30,180}, {310,69}, { 369,224 },{ 229,217} }};
	public static int[][][] Rloc = {
			{ { 230, 237 }, { 85, 147 }, { 380, 167 }, { 292, 56 }, { 166, 48 } },
			{ { 139,244 }, { 53,149 }, { 372,225}, { 163,148 },{ 293,127 } },
			{ { 139,244 }, { 53,149  }, { 344,232}, { 191,129 }, {272,131 } },
			{ { 139,244 }, { 53,149  }, { 344,232}, { 272,131}, {191,129 } },
			{ { 103,212 }, { 76,183  }, { 344,232}, { 313,178}, {191,129 } },
			{ { 53,149}, { 139,244   }, { 344,232}, { 313,178}, {191,129 } },
			{ { 53,149}, { 139,244   }, { 344,232}, { 348,188}, {191,129 } },
			{ { 53,149}, { 139,244   }, { 344,232}, { 348,188}, {191,129 } },
			{ { 53,149}, { 139,244   }, { 344,232}, { 348,188}, {191,129 } },
			{ { 53,149}, { 139,244   }, { 344,232}, { 348,188}, {191,129 } }};

	choices2() {
		Panel p_ani = new Panel();
		Panel p_step = new Panel();
		Font font = new Font(Font.DIALOG_INPUT, Font.BOLD, 12);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton r1 = new JRadioButton();
		JRadioButton r2 = new JRadioButton();
		// ////////////////////////////////////////
		bal = new JLabel(ball);
		for (int i = 0; i < 5; i++) {
			int ii = i + 1;
			blue[i] = new ImageIcon("src/s103502548/blue" + ii + ".jpg");
			red[i] = new ImageIcon("src/s103502548/red" + ii + ".jpg");
		}
		for (int i = 0; i < 5; i++) {
			l_blue[i] = new JLabel(blue[i]);
			l_red[i] = new JLabel(red[i]);
		}
		// ////////////////////////////////////////
		dialog.removeAll();
		bg.add(r1);
		bg.add(r2);
		Label ani = new Label("Animation");
		ani.setFont(font);
		ani.setForeground(Color.YELLOW);
		Label step = new Label("Step By Step");
		step.setFont(font);
		step.setForeground(Color.YELLOW);

		p_ani.add(ani);
		p_ani.add(r2);
		p_step.add(step);
		p_step.add(r1);

		dialog.setSize(150, 140);
		dialog.setBackground(Color.BLUE);
		dialog.setLocationRelativeTo(null);
		dialog.setLayout(new BorderLayout());
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (r1.isSelected()) {
					menu.dispose();
					dialog.dispose();

					JPanel button = new JPanel();
					Button nextstep = new Button("Next Step");
					int q = court.getIconHeight();
					int w = court.getIconWidth();

					big3.setSize(w + 7, q);
					big3.setResizable(false);
					big3.setLocationRelativeTo(null);
					big3.setDefaultCloseOperation(big3.EXIT_ON_CLOSE);
					big3.setLayout(new BorderLayout());
					button.setLayout(new BorderLayout());
					c_court.setLayout(null);

					for (int i = 0; i < 5; i++) {
						bal.setBounds(Balx[count][0], Baly[count][0],
								ball.getIconWidth(), ball.getIconHeight());
						l_blue[i].setBounds(Bloc[count][i][0],
								Bloc[count][i][1], blue[0].getIconWidth(),
								blue[0].getIconHeight());
						l_red[i].setBounds(Rloc[count][i][0],
								Rloc[count][i][1], blue[0].getIconWidth(),
								blue[0].getIconHeight());
					}
					nextstep.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							count++;
							if (count == 10) {
								JOptionPane.showMessageDialog(null, "턨쾧짦!!!!!",
										"Bang!!!", JOptionPane.PLAIN_MESSAGE);
								dialog.setVisible(true);
								System.exit(0);
							}
							big3.repaint();
							for (int i = 0; i < 5; i++) {
								bal.setBounds(Balx[count][0], Baly[count][0],
										ball.getIconWidth(),
										ball.getIconHeight());
								l_blue[i].setBounds(Bloc[count][i][0],
										Bloc[count][i][1],
										blue[0].getIconWidth(),
										blue[0].getIconHeight());
								l_red[i].setBounds(Rloc[count][i][0],
										Rloc[count][i][1],
										blue[0].getIconWidth(),
										blue[0].getIconHeight());
							}
						}

					});
					button.add(nextstep);
					for (int i = 0; i < 5; i++) {
						c_court.add(l_blue[i]);
						c_court.add(l_red[i]);
					}
					c_court.add(bal);
					big3.add(c_court);
					big3.add(button, new BorderLayout().SOUTH);
					big3.setVisible(true);
				} else if (r2.isSelected()) {
					menu.dispose();
					dialog.dispose();

					int q = court.getIconHeight();
					int w = court.getIconWidth();

					big3.setSize(w+7 , q);
					big3.setResizable(false);
					big3.setLocationRelativeTo(null);
					big3.setDefaultCloseOperation(big3.EXIT_ON_CLOSE);
					big3.setLayout(new BorderLayout());
					c_court.setLayout(null);

					new Thread(new actiongogo()).start();

					for (int i = 0; i < 5; i++) {
						c_court.add(l_blue[i]);
						c_court.add(l_red[i]);
					}
					c_court.add(bal);
					big3.add(c_court);
					big3.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,
							"You don't choose yet!", "Oops!!!",
							JOptionPane.WARNING_MESSAGE);
					dialog.setVisible(true);
				}
			}

		});
		dialog.add(ok, new BorderLayout().SOUTH);
		dialog.add(p_step, new BorderLayout().NORTH);
		dialog.add(p_ani, new BorderLayout().CENTER);
		dialog.setVisible(true);
	}
}

class actiongogo extends choices2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		count = 0;
		try {
			while(count!=10){
				for(int i=0;i<5;i++) {
				bal.setBounds(Balx[count][0], Baly[count][0],
						ball.getIconWidth(), ball.getIconHeight());
				l_blue[i].setBounds(Bloc[count][i][0], Bloc[count][i][1],
						blue[0].getIconWidth(), blue[0].getIconHeight());
				l_red[i].setBounds(Rloc[count][i][0], Rloc[count][i][1],
						blue[0].getIconWidth(), blue[0].getIconHeight()); }
				if(count<9) { Thread.sleep(1500); }
				count++;
			}JOptionPane.showMessageDialog(null, "턨쾧짦!!!!!", "Bang!!!",
							JOptionPane.PLAIN_MESSAGE);
					dialog.setVisible(true);
					System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}