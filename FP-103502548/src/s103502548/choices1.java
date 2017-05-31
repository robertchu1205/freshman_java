package s103502548;

import java.awt.*;

import javax.swing.*;

import java.util.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.geom.*;

import javax.swing.JRadioButton;

public class choices1 extends FP {
	public static int count = 0;
	static boolean cc = false;
	public static int[][] Balx = { { 230 }, { 120 }, { 120 }, { 300 }, { 400 },
			{ 400 }, { 400 }, { 400 }, { 270 }, { 230 } };
	public static int[][] Baly = { { 275 }, { 255 }, { 255 }, { 225 }, { 250 },
			{ 250 }, { 250 }, { 250 }, { 290 }, { 65 } };
	public static int[][][] Bloc = {
			{ { 227, 290 }, { 79, 247 }, { 373, 247 }, { 334, 75 }, { 140, 75 } },
			{ { 116, 270 }, { 30, 180 }, { 395, 266 }, { 164, 180 },
					{ 312, 174 } },
			{ { 30, 180 }, { 116, 270 }, { 395, 266 }, { 131, 205 },
					{ 306, 241 } },
			{ { 30, 180 }, { 116, 270 }, { 395, 266 }, { 131, 205 },
					{ 306, 241 } },
			{ { 30, 180 }, { 116, 270 }, { 395, 266 }, { 140, 260 },
					{ 361, 244 } },
			{ { 63, 273 }, { 334, 75 }, { 395, 266 }, { 88, 179 }, { 181, 249 } },
			{ { 147, 317 }, { 334, 75 }, { 395, 266 }, { 88, 179 },
					{ 181, 249 } },
			{ { 207, 313 }, { 334, 75 }, { 395, 266 }, { 88, 179 },
					{ 181, 249 } },
			{ { 258, 295 }, { 334, 75 }, { 395, 266 }, { 88, 179 },
					{ 181, 249 } },
			{ { 258, 285 }, { 334, 75 }, { 395, 266 }, { 88, 179 },
					{ 181, 249 } } };
	public static int[][][] Rloc = {
			{ { 230, 237 }, { 85, 147 }, { 380, 167 }, { 292, 56 }, { 166, 48 } },
			{ { 139, 244 }, { 53, 149 }, { 372, 225 }, { 163, 148 },
					{ 293, 127 } },
			{ { 139, 244 }, { 53, 149 }, { 372, 225 }, { 163, 148 },
					{ 307, 186 } },
			{ { 139, 244 }, { 53, 149 }, { 372, 225 }, { 163, 148 },
					{ 307, 186 } },
			{ { 129, 247 }, { 53, 149 }, { 372, 225 }, { 149, 208 },
					{ 336, 219 } },
			{ { 143, 238 }, { 53, 149 }, { 372, 225 }, { 291, 68 },
					{ 336, 219 } },
			{ { 143, 238 }, { 53, 149 }, { 372, 225 }, { 291, 68 },
					{ 336, 219 } },
			{ { 143, 238 }, { 53, 149 }, { 372, 225 }, { 291, 68 },
					{ 336, 219 } },
			{ { 143, 238 }, { 53, 149 }, { 372, 225 }, { 291, 68 },
					{ 320, 232 } },
			{ { 143, 238 }, { 53, 149 }, { 372, 225 }, { 291, 68 },
					{ 300, 232 } } };

	choices1() {
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
				menu.dispose();
				if (r1.isSelected()) {
					menu.dispose();
					dialog.dispose();

					JPanel button = new JPanel();
					Button nextstep = new Button("Next Step");
					int q = court.getIconHeight();
					int w = court.getIconWidth();

					cs.setSize(w + 7, q);
					cs.setResizable(false);
					cs.setLocationRelativeTo(null);
					cs.setDefaultCloseOperation(cs.EXIT_ON_CLOSE);
					cs.setLayout(new BorderLayout());
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
							cs.repaint();
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
					cs.add(c_court);
					cs.add(button, new BorderLayout().SOUTH);
					cs.setVisible(true);
				} else if (r2.isSelected()) {
					menu.dispose();
					dialog.dispose();

					int q = court.getIconHeight();
					int w = court.getIconWidth();

					cs.setSize(w +7, q);
					cs.setResizable(false);
					cs.setLocationRelativeTo(null);
					cs.setDefaultCloseOperation(cs.EXIT_ON_CLOSE);
					cs.setLayout(new BorderLayout());
					c_court.setLayout(null);

					new Thread(new action()).start();

					for (int i = 0; i < 5; i++) {
						c_court.add(l_blue[i]);
						c_court.add(l_red[i]);
					}
					c_court.add(bal);
					cs.add(c_court);
					cs.setVisible(true);
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

class action extends choices1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		count = 0;
		try {
			while (count != 10) {
				for (int i = 0; i < 5; i++) {
					if (count >= 6) {
						if (!cc) {
							Music lt = new Music();
							lt.playMusic("src/s103502548/_LillardTime_For_Overtime_In_OKC.wav");
							cc = true;
						}
					}
					bal.setBounds(Balx[count][0], Baly[count][0],
							ball.getIconWidth(), ball.getIconHeight());
					l_blue[i].setBounds(Bloc[count][i][0], Bloc[count][i][1],
							blue[0].getIconWidth(), blue[0].getIconHeight());
					l_red[i].setBounds(Rloc[count][i][0], Rloc[count][i][1],
							blue[0].getIconWidth(), blue[0].getIconHeight());
				}
				Thread.sleep(1500);
				count++;
			}
			JOptionPane.showMessageDialog(null, "턨쾧짦!!!!!", "Bang!!!",
					JOptionPane.PLAIN_MESSAGE);
			dialog.setVisible(true);
			System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}