package collection_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		Set set2 = new HashSet();
		Object [] arr = {34,23,1,67,1,49,90,34,34,90,1,1,"1",'1',"�ֿ�"};
		                      //49 �� '1' �� ���� ���Ƶ� �ڷ����� Ʋ�� �ߺ��Ǿ� �Ѵ� �Է� ����
		
		Object [] arr2 = {34,23,1,67,1,49,90,34,34,90,1,1,"1",(int)'1',"�ֿ�"};
							//'1'�� ����ȯ �Ͽ� 49�� ���� �ߺ����� ó���Ǿ�  �ϳ��� �Է�
		
		for(Object oo : arr)
		{
			set.add(oo);
		}
		
		for(Object oo : arr2)
		{
			set2.add(oo);
		}
		
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("set:"+set);
		System.out.println("arr2:"+Arrays.toString(arr2));
		System.out.println("set2:"+set2);
		
		
		System.out.println();
		ArrayList lotto = new ArrayList<>();
		HashSet lotto2 =  new HashSet();
		while(true)
		{
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
			
			if(lotto.size()==7)
				break;
		}
		
		while(true)
		{
			int num = (int)(Math.random()*45)+1;
			lotto2.add(num);
			
			if(lotto2.size()==7)
				break;
		}
		
		System.out.println("lotto:"+lotto);
		System.out.println("lotto2:"+lotto2);
		
		for (int i = 0; i < lotto2.size(); i++) {
		//	System.out.println(lotto2.get(i));
			//get(���ҹ�ȣ) ==> ���Ұ�
		}
		System.out.println("���� For��----------------");
		for (Object oo: lotto2) {
			System.out.println(oo);
			//��밡�� : ���ҹ�ȣ�� ����ϴ� ���� �ƴϱ� ����
		}
		
		
		System.out.println("Iterator----------------");
		Iterator it = lotto2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//// �������� ���弼��
		///  ����� �� >> 1-> 100
		/// ���� �� 5 * 5 ����
		/// ���� ���� �ߺ��� �� ����
		
		Set bingo = new HashSet<>();
		
		while(true)
		{
			int num = (int)(Math.random()*100)+1;
			bingo.add(num);
			
			if(bingo.size()==25)
				break;
		}
		
		it = bingo.iterator();
		
		int nn =0;
		
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
			nn++;
			
			if(nn%5==0)
				System.out.println();
			
		}
	}

}
