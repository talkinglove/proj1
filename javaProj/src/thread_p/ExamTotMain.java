package thread_p;

import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.swing.JOptionPane;

class TotTimer extends Thread
{
	MulTotExamData md;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 20; i >0; i--) {
			try {
				
				sleep(1000);
				
				if(md.chk) break;
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		md.chk=true;
		System.out.println("���� ����");
		md.print();
	}
}

class MulTotExam extends Thread
{
	
	MulTotExamData md;

	@Override
	public void run() {
		
		Iterator<String> it = md.map.keySet().iterator();
		// TODO Auto-generated method stub
		md.cnt=0;
		String key = it.next();
		while(it.hasNext())
		{
			
			
			if(md.chk) break;
			String input = JOptionPane.showInputDialog(key);
			if(md.chk) break;
			if(md.solve(key,input))
				key = it.next();
			
				
			System.out.println("�Է°�:"+input);
		}
		md.chk=true;
	}
}
class MulTotExamData
{
	TotTimer mm = new TotTimer();
	MulTotExam me = new MulTotExam();
	
	LinkedHashMap<String, String> map = new LinkedHashMap<>();
	LinkedHashMap< String,String> ok = new LinkedHashMap<>();
	LinkedHashMap< String,String> nono = new LinkedHashMap<>();
	boolean chk = false;
	int cnt;
	boolean solve(String key,String input)
	{
		boolean chk = false;
		if(map.get(key).equals(input))
		{
			ok.put(cnt+". "+key, map.get(key));
			chk=true;
			cnt++;
		}else if(input.equals("p")){
			nono.put(cnt+". "+key, input+"("+map.get(key)+")");
			chk=true;
			cnt++;
		}
		
		return chk;
	}
	
	void print()
	{
		timeover();
		
		
		System.out.println("����>>>>");
		printModule(ok);
		System.out.println("����>>>>");
		printModule(nono);
	}
	void timeover()
	{
		Iterator<String> it = map.keySet().iterator();
		
		for (int i = 0; i <cnt; i++) {
			it.next();
		}
		
		while(it.hasNext())
		{
			String key = it.next();
			nono.put(cnt+". "+key, "�ð��ʰ�("+map.get(key)+")");
			cnt++;
		}
		
		
	}
	void printModule(LinkedHashMap< String,String> map)
	{
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	void gogo()
	{
		mm.md = this;
		me.md = this;
		
		mm.start();
		me.start();
	}
}

public class ExamTotMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, MulTotExamData> map= new 
				LinkedHashMap<>();
		map.put("����", new MulTotExamData());
		map.put("����", new MulTotExamData());
		map.put("����", new MulTotExamData());
		
		map.get("����").map.put("�������� ����?", "��");
		map.get("����").map.put("��������?", "��");
		map.get("����").map.put("�������� ������?", "��");
		map.get("����").map.put("���ȣ�� ����?", "��");
		map.get("����").map.put("��׶� ������?", "��");
		
		map.get("����").map.put("ysm is", "d");
		map.get("����").map.put("one", "1");
		map.get("����").map.put("two", "2");
		map.get("����").map.put("threee", "3");
		map.get("����").map.put("yun is", "d");
		
		map.get("����").map.put("2+3", "5");
		map.get("����").map.put("4*5", "20");
		map.get("����").map.put("8-5", "3");
		map.get("����").map.put("15/3", "5");
		map.get("����").map.put("9%4", "1");
		
		Iterator<String> it = map.keySet().iterator();
		
		
		String key = it.next();
		
		MulTotExamData nowData = map.get(key);
		nowData.gogo();
		while(it.hasNext())
		{
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(nowData.chk)
			{
				key = it.next();
				
				nowData = map.get(key);
				nowData.gogo();
			}
			
		}
	}

}