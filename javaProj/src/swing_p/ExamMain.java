package swing_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ExamMain extends JFrame{

	ArrayList<JCheckBox> q1 = new ArrayList<>();
	ArrayList<JRadioButton> q2 = new ArrayList<>();
	JLabel res = new JLabel("���:");
	
	class BtnActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int jum =0;
			
			for(JCheckBox box: q1 )
			{
				if(box.isSelected()) jum+=20;
			}
			
			if(q2.get(1).isSelected()) jum+=20;
			
			res.setText("���:"+jum);
		}
		
	}
	
	public ExamMain() {
		// TODO Auto-generated constructor stub
		setBounds(1600, 0, 600, 600);
		
		q1.add(new JCheckBox("�嵿��"));
		q1.add(new JCheckBox("���켺"));
		q1.add(new JCheckBox("����"));
		q1.add(new JCheckBox("����"));
		
		q2.add(new JRadioButton("�����ؿ�"));
		q2.add(new JRadioButton("�Ϳ�����"));
		q2.add(new JRadioButton("������"));
		q2.add(new JRadioButton("�����ؿ�"));
		
		setLayout(new GridLayout(q1.size()+q2.size()+4, 1));
		
		add(new JLabel("1. ������ ������?"));
		
		for(JCheckBox box: q1 )
		{
			add(box);
		}
		
		add(new JLabel("2. ������ Ư���?"));
		ButtonGroup bg = new ButtonGroup();
		for(JRadioButton box: q2 )
		{
			bg.add(box);
			add(box);
		}
		
		JButton btn = new JButton("Ȯ��");
		
		add(btn);
		add(res);
		setVisible(true);
		setResizable(false);
		addWindowListener(new FrameClose2());
		
		btn.addActionListener(new BtnActionListener());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExamMain();
	}

}
