package swing_p;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet4Address;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalDH6 extends JFrame {

    JPanel p1;
	JLabel l1;
	JButton pls, eql;
	JButton[] number = new JButton[10];
	
	String input;
	int res;
	char oo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new CalDH6();
		
	}

	public CalDH6(){
		setBounds(100,100,600,500);
		l1 = new JLabel("0", JLabel.RIGHT);
		l1.setFont(new Font("명조체", Font.BOLD, 50));
		add(l1,BorderLayout.NORTH);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 10,1,1));
		p1.setBackground(Color.gray);
		add(p1,BorderLayout.CENTER);
		
		                  // pls.addActionListener(this);
				          //eql.addActionListener(this); 
		
		for(int i=0; i<number.length; i++){
			
			number[i] = new JButton(Integer.toString(i));
		}
		pls = new JButton("+");   
		eql = new JButton("=");
		
		p1.add(number[7]);
		p1.add(number[8]);
		p1.add(number[9]);	
		p1.add(number[4]);
		p1.add(number[5]);
		p1.add(number[6]);
		p1.add(number[1]);
		p1.add(number[2]);
		p1.add(number[3]);	
		p1.add(pls);
		p1.add(eql);
		
		
		class NumNum implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String lv = e.getActionCommand();
			
				if(input==null) {
					
					if(lv.equals('0'))
					{
						return;
					}
					else{
						input = new String();
					}
					
					
				}
				
				input += lv;
				l1.setText(input);
				
			}
			
			
		}
		
		class MarkMark implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton sr = (JButton)e.getSource();  //버튼을 눌렀을때 버튼속성을 sr로 복사
				int v;
				
				if(input!=null)
				{
					v = Integer.parseInt(input);  //input을 숫자로 바꿔서 v에 저장
					
					if(oo=='+')
					{
						res+= v;
					}
					
					else
					{
						res=v;
					}
					
					 /* 
	                switch(oo) {
	                    case '+': 
	                    	res += v; 
	                    	
	                    
	                    default : 
	                    	res = v; 
	                    	*/
					
					
					l1.setText(Integer.toString(res));
					
				}
				
				input=null;
				oo = sr.getText().charAt(0);
				
			}
			
			
		}
		
		
		NumNum nn = new NumNum();
		
		number[1].addActionListener(nn);
		number[2].addActionListener(nn);
		number[3].addActionListener(nn);
		number[4].addActionListener(nn);
		number[5].addActionListener(nn);
		number[6].addActionListener(nn);
		number[8].addActionListener(nn);
		number[9].addActionListener(nn);
		number[0].addActionListener(nn);
		
		MarkMark mm = new MarkMark();

		pls.addActionListener(mm);
		eql.addActionListener(mm);

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
		
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}




}
