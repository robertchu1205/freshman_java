package s103502548;

import java.awt.*;

import javax.swing.*;

import java.util.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.geom.*;

public class FP extends MouseAdapter implements ActionListener {
	public static JFrame menu = new JFrame("Tactical Board Menu");
	public static JFrame con = new JFrame("Control by yourself");
	public static JFrame cs = new JFrame("Corner - Shuffle ( 角落洗牌戰術 )");
	public static JFrame big3 = new JFrame("改Corner - Shuffle ( 角落洗牌戰術 )");
	public static JFrame op = new JFrame("A player A team (喇叭詹一人球隊戰術)");
	public static JLabel bal = new JLabel();
	public static JLabel[] l_blue = new JLabel[5];
	public static JLabel[] l_red = new JLabel[5];
	public static JButton own = new JButton("Control by yourself");
	public static JButton drawred = new JButton("Draw Red");
	public static JButton reset = new JButton("Reset");
	public static JButton back = new JButton("Back to menu");
	public static JButton exit = new JButton("Exit");
	public static JButton s1 = new JButton("Corner - Shuffle");
	public static JButton s2 = new JButton("改Corner - Shuffle");
	public static JButton s3 = new JButton("A player A team");
	public static JButton ok = new JButton("OK");
	public static ImageIcon[] coach = new ImageIcon[7];
	public static ImageIcon court = new ImageIcon("src/s103502548/court.jpg");
	public static ImageIcon[] blue = new ImageIcon[5];
	public static ImageIcon[] red = new ImageIcon[5];
	public static ImageIcon ball = new ImageIcon("src/s103502548/ball.jpg");
	public static Dialog dialog = new Dialog(menu, "Mode");
	public static boolean drawornot = false;
	public static int px;
	public static int py;
	public static int px2, py2;
	public static int y;
	public static int x;
	public static int x0, y0;// 球員拖移 暫存按滑鼠的位置
	static boolean d = false;

	public static JPanel coach_pic = new JPanel() {// 教練照片直接從PANEL放入
		protected void paintComponent(Graphics g) {
			Random ran = new Random();
			Image bg = coach[ran.nextInt(7)].getImage();
			g.drawImage(bg, 0, 0, coach[ran.nextInt(7)].getIconWidth(),
					coach[ran.nextInt(7)].getIconHeight(), this);
		}

	};
	public static JPanel c_court = new JPanel() {// 籃球場直接從PANEL放入
		protected void paintComponent(Graphics g) {
			Image c = court.getImage();
			g.drawImage(c, 0, 0, court.getIconWidth(), court.getIconHeight(),
					this);
		}
	};

	public FP() {
		if (!d) {
			Music test = new Music();
			test.playMusic("src/s103502548/2013_Miami_HEAT_Player_Intro.wav");
			d=true;
		}
		menu.setLayout(new BorderLayout());
		menu.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);// 關閉就關閉程式
		menu.setSize(800, 480);
		menu.setResizable(false);
		for (int i = 0; i < 7; i++) {
			coach[i] = new ImageIcon("src/s103502548/" + i + ".jpg");
		}
		own.setBounds(25, 400, 140, 35);
		s1.setBounds(175, 400, 140, 35);
		s2.setBounds(325, 400, 140, 35);
		s3.setBounds(475, 400, 140, 35);
		exit.setBounds(625, 400, 140, 35);

		coach_pic.add(own);
		coach_pic.add(s1);
		coach_pic.add(s2);
		coach_pic.add(s3);
		coach_pic.add(exit);
		coach_pic.setLayout(null);

		own.addActionListener(this);
		s1.addActionListener(this);
		s2.addActionListener(this);
		s3.addActionListener(this);
		exit.addActionListener(this);

		menu.setLocationRelativeTo(null);
		menu.add(coach_pic);
		menu.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FP();
	}

	public void BacktoMenu() {
		con.setVisible(false);
		cs.dispose();
		big3.dispose();
		op.dispose();
		menu.setVisible(true);
		dialog.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == exit) {
			System.exit(0);
		}
		if (e.getSource() == own) {

			System.out.println("ownown");
			JPanel c_option = new JPanel(new GridLayout(2, 1));
			menu.dispose();
			con.repaint();
			con.setLayout(new BorderLayout());
			con.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);// 關閉就關閉程式
			con.setResizable(false);
			con.setLocation(400, 100);
			con.setSize(535,500);
			bal = new JLabel(ball);
			bal.setBounds(270, 425, ball.getIconWidth(), ball.getIconHeight());
			c_court.add(bal);
			for (int i = 0; i < 5; i++) {
				int ii = i + 1;
				blue[i] = new ImageIcon("src/s103502548/blue" + ii + ".jpg");
				red[i] = new ImageIcon("src/s103502548/red" + ii + ".jpg");
			}
			for (int i = 0; i < 5; i++) {

				l_blue[i] = new JLabel(blue[i]);
				l_red[i] = new JLabel(red[i]);
			}
			for (int i = 0; i < 5; i++) {// 藍色球員可以拖曳
				int sss = i;
				l_blue[i].addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						x0 = e.getX();
						y0 = e.getY();
						// System.out.println("X:"+x0+"\nY:"+y0);
					}
				});
				l_blue[i].addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						int v = l_blue[sss].getX() + e.getX() - x0;
						int b = l_blue[sss].getY() + e.getY() - y0;
						l_blue[sss].setLocation(v, b);
						con.repaint();
					}
				});

			}
			for (int i = 0; i < 5; i++) {// 紅色球員可以拖曳
				int sss = i;
				l_red[i].addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						x0 = e.getX();
						y0 = e.getY();
					}
				});
				l_red[i].addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						int v = l_red[sss].getX() + e.getX() - x0;
						int b = l_red[sss].getY() + e.getY() - y0;
						l_red[sss].setLocation(v, b);
						con.repaint();
					}
				});

			}
			bal.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					x0 = e.getX();
					y0 = e.getY();
				}
			});
			bal.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					System.out.println(x0+"....."+bal.getX()+"....."+e.getX());
					int v = bal.getX() + e.getX() - x0;
					int b = bal.getY() + e.getY() - y0;
					bal.setLocation(v, b);
					con.repaint();
				}
			});
			l_blue[0].setBounds(200, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[1].setBounds(170, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[2].setBounds(140, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[3].setBounds(110, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[4].setBounds(80, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());

			l_red[0].setBounds(200, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[1].setBounds(170, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[2].setBounds(140, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[3].setBounds(110, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[4].setBounds(80, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());

			for (int i = 0; i < 5; i++) {
				l_blue[i].addMouseMotionListener(this);
				l_red[i].addMouseMotionListener(this);
				l_red[i].addMouseListener(this);
				l_blue[i].addMouseListener(this);
				c_court.add(l_red[i]);
				c_court.add(l_blue[i]);
			}

			// c_option.add(drawred);
			c_option.add(reset);
			c_option.add(exit);
			c_court.setLayout(null);

			c_court.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					x0 = e.getX();
					y0 = e.getY();
					System.out.println("XY:" + x0 + "," + y0);
				}
			});
			c_court.addMouseMotionListener(this);
			reset.addActionListener(this);
			back.addActionListener(this);
			drawred.addActionListener(this);

			con.add(c_option, new BorderLayout().EAST);
			con.add(c_court);
			con.setVisible(true);
		}
		if (e.getSource() == s1) {
			System.out.println("111111");
			choices1 c1 = new choices1();
		}
		if (e.getSource() == s2) {
			System.out.println("22222");
			choices2 c2 = new choices2();
		}
		if (e.getSource() == s3) {
			System.out.println("A person A team");
			choices3 c3 = new choices3();
		}
		if (e.getSource() == back) {
			System.exit(0);
		}
		if (e.getSource() == reset) {
			con.repaint();
			l_blue[0].setBounds(200, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[1].setBounds(170, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[2].setBounds(140, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[3].setBounds(110, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_blue[4].setBounds(80, 420, blue[0].getIconWidth(),
					blue[0].getIconHeight());

			l_red[0].setBounds(200, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[1].setBounds(170, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[2].setBounds(140, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[3].setBounds(110, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			l_red[4].setBounds(80, 380, blue[0].getIconWidth(),
					blue[0].getIconHeight());
			bal.setBounds(270, 425, ball.getIconWidth(), ball.getIconHeight());
		}
		if (e.getSource() == drawred) {
			if (drawornot == false) {
				drawred.setText("Can't Be Drawed");
				drawornot = true;
				drawpen dp = new drawpen();
			} else {
				drawornot = false;
				drawred.setText("Draw Red");
			}

		}

	}
}
