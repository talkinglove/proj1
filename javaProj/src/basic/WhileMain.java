package basic;

public class WhileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = 0;	//�ʱⰪ
		while(i<10)	//����
		{
			System.out.println("�������� �Ϳ�����"+i);
			i++;	//����
		}*/
		
		
		int i = 0;
		
		while(i<20)
		{
			System.out.println("����:"+i);
			i++;
			if(i>10)
				//break;
				continue;
				
			
			System.out.println("�������� �����ؿ�"+i);
			
		}
		
		
		
		int a = 10;
		while(a<5)
		{
			System.out.println("while:"+a);
			a++;
		}
		
		System.out.println();
		
		a = 10;
		
		do
		{
			System.out.println("do~while:"+a);
			a++;
		}while(a<5);
		
		
		
		
		
		
	}

}
