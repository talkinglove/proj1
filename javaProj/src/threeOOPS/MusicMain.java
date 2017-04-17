package threeOOPS;

class Music{
    String name;
    String [] music;

    void musiclisten(){
    	System.out.println(name+"�� ����---------------------");
    	for (int i = 0; i < music.length; i++) {
    		System.out.println("�����["+i+"]: "+music[i]);
		}
    	System.out.println(name+" ��� ��---------------------");
    }
    void radiolisten(String freq){
        System.out.println("���� "+freq+" �� ����");
    }
    void recording(String [] files){
    	System.out.println("������ �����ؿ�------------------------");
    	for (int i = 0; i < files.length; i++) {
    		System.out.println("��������["+i+"]:"+files[i]);
		}
    	System.out.println("������ �����ؿ�------------------------");
    }
    void searching(int number){
    	if(0<=number && number<music.length)
    		System.out.println(name+"���� " +music[number]+"�� ã�ƿ�");
    	else
    		System.out.println(name+"���� " +number+"�� ã�� �� �����ϴ�.");
    		
    }
    void deletion(String name){
    	
    	boolean chk = false;
    	for (int i = 0; i < music.length; i++) {
			if(name==music[i])
				chk = true;
		}
    	
    	if(chk)
    	{
    		String [] buf = new String[music.length-1];
    		int cnt=0;
    		for (int i = 0; i < music.length; i++) {
    			if(name!=music[i])
    			{
    				buf[cnt]=music[i];
    				cnt++;
    			}
			}
    		music = buf;
    		System.out.println(name+"������ �����ؿ�");
    	}
    	else
        System.out.println(name+"�� �������� �ʽ��ϴ�.");
    }
}
 
public class MusicMain {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Music MP3_1=new Music();
       Music MP3_2=new Music();
       Music MP3_3=new Music();
       
       MP3_1.name="Twice 1��";
       MP3_1.music=new String []{"TT","���Ƴ���"};
       MP3_2.name="AOA�� �ҳ�ô�";
       MP3_2.music=new String []{"GLB","������","Hoot"};
       MP3_3.name="ȫ����";
       MP3_3.music=new String []{"������ǥ������","����ô"};
    
       MP3_1.musiclisten();
       MP3_1.radiolisten("�Ŀ�FM");
       
       MP3_2.musiclisten();
       MP3_2.recording(new String[]{"�ҹ̻�����","����1","��������1"});
       
       MP3_3.searching(0);
       MP3_2.deletion("������");
       MP3_2.musiclisten();
    }
}