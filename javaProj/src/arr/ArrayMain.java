package arr;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		int [] arr =new int[] {100,3,20,50};	//���� �� �ʱ�ȭ(�����Ҵ�)
		
		int [] arr2;				//����
		
		int [] arr3 = new int[5];	//���� �� �����Ҵ�
						//new�� ���ϰ��� �޸� �ּ�
		int [] arr4;
		
		int [] arr5;
		
		//arr4 = {34,45,56};   �ʱ�ȭ ����� ���� �ÿ��� �����ϴ�.
		
		arr4 = new int[3];	
		//�����Ҵ��� new �� ���� �޸𸮿� ������ ���� �ּҸ� ���� �ޱ⿡ �����ϴ�.
		
		arr5 = new int[]{33,44,55,66,44,32,1234};
		//1. �����Ҵ� 2. ���ҹ��   3. �޸� �ּ� ����
		
		System.out.println(arr);//�迭�̸��� �ּҸ� ������ �ִ�.
		//System.out.println(arr2);
		
		arr[1] = 3333;	//�迭 ������ ����
		
		System.out.println(arr[0]);//�迭 ���� ȣ��
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		//System.out.println(arr[4]);
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		System.out.println(arr5[2]);
		
		System.out.println(arr.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		System.out.println(arr5.length);
		
		System.out.println("arr:"+arr);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		System.out.println("arr5:"+arr5);
		System.out.println(arr5[2]);
		arr5 = arr;
		System.out.println(arr5[2]);
		System.out.println("arr:"+arr);
		System.out.println("arr3:"+arr3);
		System.out.println("arr4:"+arr4);
		System.out.println("arr5:"+arr5);
		
		
	}

}
