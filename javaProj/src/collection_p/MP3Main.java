package collection_p;
//mp3 �뷡��⸦ �����ϼ���
//1. �뷡 ���� :  Ʈ����ȣ, �뷡����, ����
//2. �뷡 ����Ʈ -->next �� �ֱ�
//3. �������� ������, ������, Ʈ����ȣ

import java.util.Stack;
import java.util.regex.Pattern;

class Music{
	String title, singer;
	int tr;
	public Music(int tr, String title, String singer) {
		super();
		this.tr = tr;
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return tr + ". " + title + " (" + singer + ")";
	}
	
	boolean sch(boolean kind, String ppp)
	{
		String txt = title;
		
		if(kind) txt = singer;
		
		return Pattern.matches(".*"+ppp+".*", txt);
	}
}

class MP3
{
	Music now=null;
	
	Stack back = new Stack();
	Stack next = new Stack();
	int tot =0;
	
	void input(String title, String singer)
	{
		next.add(0,new Music(next.size()+1,title, singer));
		
		tot = next.size();
	}
	
	boolean nextModule()
	{
		boolean res = false;
		
		if(!next.isEmpty())
		{
			if(now!=null)
				back.push(now);
			
			now = (Music)next.pop();
			
			res = true;
		}
		
		return res;
	}
	
	boolean backModule()
	{
		boolean res = false;
		
		if(!back.isEmpty())
		{
			if(now!=null)
				next.push(now);
			
			now = (Music)back.pop();
			
			res = true;
		}
		
		return res;
	}
	
	void goNext()
	{
		System.out.println("goNext()>>>>>>>");
		if(nextModule())
			print();
		else
			System.out.println("����� ���� �����ϴ�.");
		
	}
	
	void goBack()
	{
		System.out.println("goBack()>>>>>>>");
		if(backModule())
			print();
		else
			System.out.println("�ڷΰ� ���� �����ϴ�.");
		
	}
	
	void goTr(int tr)
	{
		System.out.println("goTr("+tr+")>>>>>>>");
		
		if(tr>tot || tr<0)
		{
			System.out.println("Ʈ����ȣ Ȯ!");
			return;
		}
		
		goTrModule(tr);
		
		print();
	}
	
	
	void goTrModule(int tr)
	{

		while(true)
		{
			if(now.tr>tr)		backModule();
			else if(now.tr<tr)	nextModule();
				
			if(now.tr==tr)	break;
		}
		
		
	}
	
	boolean schModule(boolean kind, String ppp)
	{
		boolean chk=false;
		while(!next.isEmpty())
		{
			if(now.sch(kind, ppp)){ 
				chk = true;
				break;
			}
			
			nextModule();
		}
		return chk;
	}
	
	
	void sch(boolean kind, String ppp)
	{
		int nowNum = now.tr;
		String txt = "����";
		if(kind) txt ="����";
		System.out.println("sch("+txt+", "+ppp+")>>>>>>>");
		
		boolean chk = schModule(kind, ppp);
		
		if(!chk){
			while(!back.isEmpty())
			{
				backModule();
			}
			chk = schModule(kind, ppp);
		}
		
		
		if(!chk){
			System.out.println("ã���ô� ���� �����ϴ�.");
			goTrModule(nowNum);
		}
		print();
		
	}
	
	void print()
	{
		System.out.println("�����:"+now);
		System.out.println("�ڷ�:"+back);
		System.out.println("������:"+next);
	}
}

public class MP3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3 yoyo = new MP3();
		yoyo.input("�ð��� �޷���", "����ģ��");
		yoyo.input("����� �޷���", "����ģ��");
		yoyo.input("�������� �޷���", "����ģ��");
		yoyo.input("�������� �޷���", "�׸�ģ��");
		yoyo.input("�Ű����� �޷���", "����ģ��");
		yoyo.input("���ڸ��� �޷���", "��������");
		yoyo.input("���繫�Ҹ� �޷���", "�Ѻ��ȥ");
		yoyo.input("���ʸ� �޷���", "��������");
		yoyo.input("���̽��� �޷���", "����ڿ�");
		yoyo.input("�ָ��� �޷���", "�����ؿ�");
		
		yoyo.print();
		
		yoyo.goNext();
		yoyo.goNext();
		yoyo.goNext();
		yoyo.goBack();
		/*yoyo.goBack();
		yoyo.goBack();*/
		yoyo.goTr(5);
		yoyo.goTr(2);
		yoyo.goTr(11);
		yoyo.goTr(-1);
		yoyo.goTr(5);
		
		yoyo.sch(true, "����");
	}

}
