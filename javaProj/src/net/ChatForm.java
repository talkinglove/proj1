package net;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatForm extends JFrame
{
    
    public JTextArea ta;
    public JTextField tf;
    
    public ChatForm(String name)
    {
        super(name);
        setBounds(1600, 0, 300, 500);
        ta= new JTextArea();
        tf= new JTextField();
        
        ta.setEditable(false);	///��ȭâ �����Ұ�
        tf.setEnabled(false);	
        //Ŭ���̾�Ʈ ���� �ؾ� ��� ������� ó������ ��ȭ �Է�â ����
        
        ta.setFocusable(false); //�ʱ�ȭ�鱸���� ��Ŀ���� ������ ���� ����
        tf.setFocusable(true);  //�ʱ�ȭ�鱸���� ��Ŀ���� ������ ����

        JScrollPane jsp = new JScrollPane(ta);
        
        //JTextArea(ũ��, ��ġ ���� ����) -> JScrollPane(ũ��, ��ġ���� ����) -> JFrame
        //                   new JScrollPane(ta)            add(jsp,"Center");
        
        
        
        add(tf,"South"); 
        add(jsp,"Center");
       
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
