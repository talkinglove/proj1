package ip_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class EEEEE {


	  static void mk_dir(String path)
	  {
	    File f_ex = new File(path);
	    
	    if(!f_ex.exists())
	      f_ex.mkdir();  //디렉토리 생성
	  }
	  static void dir_kind(File f) throws IOException
	  {
	    
	    
	    
	    
	    String [] dir = {"img","doc","etc"};
	    FileOutputStream fos=null;
	    FileInputStream fis;
	    
	    HashSet <String>[] set_ext = new HashSet[2];
	    set_ext[0]=new HashSet<String>();
	    set_ext[0].add("bmp");
	    set_ext[0].add("jpg");
	    set_ext[0].add("gif");
	    set_ext[0].add("png");
	    set_ext[1]=new HashSet<String>();
	    set_ext[1].add("txt");
	    set_ext[1].add("doc");
	    set_ext[1].add("ppt");
	    set_ext[1].add("xls");

	    File [] arr = f.listFiles();
	    for(int i=0;i<arr.length;i++)
	    {
	      if(arr[i].isDirectory())
	        dir_kind(arr[i]);
	      
	      else if(arr[i].isFile())
	      {
	        String fname = arr[i].getName();
	        
	        fis = new FileInputStream(arr[i]);
	        
	        String ext = fname.substring(fname.lastIndexOf(".")+1).toLowerCase();
	        boolean chk=false;
	        
	        String path="kk";
	        mk_dir(path);
	        
	        for(int j=0;j<set_ext.length;j++)
	        {  
	          if(set_ext[j].contains(ext))
	          {
	            chk=true;
	            path+="/"+dir[j];
	            mk_dir(path);
	          }          
	        }
	        if(!chk)
	        {
	          path+="/"+dir[dir.length-1];
	          mk_dir(path);
	        }
	        
	        File save_f = new File(path+"/"+fname);
	        String new_name = fname.substring(0,fname.lastIndexOf("."));
	        String new_ext = fname.substring(fname.lastIndexOf("."));
	        
	        int no=0;
	        
	        while(save_f.exists())
	        {
	          no++;
	          fname=new_name+"_"+no+new_ext;
	          save_f = new File(path+"/"+fname);
	          
	          
	        }
	        
	        fos= new FileOutputStream(path+"/"+fname);  //확장자 별 저장될 파일 경로
	        int data=0;
	        
	        while((data=fis.read())!=-1)
	          fos.write(data);
	        fis.close();
	        fos.close();
	      }      
	    }
	  }
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		  File f = new File("img");
		    
		    dir_kind(f);
		    
		  
	}

}
