package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

class WinsClose extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		e.getWindow().dispose();
	}
}

public class imagePaintDH2 extends JFrame
implements MouseMotionListener{

	int width=900;
	int height=800;
	int brushFlag=0;
	
	JMenuBar menuBar = new JMenuBar();
	JMenu mn_Figure = new JMenu("도형");
	JMenu mn_Edit = new JMenu("도구");
	JMenu mn_edit_brush = new JMenu("브러시");
	
	ArrayList<JCheckBoxMenuItem> edit_list = new ArrayList<>();
	ArrayList<JCheckBoxMenuItem> figure_list = new ArrayList<>();

	String[] eArr = {"기본","별","하트"};
	String[] fArr = {"선", "원", "사각형"};
	
	ButtonGroup btng = new ButtonGroup();
	
	Graphics gg = null;
	
	
	Color[] color = new Color[] {
			Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, 
			Color.MAGENTA, Color.PINK, Color.GRAY, Color.WHITE, Color.BLACK 
		                         };
	
	
	public imagePaintDH2()
	{
		setBounds(100,0,600,600);
		setVisible(true);
		setLayout(null);
		setJMenuBar(menuBar);
		
		init();
		
		ca.setBounds(0,100,width, height);
		
		JPanel pn_color = new JPanel();
		pn_color.setLayout(null);
		pn_color.setBounds(0, 0, width, 100);
		pn_color.setBackground(Color.WHITE);
		
		for(int i=0; i<colArr.length; i++)
		{
			JButton btn = new JButton();
		    btn.setBackground(colArr[i]);
		    pn_color.add(btn);
		    btn.addActionListener(new BtnAction(colArr[i]));
		
		}
		add(ca);
		add(pn_color);
		
		addWindowListener(new WindowClose());
		
	}
	
	void init()
	{
		for(int i=0; i<eArr.length; i++)
		{
			JCheckBoxMenuItem cb = new JCheckBoxMenuItem(eArr[i]);
			edit_list.add(cb);
			btng.add(cb);
			if(i==0)
			{
				mn_Edit.add(edit_list.get(i));
			}else
			{
				mn_edit_brush.add(edit_list.get(i));
				cd.addActionListener(new BtnAction());
			}
			for(int i=0; i<figurArr.length; i++)
			{
				JCheckBoxMenuItem cb = new JCheckBoxMenuItem(figurArr[i]);
				figure_list.add(cb);
				btng.add(cb);
				mn_Figure.add(cb);
				cb.addActionListener(new BtnAction());
			}
			edit_list.get(0).setSelected(true);
			
			menuBar.add(mn_Edit);
			menuBar.add(mn_Figure);
			menuBar.add(mn_edit_brush);
		}
		
	}
	
	class BtnAction implements ActionListener
	{
		Color cc;
		
		public BtnAction(Color cc)
		{
			this.cc=cc;
		}
	public void actionPerformed(ActionEvent e){
		
		gg.setColor(cc);
		
		for(int i=0; i<edit_list.size(); i++)
		{
			if(e.getSource().equals(edit_list.get(i)&& i>=2)
					brushFlag = i-2;
			
		}
	}
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new CanvasMain();
	}

}
