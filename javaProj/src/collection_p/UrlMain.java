package collection_p;

import java.util.Stack;

class Url{
	String now=null;
	
	Stack back = new Stack();
	Stack next = new Stack();
	
	void goUrl(String url)
	{
		System.out.println("--------goUrl("+url+")");
		
		next.clear();
		
		if(now!=null)
			back.push(now);
		
		now =url;
		
		print();
	}
	
	void goBack()
	{
		System.out.println("--------goBack()");
		
		if(!back.isEmpty())
		{
			next.push(now);
			
			now = (String)back.pop();
			print();
		}
		else{
			System.out.println("�ڰ� �����");
		}
		
		
	}
	
	void goNext()
	{
		System.out.println("--------goNext()");
		
		if(!next.isEmpty())
		{
			back.push(now);
			
			now = (String)next.pop();
			print();
		}
		else{
			System.out.println("���� �����");
		}	
	}
	
	void print()
	{
		System.out.println("����:"+now);
		System.out.println("�ڷ�:"+back);
		System.out.println("������:"+next);
	}
}
public class UrlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Url uu = new Url();
		uu.goUrl("������");
		uu.goUrl("���׷�");
		uu.goUrl("����");
		uu.goUrl("�ٿ�");
		
		uu.goBack();
		uu.goBack();
		uu.goBack();
		uu.goBack();
		uu.goBack();
		
		uu.goNext();
		uu.goUrl("����");
	}

}
