package dynamic;
class Hambuger
{
	private final String beef = "�ѿ�";

	final String getBeef() {
		return beef;
	}
	
	
}

class ShSh extends Hambuger
{
	String kkh;
	
	/*String getBeef() {
		return kkh;
	}*/
	
	void makeBuger()
	{
		System.out.println(getBeef()+" ���� ���� ������");
	}
}
public class HambugerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShSh hb = new ShSh();
		hb.kkh="�߱���";
		hb.makeBuger();
		
	}

}
