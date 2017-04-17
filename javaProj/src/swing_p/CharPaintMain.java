package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class CharPaintMain extends JFrame implements MouseMotionListener{
	public CharPaintMain() {
		// TODO Auto-generated constructor stub
		//System.out.println("������");
		setBounds(1600, 0, 600, 600);
		setVisible(true);
		setResizable(false);
		
		addWindowListener(new FrameClose2());
		addMouseMotionListener(this);
		
		
	}
	
	int x =0, y=0;
	boolean	chk = false;
	String str="*";
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g); //���ٽñ׸���
		System.out.println("paint");
		init(g);
		g.drawString("���콺�� ������ ������", 50,50);
		
		if(str.equals("*"))
		{
			g.setColor(Color.black);
			g.drawString(str, x,y);
		}
		
		else if(str.equals("-"))
		{
			g.setColor(Color.YELLOW);
			g.fillOval(x-50, y-50, 100,100);
		}
		
	}
	
	void init(Graphics g)
	{
		if(!chk)
		{
			chk = true;
			g.setColor(Color.YELLOW);
			g.fillRect(0, 0, 600, 600);
			g.setColor(Color.BLACK);
		}
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		//super.update(g);
		paint(g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CharPaintMain();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getModifiersEx());
		//System.out.println(MouseEvent.BUTTON3_DOWN_MASK);
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
		{
			str="*";
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
		{
			str="-";
		}
		
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
