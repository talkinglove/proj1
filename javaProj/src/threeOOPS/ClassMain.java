package threeOOPS;

class AAA	//Ŭ������ ����::::> Ŭ������ ���¸� �˷���
{
	int a; 	//�������::::> �Ӽ�
	
	void meth()	//�޼ҵ�:::>���
	{
		System.out.println("AAA�� meth()");
	}
	
	/*	Ŭ������ ���Ǻο� ���౸��(���) ���� ����� �� ����. 
	 for()
	{}
	*/
}
public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a1;		//Ŭ���� ���� ����:::> �����ڸ� ����
		a1 = new AAA();	//Ŭ������ ����
		AAA a2 = new AAA();	//Ŭ������ ����
		
		//�ּ�  = �����Ҵ�:::>������
		a1.meth();	//Ŭ������ ȣ��
		System.out.println(a1.a);
		a1.a = 1000;
		System.out.println("a1.a:"+a1.a);
		System.out.println("a2.a:"+a2.a);
		
		
		
	}

}
