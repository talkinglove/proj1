package swing_p;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public class ImagePaint extends JFrame {
	
	Image img = null;
	Graphics gimg = null;
	
	public ImagePaint() {
		// TODO Auto-generated constructor stub
		setBounds(1600, 0, 600, 600);
		
		/*
		 * ���� �߻� ---> setVisible(true); ���� ����
		 * ȭ�� ���� ���� Graphics�� ���� �� ����
		img = createImage(600, 400);
		gimg = img.getGraphics();
			
		*/
		
		setVisible(true);	///------1
		setResizable(false);
		
		addWindowListener(new FrameClose2());
		
		//setVisible(true); ���� ����
		img = createImage(400, 400);///---2
		gimg = img.getGraphics();   ///---3
		
		//gimg�� �̿��Ͽ� img�� �׸��� (��ȭ���� �׸�)
		gimg.fillOval(100, 100, 200,200);	///---4
		gimg.fillOval(100, 350, 200,200);  /// ������ ��� image ũ�� �ȿ����� �׷����� ��
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		/// jframe�� img �׸���
		/// ���� ��ȭ�� ���̱�
		g.drawImage(img, 100,100,this);
		// �̹���, x��ġ, y��ġ, (observer)������ 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImagePaint();
	}

}
