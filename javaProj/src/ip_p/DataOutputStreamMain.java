package ip_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		
		FileOutputStream fos = new FileOutputStream("fff/lofe.abc");
		
		DataOutputStream dos = 
				new DataOutputStream(fos);
		
		dos.close(1234);
		fos.close();
	
		}
	}


}
