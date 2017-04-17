package oops;
class ClaStatic
{
	int a = 10;
	static int b = 20;
	void meth_1()
	{
		System.out.println(" ClaStatic instance �޼ҵ�_1");
	}
	static void meth_2()
	{
		System.out.println(" ClaStatic static �޼ҵ�_2");
	}
	
	void meth_3()
	{
		System.out.println(" ClaStatic instance �޼ҵ�_3-----");
		meth_1();
		meth_2();
		System.out.println(a);
		System.out.println(b);
		System.out.println("------------------");
	}
	static void meth_4()
	{
		System.out.println(" ClaStatic static �޼ҵ�_4---------");
		//meth_1();
		meth_2();
		//System.out.println(a);
		System.out.println(b);
		System.out.println("------------------");
	}
}
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaStatic.meth_2();
		System.out.println("ClaStatic.b:"+ClaStatic.b);
		ClaStatic cs1 = new ClaStatic();
		ClaStatic cs2 = new ClaStatic();
		
		//System.out.println("ClaStatic.a:"+ClaStatic.a);
		System.out.println("cs1.a:"+cs1.a);
		System.out.println("cs2.a:"+cs2.a);
		cs1.a = 1000;
		System.out.println("cs1.a:"+cs1.a);
		System.out.println("cs2.a:"+cs2.a);
		
		System.out.println("static ����");
		System.out.println("ClaStatic.b:"+ClaStatic.b);
		System.out.println("cs1.b:"+cs1.b);
		System.out.println("cs2.b:"+cs2.b);
		cs1.b = 2000;
		System.out.println("ClaStatic.b:"+ClaStatic.b);
		System.out.println("cs1.b:"+cs1.b);
		System.out.println("cs2.b:"+cs2.b);
		
		System.out.println("instance �޼ҵ�");
		//ClaStatic.meth_1();
		cs1.meth_1();
		cs2.meth_1();
		System.out.println("static �޼ҵ�");
		ClaStatic.meth_2();
		cs1.meth_2();
		cs2.meth_2();
		System.out.println();
		cs1.meth_3();
		cs2.meth_3();
		cs1.meth_4();
		cs2.meth_4();
		ClaStatic.meth_4();
	}

}
