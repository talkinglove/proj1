package ip_p;


import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;



public class ReportFile {

    static String[] fname = {"tangerine.bmp", "pear.jpg",  "pitch.gif", "melon.png", "mango.txt", "lime.doc", 
			"lime.doc", "papya.hwp", "kiwi.ppt", "Cherry.xls", "strawberry.pptx", "tomato.xlsx",
			"banana.docx", "grape.abc", "apple.ghi"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		
		
			for(int i=0; i<fname.length; i++ ){
				FileOutputStream fos = new FileOutputStream(fname[i]);
	
				System.out.println();
				
			}
			
	

	//String file = new String();
	
	//System.out.println((char)file);
	
	//res = fos1.mkdir();
	
	
	
		}catch(Exception e){
			
			e.printStackTrace();
		}
	
	}


	
		
		
	}

	
	
	/*FileOutputStream fos1 = new FileOutputStream("tangerine.bmp");
	FileOutputStream fos2 = new FileOutputStream("pear.jpg");
	FileOutputStream fos3 = new FileOutputStream("pitch.gif");
	FileOutputStream fos4 = new FileOutputStream("melon.png");
	FileOutputStream fos5 = new FileOutputStream("mango.txt");
	FileOutputStream fos6 = new FileOutputStream("lime.doc");
	FileOutputStream fos7 = new FileOutputStream("papya.hwp");
	FileOutputStream fos8 = new FileOutputStream("kiwi.ppt");
	FileOutputStream fos9 = new FileOutputStream("Cherry.xls");
	FileOutputStream fos10 = new FileOutputStream("strawberry.pptx");
	FileOutputStream fos11 = new FileOutputStream("tomato.xlsx");
	FileOutputStream fos12 = new FileOutputStream("banana.docx");
	FileOutputStream fos13 = new FileOutputStream("grape.abc");
	FileOutputStream fos15 = new FileOutputStream("apple.ghi");*/


