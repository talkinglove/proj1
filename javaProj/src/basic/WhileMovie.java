package basic;

import java.util.Scanner;

public class WhileMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//while scanner �� �̿��Ͽ� ��ȭ���� ���α׷��� �����ϼ���

		// ��ȭ����
		//1. �׼�  2. ��׼�   3. �Ⱦ׼�   4. �ٽÿ���    0. ����

		// �����ο�
		//1. ����   2. �л�   3. ���    4. ���ܸ�  5. �ٽ��ϱ�   0. ����

		// ���� �ο���
		//1~ 5��   9.ó������   0. ����

		/////���󿹸Ž�  ��ȭ���� ���� ȭ�� ����� ��
		
		Scanner sc = new Scanner(System.in);
		String str1="", str2="", str3="";
		total:while(true)
		{
			System.out.println("����:::>");
		
			movie:while(true)
			{
				System.out.print("��ȭ����:");
				int cnt = sc.nextInt();
				switch(cnt)
				{
					case 1:
						str1= "�׼�";
						break movie;
					case 2:
						str1= "��׼�";
						break movie;
					case 3:
						str1= "�Ⱦ׼�";
						break movie;
					
					case 9:
						continue total;
					case 0:
						str1= "����";
						break total;
					
				}
			}
			kind:while(true)
			{
				System.out.print("�����ο�:");
				int cnt = sc.nextInt();
				
				switch(cnt)
				{
					case 1:
						str2= "����";
						break kind;
					case 2:
						str2= "�л�";
						break kind;
					case 3:
						str2= "���";
						break kind;
					case 4:
						str2= "���ܸ�";
						break kind;
					case 9:
						continue total;
					case 0:
						
						break total;
					
				}
			}
			
			
			reser:while(true)
			{
				System.out.print("�����ο���:");
				int cnt = sc.nextInt();
				
				if(cnt==9){
			
					continue total;
				}
				
				if(cnt>=0 && cnt<6)
				{
					if(cnt!=0)
						str3 += cnt+"��";
					
					break total;
				}			
				
				
				
			}
		}
	
		System.out.println(str1+str2+str3);
		System.out.println("��������");

	}

}
