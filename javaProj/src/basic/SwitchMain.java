package basic;

public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;//="���� ��ߵ�";
		switch(300)
		{
			case 8:
				System.out.println("���� 8�̿�");
				str = "8888";
				break;
			case 20:
				System.out.println("���� 20�̿�");
				str="2020";
				break;
			
			case 10:
			case 14:
			case 17:
			case 27:
				System.out.println("���� 10�̿�");
				System.out.println("���� 10�̶���");
				System.out.println("���� 10�̿���");
				str = "1010";
				break;
			case 100:
				System.out.println("���� 100�̿�");
				str="10000000";
				break;
			default:
				System.out.println("���� �⺻�̿�");
				str="�⺻�⺻";
				break;
				
		}
		System.out.println(str);
		System.out.println("SwitchMain ����");
	}

}
