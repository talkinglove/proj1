package basic;

public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i =1;i<10;i*=2)
		
		int i;
		int a = 4321;
		for(i =1;i<10;i++)
		{
			int k = 1234;
			System.out.println("�������� �Ϳ�����"+i+k+a);
		}
		
		System.out.println(i+a);
		
		
		////1~10������
		int sum = 0;
		
		for (int j = 0; j <=10; j++) {
			sum+=j;
			System.out.println(j+":"+sum);
		}
		System.out.println(sum);
		
		///// 1~100 ¦������ ��
		sum = 0;
		
		for (int j = 0; j <=100; j+=2) {
			sum+=j;
			System.out.println(j+":"+sum);
		}
		System.out.println(sum);
		
		
		
		sum = 0;
		
		for (int j = 1; j <=100; j++) {
			if(j%2==0)
			{
				sum+=j;
				System.out.println(j+":"+sum);
			}
		}
		System.out.println(sum);
		
		
		for (int j = 1; j <=20; j++) {
			
			String str =""+j;
			if(j%10%3==0 && j%10!=0)
			{
				str="¦";
			}
			System.out.println(str);
		}
		
	}

}
