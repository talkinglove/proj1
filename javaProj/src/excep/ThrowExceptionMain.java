package excep;

public class ThrowExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("try ����");
			//int a = 10/0;
			/*Exception ex = new Exception();
			throw ex;*/
			throw new Exception("��Ͳ��ٰ� �������� ����");
			//System.out.println("try ��");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch"+e.getMessage());
		}
	}

}
