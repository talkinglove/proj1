package oops;
class DragonMoney
{
	String name;
	static int totMoney =100;
	int myMoney =0;
	
	DragonMoney init(String name)
	{
		this.name = name;
		return this;
	}
	
	void showMeTheMoney(int money)
	{
		if(name=="�ƺ�")
		{
			System.out.println("�ǰ��ϰԸ� ����ٿ�");
			return;
		}
		totMoney-=money;
		myMoney+=money;
		
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t�ܾ�:"+totMoney);
	}
	
	void missionComplete(int money)
	{
		if(name!="�ƺ�")
		{
			System.out.println(name+" �ǰ��ϰԸ� �ڶ�ٿ�");
			return;
		}
		totMoney+=money;
		myMoney+=money;
		
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t�ܾ�:"+totMoney);
	}
}
public class DragonMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragonMoney son = new DragonMoney().init("�Ƶ�");
		DragonMoney dau = new DragonMoney().init("��");
		DragonMoney scv = new DragonMoney().init("�ƺ�");
		
		/*son.name = "�Ƶ�";
		dau.name = "��";
		scv.name = "�ƺ�";*/
		
		son.showMeTheMoney(30);
		dau.showMeTheMoney(27);
		son.missionComplete(40);
		scv.missionComplete(70);
		dau.showMeTheMoney(16);
		scv.showMeTheMoney(16);
		son.showMeTheMoney(11);
	}

}
