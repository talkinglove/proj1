package swing_p;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class FrameClose implements WindowListener
{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ��");
		e.getWindow().dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class FrameClose2 extends WindowAdapter
{
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ��2");
		e.getWindow().dispose();
	}
}

public class FrameCloseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setBounds(1600, 0, 300, 200);
		jf.addWindowListener(new FrameClose2());
		//jf : �̺�Ʈ �ҽ�
		//addWindowListener(); �̺�Ʈ ������
		//new FrameClose() : �̺�Ʈ �ڵ鷯
		jf.setVisible(true);
	}

}
