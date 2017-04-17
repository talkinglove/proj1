package dynamic;
///////////
//////�ڵ����� �����ؼ� �Ǹ��ϼ���
/// ������� : �ڵ��� ---> ��ȭ, �������, ���ͳ� 
///  ���Ÿ�� : �ȵ���̵���, ������, ms��
////�ȵ���̵� - ���� ũ��, ���� �÷���, ��ź, ī�޶�
///   ������  - ����, �ȵ鸲, ī�޶�
///   ms�� - �ͽ��÷η�, ��������, ����, ���伥, ī�޶�

class HandPhone
{
	String name;
	
	
	public HandPhone(String name) {
		super();
		this.name = name;
	}

	void tel()
	{
		System.out.println(name+ " ��ȭ�ؿ�");
	}
	
	void photo(){
		System.out.println(name+ " ��������");
	}
	
	void internet(){
		System.out.println(name+ " ���ͳ� �ؿ�");
	}
}

class Android extends HandPhone
{

	public Android() {
		super("�ȵ���̵�");
		// TODO Auto-generated constructor stub
	}
	
	void photo(){
		System.out.println(name+ " ī�޶�� ��������");
	}
	
	void internet(){
		System.out.println(name+ " ���� ũ�� �ؿ�");
	}
	
	void play(){
		System.out.println(name+ " ���� �÷��� �ؿ�");
	}
	void bomb(){
		System.out.println(name+ " ���� ��ź �ؿ�");
	}
	
}

class IPhone extends HandPhone
{

	public IPhone() {
		super("������");
		// TODO Auto-generated constructor stub
	}
	
	void photo(){
		System.out.println(name+ " ��ȭ�� ī�޶�� ��������");
	}
	
	void internet(){
		System.out.println(name+ " ���� �ؿ�");
	}
	
	void tel(){
		System.out.println(name+ " �ȵ����");
	}
	
}

public class HandPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandPhone [] phones = {
				new Android(),
				new IPhone()
		};
		
		for(HandPhone hp : phones)
		{
			hp.internet();
			hp.tel();
			hp.photo();
			//hp.play();
			System.out.println("-----------------");
			
		}
		
		((Android)phones[0]).bomb();
	}

}
