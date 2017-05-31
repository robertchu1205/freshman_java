package ce1002.a14.s103502548;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A14 implements ActionListener {
	JFrame f = new JFrame("Copy Chu");
	JButton choose = new JButton("Choose");
	JButton start = new JButton("Start");
	static JButton pause = new JButton("Pause");
	JPanel p = new JPanel();
	JTextField tf = new JTextField();
	static JFileChooser fc = new JFileChooser();
	static JLabel l = new JLabel("Waiting....");
	Thread tc = new Thread(new con());
	static String path;
	int return0;
	//static boolean ifstop = false;

	public A14() {
		f.setSize(400, 150);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 關閉就關閉程式
		p.setLayout(null);
		choose.setBounds(305, 0, 80, 35);
		pause.setBounds(305, 80, 85, 35);
		start.setBounds(225, 80, 80, 35);
		l.setBounds(0, 45, 150, 20);
		tf.setBounds(0, 0, 225, 35);
		tf.setEditable(false);// 設定可不可編輯

		choose.addActionListener(this);
		start.addActionListener(this);
		pause.addActionListener(this);
		pause.setEnabled(false);

		p.add(tf);
		p.add(l);
		p.add(start);
		p.add(pause);
		p.add(choose);
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A14();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == choose) {// 按choose的時候
			fc.setDialogTitle("Choose file to be copied");
			fc.setCurrentDirectory(new File("D:\\"));// 初始位置為D曹
			return0 = fc.showOpenDialog(null);// 秀選擇的視窗
			if (return0 == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();// 選擇路徑
				tf.setText(file.getAbsolutePath());// 在textfield印出路徑
			}
		}
		if (e.getSource() == start) {// 按start的時候
			if (tf.getText().equals("")) {// 如果未選東西
				l.setText("Please choose a file");
			} else {
				start.setEnabled(false);
				pause.setEnabled(true);
				pause.setText("Pause");
				l.setText("Copying...");
				tc.start();
			}
		}
		if (e.getSource() == pause) {

			if (pause.getText()=="Pause") {
				l.setText("Pause!!!");
				pause.setText("Continue");
				try {
					con.pauseThread();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				l.setText("Copying.....");
				pause.setText("Pause");
				con.continueThread();
			}
		}

	}

	static class con implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			path = fc.getSelectedFile().getAbsolutePath();// 路徑的字串
			File orifile = new File(path);
			int b_filetype = orifile.getName().lastIndexOf('.');// 副檔名的初始位置
			int f_filetype = orifile.getName().length();// 副檔名長度

			File copyfile = new File(orifile.getPath().replace(
					orifile.getName(), "")// 把黨明刪掉的路徑字串
					+ "copytest"
					+ orifile.getName().substring(b_filetype, f_filetype));// 副檔名,存到f_filetype前
			try {
				FileInputStream A = new FileInputStream(orifile);
				FileOutputStream B = new FileOutputStream(copyfile);
				byte[] space = new byte[1024];
				int i = 0;
				while ((i = A.read(space)) != -1) {
					/*while (ifstop) {
						Thread.sleep(1);
						System.out.println("暫停中");
					}*/
					checkandstartPause();
					B.write(space, 0, i);// 寫入
				}

				if (A != null)// 若未關掉則關掉
					A.close();
				if (B != null)
					B.close();
				l.setText("Copy Completed");
				pause.setEnabled(false);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

		// ///////////////////////////////////////////////////////////////////////////////////////////////////

		private final static Object aboutStop = new Object();
		private static boolean ifpause = false;//如果true,就是暫停的狀態

		private void checkandstartPause() {
			synchronized (aboutStop) {
				while (ifpause) {
					try {
						aboutStop.wait();//停止
					} catch (Exception e) {
					}
				}
			}
		}

		public static void continueThread() {
			synchronized (aboutStop) {
				ifpause = false;
				aboutStop.notify();//恢復複製
			}
		}

		public static void pauseThread() throws InterruptedException {

			ifpause = true;
		}
		// ////////////////////////////////////////////////////////////////////////////////////////

	}

}
