package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FrameClose2 extends WindowAdapter
{
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("닫히는 중2");
		e.getWindow().dispose();
	}
}

public class ImagePaintDH1 extends JFrame 
implements MouseMotionListener,MouseListener{
   
	int x=0, y=0;
	boolean chk = false;
	boolean imgchk=false;
	String str= "-";
	
	Image img = null;
	Graphics gimg = null;
	
	Color[] cc= {
		Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, 
		Color.MAGENTA, Color.PINK, Color.GRAY, Color.WHITE, Color.BLACK 
	};
	
	
	
	
	
	public ImagePaintDH1(){
	setBounds(100, 0, 600, 600);
	setVisible(true);
	setLayout(null);
	JPanel icons = new JPanel();
    icons.setLayout(new GridLayout(1,cc.length));
    icons.setBounds(0, 480, 600, 100);
    
    for(int i=0; i<cc.length; i++){
    	JButton btn = new JButton();
    	btn.setBackground(cc[i]);
    	icons.add(btn);
    }
    add(icons);
    setResizable(false);
    
    img = createImage(600,500);
    gimg = img.getGraphics();
    
    addWindowListener(new FrameClose2());
    addMouseMotionListener(this);
    addMouseListener(this);
    
    }
	
	public void paint(Graphics g){
		System.out.println("paint");
		
		init(g);
		g.drawImage(img, 0, 0, this);
		
		g.drawString("마우스 움직이기", 50, 50);
		
	}
	

	private void init(Graphics g) {
		// TODO Auto-generated method stub
		
		if(!imgchk && img!=null)
		{
			imgchk= true;
			gimg.setColor(Color.WHITE);
			gimg.fillRect(0, 0, 600, 500);
			gimg.setColor(Color.BLACK);
			
		}
		
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
		{
			gimg.setColor(Color.BLACK);
			gimg.drawLine(x, y, e.getX(), getY());
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
		{
			gimg.setColor(Color.WHITE);
			gimg.fillOval(x-50, y-50, 100, 100);
		}
		
		repaint();
		x=e.getX();
		y=e.getY();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		x= e.getX();
		y=e.getY();
	}

}