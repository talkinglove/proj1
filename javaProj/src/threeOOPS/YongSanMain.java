package threeOOPS;

class JunJaLand
{
	Computer assemble(Part frame)
	{
		Computer ret = new Computer();
		
		ret.name = "�º�";
		
		ret.parts = new Part []{frame};
		ret.cal();
		return ret;
	}
	
	Computer assemble(Part frame, Part mouse)
	{
		Computer ret = new Computer();
		
		ret.name = "��Ʈ��";
		
		ret.parts = new Part []{frame,mouse};
		ret.cal();
		return ret;
	}
	Computer assemble(Part frame, Part mouse, Part keyboard)
	{
		Computer ret = new Computer();
		
		ret.name = "����ũž";
		
		ret.parts = new Part []{frame,mouse,keyboard};
		
		ret.cal();
		return ret;
	}
}

class Part
{
	String name;
	int price;
	
	Part init(String name,	int price)
	{
		this.name = name;
		this.price = price;
		return this;
	}

	
	public String toString() {
		return "["+name + ", " + price + "]";
	}
	
	
}
class Computer
{
	String name;
	Part [] parts;
	int price;
	
	
	void cal()
	{
		price =0;
		
		for(Part pp: parts)
		{
			price+= pp.price;
		}
	}
	
	void print()
	{
		String str = name+"\t";
		for(Part pp: parts)
		{
			str+= pp.toString()+"\t";
		}
		str+=price;
		System.out.println(str);
	}
}

public class YongSanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JunJaLand jj119 = new JunJaLand();
		
		Computer com = jj119.assemble(new Part().init("��е�", 90));
		com.print();
		com = jj119.assemble(new Part().init("����Ʈ��", 20),
				new Part().init("����", 8));
		com.print();
		com = jj119.assemble(
				new Part().init("���", 50),
				new Part().init("������", 2),
				new Part().init("ŰŰŰ", 3));
		com.print();
	}

}
