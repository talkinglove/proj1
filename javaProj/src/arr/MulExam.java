package arr;

import java.util.Scanner;

///////  ���� �ְ� �ݺ�, ��ȣ��, ������ ����ϼ���
////��� ���
////1. �Է� ����  2.��ü ��� 3. �ݺ� ���  4. ���� ���  5, ��, ����, ��� 

////�� �з��� ���������� ���� ����, ����� ����� ��



/// �� ���л��� ��� ���к����� �Ѻ����� ���ļ� ����Ѵ�.
public class MulExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		
		
		
		String [][] index = {
			{"�Է� ����", "��ü ���", "�ݺ� ���", "���� ���", "��, ����, ���"}, 
			{"��","�̸�","����","����","����","����","����","����","���","���","���"},
			{"����","����"},
			{"��","��","��","��","��","��"
			,"��","��","��","��","��"}
			
		};
		int [][] res = new int [stu.length][3];
		int [][] rank = new int [stu.length][index[0].length];
		/*{
			{��ü���, ��ü���,�ݺ����,�������, �ݼ������},
			{��ü���, ��ü���,�ݺ����,�������, �ݼ������},
			{��ü���, ��ü���,�ݺ����,�������, �ݼ������},
			{��ü���, ��ü���,�ݺ����,�������, �ݼ������},
			...
			
		}*/
		int maxBan = -1;
		
		
		
		int [][] sort = new int [stu.length][index[0].length];
		/*{
		{��ü������, ��ü���,�ݺ����,�������, �ݼ������},
		{��ü���, ��ü���,�ݺ����,�������, �ݼ������},
		{��ü���, ��ü���,�ݺ����,�������, �ݼ������},
		{��ü���, ��ü���,�ݺ����,�������, �ݼ������},
		...
		
	}*/
		
		
		//�����
		//�⺻ ����
		for (int i = 0; i < stu.length; i++) {
			
			if(stu[i][0]> maxBan) maxBan = stu[i][0];
			
			res[i][0]= index[1].length-6-stu[i].length;
			
			
			for (int j = 1; j < stu[i].length; j++) {
				res[i][1]+=stu[i][j];
			}
			res[i][2]=res[i][1]/(stu[i].length-1);
		}
		
		
		int [][] banCnt = new int [maxBan+1][2];
		///�� �ο��� ó��
		for (int i = 0; i < stu.length; i++) {
			banCnt[stu[i][0]][res[i][0]]++;
		}
		
		
		
		//���
		for (int i = 0; i < res.length; i++) {
			
			///����ʱ�ȭ
			for (int j = 0; j < rank[i].length; j++) {
				rank[i][j]=1;
			}
			
			
			/// ���� �� �ʱ�ȭ
			for (int j = 1; j < stu[i][0]; j++) {
				for (int k = 0; k < banCnt[j].length; k++) {
					sort[i][2]+= banCnt[j][k];
					sort[i][4]+= banCnt[j][k];
				}
			}
			
			/// ����(����)�ʱ�ȭ
			if(res[i][0]==1) {
				for (int j = 1; j < banCnt.length; j++) {
					sort[i][3]+=banCnt[j][0];
					
				}
				sort[i][4]+= banCnt[stu[i][0]][0];
				
			} //���ڶ�� �ʱⰪ �����ο��� 
			for (int j = 1; j < res.length; j++) {
				
				if(res[i][2]<res[j][2])
				{
					//sort[i][0]++;
					rank[i][0]++;
					
					sort[i][1]++;
					rank[i][1]++;
					
					if(res[i][0]==res[j][0])//������ ���ٸ�
					{
						sort[i][3]++;
						rank[i][3]++;
					}
					
					if(stu[i][0]==stu[j][0])//���� ���ٸ�
					{
						sort[i][2]++;
						rank[i][2]++;
						if(res[i][0]==res[j][0])//������ ���ٸ�
						{
							sort[i][4]++;
							rank[i][4]++;
						}
					}
				}
				
			}
			
		}
		
		
		///////////////��º�
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
		/*for (int i = 0; i < index[1].length; i++) {
			System.out.print(index[1][i]+"\t");
			line+="========";
		}*/
		
		for(String buf : index[1])
		{
			System.out.print(buf+"\t");
			line+="========";
		}
		System.out.println("\n"+line);
		
		
		///2. ������
		for(int r =0;r<name.length;r++)//r 0 -> 17
		{
			
			for (int i = 0; i < name.length; i++) {//i-> �л�
				
				if(r == sort[i][kind])//������¹�ȣ === ���� �� ��¹���� ��¹�ȣ�� ������
				{
					String str = 
							
							stu[i][0]+"\t"+	//��
							name[i]+"\t"+	//�̸�
							index[2][res[i][0]]+"\t";	
					//����{"����","����"}[]  res[i][0]=> 0,1
					
					for (int j = 1; j < stu[i].length; j++) {//j-> ����
						str+=stu[i][j]+"\t";
					}
					if(res[i][0]==1)	//����{"����","����"}[]  �����ΰ�?
						str+="\t";
					
					for (int j = 1; j < res[i].length; j++) {//j-> ����, ���
						str+=res[i][j]+"\t";
					}
					str+=index[3][res[i][2]/10]+"\t";	
					//{"��"...,"��","��","��","��","��"}res[i][2]:���/10
					str+=rank[i][kind];//0,1,2,3,4 ��� ����
					
					System.out.println(str);
				}
			}
		}
	}
}
