package threeOOPS;

class SunIn
{
	Device assemble(Goods frame)
	{
		Device ret = new Device();
		
		ret.name = "�º�";
		
		ret.goods= frame;
		
		ret.price = frame.price;
		ret.print();
		return ret;
	}
	
	Device assemble(Goods frame, Mouse mouse)
	{
		Device ret = null;
		if(mouse.type)
		{
			
			ret = new Device();
			ret.name = "��Ʈ��";
			
			ret.goods= frame;
			ret.mouse = mouse;
			ret.price = frame.price+mouse.price;
			ret.print();
		}else{
			System.out.println("���콺 ��!!!!");
		}
		return ret;
	}
	Device assemble(Goods frame, Mouse mouse, Keyboard keyboard)
	{
		Device ret = null;
		
		if(keyboard.option != "���ڽ�")
		{
			System.out.println("Ű���� ����");
			return ret;
		}
		ret = new Device();
		
		ret.name = "����ũž";
		
		ret.goods= frame;
		ret.mouse = mouse;
		ret.keyboard = keyboard;
		ret.price = frame.price+mouse.price+keyboard.price;
		ret.print();
		return ret;
	}
}

class Goods
{
	String name, kind;
	int price;
	
	Goods init(String kind, String name,	int price)
	{
		this.kind = kind;
		this.name = name;
		this.price = price;
		return this;
	}

	public String toString() {
		return "["+kind+ ", " +name + ", " + price + "]";
	}	
}

class Mouse extends Goods{
	boolean type;
	Mouse init2(String name,	int price, boolean type )
	{
		this.type = type;
		init("���콺", name,	price);
		return this;
	}
	
	public String toString2() {
		return toString()+", "+type;
	}
}

class Keyboard extends Goods{
	
	boolean type;
	String option;
	Keyboard init2(String name,	int price, boolean type,String option )
	{
		this.type = type;
		this.option = option;
		init("Ű����", name,	price);
		return this;
	}
	
	public String toString2() {
		return toString()+", "+type+", "+option;
	}
}


class Device
{
	String name;
	Goods goods;
	Mouse mouse;
	Keyboard keyboard;
	
	int price;
	
	
	
	
	void print()
	{
		String str = name+"\t";
		
		switch(name)
		{
			case "����ũž":
				str+=keyboard.toString2()+"\t";
			case "��Ʈ��":
				str+=mouse.toString2()+"\t";
			case "�º�":
				str+=goods.toString();
				
		}
		
		
		str+=price;
		System.out.println(str);
	}
}

public class YameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SunIn jj119 = new SunIn();
		
		Device com = jj119.assemble(new Goods().init("��ü","��е�", 90));
		//com.print();
		com = jj119.assemble(new Goods().init("��ü","����Ʈ��", 20),
				new Mouse().init2("����", 8, false));
		//com.print();
		com = jj119.assemble(
				new Goods().init("��ü","���", 50),
				new Mouse().init2("������", 2, false),
				new Keyboard().init2("ŰŰŰ", 3, false, "���ڽ�"));
		//com.print();
	}

}
