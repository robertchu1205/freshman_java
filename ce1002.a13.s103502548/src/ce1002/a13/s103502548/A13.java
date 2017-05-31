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
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �����N�����{��
		p.setLayout(null);
		choose.setBounds(305, 0, 80, 35);
		exit.setBounds(305, 80, 80, 35);
		start.setBounds(225, 80, 80, 35);
		l.setBounds(0, 45, 150, 20);
		tf.setBounds(0, 0, 225, 35);
		tf.setEditable(false);// �]�w�i���i�s��

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
		if (e.getSource() == choose) {// ��choose���ɭ�
			fc.setDialogTitle("Choose file to be copied");
			fc.setCurrentDirectory(new File("D:\\"));// ��l��m��D��
			int return0 = fc.showOpenDialog(null);// �q��ܪ�����
			if (return0 == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();// ��ܸ��|
				tf.setText(file.getAbsolutePath());// �btextfield�L�X���|
			}
		}
		if (e.getSource() == start) {// ��start���ɭ�
			if (tf.getText().equals("")) {// �p�G����F��
				l.setText("Please choose a file");
			} else {
				l.setText("Copy completed");
				String s = fc.getSelectedFile().getAbsolutePath();// ���|���r��
				File orifile = new File(s);
				int b_filetype = orifile.getName().lastIndexOf('.');// ���ɦW����l��m
				int f_filetype = orifile.getName().length();// ���ɦW����

				File copyfile = new File(orifile.getPath().replace(
						orifile.getName(), "")//���ҩ��R�������|�r��
						+ "copytest"
						+ orifile.getName().substring(b_filetype, f_filetype));//���ɦW,�s��f_filetype�e

				try {
					FileInputStream A = new FileInputStream(orifile);
					FileOutputStream B = new FileOutputStream(copyfile);
					byte[] space = new byte[1024];
					int i = 0;
					while ((i = A.read(space)) != -1) {
						B.write(space, 0, i);//�g�J
					}
					if (A != null)//�Y�������h����
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
