package excep;

import java.util.Scanner;

class LoginExcep extends Exception{
	String [] arr ={
			"id ����","�������� �ʴ� id","pw ����", "pw ����ġ"
	};
	
	int num;

	public LoginExcep(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return arr[num];
	}
}
public class ExcepLoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String [][] data = {
				{"aaa","1111","������"},
				{"bbb","2222","�̽��ͺ�"},
				{"ccc","3333","���"},
				{"ddd","4444","�����"},
				{"eee","5555","Ŀ�Ǻ�"}
		};
		String name = null;
		while(true){
			
			try {
				System.out.print("id:");
				
				String id = sc.nextLine();
				
				if(id.equals(""))
					throw new LoginExcep(0);
				
				int pwNum =-1;
				for (int i = 0; i < data.length; i++) {
					if(id.equals(data[i][0]))
					{
						pwNum = i;
					}
				}
				
				if(pwNum<0)
					throw new LoginExcep(1);
				
				System.out.print("pw:");
				
				String pw = sc.nextLine();
				
				if(pw.equals(""))
					throw new LoginExcep(2);
				
				if(!pw.equals(data[pwNum][1]))
					throw new LoginExcep(3);
				
				name = data[pwNum][2];
				
				break;
			} catch (LoginExcep e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		
		System.out.println(name+" �α��� �Ϸ�");
	}

}
