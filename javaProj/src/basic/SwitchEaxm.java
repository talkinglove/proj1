package basic;

public class SwitchEaxm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���޺� ������ ��� �ϼ���
	    //���� : 50%, ���� : 30%, �븮 : 20%, ���:10%
	    //���� :  �⺻�� + �⺻��*���ʽ�
	    //���ް� �⺻���� �Է¹޾� ó��
	  String grade = "����";
	  
	  int base = 300;
	  double rate=0;
	  
	  switch(grade)
	  {
	  	case "����":
	  		rate=0.5;
	  		break;
	  	case "����":
	  		rate=0.3;
	  		break;
	  	case "�븮":
	  		rate=0.2;
	  		break;
	  	case "���":
	  		rate=0.1;
	  		break;
	  }
		
	  int money = (int)(base*(1+rate));
	  System.out.println("����:"+grade);
	  System.out.println("�⺻��:"+base);
	  System.out.println("����:"+money);
		
		double jum = 100;
		String str;
		
		switch((int)jum/10)
		{
			case 9:
			case 10:
				str="��";
				break;
			case 8:
				str="��";
				break;
			case 6:
				str="��";
				break;
			case 7:
				str="��";
				break;
			default :
				str="��";
				break;
		}
		
		
		System.out.println(jum+":"+str);
		
		
		
		double rr = 3.6;
		
		switch((int)(rr*2))
		{
			case 9:
				str = "A+";
				break;
			case 8:
				str = "A";
				break;
			case 7:
				str = "B+";
				break;
			case 6:
				str = "B";
				break;
			case 5:
				str = "C+";
				break;
			case 4:
				str = "C";
				break;
			case 3:
				str = "D+";
				break;
			case 2:
				str = "D";
				break;
			
			default :
				str = "F";
				break;
		}
		
		System.out.println(rr+":"+str);
		
		String str2 = ""+(char)('A'+4-(int)rr);
		
		switch((int)(rr%1+0.5))
		{
			case 1:
				str2+="+";
		}
		
		System.out.println(str2);
		
		System.out.println();
		
		
	}

}
