package basic;

public class ForStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <5; i++) { //��
			for (int j = 0; j <=i; j++) {//ĭ(��)
				System.out.print("*");//���� �Ѱ��� ���
			}
			
			System.out.println();//�ٹٲٱ�
		}
		
		System.out.println();
		
		for (int i = 0; i <5; i++) { //��
			for (int j = 5; j >i; j--) {//ĭ(��)
				System.out.print("*");//���� �Ѱ��� ���
			}
			
			System.out.println();//�ٹٲٱ�
		}
		
		
		System.out.println();
		
		for (int i = 0; i <5; i++) { //��
			for (int j = 5-1; j >i; j--) {//��ĭ
				System.out.print(" ");//��ĭ�� �Ѱ��� ���
			}
			
			for (int j = 0; j <=i; j++) {//ĭ(��)
				System.out.print("*");//���� �Ѱ��� ���
			}
			
			
			System.out.println();//�ٹٲٱ�
		}
	}

}
