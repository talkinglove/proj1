package dynamic;
class Par
{
	static int pa = giveA();
	int pb = giveB();
	
	static int giveA()
	{
		System.out.println("Par giveA()");
		return 10;
	}
	
	int giveB()
	{
		System.out.println("Par giveB()");
		return 20;
	}
	
	Par(int pb)
	{
		this.pb = pb;
		System.out.println("�θ������");
	}
}
class Child extends Par
{
	static int pa = giveA();
	//static int ppa = super.pa;
	static int cc = giveC();
	int cd = giveD();
	
	Child()
	{
		super(Par.pa);	//super(super.pa);
		//super�� �ν��Ͻ��� ����ƽ�� ������ �� ����
		System.out.println("�ڽĻ�����");
	}
	
	static int giveA()
	{
		System.out.println("Child giveA()");
		return 1000;
	}
	
	int giveB()
	{
		System.out.println("Child giveB()");
		return 2000;
	}
	static int giveC()
	{
		System.out.println("Child giveC()");
		return 3000;
	}
	
	int giveD()
	{
		System.out.println("Child giveD()");
		return 4000;
	}
	
	
}
public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------");
		Child cc1 = new Child();
		System.out.println("-------------------------");
		Child cc2 = new Child();
		System.out.println("-------------------------");
		cc1.giveA();
		System.out.println(cc1.pb);
		
	}

}
