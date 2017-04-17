package swing_p;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContainerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1 = new JFrame("jPanel");
		f1.setBounds(1600, 0, 300, 200);
		f1.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(10, 10, 100, 130);
		p1.setBackground(Color.pink);
		
		JPanel p2 = new JPanel();
		p2.setBounds(120, 10, 100, 130);
		p2.setBackground(Color.YELLOW);
		
		for (int i = 0; i < 10; i++) {
			p1.add(new JButton("��ư"+i));
			p2.add(new JButton("��ư"+i));
		}
		
		
		f1.add(p1);
		f1.add(p2);

		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		
		
		////////////////////
				
		JFrame f2 = new JFrame("jScrollPane");
		f2.setBounds(1900, 0, 300, 200);
		f2.setLayout(null);
		
		JPanel p3 = new JPanel();
		JScrollPane hs = new JScrollPane(p3); 
		hs.setBounds(10, 10, 100, 130);
		
		p3.setBackground(Color.YELLOW);
		
		for (int i = 0; i < 10; i++) {
			p3.add(new JButton("��ư"+i));
		}
		
		
		f2.add(hs);
		
		JPanel p4 = new JPanel();
		JScrollPane vs = new JScrollPane(p4); 
		vs.setBounds(120, 10, 100, 130);
		
		p4.setBackground(Color.PINK);
		p4.setLayout(new GridLayout(10, 1));
		
		for (int i = 0; i < 10; i++) {
			p4.add(new JButton("��ư"+i));
		}
		
		
		f2.add(vs);
		

		f2.setVisible(true);
		
		
		////////////
		
		JFrame f3 = new JFrame("JDialog");
		f3.setBounds(1600, 200, 300, 200);
		f3.setLayout(null);
		
		JDialog dd = new JDialog(f3, "�޽���â", false);
		
		dd.setBounds(1700, 100, 300, 200);
		dd.setLayout(new FlowLayout());
		dd.add(new JLabel("���â�Դϴ�."));
		dd.add(new JButton("Ȯ��"));
		dd.setVisible(true);
		
		f3.setVisible(true);
		
		
		////////////////////
		JFrame f4 = new JFrame("FileDialog");
		f4.setBounds(1900, 200, 300, 200);
		f4.setLayout(null);
		
		f4.setVisible(true);
		
		FileDialog fd = new FileDialog(f4, "���Ͽ���", FileDialog.LOAD);
		fd.setLocation(2000, 100);
		fd.setDirectory("C:\\Users\\user\\Desktop");
		fd.setVisible(true);
		
		System.out.println(fd.getDirectory());
		System.out.println(fd.getFile());
	}

}
