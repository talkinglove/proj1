package excep;
class ReThrow
{
	void meth_1() throws Exception
	{
			
			try {
				System.out.println("meth_1 ����");
				meth_2();
				System.out.println("meth_1 ��");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("meth_1() ����ó��:"+e.getMessage());
				throw e;
			}
			
			
	}
	
	void meth_2() throws Exception
	{
		try {
			System.out.println("meth_2 ����");
			
			//int a = 10/0;
			throw new Exception("���� �ϰ� �׷��� �ο��� ����?");
			//System.out.println("meth_2 ��");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("meth_2() ����ó��:"+e.getMessage());
			throw e;
		}	
	}
	
}
public class ReThrowingMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReThrow rw = new ReThrow();
		
		try {
			rw.meth_1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("main() ����ó��:"+e.getMessage());
			throw e;
		}
	}

}
