package swing_p;


public class CalDH {

	JButton a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, plus, eq;
	int x, y, z;
	int total;
	boolean cnt = false;

	public CalDH() {

		JFrame f1 = new JFrame("°è»ê±â");
		f1.setBounds(100, 0, 800, 800);
		f1.setLayout(null);

		JLabel l1 = new JLabel("0");
		l1.setBounds(700, 100, 500, 100);
		f1.add(l1);

		JPanel p1 = new JPanel();
		p1.setBounds(50, 100, 700, 100);
		p1.setBackground(Color.WHITE);
		f1.add(p1);

		a1 = new JButton("1");
		a1.setBounds(500, 300, 100, 100);
		f1.add(a1);

		a2 = new JButton("2");
		a2.setBounds(500, 400, 100, 100);
		f1.add(a2);

		a3 = new JButton("3");
		a3.setBounds(500, 500, 100, 100);
		f1.add(a3);

		a4 = new JButton("4");
		a4.setBounds(400, 300, 100, 100);
		f1.add(a4);

		a5 = new JButton("5");
		a5.setBounds(400, 400, 100, 100);
		f1.add(a5);

		a6 = new JButton("6");
		a6.setBounds(400, 500, 100, 100);
		f1.add(a6);

		a7 = new JButton("7");
		a7.setBounds(300, 300, 100, 100);
		f1.add(a7);

		a8 = new JButton("8");
		a8.setBounds(300, 400, 100, 100);
		f1.add(a8);

		a9 = new JButton("9");
		a9.setBounds(300, 500, 100, 100);
		f1.add(a9);

		a10 = new JButton("0");
		a10.setBounds(200, 300, 100, 100);
		f1.add(a10);

		plus = new JButton("+");
		plus.setBounds(200, 400, 100, 100);
		f1.add(plus);

		eq = new JButton("=");
		eq.setBounds(200, 500, 100, 100);
		f1.add(eq);

		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f1.setVisible(true);

		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		a4.addActionListener(this);
		a5.addActionListener(this);
		a6.addActionListener(this);
		a7.addActionListener(this);
		a8.addActionListener(this);
		a9.addActionListener(this);
		a10.addActionListener(this);
		plus.addActionListener(this);
		eq.addActionListener(this);

		class Numbers implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stu

		}
	


	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}