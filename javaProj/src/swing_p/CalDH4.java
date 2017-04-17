package swing_p;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CalDH4 extends JFrame implements ActionListener  {

	JLabel l1;
    JButton number[] = new JButton[10];
    JButton pls, eql;

    String input;
    int res;
    char oo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CalDH4();
    }

    public CalDH4() {
        super("계산기");
        setBounds(100, 100, 400, 400);
        l1 = new JLabel("0", JLabel.RIGHT);
        l1.setFont(new Font("명조체", Font.BOLD, 50));
        add(l1, BorderLayout.NORTH);
        JPanel p = new JPanel(new GridLayout(5, 10, 1,1));
        add(p, BorderLayout.CENTER);
       
       // pls.addActionListener(this);
		//eql.addActionListener(this); 
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		super.setVisible(true);
        
        
        pls = new JButton("+");      
        eql = new JButton("=");

        for( int i=0;i<number.length;i++ ) {
            number[i] = new JButton(Integer.toString(i));
        }

        p.add(number[7]); 
        p.add(number[8]); 
        p.add(number[9]);
        p.add(pls);
        p.add(number[4]);
        p.add(number[5]); 
        p.add(number[6]);
        p.add(number[0]); 
        p.add(number[2]); 
        p.add(number[3]);
        p.add(number[1]);
        p.add(eql);

        NumNum nn = new NumNum();
        
            number[1].addActionListener(nn);
            number[2].addActionListener(nn);
            number[3].addActionListener(nn);
            number[4].addActionListener(nn);
            number[5].addActionListener(nn);
            number[6].addActionListener(nn);
            number[7].addActionListener(nn);
            number[8].addActionListener(nn);
            number[9].addActionListener(nn);
            number[0].addActionListener(nn);

        

        MarkMark mm = new MarkMark();
        pls.addActionListener(mm);       
        eql.addActionListener(mm);
       
        setVisible(true);
    }

    class NumNum implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String lv = e.getActionCommand();       
            if(input == null) {
              /* if(input.length()<9)
               {
            	   input = new String();
               }*/
            	
            	if( lv.equals('0'))
                {
                	return ;
                }
                
                else {
                	input = new String();
                }
            }
          
            
            input += lv;
            l1.setText(input);
        }
    }

    class MarkMark implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton sr = (JButton)e.getSource();
            int v;

           

            if( input != null ) {
                v = Integer.parseInt(input); 
               
                if(oo=='+')
                {
                	
                	res+= v;
                }
                else{
                	res= v;
                	
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
            input = null;
            oo = sr.getText().charAt(0);
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

/*
JFrame f1 = new JFrame("계산기");
		f1.setBounds(100, 0, 800, 800);
		f1.setLayout(null);

		JLabel l1 = new JLabel("0");
		l1.setBounds(700, 100, 500, 100);
		f1.add(l1);

		JPanel p1 = new JPanel();
		p1.setBounds(50, 100, 700, 100);
		p1.setBackground(Color.WHITE);
		f1.add(p1);

		a1 = new JButton("1");
		a1.setBounds(500, 300, 100, 100);
		f1.add(a1);

		a2 = new JButton("2");
		a2.setBounds(500, 400, 100, 100);
		f1.add(a2);

		a3 = new JButton("3");
		a3.setBounds(500, 500, 100, 100);
		f1.add(a3);

		a4 = new JButton("4");
		a4.setBounds(400, 300, 100, 100);
		f1.add(a4);

		a5 = new JButton("5");
		a5.setBounds(400, 400, 100, 100);
		f1.add(a5);

		a6 = new JButton("6");
		a6.setBounds(400, 500, 100, 100);
		f1.add(a6);

		a7 = new JButton("7");
		a7.setBounds(300, 300, 100, 100);
		f1.add(a7);

		a8 = new JButton("8");
		a8.setBounds(300, 400, 100, 100);
		f1.add(a8);

		a9 = new JButton("9");
		a9.setBounds(300, 500, 100, 100);
		f1.add(a9);

		a10 = new JButton("0");
		a10.setBounds(200, 300, 100, 100);
		f1.add(a10);

		plus = new JButton("+");
		plus.setBounds(200, 400, 100, 100);
		f1.add(plus);

		eq = new JButton("=");
		eq.setBounds(200, 500, 100, 100);
		f1.add(eq);

		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f1.setVisible(true);

		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		a4.addActionListener(this);
		a5.addActionListener(this);
		a6.addActionListener(this);
		a7.addActionListener(this);
		a8.addActionListener(this);
		a9.addActionListener(this);
		a10.addActionListener(this);
		plus.addActionListener(this);
		eq.addActionListener(this); 
 */
