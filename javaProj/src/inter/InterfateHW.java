package inter;

interface build{
    void bulid(String name);
    void repair(String name);
}
interface unit{
    void repair(String name);
    void ride(String name);
}
interface resource{
    void add(String name);
}
interface enemy{
    void attack(String name);
}
 
class BulldImpl implements build{
    String name;
    Data mydata;
    Data totdata;
    BulidList [] bl={new BulidList("Ŀ�ǵ弾��",400,0),
            new BulidList("���丮",200,100),
            new BulidList("��Ÿ��Ʈ",150,100),};
    EnemyList [] el={new EnemyList("���۸�",60),
            new EnemyList("��Ʈ�󸮽�ũ",120),
            new EnemyList("�����",100),};
    
    BulldImpl(String name,Data totdata){
        this.name=name;
        this.totdata=totdata;
        mydata=new Data(name);
    }
    
    boolean workAvi(BulidList bb, String gname)
    {
    	boolean res = false;
    	
    	 if(gname==bb.name){
    		 for(int i =0;i< bb.resource.length;i++)
    		 {
	             if(totdata.resource[i]< bb.resource[i]){
	            	 return false;
	             }else{
	            	 res = true;
	             }
	         }
    	 }
    	return res;
    }
    
    @Override
    public void bulid(String gname) {
        for(int i=0;i<bl.length;i++){
        	if(workAvi(bl[i], gname)){
        		for (int j = 0; j < bl[i].resource.length; j++) {
        			totdata.resource[j]-=bl[i].resource[j];
				}
                    mydata.bulid++;
                    totdata.bulid++;
                    System.out.println(name+"�� "+gname+"�� ����\n���� �̳׶�:"+totdata.resource[0]+" ���� ����:"+totdata.resource[1]);
                    break;
                }else{
                    System.out.println(name+"�� "+gname+"�� �� �����");
                }
            
            }
        }
        
 
    @Override
    public void repair(String gname) {
        System.out.println(name+"�� "+gname+"�� ���Ŀ�");
        mydata.repair++;
        totdata.repair++;
    }
}
class UnitImpl extends BulldImpl implements unit{
 
    
    UnitImpl(String name, Data totdata) {
        super(name, totdata);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    public void ride(String uname) {
        System.out.println(name+"�� "+uname+"�� Ÿ��");
        mydata.ride++;
        totdata.ride++;
    }
}
class resourceImpl extends UnitImpl implements resource{
 
    
    resourceImpl(String name, Data totdata) {
        super(name, totdata);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    public void add(String mname) {
        if(mname.equals("�̳׶�")){
            System.out.println(name+"�� �̳׶��� ĸ�ϴ�");
            totdata.addm();
            mydata.addm++;
            totdata.addm++;
        }else if(mname.equals("����")){
            System.out.println(name+"�� ������ ĸ�ϴ�");
            totdata.addg();
            mydata.addg++;
            totdata.addg++;
        }else System.out.println("???");
    }
}
class EnemyImpl extends resourceImpl implements enemy{
 
 
 
    EnemyImpl(String name, Data totdata) {
        super(name, totdata);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    public void attack(String ename) {
        for(int i=0;i<el.length;i++){
        if(ename==el[i].name){
            el[i].life-=5;
            mydata.attack++;
            totdata.attack++;
            System.out.println(name+"�� ����!\n"+el[i].name+"�� ���� ü��:"+el[i].life);
        }
    }
    }
    
}
 
class Scv extends EnemyImpl{
 
    Scv(String name, Data totdata) {
        super(name, totdata);
        // TODO Auto-generated constructor stub
    }
 
}
 
class BulidList{
    int [] resource;
    String name;
    BulidList(String name,int m,int g){
        this.name=name;
        resource = new int[]{m,g};
    }
}
 
class EnemyList{
    String name;
    int life;
    EnemyList(String name,int life){
        this.name=name;
        this.life=life;
    }
}
 
class Data{
    String name;
    int bulid,repair,attack,addm,addg,ride;
    int [] resource = new int [2];
    
    Data(String name){
        this.name=name;
    }
    
    void addm(){
    	resource[0]+=8;
    }
    
    void addg(){
    	resource[1]+=8;
    }
    
    public String toString(){
    return name+"\n[ "+"bulid:"+bulid+" repair:"+repair+" attack:"+attack+
                " addmineral:"+addm+" addgas:"+addg+" ride:"+ride+" ]";
        
    }
}

class GameME
{
	Data totdata;
    build bb;
    unit uu;
    resource rr;
    enemy ee;
    
    Scv [] scv;
    
    public GameME(String name) {
		// TODO Auto-generated constructor stub
    	totdata=new Data(name);
    	scv=new Scv[]{new Scv("1ȣ",totdata),
                new Scv("2ȣ",totdata),
                new Scv("3ȣ",totdata),
                new Scv("4ȣ",totdata)};
	}
    
    int schResNum(String resource)
    {
    	int rrCnt =0;
    	
    	if(resource =="����")
    		rrCnt=1;
    	else if(resource =="�̳׶�")
    		rrCnt=0;
    	
    	return rrCnt;
    }
    void getResource(int [] scvs, String resource, int limit)
    {
    	aaa:while(true){
	        for(int i=0;i<scvs.length;i++){
	        	
	            rr=scv[scvs[i]];
	            rr.add(resource);
	            if(totdata.resource[schResNum(resource)]>=limit){
	                break aaa;
	            }
	        }
	    }
    }
    
    
    void start()
    {
    	bb=scv[0];
	    bb.bulid("Ŀ�ǵ弾��");
	    bb.bulid("Ŀ�ǵ弾��");
	    getResource(new int[]{0,1,3},"�̳׶�",1000);
	    
	    getResource(new int[]{2,3},"����",500);
	   
	
	    
	    
	    bb=scv[1];
	    bb.bulid("��Ÿ��Ʈ");
	    bb.repair("��Ÿ��Ʈ");
	    
	    bb=scv[3];
	    bb.bulid("���丮");
	    bb.bulid("���丮");
	    
	    uu=scv[2];uu.repair("��ũ");uu.repair("��ũ");
	    for(int i=0;i<3;i++){
	        uu=scv[i];
	        uu.ride("��ũ");
	    }
	    ee=scv[0];ee.attack("���۸�");ee.attack("���۸�");ee.attack("���۸�");
	    ee=scv[2];ee.attack("��Ʈ�󸮽�ũ");ee.attack("�����");
	
	    for(int i=0;i<scv.length;i++){
	        System.out.println(scv[i].mydata);
	    }
	    System.out.println(totdata);
    }
}

 
public class InterfateHW {
    public static void main(String[] args) {
        new GameME("1�� �׶� ").start();
    }
}