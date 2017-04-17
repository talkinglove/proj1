package threeOOPS;

import java.util.Arrays;

class Food{
	String name,main;
	String [] mat;
	int price;
	public Food(String name, String main, String[] mat, int price) {
		super();
		this.name = name;
		this.main = main;
		this.mat = mat;
		this.price = price;
	}
	void print() {
		String str="Food [name=" + name + ", main=" + main + ", mat=" + Arrays.toString(mat) + ", price=" + price + "]";
		System.out.println(str);
	}	
}

class FoodSet{
	String name;
	Food [] menu;
	
	int price;

	public FoodSet(String name,Food[] menu) {
		super();
		this.name = name;
		this.menu = menu;
		cal();
	}
	void cal()
	{
		price = 0;
		for(Food mm: menu)
		{
			price+=mm.price*0.9;
		}
	}
	void print()
	{
		System.out.println("set�޴�:"+name+"["+price+"]---------------");
		for(Food mm: menu)
		{
			mm.print();
		}
		
	}
	
	
}
class SchoolFood
{
	String name;
	
	Food [] rec;
	
	FoodSet [] sets;
	
	
	Food cooking(String main)
	{
		Food ret = null;
		
		for(Food ff: rec)
		{
			if(ff.name == main)
			{
				return ff;
			}
		}
		System.out.println("�� �޴��� ���� �޴��Դϴ�.");
		return ret;
	}
	
	FoodSet cookingSet(String name)
	{
		for(FoodSet ss : sets)
		{
			if(name==ss.name)
				return ss;
		}
		return null;
	}
	
	Food cooking(String main, String sub1)
	{
		Food ret = null;
		
		Food [] bufadqd = mainChk(main);
		
		if(bufadqd.length==0)
		{
			System.out.println("�� �޴��� ���� �޴��Դϴ�.");
			return null;
		}
		ret = subChk(bufadqd, new String []{sub1});
		if(null==ret)
		{
			System.out.println("�� �޴��� ���� �޴��Դϴ�.");
		}
		
		
		return ret;
	}
	
	Food cooking(String main, String sub1, String sub2)
	{
		Food ret = null;
		
		Food [] bufadqd = mainChk(main);
		
		if(bufadqd.length==0)
		{
			System.out.println("�� �޴��� ���� �޴��Դϴ�.");
			return null;
		}
		ret = subChk(bufadqd, new String []{sub1, sub2});
		if(null==ret)
		{
			System.out.println("�� �޴��� ���� �޴��Դϴ�.");
		}
		
		
		return ret;
	}
	
	
	
	Food subChk(Food [] arr, String [] sub)
	{
		Food ret = null;
		
		for(Food ff: arr)
		{
			if(ff.mat!=null)
			{
				if(ff.mat.length == sub.length)
				{
					int cnt=0;
					for(String ss: sub)
					{
						for(String mm : ff.mat)
						{
							if(mm == ss)
								cnt++;
						}
					}
					if(cnt== sub.length)
					{
						ret = ff;
					}
					
				}
			}
		}
		
		return ret;
	}
	
	Food [] mainChk(String main)
	{
		Food [] ret = new Food [0];
		//for(Food ff: rec)
		for(int ff =0;ff< rec.length;ff++)
		{
			if(rec[ff].main == main)
			{
				Food [] ����õ = new Food [ret.length+1];
				for (int i = 0; i < ret.length; i++) {
					����õ[i]=ret[i];
				}
				����õ[ret.length]=rec[ff];
				ret = ����õ;
			}
		}
		return ret;
	}
}
////�н����� �����ϼ���

/// ������ �ֹ��ϼ���
// �޴� : ������, ����, ġ�����
//      ���, �����, ġ����, ���ζ��
///-------------------------------------
//��Ʈ�޴��� �ֹ��ϼ���
/// �������� �߻��� ��
/// �����ֹ��� ������ 3�� �̻��� ��� ���� �޴� ������
public class SchoolFoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolFood sf = new SchoolFood();
		sf.rec =new Food[] {
				new Food("������","������",null, 3000),
				new Food("����", "������",new String[]{"���"}, 4500),
				new Food("ġ�����","������", new String[]{"ġ��"}, 3500),
				new Food("ġ�����","������", new String[]{"���","ġ��"}, 5500),
				new Food("���", "���",null, 2500),
				new Food("ġ����","���", new String[]{"ġ��"}, 3000),
				new Food("�����", "���",new String[]{"��"}, 3500),
				new Food("ġ����", "���",new String[]{"��","ġ��"}, 4000),
				new Food("���ζ��", "���", new String[]{"����"}, 3500),
				new Food("���", "���",null, 1500),
				new Food("��ġ���", "���",new String[]{"��ġ"}, 1500),
				new Food("���������", "���",new String[]{"������"}, 1500),
				new Food("�����", "���",new String[]{"��ġ","ġ��"}, 1500),
				
				
			};
		
		sf.sets = new FoodSet []{
				new FoodSet("����",new Food[]{sf.rec[0], sf.rec[4]}),
				new FoodSet("���",new Food[]{sf.rec[1], sf.rec[6]}),
				new FoodSet("���",new Food[]{sf.rec[0], sf.rec[4],sf.rec[9]}),
				new FoodSet("����",new Food[]{sf.rec[2], sf.rec[7],sf.rec[12]})
		};;
		sf.cooking("���").print();
		sf.cooking("���","��").print();
		sf.cooking("���","ġ��","��").print();
		sf.cookingSet("����").print();
		sf.cookingSet("���").print();
	}

}
