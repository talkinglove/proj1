package threeOOPS;

/*������ �����ϼ���

(���̸�, ��, �а���, �����...) ���� �־� ������ �������ּ���

���� �����ǿ� ���� ���� �����ϼ���

===> 
�������� 1����: �� 100ml, �а��� 100g, ����� 10g
��ī�� 1���� : �� 200ml, �а��� 150g, �ް� ���� 68g,  �Ƹ��и� 78g
�Ļ� 1���� :�� 500ml, �а��� 350g

�� : ���̸�, ����, ����

������ Ŭ�����迭�� �Ұ�*/
class Bread{
	String name;
	int price, kcal;
	public Bread(String name, int price, int kcal) {
		super();
		this.name = name;
		this.price = price;
		this.kcal = kcal;
	}
	void print() {
		String str = name + "\t" + price + "\t" + kcal;
		System.out.println(str);
	}
	
	
}

class Recipe
{
	String name; 
	int water, powder;
	RecSp [] sp;
	public Recipe(String name, int water, int powder, RecSp[] sp) {
		super();
		this.name = name;
		this.water = water;
		this.powder = powder;
		this.sp = sp;
	}
	
	
}
class RecSp
{
	
	public RecSp(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	String name;
	int amount;
}
class Bakery
{
	Recipe [] recArr = {
			new Recipe("��������", 100, 100, new RecSp []{new RecSp("�����", 10)} ),
			new Recipe("��ī��",200, 150, 
					new RecSp []{new RecSp("�ް�", 68),
							new RecSp("�Ƹ��и�", 78)} ),
			new Recipe("�Ļ�",500,350,null)		
		};
	
	
	Bread [] retArr = {new Bread("��������", 1000,245),
			new Bread("��ī��",3000 ,345),
			new Bread("�Ļ�", 500, 567)};
	
	
	
	
	Bread [] makeBBang(String name, int water, int powder, String []sp, int [] amount)
	{
		Bread [] ret = new Bread [0];
		
		Recipe rec = recipeSearch(name);
		
		
		poss : while(true)
		{
			//����� �ִ���////////////////////////////
			if(water < rec.water || powder < rec.powder)
			{
				break poss;
			}
			
			if(rec.sp!=null)
			{
				for(RecSp rs : rec.sp)
				{
					boolean chk = false;
					
					if(sp==null)
						break poss;
					
					for (int i = 0; i < sp.length; i++) {
						if(rs.name ==sp[i])
						{
							if(rs.amount <=amount[i])
							{
								chk = true;
							}
						}
						
					}
					
					if(!chk)
					{
						break poss;
					}
				}
			}
			
			////////////////////////////
			
			
			water -= rec.water;
			powder -= rec.powder;
			
			if(rec.sp!=null)
			{
				for(RecSp rs : rec.sp)
				{
					for (int i = 0; i < sp.length; i++) {
						if(rs.name ==sp[i])
						{
							amount[i]-=rs.amount;
						}		
					}
				}
			}
			
			
			Bread [] buf = new Bread [ret.length+1];
			
			for (int i = 0; i < ret.length; i++) {
				buf[i] = ret[i];
			}
			
			
			for(Bread sample : retArr)
			{
				if(sample.name == name)
					buf[ret.length] = new Bread(name,sample.price,sample.kcal);
				
			}

			ret = buf;
		}
		
		return ret;
	}
	
	Recipe recipeSearch(String name)
	{
		Recipe ret = null;
		
		for(Recipe rec :recArr)
		{
			if(rec.name == name)
				ret = rec;
		}
		
		return ret;
	}
	
	
}
public class BakeryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bakery dddd = new Bakery();
		
		Bread [] bb = dddd.makeBBang("�Ļ�", 2300, 1360, null, null);
		
		for(Bread br :bb)
			br.print();
		
		bb = dddd.makeBBang("��ī��", 2300, 1360, new String []{"�ް�","�Ҽ���","�Ƹ��и�"}, new int[]{1000,1234,2000});
		
		for(Bread br :bb)
			br.print();
	}
	

}
