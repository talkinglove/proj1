package swing_p;

 

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;

 

import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JRadioButton;

import javax.swing.WindowConstants;

 

class EventExam extends JFrame

{

    ArrayList<JCheckBox> qq_1 = new ArrayList<>(); 

    

    ArrayList<JRadioButton> qq_2 = new ArrayList<>();

    

    JLabel res = new JLabel("���:");

    

    

    

    class BtnListener implements ActionListener

    {

        @Override

        public void actionPerformed(ActionEvent e) {

            // TODO Auto-generated method stub

            ////res.setText("�ɷ��ɷ��ɷ�");

            

            int jum =0;

            

            for(JCheckBox buf : qq_1)

                if(buf.isSelected())

                    jum+=20;

            

            

            if(qq_2.get(1).isSelected())

                jum+=20;

            

            res.setText("���:"+jum);

            

        }

    }

    

    class AAA

    {

        int a = 10;

        

        void meth()

        {

            System.out.println("AAA meth()");

        }

    }

    

    

    private class BBB   ////���� Ŭ���������� ��밡��

    {

        int a = 20;

        

        void meth()

        {

            System.out.println("BBB meth()");

        }

    }

    

    

    

    public EventExam() {

        // TODO Auto-generated constructor stub

        

        qq_1.add(new JCheckBox("�嵿��"));

        qq_1.add(new JCheckBox("���켺"));

        qq_1.add(new JCheckBox("����"));

        qq_1.add(new JCheckBox("����"));

        

        

        ButtonGroup bg = new ButtonGroup();

        

        qq_2.add(new JRadioButton("������"));

        qq_2.add(new JRadioButton("�Ϳ��"));

        qq_2.add(new JRadioButton("��ġ��"));

        qq_2.add(new JRadioButton("������"));

        

        setBounds(100, 0, 500, 700);

        setLayout(new GridLayout(12, 1));

        

        add(new JLabel("1. �������� ������ ������"));

        

        for(JCheckBox buf : qq_1)

            add(buf);

        

        add(new JLabel("2. �������� ��Ư�⸦ ������"));

        for(JRadioButton buf : qq_2)

        {

            add(buf);

            bg.add(buf);

        }

        

        JButton btn = new JButton("���");

        

        add(btn);

        add(res);

        

        btn.addActionListener(new BtnListener());

        

        setVisible(true);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

}

 

 

public class CalDH2 {

 

    public static void main(String[] args) {

        //new EventExam().AAA();

        

        EventExam ex = new EventExam();

        

        //ex.AAA();

        

        /*EventExam.AAA aaa = new EventExam().new AAA();

        aaa = ex.new AAA();

        ///�̳� Ŭ������ ���� �� ����

        

        System.out.println(aaa.a);

        new EventExam().new AAA().meth();*/

        

    ///    new EventExam().new BBB().meth();  ���� �߻� ���� ��������

        

        

    }

}

  






