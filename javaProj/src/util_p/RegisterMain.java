package util_p;

import java.util.regex.Pattern;

/*1. ���̵� : �����빮�ڼҹ��� ���� Ư����ȣ ����
2. ���� ÷��-->����,����.�̹��� Ȯ����
�̹���(jpg, jpeg, bmp, png, gif)  --  ��ҹ��� ���о���
3. �����ȣ �˻� - ������ (�ʼ��˻�)*/
public class RegisterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			String [] pp = {".*[a-z].*",".*[A-Z].*",".*[0-9].*",".*[_.].*"};
			String tot = "[a-zA-Z0-9_.]*";
			
			String id = "abA_cd123";
			
			boolean idChk = false;
			if(!Pattern.matches(tot, id))
			{
				idChk = true;
			}else{
				for(String ppp: pp)
				{
					if(!Pattern.matches(ppp, id))
						idChk = true;
				}
			}
			
			if(idChk) throw new Exception("id ����");
			
			String ff = "fefef.jpg";
			
			if(!Pattern.matches(".*\\.(jpg|png|gif|bmp)", ff.toLowerCase()))
				throw new Exception("���� ����");
			
			
			
			String [][] zipStr = {
					{"��","��-��"},
					{"��","��-��"},
					{"��","��-�L"},
					{"��","��-��"},
					{"��","��-�J"},
					{"��","��-��"},
					{"��","��-��"},
					{"��","��-��"},
					{"��","��-��"},
					{"��","��-��"},
					{"��","ī-�i"},
					{"��","Ÿ-�M"},
					{"��","��-��"},
					{"��","��-�R"},
					{"��","��-��"},
					{"��","¥-��"},
					{"��","��-��"},
					{"��","��-��"},
					{"��","��-��"},
			};
			
			String [] qq = {
					"������","�д籸","�����","������",
					"���뱸","�ٴٱ�","���α�"
					
			};
			
			String gu = "����";
			
			String guReg =".*";
			
			for (int i = 0; i < gu.length(); i++) {
				
				for(String [] zip: zipStr)
				{
					if((gu.charAt(i)+"").equals(zip[0]))
						guReg+="["+zip[1]+"]";
				}
			}
			guReg+=".*";
			
			for(String qqq : qq)
			{
				if(Pattern.matches(guReg, qqq))
					System.out.println(qqq);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
