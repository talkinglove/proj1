package oops;

import java.util.Scanner;
 
class StudHH{
  int no, ban, sum,  gender;
  
  double avg;
  
  String name, tel;
  int [] jum, sort, rank;
  
 }
 ////�л�Ŭ������ ����, ����, ����, ȣ�� �Ͽ� �л������� ����ϼ���
 
 //--- �й�, �̸�, ��, ��ȭ��ȣ,  ���� [����, ����, ����], ����, ���
 public class Report_9_1 {
 
  public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   
  
   
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
   
   
   int[] stuNo = 
              {1, 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
 
   String [][] index = {
    {"�Է� ����", "��ü ���", "�ݺ� ���", "���� ���", "��, ����, ���", "��,����,��ȣ"}, 
    {"��","�̸�","����","����","����","����","����","����","���","���","���"},
    {"����","����"}
   };
   
   StudHH [] arr = new StudHH[name.length];
   
   for (int i = 0; i < arr.length; i++) {  // i�� ������ �迭�� ����ŭ�� ������ ���´�.
    arr[i] = new StudHH();    // ������ arr[i]�� ���� ��ü�� �����Ѵ�.
    arr[i].name = name[i];     // arr[i]�� �̸���  �л��̸� name[i]�� �ִ´�.
    arr[i].no = stuNo[i];
    arr[i].ban = stu[i][0];    // arr[i]�� �ݿ� �л��� �� stu[i][0]�� �ִ´�.
    
    arr[i].jum = new int [stu[i].length-1];   //arr[i]���� ������ ���� �� (���� ���� ������ )��ŭ �迭 ���� 
    arr[i].rank = new int [index[0].length];
    arr[i].sort = new int [index[0].length];
    
    for (int j = 0; j < arr[i].jum.length; j++)  //  j�� �� �л��� �� ������ ���̸�ŭ arr[i]���� �ٸ��� �Ҵ�
    {
     arr[i].jum[j]=stu[i][j+1];  // ������ arr[i]�� �������� ������ �ִ´�.   1�� stu�� �տ� �� ����
    }
    
    arr[i].sum =0;     //���� ���� �ֱ� ������ 0���� �ʱ�ȭ�Ѵ�.
    for(int jj : arr[i].jum)    
    {
     arr[i].sum += jj;  //arr[i]�� �ִ� ���� ������ ��� ���ؼ� arr[i].sum�� ���� �ִ´�.
    }
    
  
    arr[i].avg =(double)((int)(100*((double) arr[i].sum/arr[i].jum.length)))/100;  // arr[i].avg�� arr[i]�� sum���鿡 
                //������ ������� ������ �������ŭ ������.
    arr[i].gender = index[1].length - 6 -stu[i].length;  // gender���� �ִ´�. 1�̸� ����, 0�̸� ����
//    System.out.println("arr["+i+"].gender="+arr[i].gender+"\t");
   }
   
   System.out.println("0.�ڷ��Է¼��� 1.��ü  2.�ݺ�  3.������  4.��,����,���  5.��,����,��ȣ ");
   System.out.print("��¹��(1~5)�� �����ϼ���> ");
   int choice = sc.nextInt();
   
   // arr[i]�� rank=1, sort=0���� �ʱ�ȭ
   for(int i=0; i<arr.length; i++)
   {
    for(int j=0; j<arr[i].rank.length; j++)
    {
     arr[i].rank[j]=1;
     arr[i].sort[j]=0;
    }
    
   }
   
   
   //�ݼ� ���ϱ�, ����� ���ϱ�
   int banMax=0, subMax=0;
   for(int i=0; i<arr.length; i++)    
   {
    if(arr[i].ban>banMax)
    {
     banMax = arr[i].ban;
    }
    
    if(arr[i].jum.length > subMax)
    {
     subMax = arr[i].jum.length;
    }
    
   }
      
   //sort ����ġ ���ϱ�
 
   int [] banStu = new int [banMax+1]; //�� ���� �л��� �� ���ϱ�
   int [] banMale = new int [banMax+1]; //�� �ݺ� ���л����� �� ���ϱ�
   
   for(int i=0; i<banMax+1; i++)        //�߰�
   {
       banStu[i]=0;    banMale[i]=0; //���� 0���� �ʱ�ȭ
   }
   
   
   // ������ ��½� ����� ��ü ���л� ��
   for(int i=0; i<arr.length; i++) 
   {
    if(arr[i].gender == 0) //�л��� ������ ������ ���
    {
     banMale[0]++;  //bamMale[0] = ��ü ���л��� ��
    }
   }   
 
   //�� ���� �л����� �� ���� ���л� ��
   for(int j =1; j<= banMax; j++)
   {
    for(int i=0; i<arr.length; i++)
    {
     if(arr[i].ban == j)
     {
      banStu[j]++; //�� �� �л��� ���ϱ�
      if(arr[i].gender == 0) //Ư�� �� �л��� ������ ������ ���
      {
       banMale[j]++;  //�� �� ���л�  �� ���ϱ�
      }
     }
    }
   }
  
   
  
   
   
   for(int i=0; i<arr.length; i++)
   {
    for(int j=1; j<index[0].length; j++)
    {
     if(j==2)       //choice ==2 �� ��2.�ݺ� 
     {
     for(int k=1; k<arr[i].ban; k++)
     {
      arr[i].sort[j] += banStu[k];
     }
     }
     else if(j==3)      //choice ==3 �� ��3.������  
     {
      if(arr[i].gender == 1)
      {
       arr[i].sort[j] = banMale[0];   // ��ü ���л� ��
      }
     }
     else if(j==4 || j==5)     //choice ==4,5 �� �� 4.��,����,���  5.��,����,��ȣ
     {
  /*arr[i].sort[j] += banStu[j-1]+banMale[j];  //�� ���� �л������� �� + �ش� ���� ���л� ��   [banMax+1]; (1~3)*/ 
      if(arr[i].gender==1)
      {
       for(int k=1; k<arr[i].ban; k++)
       {
        arr[i].sort[j] += banStu[k];
       }
       arr[i].sort[j] += banMale[arr[i].ban];
      }else if(arr[i].gender == 0)
      {
       for(int k=1; k<arr[i].ban; k++)
       {
        arr[i].sort[j] += banStu[k];
       }
      }
     }
    
 
    }
   }
   
   
   
  
   //arr[i].rank�� arr[i].sort ä���
   for(int i=0; i< arr.length; i++)
   {
    for(int j=0; j<arr.length; j++)
    {
     if(arr[i].avg < arr[j].avg) 
     {
     
      arr[i].rank[0]++;    // 0��. �ڷ� �Է� ����
      
      arr[i].rank[1]++;    // 1��. ��ü ���
      arr[i].sort[1]++;
      
      if(arr[i].ban == arr[j].ban)  
      {
       arr[i].rank[2]++;   //2��. �� �� ���
       arr[i].sort[2]++;
      }
      
      if(arr[i].gender == arr[j].gender) 
      {
       arr[i].rank[3]++;   //3��. ���� �� ���
       arr[i].sort[3]++;
       
       if(arr[i].ban == arr[j].ban)
       {
        arr[i].rank[4]++;  //4��. ��, ����, ���
        arr[i].sort[4]++;
       }
      }
     }
     
     if(arr[i].no > arr[j].no)
     {
      if(arr[i].ban == arr[j].ban )
      {
       if(arr[i].gender == arr[j].gender)
       {
        arr[i].rank[5]++;  //5. ��, ����, ��ȣ
        arr[i].sort[5]++;
       }
      }
     }
    }
   }
   
   
   //���
   
   int z = 0;
   System.out.println("�й�\t��\t�̸�\t����\t����\t����\t����\t����\t����\t���\t����");
   for(int i=0; i<arr.length;i++)
   {
    for(int j=0; j<arr.length;j++)
    {
     if(arr[j].sort[choice] == i)
     {
      System.out.print(
    		arr[j].no+"\t"
           +arr[j].ban+"\t"
           +arr[j].name+"\t"
           +arr[j].gender+"\t");
      for(int k=0; k< arr[j].jum.length; k++)
      { 
       
       if( arr[j].gender == 1 && k== arr[j].jum.length-1 )
       {
        System.out.print(arr[j].jum[k]+"\t\t");
       }else{
        System.out.print(arr[j].jum[k]+"\t");
       }
       
       
      }
      System.out.println(arr[j].sum+"\t"+arr[j].avg+"\t"+arr[j].rank[choice]);
     }
    }
   }
    
   
   
 
   
  ///////  ���� �ְ� �ݺ�, ��ȣ��, ������ ����ϼ���
  //// ��� ���
  ////1. �ݺ� �Է� ����  2. �ݺ� ���  3. ���� ���  4, ��, ����, ���   5, ��, ����, ��ȣ
 
  //// �� �з��� ���������� ���� ����, ����� ����� ��
   
   
   
   
 
   
  }
 }
 
 