package ce1002.a13.s103502548;

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

public class A13 implements ActionListener {
	JFrame f = new JFrame("Copy Chu");
	JButton choose = new JButton("Choose");
	JButton start = new JButton("Start");
	JButton exit = new JButton("Exit");
	JPanel p = new JPanel();
	JTextField tf = new JTextField();
	JFileChooser fc = new JFileChooser();
	JLabel l = new JLabel("Waiting....");

	public A13() {
		f.setSize(400, 150);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 關閉就關閉程式
		p.setLayout(null);
		choose.setBounds(305, 0, 80, 35);
		exit.setBounds(305, 80, 80, 35);
		start.setBounds(225, 80, 80, 35);
		l.setBounds(0, 45, 150, 20);
		tf.setBounds(0, 0, 225, 35);
		tf.setEditable(false);// 設定可不可編輯

		choose.addActionListener(this);
		start.addActionListener(this);
		exit.addActionListener(this);

		p.add(tf);
		p.add(l);
		p.add(start);
		p.add(exit);
		p.add(choose);
		f.add(p);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A13();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == choose) {// 按choose的時候
			fc.setDialogTitle("Choose file to be copied");
			fc.setCurrentDirectory(new File("D:\\"));// 初始位置為D曹
			int return0 = fc.showOpenDialog(null);// 秀選擇的視窗
			if (return0 == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();// 選擇路徑
				tf.setText(file.getAbsolutePath());// 在textfield印出路徑
			}
		}
		if (e.getSource() == start) {// 按start的時候
			if (tf.getText().equals("")) {// 如果未選東西
				l.setText("Please choose a file");
			} else {
				l.setText("Copy completed");
				String s = fc.getSelectedFile().getAbsolutePath();// 路徑的字串
				File orifile = new File(s);
				int b_filetype = orifile.getName().lastIndexOf('.');// 副檔名的初始位置
				int f_filetype = orifile.getName().length();// 副檔名長度

				File copyfile = new File(orifile.getPath().replace(
						orifile.getName(), "")//把黨明刪掉的路徑字串
						+ "copytest"
						+ orifile.getName().substring(b_filetype, f_filetype));//副檔名,存到f_filetype前

				try {
					FileInputStream A = new FileInputStream(orifile);
					FileOutputStream B = new FileOutputStream(copyfile);
					byte[] space = new byte[1024];
					int i = 0;
					while ((i = A.read(space)) != -1) {
						B.write(space, 0, i);//寫入
					}
					if (A != null)//若未關掉則關掉
						A.close();
					if (B != null)
						B.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		if (e.getSource() == exit) {
			System.exit(0);
		}
	}

}
