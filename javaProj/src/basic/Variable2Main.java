package basic;

public class Variable2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///�ڷ���
		//1. ����
		byte bb = 127;
		short sh = 32767;
		int ii = 123456;	//1234567.678;
		long ll = 21474836478L;
		
		System.out.println(bb);
		System.out.println(sh);
		System.out.println(ii);
		System.out.println(ll);
		
		//2. �Ǽ�
		float ff = 123.456F;
		double dd = 123.456;
		System.out.println(ff);
		System.out.println(dd);
		
		//3. ����
		char ch = 'a';
		System.out.println(ch);
		
		//4. ���ڿ�
		String str = "���Ǥä���������Ĥþ�";
		System.out.println(str);
		
		//5. ��
		boolean bo = true;
		System.out.println(bo);
		
		ii = bb;
		ii = (int)dd;
		//ii = (int)str;
		
	}

}
