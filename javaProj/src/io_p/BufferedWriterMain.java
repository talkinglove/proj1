package io_p;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("fff/bbb.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("������ �޷�\n");
			bw.write("�����徾 ��ó ���� ������");
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
