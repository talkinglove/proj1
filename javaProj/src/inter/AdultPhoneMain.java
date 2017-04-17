package inter;
///���
	//// mp3 - ���, ���߱�
	/// ī�޶� - ���, ����
	/// ��ȭ   - ���, ��ȭ�ϱ�
	/// �ڵ��� - mp3, ī�޶�, ��ȭ
	
	/// ����
	///  ��� �� ����� �ּ���
interface Mp3
{
	void listen();
	void stop();
}
interface Phone
{
	void listen();
	void tel();
}
interface Camera
{
	void photo();
	void view();
}

interface HandPhone extends Mp3, Phone, Camera
{
}

class PhoneData
{
	int listen, tel, photo;

	String name;
	
	
	
	public PhoneData(String name) {
		super();
		this.name = name;
	}



	public String toString() {
		return name+"[listen=" + listen + ", tel=" + tel + ", photo=" + photo + "]";
	}
	
	
}
class AdultPhone implements HandPhone
{
	//String name;
	PhoneData data;
	PhoneData totData;
	
	public AdultPhone(String name,PhoneData totData) {
		super();
		data = new PhoneData(name);
		this.totData = totData;
	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		System.out.println(data.name+" ����");
		data.listen++;
		totData.listen++;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(data.name+" �����");
	}

	@Override
	public void tel() {
		// TODO Auto-generated method stub
		System.out.println(data.name+" ��ȭ�ؿ�");
		data.tel++;
		totData.tel++;
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println(data.name+" ������ ����");
		data.photo++;
		totData.photo+=8;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println(data.name+" ������ ����");
	}
}
public class AdultPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneData totData = new PhoneData("��ü");
		AdultPhone ap = new AdultPhone("���1", totData);
		AdultPhone ap2 = new AdultPhone("���2", totData);
		
		Mp3 mp3 = ap;
		Phone ph = ap2;
		Camera cm = ap;
		
		mp3.listen();
		mp3.stop();
		ph.tel();
		ph.listen();
		cm.photo();
		cm.view();
		
		System.out.println(ap.data.toString());
		System.out.println(ap2.data.toString());
		System.out.println(totData.toString());
	}

}
