package excep;

import java.util.Scanner;

//ȸ������ ���α׷��� �ۼ��ϼ���
//�Է»��� - id", "pw", "pwȮ��", "����", "�̸���", "���", "Ư��", "��ȭ��ȣ", "�ڵ���", "�������", "����
//�ʼ� �Է»��� - id", "pw", "pwȮ��", "����", "��ȭ��ȣ", "�������", "���� (���� ������ ���� �߻�)
//��ȿ�� �˻� - ���� : 1980 ���� ����ڸ� ���� ����
//          ��й�ȣ", "��й�ȣ Ȯ���� ���� ���ƾ߸� ����
public class ExcepRegisterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] qq ={"id", "pw", "pwȮ��", "����", "�̸���", 
				"���", "Ư��", "��ȭ��ȣ", "�ڵ���", "�������", "����"};
		boolean [] cjh = {true,true,true, true,false,false,false,true,false,true,true};
		int excepNum = 9;
		String pwChk="";
		Scanner sc = new Scanner(System.in);
		tot:while(true)
		{
			try {
				for (int i = 0; i < qq.length; i++) {
					System.out.print(qq[i]+":");
					
					if(i!=excepNum)
					{
						String input = sc.nextLine();
						if(cjh[i] && input.equals(""))
							throw new Exception(qq[i]+" �Է¿���");
						
						if(i==1) pwChk = input;
						
						if(i==2 && !pwChk.equals(input))
							throw new Exception("pw ����ġ");
						
						System.out.println(input);
					}else{
						int input = sc.nextInt();
						if(input<19800000)
							throw new Exception(qq[i]+" 1980�̻�");
							System.out.println(input);
						sc.nextLine();
					}
				}
				break tot;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("ȸ������ �Ϸ�");
	}

}
