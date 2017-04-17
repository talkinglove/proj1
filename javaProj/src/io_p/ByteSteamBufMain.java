package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteSteamBufMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte [] inArr = {4,-128,-127,-3,-2,-1,0,1,2,3,11,56,76,126,127};
		byte [] outArr;
		byte [] buf = new byte[7];
		int cnt=0;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		
		System.out.println(Arrays.toString(inArr));
		System.out.println(Arrays.toString(buf));
		
		cnt = bis.read(buf, 2,3);
			//param 0:��� ���ڴ�, 
			//param 1:buf�� ���° ����
			//param 2:�������� � ��������
			//ret : ������ ����
		
		System.out.println(Arrays.toString(buf));
		
		System.out.println("cnt:"+cnt);
		System.out.println("bis.available():"+bis.available());
		//available() �����ִ� ����(������ �� �ִ� ����)
		
		bos.write(buf, 3, 2);
		//param 0:��𿡼� �������ڴ�. 
		//param 1:buf�� ���° ����
		//param 2:buf���� � ��������
		
		System.out.println(Arrays.toString(bos.toByteArray()));
		
		
		
		cnt=bis.read(buf);	
			//param : ��𿡼� �������ڴ�. 
			//buf�� 0��° ����
			//buf�� ���̱��� �������� =>7
			//ret : ������ ����
		
		
		bos.write(buf);
		//param 0:��𿡼� �������ڴ�. 
		//0��° ����
		//buf�� ���̱��� �������� => 7
		
		System.out.println(Arrays.toString(bos.toByteArray()));
				
	}

}
