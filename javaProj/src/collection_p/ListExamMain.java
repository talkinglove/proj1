package collection_p;

import java.util.ArrayList;
import java.util.List;

class Stud{
	String name, gender, res;
	ArrayList jum = new ArrayList();
	int sum, avg, rank, ban;
	
	Stud(int ban,String name, int kor,int eng, int mat, int lol)
	{
		this(ban, name, kor, eng, mat);
		jum.add(lol);
		cal();
	}
	
	Stud(int ban, String name, int kor,int eng, int mat)
	{
		this.ban = ban;
		this.name = name;
		jum.add(kor);
		jum.add(eng);
		jum.add(mat);
		cal();
	}
	
	void cal()
	{
		gender = new String[]{"����","����"}[jum.size()-3];
		
		sum =0;
		
		for (int i = 0; i < jum.size(); i++) {
			sum += (int)(jum.get(i));
		}
		
		avg = sum/jum.size();
		
		res = "���հ�";
		if(avg>=70) res="�հ�";
	}

	@Override
	public String toString() {
		return ban  + "\t" +name + "\t" + gender +  "\t" + jum + "\t" + sum + "\t" + avg
				+ "\t" + rank + "\t" + res;
	}
	
	
}
public class ListExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List input = new ArrayList();
		
		input.add(new Stud(2,"������",88,89,87,74 ));
		input.add(new Stud(3,"���ȣ",78,87,65,54 ));
		input.add(new Stud(1,"�ֹ���", 43,32,21 ));
		input.add(new Stud(2,"���Ѻ�",34,56,78 ));
		input.add(new Stud(3,"������", 89,90,98));
		input.add(new Stud(2,"����ȫ", 87,76,65,54));
		input.add(new Stud(1,"������",99,97,96));
		input.add(new Stud(2,"������", 12,23,34,45));
		
		System.out.println("������ >>>>>>>>>>");
		int maxBan=0;
		
		for (Object oo : input) {//�� �л��� �޾ƿ�
			System.out.println(oo);
			Stud st = (Stud)oo;//Object -> �л� ����ȯ
			if(maxBan <st.ban) maxBan =st.ban; //�ִ���� �˾Ƴ�->3
		}
		
		/*���� ����
		
		      	0 - 1�� ArrayList 	������
		      						�ֹ���
		output  1 - 2�� ArrayList	������
									����ȫ
									���Ѻ�
									������
				2 - 3�� ArrayList	������
									���ȣ
				*/
		List output = new ArrayList();//��¿� ����Ʈ ����
		//output
		
		
		for (int i = 0; i < maxBan; i++) {	//�ݺ� ����Ʈ ����
			output.add(new ArrayList());
		}
		/*���� ����
		
		      	0 - 1�� ArrayList 
		output  1 - 2�� ArrayList
				2 - 3�� ArrayList
		*/
		
		
		///�� �л��� �ڽ��� �� ����Ʈ�� �ֱ�
		for (Object oo : input) {//���л� ��������
			Stud st = (Stud)oo;	//����ȯ
			int meBan = st.ban-1;	//����-1  (0,1,2)
	      	/*		0 - 1�� ArrayList 
			output  1 - 2�� ArrayList
					2 - 3�� ArrayList
					
		meBan�� �̿��Ͽ�
			output ���� ���ݿ� �ش��ϴ� ArrayList�� �������� ����
					*/
			Object ob = output.get(meBan);	
					//���� ����Ʈ ������ ����� Object;
			
			ArrayList meBanList = (ArrayList)ob;
				//�� ����ȯ
			
			meBanList.add(st);	//������ ����Ʈ�� ���� �л��� �߰�
			
			//((ArrayList)output.get(st.ban-1)).add(st);
		}
		
		for (Object arr : output) {
			
			for(Object oo : (ArrayList)arr)
			{
				Stud me = (Stud)oo;
				me.rank=1;
				for(Object oo2 : (ArrayList)arr)
				{
					Stud com = (Stud)oo2;
					
					if(com.avg>me.avg)
						me.rank++;
				}
			}
		}
		
		
		
		
		System.out.println("���>>>>>");
		for (int i = 0; i < output.size(); i++) {
			System.out.println(i+1+" ��>>>");
			
			for (int j = 1; j <= ((ArrayList)output.get(i)).size(); j++) {
				for(Object oo : (ArrayList)output.get(i))
				{
					if(((Stud)oo).rank==j)
						System.out.println(oo);
				}
			}
			
			
		}
		
		
		
		
	}

}
