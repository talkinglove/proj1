package oops;

//�ѹ��� - �����, �����ȣ, ����
//���� - �����, �����ȣ,����, Ư��
//������ - �����, �����ȣ, �����Ǽ�
class OverSawon {
	String name, spec, depart;
	int num, money, sale;

	OverSawon init(String name, int num, int money) {
		depart = "�ѹ���";
		init(name, num, money, 0, "");
		return this;
	}

	OverSawon init(String name, int num, int money, String spec) {
		depart = "����";
		init(name, num, money, 0, spec);
		
		return this;
	}

	OverSawon init(String name, int num, double sale) {
		depart = "������";
		init(name, num, 0, sale, "");
		
		return this;
	}
	
	void init(String name, int num, int money, double sale, String spec)
	{
		this.name = name;
		this.num = num;
		this.money = money;
		this.spec = spec;
		this.sale = (int) sale;
	}

	void print() {
		String str = 
				depart + "\t" + 
				name + "\t" +
				num + "\t" +
				money + "\t" +
				spec + "\t" + 
				sale;
		System.out.println(str);
	}
}

public class OverSawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverSawon [] os = {
				new OverSawon().init("������", 1, 5000),
				new OverSawon().init("������", 2, 6000, "����"),
				new OverSawon().init("������", 3, 150.0),
				new OverSawon().init("������", 4, 7000)
		};
		
		for(OverSawon oo : os)
		{
			oo.print();
		}
	}

}
