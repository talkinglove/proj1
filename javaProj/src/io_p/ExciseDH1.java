package io_p;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class ExciseDH1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			for(int i='1'; i<='9'; i++)
			{
				bos.write(i);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
