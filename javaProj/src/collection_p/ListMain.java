package collection_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List vv = new Vector();
		vv = new ArrayList();
		
		vv.add(1);
		vv.add("������");
		vv.add(new int[]{33,44,55});
		vv.add(new Vector());
		vv.add(new Random());
		
		System.out.println(vv);
		
		for (int i = 0; i <vv.size(); i++) {
			System.out.println(vv.get(i));
		}
		
		vv.add(2, "������");
		System.out.println(vv);
		vv.set(3, "����ȭ");
		vv.set(5, "������");
		System.out.println(vv);
		
		vv.remove(4);
		System.out.println(vv);
		
		List ss = new ArrayList(vv.subList(1, 3));
		ss.add("������");
		System.out.println(ss);
		
		System.out.println(vv.contains("����ȫ"));
		System.out.println(vv.indexOf("������"));
		System.out.println(vv);
		//vv.retainAll(ss);
		//vv.removeAll(ss);
		
		vv.remove(0);
		System.out.println(vv);
		
		Collections.sort(vv);
		
		System.out.println(vv);
		
		List t1 = new ArrayList();
		List t2 = new ArrayList();
		List fa = new ArrayList();
		
		t1.add("�����");
		t1.add("������");
		t1.add("����");
		t1.add("�豤��");
		t1.add("������");
		t1.add("�����");
		t1.add("��ȣ��");
		t2.add("��ȣ��");
		t2.add("������");
		t2.add("����ȫ");
		t2.add("�̽���");
		t2.add("�嵿��");
		fa.add("�̺���");
		fa.add("�̽¿�");
		fa.add("������");
		fa.add("�嵿��");
		fa.add("�ڿ���");
		fa.add("ȫ����");
		
		System.out.println("t1:"+t1);
		System.out.println("t2:"+t2);
		System.out.println("fa:"+fa);
		
		List ����õ = new Vector(fa);
		fa.removeAll(t1);
		fa.removeAll(t2);
		
		t1.removeAll(t2);
		t1.removeAll(����õ);
		t2.removeAll(����õ);
		
		
		System.out.println("t1:"+t1);
		System.out.println("t2:"+t2);
		System.out.println("fa:"+fa);

	}

}
