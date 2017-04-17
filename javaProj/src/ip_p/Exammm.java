package ip_p;
////이름, 국, 영, 수 시험 결과를 파일에 저장하시오
/// 처리 내용 총점, 평균, 등급
/// 결과 파일에서 내용을 가져와 출력하시오
/// 학생 5명으로 처리 등수 별로 출력할것

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exammm{

	avg =( kor+eng+mat)/3;
	
	
	
// TODO Auto-generated method stub

			
			try {
				FileOutputStream fos = new FileOutputStream("fff/sd.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				
				oos.writeObject(new SerData1("피카츄", 100));
				oos.writeObject(new SerData1("라이츄", 80));
				oos.writeObject(new SerData1("파이리", 60));

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

//이름, 국영수 ㅛ시험결과를 파일에 저장하시오
//처리내용 총점, 평균




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
				oos.writeUTF("윤성문 일찍오자");
				oos.writeObject(new SerData("추주추주", 100));
				oos.writeObject(new int []{123,456,789});
				oos.writeObject(new ArrayList<>());
				oos.writeObject(new SerData[]{new SerData("추주추주", 100)});
				oos.writeObject(new SerChild("추주추주", 100,"추주헌"));
				
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
