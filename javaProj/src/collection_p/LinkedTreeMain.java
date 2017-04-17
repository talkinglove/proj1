package collection_p;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class AAA{
	int a;
	String b;
	public AAA(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "AAA [a=" + a + ", b=" + b + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AAA other = (AAA) obj;
		if (a != other.a)
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	
	
}


class MyCom implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 1;
	}
}

class MyCom2 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return -1;
	}
}

class MyCom3 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class MyCom4 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int me = (int)o1;
		int you = (int)o2;
		
		System.out.println(you+":"+me);
		
		return me-you;
	}
}
class MyCom5 implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int me = (int)o1;
		int you = (int)o2;
		return you-me;
	}
}

public class LinkedTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [] oo ={23,45,6666, new AAA(10,"�İ���"),
				'a',23,"������","talkinglove",'a',"������", 
				new AAA(10,"�İ���")};
		
		int [] arr = {
				34,43,678,
				76,54,32,
				34,135,34, 11,
				675,32,456};
		
		
		HashSet set1 = new HashSet<>();
		LinkedHashSet set2 = new LinkedHashSet<>();
		TreeSet set3 = new TreeSet();
		TreeSet set4 = new TreeSet(new MyCom());
		TreeSet set5 = new TreeSet(new MyCom2());
		TreeSet set6 = new TreeSet(new MyCom3());
		TreeSet set7 = new TreeSet(new MyCom4());
		TreeSet set8 = new TreeSet(new MyCom5());
		
		for(Object obj:arr)
		{
			set1.add(obj);
			set2.add(obj);
			set3.add(obj);
			set4.add(obj);
			set5.add(obj);
			set6.add(obj);
			set7.add(obj);
			set8.add(obj);
		}
		
		System.out.println("HashSet:"+set1);
		System.out.println("LinkedHashSet:"+set2);
		System.out.println("TreeSet:"+set3);
		System.out.println("TreeSet 1:"+set4);
		System.out.println("TreeSet-1:"+set5);
		System.out.println("TreeSet 0:"+set6);
		System.out.println("TreeSet asc:"+set7);
		System.out.println("TreeSet desc:"+set8);
		
		// �⼮ ����üũ�� �����ϼ���
		
		// �л���ȣ �� Ȯ��
		// ���ʷ� ���� ����� �Խ�
		
		//-----------------------------------------
		
		// �л��̸�_0313152012
		      // ���Ͻú���
		// ������_0313152012
		
		// ���� �Խ��� ��� ������� ����ϼ���
		// �� ���Ͻð��� �Խ��Ͽ��� ��� �ԽǼ������� ����� ��
		
		
		
	}

}
