package basic;

public class IfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jum =78;
		
		String grade="�ʱ��ʱ�";
		if(jum>=90)
		{
			System.out.println("�� ���̾�");
			System.out.println("��");
			System.out.println("���� ����");
			grade="A";
		}
		
		else if(jum>=80){
			System.out.println("�� ��");
			grade="B";
		}	
		else if(jum>=70){
			System.out.println("�� ��");
			grade="C";
		}	
		
		else{
			System.out.println("������");
			//grade="F";
		}
		System.out.println("IfMain Ŭ���� ����");
		System.out.println(grade);
		
/*		// �ڵ��� ���� �׽�Ʈ�� �غ�����
		// �� ������ ���� :100�� 
		//���� : �ӵ� 50%, ������ : 30%, ���� : 20%


		���� :  �ӵ� 78, ������ 82  ���� 67
		���� :  78*0.5  +  82 *0.3  +  67 *0.2
		     
		//���� 80 �̻� -  ���, 70�̻� - ���� , ������ - �ҷ�
		//��� ������ 80���̻��� ��� ����Ʈ
*/		
		
		int speed = 58, safe = 88, fuel=87;
		double tot = speed*0.5+safe*0.3+fuel*0.2;
		
		String res = "����:"+tot+", ���:";
		
		if(tot>=80){
			res+="���";
			if(speed>=80 && safe>=80 && fuel>=80)
				res+="(����Ʈ)";
			
		}else if(tot>=70){
			res+="����";
		}else{
			res+="�ҷ�";
		}
		
		System.out.println(res);
		//System.out.print();
		System.out.println("����������");
	}

}
