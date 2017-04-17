package oops;

import java.util.Arrays;
import java.util.Scanner;

class StudRetData{
	int no, ban, sum, avg, gender;
	String name, tel;
	int [] jum, rank, sort;
	boolean mid;
	
	void init(String name, int [] stu, int cnt, boolean mid)
	{
		this.mid = mid;
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
	
	void max()
	{
		 
		
		for (int j = 0; j < jum.length; j++) {
			jum[j]=999;
		}
		sum = 999999;
		avg = 999;
		
	}
	
	void acc(StudRetLogic logic)
	{
		
		
		logic.sta[0][0].cal(this);
		logic.sta[1][0].cal(this);
		logic.sta[2][ban].cal(this);
		logic.sta[3][gender].cal(this);
		logic.sta[4][ban*2+gender].cal(this);
		
		for(StudRetData bb: logic.sta[2][ban].arr)
		{
			bb.ban = ban;
		}
		
		
		for(StudRetData bb: logic.sta[3][gender].arr)
		{
			bb.gender = gender;
		}
		
		for(StudRetData bb: logic.sta[4][ban*2+gender].arr)
		{
			bb.gender = gender;
			bb.ban = ban;
		}
		
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
	
	void rankCal(StudRetData [] arr, int [][] banCnt)
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
	
	
	
	void rankCal2(StudRetLogic sl)
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
		
		if(!mid)
		str+=index[1][avg/10];
				
		str+="\t";	
		//{"��"...,"��","��","��","��","��"}res[i][2]:���/10
		str+=rank[kind]+"\t";
				
				str+=sort[kind];//0,1,2,3,4 ��� ����
		
		System.out.println(str);
	}
	
}

class StudRetArr
{
	StudRetData [] arr;
	String [] name={"����","���","�ִ�","�ּ�"};
	int totCnt, manCnt, sort;
	
	StudRetArr init()
	{
		arr = new StudRetData[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new StudRetData();
			arr[i].init(name[i], new int[5], 5, true);
			
		}
		
		arr[3].max();
		return this;
	}
	
	
	void cal(StudRetData data)
	{
		totCnt++;
		
		for (int i = 0; i < data.jum.length; i++) {
			
			arr[0].jum[i]+=data.jum[i];
			
			if(arr[2].jum[i]<data.jum[i])
				arr[2].jum[i]=data.jum[i];
			
			if(arr[3].jum[i]>data.jum[i])
				arr[3].jum[i]=data.jum[i];

		}
		arr[0].sum+=data.sum;
		arr[0].avg+=data.avg;
		
		if(arr[2].sum<data.sum)
			arr[2].sum=data.sum;
		if(arr[2].avg<data.avg)
			arr[2].avg=data.avg;
		
		if(arr[3].sum>data.sum)
			arr[3].sum=data.sum;
		if(arr[3].avg>data.avg)
			arr[3].avg=data.avg;
		
		for (int i = 0; i < arr[1].jum.length-1; i++) {
			
			arr[1].jum[i]=arr[0].jum[i]/totCnt;

		}
		
		if(data.gender==0)
		{
			manCnt++;
			arr[1].jum[3]=arr[0].jum[3]/manCnt;
		}
		arr[1].sum=arr[0].sum/totCnt;
		arr[1].avg=arr[0].avg/totCnt;
		
	}
	
	
}


class StudRetLogic
{
	StudRetArr [][] sta = new StudRetArr[5][];
	StudRetData [] arr;
	int [][] banCnt;
	String [][] index = {
			{"�Է� ����", "��ü ���", "�ݺ� ���", "���� ���", "��, ����, ���"}, 
			{"��","�̸�","����","����","����","����","����","����","���","���","���"}
	
		};
	void cal(StudRetData [] arr)
	{
		this.arr = arr;
		init();
		acc();
		rank();
		print();
	}
	
	void acc()
	{
		sta[0] = new StudRetArr[1];
		sta[1] = new StudRetArr[1];
		sta[2] = new StudRetArr[banCnt.length];
		sta[3] = new StudRetArr[2];
		sta[4] = new StudRetArr[banCnt.length*2];
		
		int [] rrr = new int [sta.length];
		for (int i = 0; i < sta.length; i++) {
			for (int j = 0; j < sta[i].length; j++) {
				sta[i][j] = new StudRetArr().init();
				if(i==1)
				{
					rrr[i] = arr.length;
				}else if(i==2)
				{
					rrr[i] += banCnt[j][0]+banCnt[j][1];	
				}
				else if(i==3)
				{
					for (int k = 0; k < banCnt.length; k++) {
						rrr[i]+=banCnt[k][j];
					}
				}
				else if(i==4)
				{
					rrr[i] += banCnt[j/2][j%2];	
				}
				sta[i][j].sort +=rrr[i];
			}
		}
		
		
		for (int i = 1; i < sta.length; i++) {
			for (int j = 0; j < sta[i].length; j++) {
				sta[i][j].sort--;
			}
		}
		
		
		
		for (StudRetData data : arr) {
			data.acc(this);
		}
	}
	
	void init()
	{
		int maxBan = -1;
		
		for(StudRetData sd : arr)
		{
			if(sd.ban> maxBan) maxBan = sd.ban;
			
			sd.gender= index[1].length-7-sd.jum.length;
		}
		banCnt = new int [maxBan+1][2];
		
		///�� �ο��� ó��
		for(StudRetData sd : arr){
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
			
			for (StudRetData sd :arr) {//i-> �л�
				
				if(r == sd.sort[kind])//������¹�ȣ === ���� �� ��¹���� ��¹�ȣ�� ������
				{
					sd.print(kind);
				}
			}
			
			for(StudRetArr acc : sta[kind])
			{
				if(acc.sort==r)
				{
					System.out.println(acc.sort+"--------------------------------------------------------------------------------------");
					
					for(StudRetData dd : acc.arr)
					{
						dd.print(kind);
					}
					System.out.println("--------------------------------------------------------------------------------------");
				}
			}
		}
		
		
	}
}


////�л�Ŭ������ ����, ����, ����, ȣ�� �Ͽ� �л������� ����ϼ���

//--- �й�, �̸�, ��, ��ȭ��ȣ,  ���� [����, ����, ����], ����, ���
public class StudReturnMain {

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
		
		
		
		StudRetData [] arr = new StudRetData[name.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new StudRetData();
			arr[i].init( name[i], stu[i], 5, false);
			
		}
		
		new StudRetLogic().cal(arr);
		
		
		
	}
}
