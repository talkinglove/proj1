package thread_p;
class ClaTh_1 extends Thread
{
	int cnt=0;//Thread�� ����� Ŭ������ ��������� �� Thread�� �����뵵�� ���
	public ClaTh_1(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//int a = 10/0;
		//System.out.println(getName());
		
		for (int i = 0; i < 1000; i++) {
			System.out.print(getName());
			cnt++;
		}
		System.out.println("\n"+getName()+":"+cnt);
	}
	
}

class ClaTh_2 implements Runnable
{
	String name;
	int cnt=0;	//Runnable�� ������ Ŭ������ ��������� �����뵵�� ���
	public ClaTh_2(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			System.out.print(name);
			cnt++;
		}
		System.out.println("\n"+name+":"+cnt);
	}
}


public class ThreadMain {

	static void meth()
	{
		int a = 10/0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClaTh_1 t1 = new ClaTh_1("*");
		ClaTh_1 t3 = new ClaTh_1("&");
		Runnable rr = new ClaTh_2("/");
		Thread t2 = new Thread(rr);
		Thread t4 = new Thread(rr);
		
		//Thread t2 = new Thread(new ClaTh_2("/"));
		
		//t1.run();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("\nThread.activeCount():"+Thread.activeCount());
		System.out.println("\nThread.currentThread():"+Thread.currentThread());
		int [] arr = {10,20};
		
		//System.out.println(arr[300]);
		
		for (int i = 0; i < 1000; i++) {
			System.out.print("-");
		}
		System.out.println("\nThread.activeCount():"+Thread.activeCount());
	}

}
