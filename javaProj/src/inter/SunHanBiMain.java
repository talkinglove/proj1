package inter;
interface Stud
{
	void study();
	void sleep();
}
interface Joomma
{
	void thst();
	void sleep();
	void eat();
}
interface Daughter
{
	void fight();
	void eat();
	
}

interface Age36Women extends Stud, Joomma, Daughter
{
}

class DaughterImpl implements Daughter
{
	String name;

	public DaughterImpl(String name) {
		super();
		this.name = name;
	}
	
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println(name+" ���͵���");
	}
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+" �Ծ��");
	}
	
	
	
}


class JoommaImpl extends DaughterImpl implements Joomma
{
	

	public JoommaImpl(String name) {
		super(name);
		
	}
	
	public void thst() {
		// TODO Auto-generated method stub
		System.out.println(name+" Ȯ!!!");
	}

	
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name+" ���ڿ�");
	}
	
	
	
}
class StudImpl extends  JoommaImpl
{

	public StudImpl(String name) {
		super(name);
		
	}

	public void study() {
		// TODO Auto-generated method stub
		System.out.println(name+" �����ؿ�");
	}
	
}
class Age36WoImpl  extends StudImpl  implements Age36Women
{

	public Age36WoImpl(String name) {
		super(name);
		//this.name = name;
	}
	
}

public class SunHanBiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age36WoImpl shb = new Age36WoImpl("�Ѻ��");
		
		Stud st;
		Joomma jm;
		Daughter dau;
		Age36Women a3w;
		
		System.out.println("���� Ŭ����----------------------");
		shb.study();
		shb.sleep();
		shb.eat();
		shb.sleep();
		shb.eat();
		shb.thst();
		System.out.println("��⹭��----------------------");
		a3w =shb;
		a3w.study();
		a3w.sleep();
		a3w.eat();
		a3w.sleep();
		a3w.eat();
		a3w.thst();
		System.out.println("��� st----------------------");
		//st = shb;
		st = a3w;
		st.study();
		st.sleep();
		//st.eat();
		System.out.println("��� jm----------------------");
		jm = shb;
		jm.sleep();
		jm.eat();
		jm.thst();
		System.out.println("��� dau----------------------");
		dau = shb;
		dau.fight();
		dau.eat();
		
		System.out.println("��� dau �ܵ�----------------------");
		DaughterImpl ddd = new DaughterImpl("�ֹ���");
		dau = ddd;
		dau.eat();
		
		System.out.println("��� jm �ܵ�----------------------");
		JoommaImpl jjj = new JoommaImpl("���ַ�");
		jm = jjj;
		jm.sleep();
		
	}
	
	///���
	//// mp3 - ���, ���߱�
	/// ī�޶� - ���, ����
	/// ��ȭ   - ���, ���ϱ�
	/// �ڵ��� - mp3, ī�޶�, ��ȭ
	
	/// ����
	///  ��� �� ����� �ּ���
	
}
