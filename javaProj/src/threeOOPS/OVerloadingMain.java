package threeOOPS;
class ClaOVerload
{
	void meth(int a, String b)
	{
		System.out.println("�⺻�޼ҵ�:"+a+","+b);
		
	}
	
	void meth(int a)
	{
		System.out.println("�Ű������� ������ �ٸ� ���:"+a);
		
	}
	
	void meth(int a, int b)
	{
		System.out.println("�Ű������� �ڷ����� �ٸ����:"+a+","+b);
		
	}
	
	void meth( String b, int a)
	{
		System.out.println("�Ű������� ������ �ٸ� ���:"+a+","+b);
		
	}
}
public class OVerloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaOVerload ov = new ClaOVerload();
		ov.meth(10, "���� ������");
		ov.meth(20);
		ov.meth(30,40);
		ov.meth("��� �����?",50);
	}
	
	//// ��ǻ�͸� �����ϼ���
	// �º� - ��ü(�̸�,����)
	// ��Ʈ�� - ��ü(�̸�,����), ���콺(�̸�,����)
	// ����ũž - ��ü(�̸�,����), ���콺(�̸�,����), Ű����(�̸�,����)
	///  ��ǻ�� - ��ǰ��, ���� , ��ǰ � ���� ������ ���� ��
	
	
	
	/////// ������ �����ϼ���
	/// ���콺 - ����/����, ���̹�/�Ϲ�
	/// Ű���� - ����/���ڽ�, ����/����, led/������
	//// Ŭ������ �Է¹ް�, Ŭ������ ����� ��
	///  ��ǻ�� - ��ǰ��, ���� , ���� � ���� ������ ���� ��
	
	

}
