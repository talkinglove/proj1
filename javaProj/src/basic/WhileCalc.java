package basic;

import java.util.Scanner;

public class WhileCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��1 :
		//���� (+, - , *, / ,% , c(�ٽ��ϱ�),  g(����)): 
		//---> �߸��� ���ڰ� ������ "���� �Ұ��Դϴ�." �޼��� ó��
		//��2:
		Scanner sc = new Scanner(System.in);
		sss:while(true)
		{
			System.out.println(
		"���� ��ġ������ �������̳� �ϴ��ڿ��Դ� ��ġ ���� ���� �����϶�");
			
			System.out.print("��1:");
			int su1 = sc.nextInt();
			
			System.out.println("+, - , *, / ,% , c(�ٽ��ϱ�),  g(����)");
			System.out.print("��ȣ:");
			String code = sc.next();
			
			System.out.print("��2:");
			int su2 = sc.nextInt();
			int calc=0;
			
			String str = su1+code+su2+" = ";
			switch(code)
			{
				case "+":
					
					str+=(su1+ su2);
					break;
				case "-":
					str+=(su1- su2);
					break;
				case "*":
					str+=su1* su2;
					break;
				case "/":
					str+=su1/ su2;
					break;
				case "%":
					str+=su1% su2;
					break;
				case "c":
					str="�ٽ��ϱ�";
					break;
				case "g":
					break sss;
				default:
					str="���� �Ұ��Դϴ�.";
					break;
			}
			
			
			
			
			System.out.println("���:"+str);
		}
		System.out.println("���� ����");

	}

}
