package object_p;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "������ õ��";
		String str2 = "������ õ��";
		String str3 = new String("������ õ��");
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str1.toString());
		System.out.println(str2);
		System.out.println(str2.hashCode());
		System.out.println(str2.toString());
		System.out.println("������ õ��");
		System.out.println("������ õ��".hashCode());
		System.out.println("������ õ��".toString());
		System.out.println(str3);
		System.out.println(str3.hashCode());
		System.out.println(str3.toString());
		
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		System.out.println("������ õ��".getClass());
		
		System.out.println(str1=="������ õ��");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3=="������ õ��");
		
		System.out.println("---------------------");
		System.out.println(str1.equals("������ õ��"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals("������ õ��"));
		System.out.println(str1.length());
		
	}

}
