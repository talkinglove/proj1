package threeOOPS;
class Const
{
	int sum, b, c;
	int avg;
	Const(int a)
	{
		
		System.out.println("����� ���� ������");
		this.a=a;
	}
	
	
	Const(int a, int b, int c)
	{
		
		System.out.println("����� ���� ������");
		this.a=a;
		this.b = b;
		this.c =c;
		
		cal();
		print();
	}
	
	
	void cal()
	{
		sum = a+b+c;
		avg = sum/3;
	}
	
	void print()
	{
		System.out.println(sum);
		System.out.println(avg);
	}
	
	
	
	Const()
	{
		this(5678);
		System.out.println("�⺻������");
		
		
	}
	
	int a = giveA();
	
	int giveA()
	{
		//Const();
		//this();
		System.out.println("giveA()");
		return 10;
	}
	
	
}
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const co1 = new Const();
		System.out.println(co1.a);
		//co1.Const();
		new Const(89,96,65);
		
		Const [] arr = {
				new Const(89,96,65),
				new Const(89,26,65),
				new Const(83,96,65)
		};
		
	}
	
	////�н����� �����ϼ���
	
	/// ������ �ֹ��ϼ���
	// �޴� : ������, ����, ġ�����
	//      ���, �����, ġ����, ���ζ��
///-------------------------------------
//   ��Ʈ�޴��� �ֹ��ϼ���
	/// �������� �߻��� ��
/// �����ֹ��� ������ 3�� �̻��� ��� ���� �޴� ������

}
