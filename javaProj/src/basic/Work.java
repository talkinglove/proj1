package basic;

public class Work {
	
	public static void main(String[] args) {
		
		int kor = 47, eng = 78, mat = 46;                             //��������
		int sum = kor + eng + mat;                                    //����
		int gobu = 100;                                               //�Ҽ��� �ڸ� �̵�
		double avg = (double)(int)((double)sum/3 *gobu+0.5)/gobu;     //��� (����, �ݿø�)
		
		/*int chk = 10-(int)kor/10;
		String grade = (chk <5 ? chk : 5) +"���";*/
		String grade = (char)('A'+(kor >= 60 ? 9-kor/10: 5))+"���";
		
	/*	String grade = kor >= 90 ? "1���" :                           // ��� Ȯ��
					   kor >= 80 ? "2���" :
					   kor >= 70 ? "3���" : 
					   kor >= 60 ? "4���" : "5���";  
		String grade2 = eng >= 90 ? "1���" : 
						eng >= 80 ? "2���" :
						eng >= 70 ? "3���" : 
						eng >= 60 ? "4���" : "5���";  
		String grade3 = mat >= 90 ? "1���" : 
						mat >= 80 ? "2���" :
						mat >= 70 ? "3���" : 
						mat >= 60 ? "4���" : "5���"; */ 
					   
					   
		System.out.println("����:" + sum);
		System.out.println("���:" + avg);
		System.out.println("����:" + kor + " = " + grade);
		/*System.out.println("����:" + eng + " = " + grade2);
		System.out.println("����:" + mat + " = " + grade3);
		*/
	}

}
