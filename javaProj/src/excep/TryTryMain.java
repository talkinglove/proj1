package excep;

public class TryTryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("try ����");

			try {
				System.out.println("try try ����");
				//int b = 10/0;
				System.out.println("try try ��");
				
			} catch (Exception e) {
				System.out.println("try catch ����");
				
				System.out.println("try catch ��");
			}
			
			int a = 10/0;
			
			System.out.println("try ��");
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("catch ����");

			try {
				System.out.println("catch try ����");
				int b = 10/0;
				System.out.println("catch try ��");
				
			} catch (Exception ee) {
				System.out.println("catch catch ����");
				
				System.out.println("catch catch ��");
			}
			System.out.println("catch ��");
		}
	}

}
