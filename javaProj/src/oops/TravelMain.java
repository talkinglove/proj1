package oops;

/*// �λ꿩�� - �ؿ��, ���ȸ�, �ڰ�ġ����
     300        20     10        10
//��õ���� - �Ҿ簭, �߰���, ��õȣ, 
     200        10    20      30
//���� ���� - ������, ������, ������, ������, ��������, ���� ���, ������
     200         10   10         5      15       10       20         10
//���� ���� - ������, ������, ������, ������, ������, ��������
                 5      7       5      10      20      15

//���� ���� ---> �ؿ��,     ��õȣ,       ������,  ������,       ������
                 20 + 300 +   30 +   200 +  5  +    15 +   200 +  7  
*/

class CityLogic{
	City [] citys;
	int currCity;//���絵��
	Place currPlace;//���翩����
	
	void init(City [] citys)
	{
		this.citys = citys;
		currCity = 0;
		currPlace = null;
	}
	
	void travel(String place)
	{
		for(int i = currCity ; i<citys.length;i++)
		{
			for (int j = 0; j < citys[i].places.length; j++) {
				if(place==citys[i].places[j].name)
				{
					for (int k = currCity; k < i; k++) {
						City.totDist+=citys[k].cityDist;
					}
					City.totDist+=citys[i].places[j].dist;
					currCity = i;
					currPlace = citys[i].places[j];
				}
			}
		}
		
	}
	
	void print()
	{
		System.out.println(City.totDist);
	}
	
	
}

class City{
	
	static int totDist=0;
	
	Place [] places;
	String cityName;
	int cityDist;
	
	City init(String cityName,	int cityDist, Place [] places)
	{
		this.cityName = cityName;
		this.cityDist=cityDist;
		this.places = places;
		
		return this;
	}
}
class Place{
	String name;
	int dist;
	
	Place init(String name,	int dist)
	{
		this.name = name;
		this.dist=dist;
		
		return this;
	}
}

public class TravelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CityLogic logic = new CityLogic();
		logic.init(new City []{
				new City().init(
					"�λ�", 
					300, 
					new Place [] {
						new Place().init("�ؿ��", 20),
						new Place().init("���ȸ�", 10),
						new Place().init("�ڰ�ġ", 10)}),
				new City().init(
					"��õ", 
					200, 
					new Place [] {
						new Place().init("�Ҿ簭", 10),
						new Place().init("�߰���", 20),
						new Place().init("��õȣ", 30)}),
				
				 
				new City().init(
						"����", 
						200, 
						new Place [] {
							new Place().init("������", 10),
							new Place().init("������", 10),
							new Place().init("������", 5),
							new Place().init("������", 15),
							new Place().init("��������", 10),
							new Place().init("���� ���", 20),
							new Place().init("������", 30)}),
				

				new City().init(
						"����", 
						0, 
						new Place [] {
							new Place().init("������", 5),
							new Place().init("������", 7),
							new Place().init("������", 5),
							new Place().init("������", 10),
							new Place().init("������", 20),
							new Place().init("��������", 15)})
			}
		
		
		 );
		     
		logic.travel("�ؿ��");
		logic.travel("��õȣ");
		logic.travel("������");
		logic.travel("������");
		logic.travel("������");
		
		logic.print();
	}

}
