package thread_p;

class Product{
	
	boolean chk = false;
	String data;
	
	synchronized void put(String data)
	{
		if(!chk)
		{
			this.data = data;
			chk =true;
			System.out.println("�԰�:"+data);
			notifyAll();	//������� ��� thread�� ����
		}else{
			try {
				wait();
				//���� ���� �����尡 ������ ���ϰ� block ���
				  // ������ �������� ���� ���μ����� ���� ����
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	synchronized String get()
	{
		if(!chk)
		{
			try {
				wait();
				//���� ���� �����尡 ������ ���ϰ� ���
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		chk =false;
		System.out.println("���:"+data);
		notifyAll();
		return data;
	}
	
}

class Factory extends Thread
{
	Product pro;

	public Factory(String name,Product pro) {
		super(name);
		// TODO Auto-generated constructor stub
		this.pro = pro;
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" ("+i+")��° �԰� �õ�");
			
			
			pro.put(getName());
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class Buyer extends Thread
{
	Product pro;

	public Buyer(String name,Product pro) {
		super(name);
		// TODO Auto-generated constructor stub
		this.pro = pro;
		
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" ("+i+")��° ���ǻ�� �õ�");
			
			System.out.println(getName()+" ("+i+")::"+pro.get());
			
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

public class WNMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro = new Product();
		Factory fc_1 = new Factory("����", pro);
		Factory fc_2 = new Factory("tv", pro);
		Buyer bu_1 = new Buyer("bu_1", pro);
		Buyer bu_2 = new Buyer("bu_2", pro);
		
		fc_1.start();
		fc_2.start();
		bu_1.start();
		bu_2.start();
	}

}
