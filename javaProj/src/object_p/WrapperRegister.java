package object_p;

import java.util.Scanner;

///ȸ�� ������ �����ϼ���

/// ������� : jpg,bmp,png,gif �� �ø�����
/// �̸��� ��ȿ�� �˻��ϼ���

////  ���̵�@������   ������ �� : @ �Ѱ�
///  ���̵� ������
//// ������ �������� ���� ������ ������ 2,3����
         //// naver.com,   yahoo.co.kr 
/// ��ȭ��ȣ�� ���ڸ�
/// ����ó�� ����� ��
public class WrapperRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true){
			try {
				System.out.print("�������:");
				String pic = sc.nextLine();
				
				String [] chArr =new String[] {"jpg","bmp","gif"};
				
				String ext = pic.toLowerCase().substring(
						pic.lastIndexOf(".")+1);
				
				boolean chk = true;
				for(String ch: chArr)
				{
					if(ch.equals(ext)) chk = false;
				}
				
				if(chk)	throw new Exception("������� ����");
				
				
				System.out.print("�̸���:");
				String email = sc.nextLine();
				
				
				
				String [] emArr = email.split("@");
				
				if(emArr.length!=2)	throw new Exception("�̸��� @����");
				
				chk = false;
				for(int i =0; i<emArr[0].length();i++)
				{
					if(emArr[0].toLowerCase().charAt(i)<'a'
					||emArr[0].toLowerCase().charAt(i)>'z')
						chk=true;
				}
				if(chk)	throw new Exception("���̵� ����");
				
				
				chArr =new String[] {"naver.com","google.com","yahoo.com"};
				chk = true;
				for(String ch: chArr)
				{
					if(ch.equals(emArr[1])) chk = false;
				}
				
				if(chk)	throw new Exception("������ ����");
				
			
				System.out.print("��ȭ��ȣ:");
				String tel = sc.nextLine();
				
				Long.parseLong(tel);
				
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
		
		System.out.println("ȸ������ �Ϸ�");
	}

}
