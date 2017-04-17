package thread_p;
class SRSTh extends Thread
{

	public SRSTh(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!Thread.currentThread().isInterrupted()) {	//���ͷ�Ʈ�� ��û���� ������ ����
			try {
				sleep(1000);
				
				System.out.println(getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("���ͷ�Ʈ ��û:"+e.getMessage());
			}
		}
	}
}
public class SRSMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SRSTh t1 = new SRSTh("*");
		SRSTh t2 = new SRSTh("**");
		SRSTh t3 = new SRSTh("***");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(Thread.activeCount());
		Thread.sleep(2000);
		t1.suspend();
		Thread.sleep(2000);
		t2.suspend();
		
		Thread.sleep(2000);
		System.out.println(Thread.activeCount());
		t1.resume();
		Thread.sleep(3000);
		t1.interrupt();		//���ͷ�Ʈ ��û
		t2.stop();
		Thread.sleep(3000);
		System.out.println(Thread.activeCount());
		t3.stop();
		
		t1 = new SRSTh("��*");
		t1.start();
	}

}
