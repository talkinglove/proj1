package oops;

class ClaOver
{
	void meth(int a, String b)
	{
		System.out.println("�޼ҵ� �����Դϴ�.:"+a+b);
	}
	
	void meth(int a)
	{
		System.out.println("�μ��� ������ �ٸ� ����Դϴ�.:"+a);
	}
	void meth(int a, int b)
	{
		System.out.println("�μ��� �ڷ����� �ٸ� ����Դϴ�.:"+a+b);
	}
	
	void meth(String b, int a)
	{
		System.out.println("�μ��� ������ �ٸ� ����Դϴ�.:"+a+b);
	}
	
	/*void meth(int a, String c)
	{
		System.out.println("�μ��� �̸��� �ٸ������δ� �����ε� ���ǿ� ���� ����.:"+a+c);
	}
	
	int meth(int a, String b)
	{
		System.out.println("�������� �����ε��� �������:"+a+b);
		
		return 1234;
	}
	*/
}

public class OverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaOver co = new ClaOver();
		co.meth(10,"abc");
		co.meth(10);
		co.meth(20,30);
		co.meth("qwer",30);
	}

}
