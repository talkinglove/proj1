package basic;

import java.util.Scanner;

public class WhileScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nn = sc.next();
		System.out.println(nn);
		/*System.out.print("a�Է�:");
		int a = sc.nextInt();
		
		System.out.println("a:"+(a+100));
		*/
		
		www:while(true)
		{
			System.out.println("��̷� ���� ������ ����");
			System.out.println("����:1~3,  ����:0");
			System.out.print("�Է�:");
			int input = sc.nextInt();
			
			
			
			/*if(input==0)
				break;*/
			
			String str="";
			
			switch(input)
			{
				case 1:
					str="������ ���ǵ���";
					break;
				case 2:
					str="�̷��� ������";
					break;
				case 3:
					str="���� �����!!!";
					break;
				case 0:
					break www;
				default:
					str="�߸������̽��ϴ�.";
					break;
			}
			System.out.println("���:"+str);
		}
		
		System.out.println("����");

	}

}
