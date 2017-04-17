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

    

    JLabel res = new JLabel("결과:");

    

    

    

    class BtnListener implements ActionListener

    {

        @Override

        public void actionPerformed(ActionEvent e) {

            // TODO Auto-generated method stub

            ////res.setText("케로케로케로");

            

            int jum =0;

            

            for(JCheckBox buf : qq_1)

                if(buf.isSelected())

                    jum+=20;

            

            

            if(qq_2.get(1).isSelected())

                jum+=20;

            

            res.setText("결과:"+jum);

            

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

    

    

    private class BBB   ////현재 클래스에서만 사용가능

    {

        int a = 20;

        

        void meth()

        {

            System.out.println("BBB meth()");

        }

    }

    

    

    

    public EventExam() {

        // TODO Auto-generated constructor stub

        

        qq_1.add(new JCheckBox("장동건"));

        qq_1.add(new JCheckBox("정우성"));

        qq_1.add(new JCheckBox("현빈"));

        qq_1.add(new JCheckBox("원빈"));

        

        

        ButtonGroup bg = new ButtonGroup();

        

        qq_2.add(new JRadioButton("멋지미"));

        qq_2.add(new JRadioButton("귀요미"));

        qq_2.add(new JRadioButton("백치미"));

        qq_2.add(new JRadioButton("깜찍이"));

        

        setBounds(100, 0, 500, 700);

        setLayout(new GridLayout(12, 1));

        

        add(new JLabel("1. 선생님의 별명을 고르세요"));

        

        for(JCheckBox buf : qq_1)

            add(buf);

        

        add(new JLabel("2. 선생님의 주특기를 고르세요"));

        for(JRadioButton buf : qq_2)

        {

            add(buf);

            bg.add(buf);

        }

        

        JButton btn = new JButton("결과");

        

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

        ///이너 클래스의 선언 및 생성

        

        System.out.println(aaa.a);

        new EventExam().new AAA().meth();*/

        

    ///    new EventExam().new BBB().meth();  에러 발생 제한 접근자임

        

        

    }

}

  






