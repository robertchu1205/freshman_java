package s103502548;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class drawpen extends FP{
	drawpen () {
	c_court.addMouseListener(new MouseAdapter(){
		public void mousePressed(MouseEvent m){
			px = m.getX();
			py = m.getY();
			c_court.repaint();
			System.out.println("pressed");
		}
		public void mouseReleased(MouseEvent m){
			px2 = m.getX();
			py2 = m.getY();
			c_court.repaint();
			System.out.println("Released");
		}
	});
	c_court.addMouseMotionListener(new MouseMotionAdapter() {
		public void mouseDragged(MouseEvent e1) {
			 px2 = e1.getX();
			 py2 = e1.getY();
			//System.out.println(e1.getX() + "\n");
		//	System.out.println(e1.getY());
			c_court.repaint();
			System.out.println("dragged");
		}
		
		
		});
	
	}
	public void paint(Graphics g) {
			System.out.println("asdasd++5+5+");
			g.drawLine(px, py, px2, py2);
		}
}
