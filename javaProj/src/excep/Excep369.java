package excep;

import java.util.Arrays;

public class Excep369 {
	
	static int[] ����õ��������(int i)
	{
		int [] ����õ = new int[0];
		
		for(int k =i ;k>0;k/=10)
		{
			int b = k%10;
			
			int [] buf = new int[����õ.length+1];
			for(int m =0; m<����õ.length;m++)
			{
				buf[m] = ����õ[m];
			}
			buf[����õ.length] = b;
			����õ = buf;
			
		}
		
		return ����õ;
	}
	
	static String ����õ�������(int [] ����õ,  String ����)
	{
		String str ="";
		int cnt=0;
		int i=0;
		//System.out.println(Arrays.toString(����õ));
		for (int j = ����õ.length-1; j >=0 ; j--) {
			i *=10;
			i+=����õ[j];
		}
		
		
		for (int j = 0; j < ����õ.length; j++) {
			
			try{
				int ccc = 1234/(����õ[j]%3);
			}catch(Exception e){
				try {
					int ccc = 1234/(����õ[j]);
					str+=����;
					cnt++;
				} catch (Exception e2) {
					
				}
				
			}
		}
		try {
			int cde = 1234/cnt;
		} catch (Exception e) {
			str+=i;
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 3456; i++) {
			
			System.out.println(i+":"+����õ�������(����õ��������(i),  "¦"));
		}
	}

}
