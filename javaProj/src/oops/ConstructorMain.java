package oops;
class ClaConst
{
	
	ClaConst()
	{
		this(1234);
		System.out.println("���� �⺻�����ڴ�");
		b = 2222;
		
		
	}
	
	ClaConst(int b)
	{
		System.out.println("�� ����� ���� �����ڴ�:"+b);
		this.b = b;
	}
	
	int b = giveB();
	
	int giveB()
	{
		System.out.println("giveB()");
		return 20;
	}
}
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaConst cc = new ClaConst(5678);
		System.out.println(cc.b);
	}

}
