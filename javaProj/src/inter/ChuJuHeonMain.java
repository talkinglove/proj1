package inter;
////�������� �����ϼ���
/// ������ ������ - �� ���, �ܼҸ��� 
/// ������ ������ - �������ּ���, �ܼҸ���
/// ������ ������ - ����մϴ�, �ܼҸ���
interface Mom
{
	String name ="����";
	void bab(String name);
	void nagging(String name);
}

interface Instructor
{
	String name ="��";
	void teaching(String name);
	void nagging(String name);
}

interface Monster
{
	String name ="������";
	void love(String name);
	void nagging(String name);
}

class ChuJuHeon implements Mom, Instructor, Monster
{

	@Override
	public void love(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"����ؿ� ������");
	}

	@Override
	public void teaching(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"�������ּ���");
	}

	@Override
	public void bab(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" �����");
	}

	@Override
	public void nagging(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"�ܼҸ���");
	}
	
}
public class ChuJuHeonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mom mm;
		Instructor inst;
		Monster mo;
		
		ChuJuHeon cjh = new ChuJuHeon();
		
		mm=cjh;
		mm.bab("���ִ�");
		mm.nagging("������ ");
		
		inst =cjh;
		inst.nagging("���� ");
		inst.teaching("�������̽��� ");
		
		mo = cjh;
		//System.out.println(mo.name);
		mo.love("������ŭ ");
		mo.nagging("���ϸ�ŭ ");
	}

}
