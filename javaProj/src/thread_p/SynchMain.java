package thread_p;

class Mother
{
	int total =100;
	
	
	synchronized boolean showMeTheMoney(int money, String name)
	{
		if(!name.equals("�ƺ�"))
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return total>=money;
		}
		System.out.println("scv ������");
		return false;
		
	}
	
	synchronized boolean missionComplete(int money,String name)
	{
		if(name.equals("�ƺ�"))
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 100<money;
		}
		System.out.println("�ǰ��ϰԸ� �ڶ�ٿ�");
		return false;
		
	}
}

class DragonMoney extends Thread
{
	Mother mom;
	int myMoney=0;
	public DragonMoney(String name,Mother mom) {
		super(name);
		// TODO Auto-generated constructor stub
		this.mom = mom;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(mom.total>0)
		{
			int money= (int)(Math.random()*50+1);
			
			if(mom.showMeTheMoney(money, getName()))
			{
				mom.total-=money;
				myMoney += money;
				
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\t�ܾ�:"+mom.total);
			}
			
			money= (int)(Math.random()*150+1);
			
			if(mom.missionComplete(money, getName()))
			{
				mom.total+=money;
				myMoney += money;
				
				System.out.println(getName()+":"+money+"("+myMoney+")");
				System.out.println("\t�ܾ�:"+mom.total);
			}
		}
	}
}

public class SynchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mother mom = new Mother();
		
		DragonMoney son = new DragonMoney("�Ƶ�", mom);
		DragonMoney dau = new DragonMoney("��", mom);
		DragonMoney scv = new DragonMoney("�ƺ�", mom);
		
		son.start();
		dau.start();
		scv.start();
	}

}
