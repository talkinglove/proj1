package basic;
/*
 * 1�� ������
 *   - : ����ǥ�� (����)
 *   ! : ���� (boolean)
 *   ++,-- : ����(1�� ����, ����) 
 *    ����ó�� ����  ++���� : ���� ����Ͽ� ������ �Է�
 *    ����ó�� ����  ����++ : ���� ���� �� ++ ����
 * 
 * 
    <ǥ���>
    int x = a + b;
    param : a, b
    return : x

   2�� ������
 * 
 *   2.1 ���   ---> 
     param  ������ or ���ڿ�
     return ������ or ���ڿ�
 *    +,-,*,/,%
 *    ���ڿ��� ������ ���� ���� ���� --> ���ڸ� ����
 *    �� + �� ���ڿ� ���� ���ڿ��� �����ϴ� �����ڷ� ���

 *   2.2 ��  ---> 
      param  ������  or ���ڿ�
      return boolean (true,false)
 *    >  ũ��    �ʰ�
 *    >=  ũ�ų� ���� �̻�  =�� ���� ���� ��� �ݵ�� �ڿ���� �Ѵ�
 *    <=  �۰ų� ����  ����    = �� ���� �ԷµǴ� ��� �������� ����
 *    <  �۴�    �̸� 
 *    ==  ����
 *    !=  �ٸ���

 *   2.3 ��  ---> 
     param  boolean��
       return boolean (true,false)
 *    && - and (�������� ��� ���϶� ��)
 *    || -or (������ �� �ϳ��� ���̸� ��)
 *    ^ -xor (�������� ���� �ٸ����� ��)   
 *    Boolean�� ���������� ���

 * 2.4 shift ��Ʈ ���� ----> 
     param  ������
     return 2�� �ڸ��̵�
 *    x<<n  ����x�� n��Ʈ �������� �̵� �������� 0���� ä��

      x>>n  ����x�� n��Ʈ ���������� �̵�    �������� ��� :0, ����:1�� ä��

     x>>>n ����x�� n��Ʈ ���������� �̵�    �������� 0���� ä��
 

 * 2.5 ��Ʈ ���� ---->
           param  ������
           return ������
         a:1110��    14
         b:0101��     5
         
       &   0100
       |   1111
       ^   1011
         
         c=a&b=0100��   4
         c=a|b=1111��   15
         c=a^b=1011��   11


   215   --> 0 1101 0111
   432   --> 1 1011 0000
---------------------------------
         &   0 1001 0000   --> 144
         |   1 1111 0111   --> 503
         ^   1 0110 0111   --> 359

2.7  ���Կ�����
param = ������

return => ������

������
����
��
���ʿ��� ������
=
�����͸� ����(��ü)
a = 4
4
+=
������ ���ϱ�Ǵ� ���ڿ��� ������ ���� ����
a +=2
a +='�ǰ��մϴ�'('����')
a���� 4�ϰ��6
���� �ǰ��մϴ�
-=
������ �� ���� ����
a -=2
a ���� 4�ΰ�� 2
*=
������ ���� ���� ����
a *=2
a ���� 4�ΰ�� 8
/=
������ �������� ����
a /=2
a ���� 4�� ��� 2
%=
������ ������ ���� ����
a %=2
a ���� 4�� ��� 0
 

 * 
 * 3�� ������ ---> if�� 
 *   ���� ?  ���϶� ��  : �����϶� ��
 *   
 *   ������ boolean ������ ����� ���ߵǾ� ��
 *   ������ true -> ���϶� ��
 *   ������ false -> �����϶� ��
 * 
 * 
 * ����ȯ --> ����ȯ�� �ƹ��ų� �Ǵ� ���� �ƴ� ���������� �ڷ����� �ȴ�
 *           ���� <--> ����,  char <--> int  char�� ���ڰ��� �־� int������ ����
 *    
 *   ������ ����ȯ
 *   : ����������� �ڽŰ� ����Ǵ� �ڷ������� ����� �ٲپ� ���� ����ȯ
 * 
 *   ����� ����ȯ
 *   : ������ ����ȯ�� ���ϱ� ���� ���Ǵ� �������� �Ͻ������� ���� ��ȯ
 *      (�ڷ���)��;  ���·� ��ȯ
 * 
 */
public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		/*2�� ������
		 * 
		 *   2.1 ���   ---> 
		     param  ������ or ���ڿ�
		     return ������ or ���ڿ�
		 *    +,-,*,/,%
		 *    ���ڿ��� ������ ���� ���� ���� --> ���ڸ� ����
		 *    �� + �� ���ڿ� ���� ���ڿ��� �����ϴ� �����ڷ� ���*/
		
		int x2 = 14, y2 = 5;
		String str1 = "������", str2 = "������";
		
		System.out.println(x2+y2);
		System.out.println(x2-y2);
		System.out.println(x2*y2);
		System.out.println(x2/y2);
		System.out.println(x2%y2);
		
		System.out.println(str1+str2);
		System.out.println(x2+y2+str1);
		System.out.println(str1+x2+y2);
		//                "������14" + 5 =>"������145" 
		System.out.println(1+x2);
		System.out.println('1'+x2);
		System.out.println("1"+x2);
		
		System.out.println(x2+" + "+y2+" = "+(x2+y2));
		System.out.println(x2+" - "+y2+" = "+(x2-y2));
		System.out.println(x2+" * "+y2+" = "+x2*y2);
		System.out.println(x2+" / "+y2+" = "+(x2/y2));
		System.out.println(x2+" % "+y2+" = "+(x2%y2));
		/*
		 * 14 + 5 = 19
		 * 14 - 5 = 9
		 * 14 * 5 = 70
		 * 14 / 5 = 2
		 * 14 % 5 = 4
		 * System.out.println(str1-str2);
		System.out.println(str1*str2);
		System.out.println(str1/str2);
		System.out.println(str1%str2);
		
		**   2.2 ��  ---> 
      param  ������  or ���ڿ�
      return boolean (true,false)
 *    >  ũ��    �ʰ�
 *    >=  ũ�ų� ���� �̻�  =�� ���� ���� ��� �ݵ�� �ڿ���� �Ѵ�
 *    <=  �۰ų� ����  ����    = �� ���� �ԷµǴ� ��� �������� ����
 *    <  �۴�    �̸� 
 *    ==  ����
 *    !=  �ٸ���
		*
		*/
		int x3 = 20, y3 = 35;
		
		System.out.println(x3+" > "+y3+" = "+(x3>y3));
		System.out.println(x3+" >= "+y3+" = "+(x3>=y3));
		System.out.println(x3+" <= "+y3+" = "+(x3<=y3));
		System.out.println(x3+" < "+y3+" = "+(x3<y3));
		System.out.println(x3+" == "+y3+" = "+(x3==y3));
		System.out.println(x3+" != "+y3+" = "+(x3!=y3));
		/*
		System.out.println(x3>=y3);
		System.out.println(x3<=y3);
		System.out.println(x3<y3);
		System.out.println(x3==y3);
		System.out.println(x3!=y3);*/
		System.out.println();
		System.out.println(str1==str2);
		System.out.println(str1!=str2);
		
/*		*   2.3 ��  ---> 
	     param  boolean��
	       return boolean (true,false)
	 *    && - and (�������� ��� ���϶� ��)
	 *    || -or (������ �� �ϳ��� ���̸� ��)
	 *    ^ -xor (�������� ���� �ٸ����� ��)   
	 *    Boolean�� ���������� ���
*/
		System.out.println();
		boolean x4 = false, y4 = false;
		System.out.println(x4 && y4);
		System.out.println(x4 || y4);
		System.out.println(x4 ^ y4);
		
		int money = 300, height = 190;
		
		//boolean mmChk = money >=1000;
		//boolean hhChk = height>= 185;
		
		System.out.println("And:"+(money >=1000 && height>= 185));
		/*System.out.println("Or:"+(mmChk || hhChk));
		System.out.println("Xor:"+(mmChk ^ hhChk));*/
		
		boolean x5 = false;
		String res = x5 ? "�� ��������" : "�� ����������";
		System.out.println(res);
		
		boolean marry = money >=1000 && height>= 185;
		String mmStr = marry ? "��ȥ�����մϴ�.":"ȥ�ڻ�� �͵�...";
		
		System.out.println(mmStr);
		
		int jum =98;
		
		
		String grade =
				//jum >=70 ? "��":
				jum >=90 ? "��": 
				jum >=80 ? "��":
				jum >=70 ? "��":
				jum >=60 ? "��":
					"��";
		
		System.out.println(grade);
		
		
		
		/** 1�� ������
		 *   - : ����ǥ�� (����)
		 *   ! : ���� (boolean)
		 *   ++,-- : ����(1�� ����, ����) 
		 *    ����ó�� ����  ++���� : ���� ����Ͽ� ������ �Է�
		 *    ����ó�� ����  ����++ : ���� ���� �� ++ ����*/
		
		int x1 = 24;
		boolean bo1 = true;
		System.out.println(-x1);
		System.out.println(!bo1);
		
		//x1 = x1 +1;
		x1++;
		System.out.println(x1);
		System.out.println(++x1);
		System.out.println(x1);
		System.out.println(--x1);
		//System.out.println(x1**);
		//System.out.println(x1//);
		
		int a=5, b = 6, c = 10, d;
		
		d = a++ + ++c - b-- * --a + a++;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		int x6 = 23;
		System.out.println(x6<<2);
		System.out.println(92>>2);
		System.out.println(92>>>2);
		
		System.out.println(-23<<2);
		System.out.println(-92>>2);
		System.out.println(-92>>>2);
		
		
		int aaa = 300;
		byte bbb = (byte)aaa;
		// -128,-127, ~ -1,0,1,2~ 125,126,127
		// 0,1,2~ 125,126,127,-128,-127, ~ -1
		System.out.println(bbb);
		
		System.out.println(14&5);
		System.out.println(14|5);
		System.out.println(14^5);
		//1110
		//0101
		//& : 0100 
		
		int x7 = 10;
		//x7 = x7 + 5;
		//x7 += 5;
		System.out.println(x7 += 5);
		System.out.println(x7 -= 3);
		System.out.println(x7 *= 2);
		System.out.println(x7 /= 3);
		System.out.println(x7 %= 5);
		//System.out.println(x7 += "ǻǻǻǻǻ��");
		String str3 = "ǻǻǻǻǻ��";
		//System.out.println(x7 += str3);
		System.out.println(str3 += x7);
		
		
	}

}
