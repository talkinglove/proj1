package object_p;
class Kanu{
	final String name;
	int cnt;
	
	
	public Kanu(String name, int cnt) {
		super();
		this.name = name;
		this.cnt = cnt;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//name="������ �˰�";
		return name.equals(((Kanu)obj).name);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Kanu(name, cnt);
	}
	
	@Override
	public String toString() {
		return "Kanu [name=" + name + ", cnt=" + cnt + "]";
	}
	
	
}
public class KanuMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Kanu [] arr = {
				new Kanu("�Ƹ޸�ī��", 1),
				new Kanu("������ī��", 2),
				new Kanu("�Ƹ޸�ī��", 1),
				new Kanu("���þƳ�", 3),
				new Kanu("������ī��", 1)
		};
		
		Kanu [] ����õ = new Kanu[0];
		
		
		for(Kanu kk: arr)
		{
			boolean chk = true;
			
			for(Kanu ����: ����õ)
			{
				if(kk.equals(����))
				{
					����.cnt+=kk.cnt;
					chk=false;
				}
			}
			if(chk)
			{
				Kanu [] �ٲ� = new Kanu[����õ.length+1];
				for (int i = 0; i < ����õ.length; i++) {
					�ٲ�[i] = ����õ[i];
				}
				�ٲ�[����õ.length]= (Kanu)kk.clone();
				//�ٲ�[����õ.length]= kk;
				����õ = �ٲ�;
			}
		}
		
		for(Kanu ret: ����õ)
		{
			System.out.println(ret);
		}
		System.out.println("------------------------");
		
		for(Kanu ret: arr)
		{
			System.out.println(ret);
		}
		//arr[0].name ="������ �޷�";
	}

}
