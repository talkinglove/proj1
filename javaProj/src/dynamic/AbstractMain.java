package dynamic;
abstract class AbsPar
{
	int a = 10;
	int b = 20;
	
	void meth_1()
	{
		System.out.println("�θ� meth_1()");
	}
	
	abstract void meth_2();
}

class AbsChild extends AbsPar
{
	
	void meth_2() {
		System.out.println("�ڽ� meth_2()");
		
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsPar pp = new AbsPar(){
			void meth_2() {
				System.out.println("������ �������̵� meth_2()");
				
			}
		};
		
		pp.meth_1();
		pp.meth_2();
		
		System.out.println("------------------");
		
		AbsChild cc = new AbsChild(){
			void meth_2() {
				System.out.println("�ڽ� ������ �������̵� meth_2()");
				meth_3();
				
			}
			
			void meth_3() {
				System.out.println("�ڽ� ������ meth_3()");
				System.out.println("super.a:"+super.a);
				System.out.println("this.a:"+this.a);
				System.out.println("a:"+a);
				System.out.println("abc:"+abc);
				System.out.println("-----------------");
				
			}
			
			int a = 1234;
			int abc = 5678;
		};
		cc.meth_1();
		cc.meth_2();
		//cc.meth_3();
		
		System.out.println(cc.a);
	}
	
	
	///// �÷��̾ ���弼��
	
	///  MP3(��������), ���ӱ�(����), TV(ä��)
	
	// �÷��̾ �ݵ�� �־�� �ϴ� ���: ���, �Ͻ�����, ����
	
	/// �ΰ��� ����� �˾Ƽ� ��������
	
	
	
	

}
