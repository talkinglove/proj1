package threeOOPS;

//// �ΰ��� Ŀ�������� Ŀ�Ǹ� �Ǹ��ϼ���
/// �޴� : �Ƹ޸�ī��(����:20), īǪġ��(����:15, ����:10), 
///       ī��Ḷ���ƶ�(����:10,����:10,ī���:5)
///       ������(����:30), ��ȭ��(��ȭ:25), ������(����:15)

///  ���δ� ���翡�� �޾� ó��
///  ������ ���� �� �������� ó��
class Material
{
	String name;
	int amount;
	public Material(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	 void print() {
		System.out.println(name + ":" + amount);
	}
	
	
}
class Dabang
{
	static int bean = 100;
	String name;
	
	
	public Dabang(String name) {
		super();
		this.name = name;
	}

	Material [] mater;
	
	void makeBeverage(String order)
	{
		switch(order)
		{
			case "�Ƹ޸�ī��":
				bean-=20;
				break;
			case "īǪġ��":
				bean-=15;
				 mater[0].amount-=10;
				break;
			case "ī��Ḷ���ƶ�":
				bean-=10;
				mater[0].amount-=10;
				mater[1].amount-=5;
				break;
			case "������":
				mater[2].amount-=30;
				break;
			case "��ȭ��":
				mater[3].amount-=25;
				break;
			case "������":
				mater[4].amount-=15;
				break;
		}
		
		print(order);
	}
	
	void print(String order)
	{
		System.out.println(name+" "+order+" ���Ծ��==============");
		
		System.out.println("����:"+bean);
		for(Material mm: mater)
		{
			mm.print();
		}
		
	}
	
}
public class StaticCoffeeMain {

	public static void main(String[] args) {
		Dabang cf1 = new Dabang("�����");
		Dabang cf2 = new Dabang("ȥ�ڿ�");
		cf1.mater = new Material[]{
				new Material("����", 100),
				new Material("ī���", 80),
				new Material("����", 70),
				new Material("��ȭ", 85),
				new Material("����", 90)
			};
		cf2.mater = new Material[]{
				new Material("����", 100),
				new Material("ī���", 80),
				new Material("����", 70),
				new Material("��ȭ", 85),
				new Material("����", 90)
			};
		
		cf1.makeBeverage("�Ƹ޸�ī��");
		cf2.makeBeverage("�Ƹ޸�ī��");
		cf1.makeBeverage("īǪġ��");
		cf2.makeBeverage("īǪġ��");
	}
}
