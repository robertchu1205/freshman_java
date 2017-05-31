package ce1002.e13.s103502548;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class E13 extends JFrame implements KeyListener{
	public static ImageIcon maz=new ImageIcon(E13.class.getResource("maze.jpg"));//放地圖
	public static ImageIcon dog=new ImageIcon(E13.class.getResource("mouse.jpg"));//放狗照片
	public static JLabel jl=new JLabel(dog);//把狗放到LABEL裡面
	public static JPanel jp=new JPanel() {//迷宮直接從PANEL放入
		protected void paintComponent(Graphics g) {
			Image bg=maz.getImage();
			g.drawImage(bg,0, 0,maz.getIconWidth(),maz.getIconHeight(), this);
		}
	};
	public static int x=3;//為了對其更改初始位置
	public static int y=246;
	public static int next=20;
	public static int a_x=11;
	public static int a_y=0;
	
	public static int [][]maze = { 
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
		{1,0,1,0,0,0,1,0,1,1,1,1,1,0,1,1,0,0,1,0,1},
		{1,0,1,1,1,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,2},
		{1,0,1,0,1,0,1,0,0,1,0,0,0,0,1,1,0,0,1,0,1},
		{1,0,1,0,0,1,1,1,0,1,0,0,0,0,1,1,0,0,1,0,1},
		{1,0,1,0,0,0,1,1,0,1,0,0,1,0,1,1,0,0,1,0,1},
		{1,0,1,0,1,0,1,1,0,1,1,1,1,0,1,0,1,1,0,0,1},
		{1,0,0,0,1,0,1,1,0,1,0,0,0,0,1,0,1,1,0,1,1},
		{1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,1},
		{1,0,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,0,1},
		{0,0,1,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,0,0,1},
		{1,0,1,0,1,1,0,1,1,0,0,0,0,1,0,0,1,0,0,0,1},
		{1,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,1},
		{1,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1},
		{1,0,1,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,0,0,1},
		{1,0,1,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,0,1},
		{1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1},
		{1,0,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1},
		{1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	public E13()
	{	
		setTitle("CSIE Maze");//jframe標題
		setLocation(580,250);//jframe初始位置
		jp.setLayout(null);//讓狗一開始不要亂跑
		jl.setSize(dog.getIconWidth(),dog.getIconHeight());
		jl.setLocation(0,220);
		setSize(425, 450);
		jp.add(jl);
		add(jp);
		addKeyListener(this);
		setResizable(false);//固定視窗大小
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E13();
	}
	public void keyPressed(KeyEvent e) {
		Graphics g = getGraphics();
		jp.remove(jl);//把第一隻狗清掉
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(maze[a_x][a_y+1]==0)
			{
				x+=next;
				a_y++;
				update(g);//把之後drawimage的狗都清掉
				g.drawImage(dog.getImage(), x,y, null);
			}
			else if(maze[a_x][a_y+1]==1) { }
			else
			{
				x+=next;
				a_y++;
				update(g);
				g.drawImage(dog.getImage(), x,y, null);
				JOptionPane.showMessageDialog(null, "Shiba find its way home =)", "Success", JOptionPane.PLAIN_MESSAGE );
				System.exit(0);//把視窗都關閉
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			if(maze[a_x][a_y-1]==0)
			{
				x-=next;
				a_y--;
				update(g);
				g.drawImage(dog.getImage(),x,y, dog.getIconWidth(), dog.getIconHeight(), this);
				
			}
			else if(maze[a_x][a_y-1]==1) { }
			else
			{
				x-=next;
				a_y--;
				update(g);
				g.drawImage(dog.getImage(),x,y, dog.getIconWidth(), dog.getIconHeight(), this);
				JOptionPane.showMessageDialog(null, "Shiba find its way home =)", "Success", JOptionPane.PLAIN_MESSAGE );
				System.exit(0);
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(maze[a_x-1][a_y]==0)
			{
				y-=next;
				a_x--;
				update(g);
				g.drawImage(dog.getImage(), x,y, dog.getIconWidth(), dog.getIconHeight(), this);
				
			}
			else if(maze[a_x-1][a_y]==1) { }
			else
			{
				y-=next;
				a_x--;
				update(g);
				g.drawImage(dog.getImage(), x,y, dog.getIconWidth(), dog.getIconHeight(), this);
				JOptionPane.showMessageDialog(null, "Shiba find its way home =)", "Success", JOptionPane.PLAIN_MESSAGE );
				System.exit(0);
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			if(maze[a_x+1][a_y]==0)
			{
				y+=next;
				a_x++;
				update(g);
				g.drawImage(dog.getImage(), x,y, dog.getIconWidth(), dog.getIconHeight(), this);
			}
			else if(maze[a_x+1][a_y]==1) { }
			else
			{
				y+=next;
				a_x++;
				update(g);
				g.drawImage(dog.getImage(), x,y, dog.getIconWidth(), dog.getIconHeight(), this);
				JOptionPane.showMessageDialog(null, "Shiba find its way home =)", "Success", JOptionPane.PLAIN_MESSAGE );
				System.exit(0);
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
