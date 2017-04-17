import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "½Äadfsasasgasgagagfag";
		String str2 = "¾ó·è¼Ø¤·¤©¤·¤«¤·¤¤¤«¤¾";

		
		try{
		FileOutputStream fos = new FileOutputStream("fff/littleCow.txt");
		
		//fos.write(123);
		
		for(int i=0; i<str1.length(); i++){
			fos.write(str1.charAt(i));
			//fos2.write(str1.charAt(i));
		
		}
		
		for(int i=0; i<str2.length(); i++){
			fos.write(str2.charAt(i));
			//fos2.write(str2.charAt(i));
		
		}
		
		fos.close();
		//fos2.close();
		
	}catch(Exception e){
e.printStackTrace();
}
	}
}
