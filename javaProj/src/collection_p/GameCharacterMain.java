package collection_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

class Character
{
	String name, kind;
	LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
	public Character(String name, String kind, int level, int val, int freq) {
		super();
		this.name = name;
		this.kind = kind;
		map.put("����", level);
		map.put("��ġ", val);
		map.put("��", freq);
	}
	@Override
	public String toString() {
		return name + "\t" + kind + "\t" + map;
	}
	
}

class CharCom implements Comparator<Character>
{
	String kind;

	public CharCom(String kind) {
		super();
		this.kind = kind;
	}
	@Override
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		
		int res = o2.map.get(kind)-o1.map.get(kind);
		if(res==0) res=1;
		return res;
	}
}
public class GameCharacterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> data = new ArrayList<>();
		
		data.add(new Character("Ƽ��, ", "����", 10, 30, 30));
        data.add(new Character("������", "�Ǵ�", 20, 40, 80));
        data.add(new Character("Ʈ��", "����", 30, 50, 90));
        data.add(new Character("������", "�Ǵ�", 40, 70,66));
        data.add(new Character("�ҳ�", "��ũ", 50, 80, 40));
        data.add(new Character("�𸣰���", "�Ǵ�", 60, 30, 65));
        data.add(new Character("ī����", "����", 70, 20, 12));
        data.add(new Character("��", "��ũ", 80, 60, 54));
        data.add(new Character("�Ƹ�", "�Ǵ�", 90, 90, 23));
        data.add(new Character("ī����", "����", 22, 10, 87));
        data.add(new Character("Ų��", "��ũ", 28, 10, 67));
        data.add(new Character("����ũ��ũ", "��ũ", 64, 10, 46));
        data.add(new Character("�����Ƴ�", "����", 99, 10, 78));
        data.add(new Character("�ڱ׸�", "����", 55, 10, 100));
        data.add(new Character("����õ", "����", 66, 45, 89));
        data.add(new Character("������", "����", 87, 24, 78));
        data.add(new Character("������", "����", 33, 65, 67));
        data.add(new Character("������", "��ũ", 11, 23, 40));
        data.add(new Character("���ȯ", "����", 5, 12, 30));
        
        String kind = "��";
        
        Iterator<Character> dit = data.iterator();
        TreeMap<String, TreeSet<Character>> map = new TreeMap<>();
        while(dit.hasNext())
        {
        	Character ch = dit.next();
        	
        	TreeSet<Character> nowSS = map.get(ch.kind);
        	
        	if(nowSS==null)
        		map.put(ch.kind, nowSS = new TreeSet<>(new CharCom(kind)));
        		
        	nowSS.add(ch);
        }
        
        Iterator<String> mit = map.keySet().iterator();
        
        while(mit.hasNext())
        {
        	String key = mit.next();
        	System.out.println(key+">>>>>>");
        	
        	Iterator<Character>sit = map.get(key).iterator();
        	
        	while(sit.hasNext())
        	{
        		System.out.println(sit.next());
        	}
        	
        }
	}

}
