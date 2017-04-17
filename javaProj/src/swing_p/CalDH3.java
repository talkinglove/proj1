package swing_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalDH3 extends JFrame implements ActionListener
{
	JFrame f1;
	JButton[] b1 = new JButton[10];
	JPanel p1;
	JLabel l1;
	JButton pls, eql;
	char o;
	int res;
	String input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new CalDH3();

	}
	
	
	public CalDH3() {
		setBounds(50,50,400,500);
		setLayout(new GridLayout(4, 3, 30, 30));
		l1 = new JLabel("0",JLabel.RIGHT);
		p1 = new JPanel(new GridLayout(4,3,2,2));
		pls = new JButton("+");
		eql = new JButton("=");
		
		for(int i=0; i<10; i++){
			b1[i] = new JButton(Integer.toString(i));
		
		//p1.add(b1[i]);
		}
		
		p1.add(b1[9]);
		p1.add(b1[8]);
		p1.add(b1[7]);
		p1.add(b1[6]);
		p1.add(b1[5]);
		p1.add(b1[4]);
		p1.add(b1[3]);
		p1.add(b1[2]);
		p1.add(b1[1]);
		p1.add(pls);
		p1.add(eql);
		
		
		
		class NumNum implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				String s = e.getActionCommand();
				if(input==null)
				{
					if(s.equals("0")) return;
					else input = new String();
				}
				
				if(input.length() >=9) return;
				input+=s;
				l1.setText(input);
				
			}
		}
		
		class MarkMark implements ActionListener
		{
			public void actionPerformed(ActionEvent e){
				JButton source = (JButton)e.getSource();
				int v;
				
				/*if(source == clear){
					l1.setText("0");
					input = null;
					o=0;
					res = 0;
					return;
				}*/
				
				if(input!=null)
				{
					v= Integer.parseInt(input);
					switch(o)
					{
					case'+': res+=v;
					break;
					
				default : res=v; 
				break;
					}
					
					l1.setText(Integer.toString(res));
					
				}
				input=null;
				o= source.getText().charAt(0);
			}
		}
		
		NumNum nn = new NumNum();
		for(int i=0; i<10; i++)
		{
			b1[i].addActionListener(nn);
		}
		
		MarkMark mm = new MarkMark();
		pls.addActionListener(mm);
		eql.addActionListener(mm);
		setVisible(true);
		
		
		
		
		
	}
   

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}