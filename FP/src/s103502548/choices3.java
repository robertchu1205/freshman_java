package s103502548;

import java.awt.*;

import javax.swing.*;

import java.util.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.geom.*;

import javax.swing.JRadioButton;

public class choices3 extends FP {
	public static int count = 0;
	public static int[][] Balx = { { 230 }, { 203 } ,{234}};
	public static int[][] Baly = { { 275 }, { 282 } ,{59}};
	public static int[][][] Bloc = {
			{ { 227, 290 }, { 79, 247 }, { 373, 247 }, { 334, 75 }, { 140, 75 } },
			{ { 195, 290 }, { 403, 292 }, { 408, 236 }, { 430, 152 },
					{ 437, 48 } },
					{{ 234, 75 }, { 403, 292 }, { 408, 236 }, { 430, 152 },
					{ 437, 48 } }};
	public static int[][][] Rloc = {
			{ { 230, 237 }, { 85, 147 }, { 380, 167 }, { 292, 56 }, { 166, 48 } },
			{ { 230, 231 }, { 353, 292 }, { 355, 236 }, { 355, 152 },
					{ 355, 48 } } ,
					{{ 230, 231 }, { 353, 292 }, { 355, 236 }, { 355, 152 },
					{ 355, 48 } } };

	choices3() {
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

					op.setSize(w + 7, q);
					op.setResizable(false);
					op.setLocationRelativeTo(null);
					op.setDefaultCloseOperation(op.EXIT_ON_CLOSE);
					op.setLayout(new BorderLayout());
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
							if (count == 3) {
								JOptionPane.showMessageDialog(null, "턨쾧짦!!!!!",
										"Bang!!!", JOptionPane.PLAIN_MESSAGE);
								dialog.setVisible(true);
								System.exit(0);
							}
							op.repaint();
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
					op.add(c_court);
					op.add(button, new BorderLayout().SOUTH);
					op.setVisible(true);
				} else if (r2.isSelected()) {
					menu.dispose();
					dialog.dispose();

					int q = court.getIconHeight();
					int w = court.getIconWidth();

					op.setSize(w + 7, q);
					op.setResizable(false);
					op.setLocationRelativeTo(null);
					op.setDefaultCloseOperation(op.EXIT_ON_CLOSE);
					op.setLayout(new BorderLayout());
					c_court.setLayout(null);

					new Thread(new actiongo()).start();

					for (int i = 0; i < 5; i++) {
						c_court.add(l_blue[i]);
						c_court.add(l_red[i]);
					}
					c_court.add(bal);
					op.add(c_court);
					op.setVisible(true);
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

class actiongo extends choices3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		count = 0;
		try {
			while (count != 3) {
				for (int i = 0; i < 5; i++) {
					bal.setBounds(Balx[count][0], Baly[count][0],
							ball.getIconWidth(), ball.getIconHeight());
					l_blue[i].setBounds(Bloc[count][i][0], Bloc[count][i][1],
							blue[0].getIconWidth(), blue[0].getIconHeight());
					l_red[i].setBounds(Rloc[count][i][0], Rloc[count][i][1],
							blue[0].getIconWidth(), blue[0].getIconHeight());
				}
				Thread.sleep(2500);
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