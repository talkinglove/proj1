package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = 
					new FileInputStream("fff/sd.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			System.out.println(ois.readInt());
			System.out.println(ois.readBoolean());
			System.out.println(ois.readDouble());
			System.out.println(ois.readUTF());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			ois.close();
			fis.close();
			
			////�̸�, ��, ��, �� ���� ����� ���Ͽ� �����Ͻÿ�
			/// ó�� ���� ����, ���, ���
			/// ��� ���Ͽ��� ������ ������ ����Ͻÿ�
			
			/// �л� 5������ ó�� ��� ���� ����Ұ�
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
