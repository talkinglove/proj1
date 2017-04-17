package dynamic;

class DyPar
{
	int a = 10;
	int b = 20;
	String meth_1()
	{
		return "�θ� �޼ҵ�1()";
	}
	String meth_2()
	{
		return "�θ� �޼ҵ�2()";
	}
}
class DyChild1 extends DyPar
{
	int a = 1000;

	int d = 4000;
	String meth_1()
	{
		return "�ڽ�1 �޼ҵ�1():"+d;
	}
	
	String meth_3()
	{
		return "�ڽ�1 �޼ҵ�3()";
	}
	
}

class DyChild2 extends DyPar
{
	int a = 1212;

	int e = 5656;
	String meth_1()
	{
		return "�ڽ�2 �޼ҵ�1():"+e;
	}
	
	String meth_3()
	{
		return "�ڽ�2 �޼ҵ�3()";
	}
	
}

class Madam
{
	int a = 10;
	int b = 20;
	String meth_1()
	{
		return "�θ� �޼ҵ�1()";
	}
	String meth_2()
	{
		return "�θ� �޼ҵ�2()";
	}
}

public class DynmicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DyPar pp = new DyPar();
		DyPar pc = new DyChild1();
		//DyChild1 cp = (DyChild1)new DyPar();
		DyChild1 cc = new DyChild1();
		
		
		System.out.println("�θ� ���-----------------------");
		
		System.out.println( "pp.b:"+pp.b);
		System.out.println( "pc.b:"+pc.b);
		System.out.println( "cc.b:"+cc.b);
		
		System.out.println("pp.m2()"+pp.meth_2());
		System.out.println("pc.m2()"+pc.meth_2());
		System.out.println("cc.m2()"+cc.meth_2());
		
		System.out.println("�ڽ� ���-----------------------");
		//System.out.println( "pp.d:"+pp.d);
		//System.out.println( "pc.d:"+pc.d);
		System.out.println( "cc.d:"+cc.d);
		
		//System.out.println("pp.m3()"+pp.meth_3());
		//System.out.println("pc.m3()"+pc.meth_3());
		System.out.println("cc.m3()"+cc.meth_3());
		
		System.out.println("�������̵� ���-----------------------");
		
		System.out.println( "pp.a:"+pp.a);
		System.out.println( "pc.a:"+pc.a);
		System.out.println( "cc.a:"+cc.a);
		
		System.out.println("pp.m1()"+pp.meth_1());
		System.out.println("pc.m1()"+pc.meth_1());
		System.out.println("cc.m1()"+cc.meth_1());
		
		System.out.println("�������� ��ȯ-----------------------");
		cc.d = 9999;
		System.out.println( "cc.d:"+cc.d);
		DyPar pcc = cc;
		//System.out.println( "pcc.d:"+pcc.d);
		DyChild1 cpcc = (DyChild1)pcc;
		
		Madam mm = new Madam();
		//Madam mcc = (Madam)cc;
		//Madam mpcc = (Madam)pcc;
		System.out.println( "cpcc.d:"+cpcc.d);
		
		//DyChild1 cpp = (DyChild1)pp;
		
		System.out.println(cc instanceof DyChild1);
		System.out.println(cc instanceof DyPar);
		System.out.println(pp instanceof DyChild1);
		System.out.println(pp instanceof DyPar);
		//System.out.println(mm instanceof DyPar);
		
		System.out.println("�ڽ� Ŭ������ �̿��� ������-----------------------");
		DyChild1 cc1 = new DyChild1();
		DyChild2 cc2 = new DyChild2();
		
		System.out.println("cc1.d:"+cc1.d);
		//System.out.println("cc1.e:"+cc1.e);
		//System.out.println("cc2.d:"+cc2.d);
		System.out.println("cc2.e:"+cc2.e);
		
		System.out.println("cc1.m1:"+cc1.meth_1());
		System.out.println("cc2.m1:"+cc2.meth_1());
		
		//DyChild2 c2cc1 = (DyChild2)cc1;
		DyPar ppcc = cc1;
		System.out.println("ppcc.m1:"+ppcc.meth_1());		
		ppcc = cc2;
		System.out.println("ppcc.m1:"+ppcc.meth_1());
		
		System.out.println("������ �迭-----------------------");
		
		DyPar [] arr = {
				cc,
				pc,
				cc1,
				cc2,
				new DyChild1(),
				new DyChild2(),
				new DyPar()
		};
		
		for(DyPar dp : arr)
		{
			System.out.println(dp.meth_1());
		}
		
		
	}

}
