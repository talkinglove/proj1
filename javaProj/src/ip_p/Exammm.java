package ip_p;
////�̸�, ��, ��, �� ���� ����� ���Ͽ� �����Ͻÿ�
/// ó�� ���� ����, ���, ���
/// ��� ���Ͽ��� ������ ������ ����Ͻÿ�
/// �л� 5������ ó�� ��� ���� ����Ұ�

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exammm{

	avg =( kor+eng+mat)/3;
	
	
	
// TODO Auto-generated method stub

			
			try {
				FileOutputStream fos = new FileOutputStream("fff/sd.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				
				oos.writeObject(new SerData1("��ī��", 100));
				oos.writeObject(new SerData1("������", 80));
				oos.writeObject(new SerData1("���̸�", 60));

				oos.close();
				fos.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
}
				
}
	
				
				
				
				
				
				
				
				
				//oos.writeObject(new int []{123,456,789});
				
		
	



/*
package ip_p;

//�̸�, ������ �˽������� ���Ͽ� �����Ͻÿ�
//ó������ ����, ���




import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class ObjectStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		
		public SerChild(String str, int cnt, String name) {
			
			super(str, cnt);
			// TODO Auto-generated constructor stub
			this.name = name;
		}

		private static final long serialVersionUID = 5678L;
		@Override
		public String toString() {
			return "SerChild [name=" + name + ", str=" + str + ", cnt=" + cnt + "]";
		}
		
	}

	public class ObjectStreamMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
				FileOutputStream fos = new FileOutputStream("fff/sd.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				
				oos.writeInt(123);
				oos.writeBoolean(true);
				oos.writeDouble(123.456);
				oos.writeUTF("������ �������");
				oos.writeObject(new SerData("��������", 100));
				oos.writeObject(new int []{123,456,789});
				oos.writeObject(new ArrayList<>());
				oos.writeObject(new SerData[]{new SerData("��������", 100)});
				oos.writeObject(new SerChild("��������", 100,"������"));
				
				oos.flush();
				oos.reset();
				
				oos.close();
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
*/
		
		
		
	}

}
