package collection_p;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class AtCom implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String me = (String)o1;
		String you = (String)o2;
		int mm =me.indexOf("_");
		int yy = you.indexOf("_");
		int res =me.substring(0,mm).compareTo(
				you.substring(0,yy));
		
		if(res==0) return 0;
				
		res = me.substring(mm+1).compareTo(
				you.substring(yy+1));
		
		if(res==0) res =1;
		return res;
	}
}
public class AttendMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �л��̸�_0313152012
	      // ���Ͻú���
	// ������_0313152012
	
	// ���� �Խ��� ��� ������� ����ϼ���
	// �� ���Ͻð��� �Խ��Ͽ��� ��� �ԽǼ������� ����� ��
		String [] arr={
				"�ֹ���_085923",
				"���Ѻ�_090712",
				"������_084312",
				"���ȯ_091212",
				"���¿�_101115",
				"��μ�_130000",
				"����õ_110403",
				"������_084613",
				"������_090522",
				"������_130000",
				"����ȫ_084312",
				"�ֹ���_084613",
				"����ȭ_084312"
		};
		
		TreeSet ts = new TreeSet(new AtCom());
		
		for(String st: arr)
			ts.add(st);
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
			
			
	}

}
