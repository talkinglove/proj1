package basic;

import java.util.Scanner;

public class WhileMovie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String str1="", str2="", str3="";
		int curr = 0;////ī�װ��� �б�
		total:while(true)
		{
			System.out.println("����:::>");
		
			switch(curr)////1
			{
				case 0:
				System.out.print("��ȭ����:");
				int cnt = sc.nextInt();	/////�� ī�װ� �ȿ����� �б�
				switch(cnt)///////2
				{
					case 1:
						str1= "�׼�";
						break;
					case 2:
						str1= "��׼�";
						break;
					case 3:
						str1= "�Ⱦ׼�";
						break;
					
					case 9:
						continue total;
					case 0:
						str1= "����";
						break total;
						
					default:
						curr=0;
						continue total;
				}
				
				case 1:
				System.out.print("�����ο�:");
				cnt = sc.nextInt();
				
				switch(cnt)//////2
				{
					case 1:
						str2= "����";
						break;
					case 2:
						str2= "�л�";
						break;
					case 3:
						str2= "���";
						break;
					case 4:
						str2= "���ܸ�";
						break;
					case 9:
						continue total;
					case 0:
						
						break total;
					default:
						curr=1;
						continue total;
				}
			
			
			
				case 2:
				System.out.print("�����ο���:");
				cnt = sc.nextInt();
				
				if(cnt==9){///////2
			
					continue total;
				}
				
				if(cnt>=0 && cnt<6)
				{
					if(cnt!=0)
						str3 += cnt+"��";
					
					break total;
				}else{
					curr = 2;
					continue total;
				}			
	
			}
		}
	
		System.out.println(str1+str2+str3);
		System.out.println("��������");

	}

}
