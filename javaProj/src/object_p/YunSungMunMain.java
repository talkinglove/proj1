package object_p;

public class YunSungMunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="�������� Ű�� Ŀ�� AbcD eF Java ���� 1234";
		  //      0 12 345-----------------------> 31
		String email ="aaa_bbb@abc.co.kr";
		
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.charAt(5));
		char ch = a.charAt(5);
		System.out.println(a.substring(5));
		System.out.println(a.substring(5,12));
		
		String [] arr = email.split("@");
		
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		String [] domain = arr[1].split("[.]");
		
		for(String doArr : domain)
		{
			System.out.println(doArr);
		}
		
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("a",21));
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.lastIndexOf("a",21));
		
		String ff = "aaa.bbb.ccc.ddd.txt";
		
		System.out.println(
				ff.substring(
				ff.lastIndexOf(".")+1));
		
		System.out.println(a.contains("j"));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		//�������� Ű�� Ŀ�� Abcd Ef Java ���� 1234
		
		String [] arr2 = a.toLowerCase().split(" ");
		
		String ret="";
		for (int i = 0; i < arr2.length; i++) {
			ret+=arr2[i].substring(0,1).toUpperCase()+
			//ret+=(char)(arr2[i].charAt(0)-('a'-'A'))+
					arr2[i].substring(1);
			
			if(arr2.length-1>i) ret+=" ";
		}
		
		System.out.println(ret);
		
		System.out.println(a.replaceAll("a", "����"));
		
		char [] chArr = a.toCharArray();
		
		for(char cc: chArr)
		{
			System.out.println(cc);
		}
		
		String aa = new String(chArr);
		System.out.println(aa);
		
		String sss = "   �� �� ��   ��    ";
		
		System.out.println(sss.length());
		System.out.println(sss.trim());
		System.out.println(sss.trim().length());
		System.out.println(ff+"���� ��?");
		System.out.println(ff.concat("���� ��?") );
		
	}
	

}
