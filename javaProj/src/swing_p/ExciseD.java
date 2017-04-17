package swing_p;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExciseD extends JFrame {
	
	ArrayList<JPanel> cardMap = new ArrayList<>();
	JPanel cardP = new JPanel();
	CardLayout card = new CardLayout();
		
	//ArrayList<singleQQ> arr = new ArrayList<>();
	JLabel resLB = new JLabel("결과");
	
	class BtnAction implements ActionListener {  //이너 클래스
		
		int num;
		
		public BtnAction(int num){
			this.num=num;
			
			
		}
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			card.show(cardP, num+"");
			
		}
		
		
	}
	
	public ExciseD(){
		
		setBounds(100,50,800,600);
		JPanel nn = new JPanel();
		JPanel qqpp = new JPanel();
		JPanel respp = new JPanel();
		qqInit();
		
		Color [] cc = {
				Color.pink, Color.YELLOW, Color.CYAN,
				Color.ORANGE,Color.black
		};
		
		nn.setLayout(new GridLayout(1,2));
		nn.add(respp);
		nn.add(qqpp);
		add(nn."North");
		
		cardP.setLayout(card);
		
		add(cardP,"center");
		
		qqpp.setLayout(new FlowLayout(FlowLayout.RIGHT,20,30));
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		for(int i=0; i<cardMap.size(); i++)
		{
			btns.add(new JButton(i+1+""));
			qqpp.add(btns.get(i));
			cardMap.get(i).setBackground(cc[i]);
			
			cardP.add(cardMap.get(i), i+"");
			btns.get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					int jum=0;
					
					for()
				}
			});
			
		}
		
		
		
	}
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
