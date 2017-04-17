package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePaintMain extends JFrame implements MouseMotionListener{
	public ImagePaintMain() {
		// TODO Auto-generated constructor stub
		//System.out.println("������");
		setBounds(1600, 0, 600, 600);
		setVisible(true);
		setLayout(null);
		icons = new JPanel();
		icons.setLayout(new GridLayout(1,cc.length));
		icons.setBounds(0, 480, 600, 100);
		
		
		add(icons);
		setResizable(false);
		
		img = createImage(600, 500);///---2
		gimg = img.getGraphics();   ///---3
		
		addWindowListener(new FrameClose2());
		addMouseMotionListener(this);
	
	}
	
	int x =0, y=0;
	boolean	chk = false,imgchk = false;
	String str="*";
	
	Image img = null;
	Graphics gimg = null;
	JPanel icons;
	
	Color [] cc = {
		Color.red, Color.orange, Color.YELLOW,
		Color.GREEN, Color.BLUE, Color.MAGENTA,
		Color.PINK, Color.gray, Color.WHITE, Color.black
	};
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g); //���ٽñ׸���
		System.out.println("paint");
		
		init(g);
		g.drawImage(img, 0, 0, this);
		
		g.drawString("���콺�� ������ ������", 50,50);
		
	}
	
	void init(Graphics g)
	{
		if(!chk)
		{
			chk = true;
			g.setColor(Color.YELLOW);
			
			g.fillRect(0, 0, 600, 600);
		
			for (int i = 0; i < cc.length; i++) {
				JButton btn = new JButton();
				btn.setBackground(cc[i]);
				icons.add(btn);
			}
		}
		
		if(!imgchk && img!=null)
		{
			imgchk=true;
			gimg.setColor(Color.white);
			gimg.fillRect(0, 0, 600, 500);
			gimg.setColor(Color.BLACK);
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
		new ImagePaintMain();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
		{
			gimg.setColor(Color.black);
			//gimg.drawString(str, x,y);
			gimg.drawLine(x, y, e.getX(), e.getY());
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
		{
			gimg.setColor(Color.white);
			gimg.fillOval(x-50, y-50, 100,100);
		}

		repaint();
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}

}
