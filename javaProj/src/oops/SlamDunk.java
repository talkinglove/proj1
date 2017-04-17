package oops;
class SlamPlayer
{
	String name, pos;
	int jum;
	
	void init (String name, String pos,	int jum)
	{
		this.name = name;
		this.pos = pos;
		this.jum = jum;
	}
	
	void print()
	{
		String str = name+"\t"+pos+"\t"+jum;
		System.out.println(str);
		
	}
	
	
}
class SlamTeam
{
	String name;
	SlamPlayer [] players = new SlamPlayer [0];
	
	void add (String name, String pos,	int jum )
	{
		SlamPlayer [] buf = new SlamPlayer[players.length+1];
		
		for (int i = 0; i < players.length; i++) {
			buf[i] = players[i];
		}
		buf[players.length] = new SlamPlayer();
		
		buf[players.length].init(name, pos, jum);
		
		players = buf;
		
		
	}
}

class BestTeam
{
	
	SlamTeam bestPlayers(SlamTeam [] teams)
	{
		String [] pos = {"c","pf","sf","pg","sg"};
		
		SlamTeam res = new SlamTeam();
		
				
		for (int i = 0; i < pos.length; i++) {
			res.add("", pos[i],0);
			for(SlamTeam tt: teams)
			{
				for (int j = 0; j < tt.players.length; j++) {
					
					if(pos[i]==tt.players[j].pos 
							&& res.players[i].jum <tt.players[j].jum )
					{
						res.players[i] = tt.players[j];
					}
					
				}
			}
		}
		
		return res;
		
			
	}
	
	
	
	
}
public class SlamDunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		SlamTeam bs = new SlamTeam();
		bs.name = "�ϻ�";
		bs.add("äġ��", "c", 99);
		bs.add("���븸", "cg", 77);
		bs.add("���¼�", "pg", 88);
		bs.add("����ȣ", "pf", 88);
		bs.add("���¿�", "sf", 94);
		
		SlamTeam nn = new SlamTeam();
		nn.name = "�ɳ�";
		nn.add("������", "c", 91);
		nn.add("������", "pf", 99);
		nn.add("����ȯ", "pg", 73);
		nn.add("Ȳ�»�", "pf", 77);
		nn.add("�ϻ���", "sg", 30);
		
		SlamTeam hn = new SlamTeam();
		hn.name = "�س�";
		hn.add("����ȯ", "pg",98);
		hn.add("���ؼ�", "sg",97);
		hn.add("��ȣ��", "sf",87);
		hn.add("������", "sg",91);
		hn.add("��α�", "c",84);
		
		SlamTeam bp = new BestTeam().bestPlayers(
				new SlamTeam[]{bs, nn, hn});
		
		for(SlamPlayer sp : bp.players)
		{
			sp.print();
		}
	}

}
