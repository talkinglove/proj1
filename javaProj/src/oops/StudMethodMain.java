package oops;

import java.util.Scanner;

class StudData{
	int no, ban, sum, avg, gender;
	String name, tel;
	int [] jum, rank, sort;
	
	void init(String name, int [] stu, int cnt)
	{
		ban = stu[0];
		this.name = name;
		jum = new int [stu.length-1]; 
		
		for (int j = 0; j < jum.length; j++) {
			jum[j]=stu[j+1];
		}
		rank = new int[cnt];
		sort = new int[cnt];
		cal();
	}
	
	
	void cal()
	{
		sum =0;
		for(int jj : jum)
		{
			sum += jj;
		}
		avg = sum/jum.length;
	
	}
	
	void rankCal(StudData [] arr, int [][] banCnt)
	{
		///����ʱ�ȭ
		for (int j = 0; j < rank.length; j++) {
			rank[j]=1;
		}
		
		
		/// ���� �� �ʱ�ȭ
		for (int j = 1; j < ban; j++) {
			for (int k = 0; k < banCnt[j].length; k++) {
				sort[2]+= banCnt[j][k];
				
			}
			sort[4] =sort[2]; 
		}
		
		/// ����(����)�ʱ�ȭ
		if(gender==1) {
			for (int j = 1; j < banCnt.length; j++) {
				sort[3]+=banCnt[j][0];
				
			}
			sort[4]+= banCnt[ban][0];
			
		} //���ڶ�� �ʱⰪ �����ο���
		
		
		
		for (int j = 0; j < arr.length; j++) {
			
			if(avg<arr[j].avg)
			{
				
				rank[0]++;
				
				sort[1]++;
				rank[1]++;
				
				if(gender==arr[j].gender)//������ ���ٸ�
				{
					rank[3]++;
					sort[3]++;
				}
				
				if(ban==arr[j].ban)//���� ���ٸ�
				{
					rank[2]++;
					sort[2]++;
					if(gender==arr[j].gender)//������ ���ٸ�
					{
						rank[4]++;
						sort[4]++;
					}
				}
			}
			
		}
	}
	
	
	
	void rankCal2(StudLogic sl)
	{
		///����ʱ�ȭ
		for (int j = 0; j < rank.length; j++) {
			rank[j]=1;
		}
		
		
		/// ���� �� �ʱ�ȭ
		for (int j = 1; j < ban; j++) {
			for (int k = 0; k < sl.banCnt[j].length; k++) {
				sort[2]+= sl.banCnt[j][k];
				
			}
			sort[4] =sort[2]; 
		}
		
		/// ����(����)�ʱ�ȭ
		if(gender==1) {
			for (int j = 1; j < sl.banCnt.length; j++) {
				sort[3]+=sl.banCnt[j][0];
				
			}
			sort[4]+= sl.banCnt[ban][0];
			
		} //���ڶ�� �ʱⰪ �����ο���
		
		
		
		for (int j = 0; j < sl.arr.length; j++) {
			
			if(avg<sl.arr[j].avg)
			{
				
				rank[0]++;
				
				sort[1]++;
				rank[1]++;
				
				if(gender==sl.arr[j].gender)//������ ���ٸ�
				{
					rank[3]++;
					sort[3]++;
				}
				
				if(ban==sl.arr[j].ban)//���� ���ٸ�
				{
					rank[2]++;
					sort[2]++;
					if(gender==sl.arr[j].gender)//������ ���ٸ�
					{
						rank[4]++;
						sort[4]++;
					}
				}
			}
			
		}
	}
	
	
	void print(int kind)
	{
		String [][] index ={
				{"����","����"},
				{"��","��","��","��","��","��"
					,"��","��","��","��","��"}
		};
		String str = 
				
				ban+"\t"+	//��
				name+"\t"+	//�̸�
				index[0][gender]+"\t";	
		//����{"����","����"}[] 
		
		for (int j = 0; j < jum.length; j++) {//j-> ����
			str+=jum[j]+"\t";
		}
		if(gender==1)	//����{"����","����"}[]  �����ΰ�?
			str+="\t";
		
		
		str+=sum+"\t"+avg+"\t";
		
		str+=index[1][avg/10]+"\t";	
		//{"��"...,"��","��","��","��","��"}res[i][2]:���/10
		str+=rank[kind];//0,1,2,3,4 ��� ����
		
		System.out.println(str);
	}
	
}


class StudLogic
{
	StudData [] arr;
	int [][] banCnt;
	String [][] index = {
			{"�Է� ����", "��ü ���", "�ݺ� ���", "���� ���", "��, ����, ���"}, 
			{"��","�̸�","����","����","����","����","����","����","���","���","���"}
	
		};
	void cal(StudData [] arr)
	{
		this.arr = arr;
		init();
		rank();
		print();
	}
	
	void init()
	{
		int maxBan = -1;
		
		for(StudData sd : arr)
		{
			if(sd.ban> maxBan) maxBan = sd.ban;
			
			sd.gender= index[1].length-7-sd.jum.length;
		}
		banCnt = new int [maxBan+1][2];
		
		///�� �ο��� ó��
		for(StudData sd : arr){
			banCnt[sd.ban][sd.gender]++;
		}
	}
	
	void rank()
	{
		//���
		for (int i = 0; i < arr.length; i++) {

			//arr[i].rankCal(arr,banCnt);
			arr[i].rankCal2(this);
			
		}
	}
	
	void print()
	{
	////1.���Ÿ�� �Է�
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < index[0].length; i++) {
			
			System.out.print(i+"."+index[0][i]);
			if(i<index[0].length-1)
				System.out.print(", ");
		}
		System.out.print("\n�Է�:");
		int kind = sc.nextInt();
		String line="";
		
		for(String buf : index[1])
		{
			System.out.print(buf+"\t");
			line+="========";
		}
		System.out.println("\n"+line);
		
		
		///2. ������
		for(int r =0;r<arr.length;r++)//r 0 -> 17
		{
			
			for (StudData sd :arr) {//i-> �л�
				
				if(r == sd.sort[kind])//������¹�ȣ === ���� �� ��¹���� ��¹�ȣ�� ������
				{
					sd.print(kind);
				}
			}
		}
	}
}


////�л�Ŭ������ ����, ����, ����, ȣ�� �Ͽ� �л������� ����ϼ���

//--- �й�, �̸�, ��, ��ȭ��ȣ,  ���� [����, ����, ����], ����, ���
public class StudMethodMain {

	public static void main(String[] args) {
		
		
		String [] name = {
				"�嵿��",
				"�峲��",
				"�弭��",
				"���߰�",
				"�ϵνŰ�",
				"����",
				"����",
				"����",
				"����",
				"���",
				"�̽��ͺ�",
				"������",
				"�����",
				"Ŀ�Ǻ�",
				"�Ѱ���",
				"�ѳ���",
				"�Ѵ���",
				"�Ѷ���"
				
				
		};
		
		int[][] stu = {//index 0�� ��, 1�� ����(0�̸� ����,1�̸� ����),����, ���� ,���� ����)
                {1, 37,70,50}, 
                {2, 96,95,99}, 
                {3, 78,69,57,77}, 
                {2, 67,65,86}, 
                {1, 97,76,80,97},
                {3, 67,62,70}, 
                {2, 57,45,60}, 
                {3, 88,55,50,88}, 
                {2, 86,96,40}, 
                {1, 95,85,30},
                {3, 65,49,20,66},
                {1, 5,49,45}, 
                {3, 63,78,78,78}, 
                {2, 11,76,86}, 
                {3, 45,63,57,45}, 
                {3, 78,67,79}, 
                {2, 99,89,68}, 
                {1, 15,64,97,67}
        };
		
		
		
		StudData [] arr = new StudData[name.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new StudData();
			arr[i].init( name[i], stu[i], 5);
			
		}
		
		new StudLogic().cal(arr);
		
		
		
	}
}
