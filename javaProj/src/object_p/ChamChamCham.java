package object_p;

import java.util.Scanner;

public class ChamChamCham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] index = {"����","����","������"};
		while(true)
		{
			System.out.println("�߾��� ���� ������");
			for (int i = 0; i < index.length; i++) {
				System.out.print(i+"."+index[i]+", ");
			}
			System.out.print("\n�Է�:");
			int user=sc.nextInt();
			
			if(user==0)
				break;
			
			int com = (int)(Math.random()*2)+1;
			
			String res = "��";
			if(user==com) res = "��";
			
			System.out.println("���̸�:"+index[user]);
			System.out.println("��ǻ��:"+index[com]);
			System.out.println("���:"+res);
			
		}
		System.out.println("��������");
	}

}
