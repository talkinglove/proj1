package ip_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import io_p.Exception;

public class BufferdWriterMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		File par = new File("fff/rep");
		if(par.exists())
		{
			System.out.println("파일 있음");
		}
		
		if(par.isDirectory())
		{
			System.out.println("디렉토리");
		}
		
		System.out.println(par.getName());
		System.out.println(par.getPath());

		
		File[] arr = par.listFiles();
		
		String path="fff/rep";
		
				File dirFile = new File(path);
				File []fileList = dirFile.listFiles();
				
		
				for(File tfile : fileList) 
				{
				  if(tfile.isFile()) 
				  {
				    String tPath = tfile.getParent();
				    String tfileName = tfile.getName();
				    System.out.println("파일 이름: "+tfileName);
				    
				    int pos = tfileName.lastIndexOf(".");	
				    
				    if(tfileName.substring(pos+1).equals("def") ||
				       tfileName.substring(pos+1).equals("doc") ||	
				       tfileName.substring(pos+1).equals("docx")||	
				       tfileName.substring(pos+1).equals("ppt")	||
				       tfileName.substring(pos+1).equals("xls")		
				    		)
				    {
			    		System.out.println("확장자: "+tfileName.substring(pos+1)+ "문서폴더로");
				    }
				    else if(tfileName.substring(pos+1).equals("bmp") ||
						       tfileName.substring(pos+1).equals("gif") ||	
						       tfileName.substring(pos+1).equals("jpg")	||	
						       tfileName.substring(pos+1).equals("png")		
						    		)
				    {
			    		System.out.println("확장자: "+tfileName.substring(pos+1)+ "그림폴더로");
				    }
				    
				    else
				    {
			    		System.out.println("확장자: "+tfileName.substring(pos+1)+ "기타폴더로");

				    }
				    
				  }
				}
				
				try {
					FileInputStream fi = 
							new FileInputStream("fff/pic1.jpg");
					
					FileOutputStream fo = 
							new FileOutputStream("fff/pic1-1.jpg");
					
					byte [] buf = new byte[1024];
					
					int data;
					
					while(fi.available()>0)
					{
						data = fi.read(buf);
						
						fo.write(buf, 0, data);
						
						System.out.println(Arrays.toString(buf));
					}
					
					fo.close();
					fi.close();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
				
				
	}
}
				
				
			
		
		/////////////////
		
		