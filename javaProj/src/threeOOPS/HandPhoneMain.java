package threeOOPS;

//�ڵ����� �ΰ� �缭 
//�ڵ���1 ->��ȭ�� �ϰ�, ������ ���
//�ڵ���2 ->��ȭ�� �ϰ�, ������ �ؿ�

//�ڵ�����  --> ����
//�ΰ� ---> ����
//�缭 ---> ����

class WaterBottle
{
	String cover;
	int water;
	String cap;
	
	void print()
	{
		String str = cover+"\t"+water+"\t"+cap;
		
		System.out.println(str);
	}
}



class HandPhone
{
	String battery, name;
	
	int price, energy=100;
	
	void tel(String number)
	{
		if(this.energy<=0)
		{
			System.out.println(name+ " ���͸��� �����");
		}else{
			int energy = 20;
			this.energy-=energy;
			number="010-5555-5555";
			System.out.println(name+" "+ number+" ��ȭ�ؿ�:"+this.energy);
			
		}
		
	}
	
	void repair(String [] center)
	{
		center[0]="��´";
		System.out.println(name+" "+center[0]+" �� ���Ŀ�");
	}
	
	
	
	String photo(String target)
	{
		int use = 30;
		energy-=use;
		
		System.out.println(name+" ������ ����:"+energy);
		
		return name+"�� "+target+" ����";
	}
	void game()
	{
		int use = 50;
		energy-=use;
		System.out.println(name+" �����ؿ�:"+energy);
		
		return;
	}
	
	
	WaterBottle makeBottle()
	{
		WaterBottle ret = new WaterBottle();
		
		ret.cover = "���̽ý�";
		ret.water = 500;
		ret.cap = "�ö�ƽ";
		
		return ret;
	}
	
}
public class HandPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhone ad = new HandPhone();
		HandPhone gg = new HandPhone();
		
		ad.name = "������7";
		ad.battery = "��ü��";
		ad.price = 100;
		
		gg.name = "������S7";
		gg.battery = "������";
		gg.price = 92;
		
		String num ="010-1234-5678"; 
		ad.tel(num);
		System.out.println("num:"+num);
		
		String pic = ad.photo("���� ");
		System.out.println(pic);
		
		gg.tel("010-9876-5432");
		gg.game();
		gg.game();
		gg.tel("010-1111-2222");
		
		String [] center = {"����","ī�޶�","��ư"};
		gg.repair(center);
		System.out.println("center[0]:"+center[0]);
		
		/*WaterBottle wb = gg.makeBottle();
		wb.print();*/
		gg.makeBottle().print();
	}

}
