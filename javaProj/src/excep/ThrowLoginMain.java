package excep;

import java.util.Scanner;

public class ThrowLoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id="aaa", pw="1111";
		while(true)
		{
			try {
				System.out.print("id:");
				String input = sc.nextLine();
				
				if(!id.equals(input))
					throw new Exception("id�� �������� �ʽ��ϴ�.");
				
				
				System.out.print("pw:");
				input = sc.nextLine();
				
				if(!pw.equals(input))
					throw new Exception("pw�� ��ġ���� �ʽ��ϴ�.");
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("�α��� �Ϸ�");
	}

}
