package swing_p;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

class BorderExam extends JPanel
{
 public BorderExam()//������ �г��� ���� ����...
 {
  BevelBorder border;
  EtchedBorder eborder;
  TitledBorder tborder;
  
  JLabel label;
  
  setLayout(new GridLayout(1,4,20,20));//�г��� �׸���ƿ����� ���̾ƿ��� ��´�.
  
  label=new JLabel("��������",JLabel.CENTER);//
  add(label);
  
  /*-----BevelBorder-----*/
  label=new JLabel("beveled border",JLabel.CENTER);
  border=new BevelBorder(BevelBorder.RAISED);//3�������� �׵θ� ȿ���� ���Ѱ��̰� �簢�� �ɼ��� �ش�.
  label.setBorder(border);//�󺧿� �����Ų��.
  add(label);
  /*---------------------*/
  
  /*-----EtchedBorder-----*/
  label=new JLabel("������ etched border",JLabel.CENTER);
  eborder=new EtchedBorder(EtchedBorder.RAISED);//��鿡 ���� �ǵ��� �ܰ��� ȿ���� ���� ���̰� �簢�� ȿ���� �ش�.
  label.setBorder(eborder);
  add(label);
  /*----------------------*/
  
  /*-----TitledBorder-----*/
  label=new JLabel("titled border",JLabel.CENTER);
  tborder=new TitledBorder("����");
  tborder.setTitlePosition(TitledBorder.ABOVE_TOP);//������ ��ġ�� Ÿ��Ʋ�� ��Ÿ���ִ� ����...
  tborder.setTitleJustification(TitledBorder.CENTER);//�ڸ������� ����� ����...
  label.setBorder(tborder);
  add(label);
  /*----------------------*/
 }
  
 public static void main(String args[])
 {
  JFrame f=new JFrame("������ �׽�Ʈ �մϴ�.");
  BorderExam b=new BorderExam();//������ ����...�г��� ����...�Ѵ�...
  
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x��ư�� ���� �������� �ݴ´�.
  f.getContentPane().add("Center",b);//�г��� �����ӿ� ������.
  
  f.setSize(500,100);
  f.show();
 }
}


