package arr;

import java.util.Scanner;

public class ArrayHome2 {

	public static void main(String[] args) {
		//1...   ArrayHome2 �� main �Լ� ����
		
		////1. �Էº�
		
		String [] name = {
				"�嵿��","�峲��","�弭��","���߰�","�ϵνŰ�"};
		//2...  �̸� �迭 ���� - 5���� �̸��� ���ҷ� ����
		
		int [] ban = {2,1,2,1,2};  //3... �� �迭 ����(5��)
		int [] jum1 = {20,85,95,70,65};
        int [] jum2 = {15,80,100,55,90};
        int [] jum3 = {65,85,80,75,80};
        
        int [] sum = new int [name.length];
        //7... �հ� �迭�� ���� --�л��� �ο��� ��ŭ �迭���� ����
        int [] avg = new int [name.length];
        
        
        int [] totalRank = new int [name.length];
        //9...  ��ü ��� �迭 ���� --
           /// ��ü ��� �迭�� ���� ȭ�� ��½ÿ� ����� ������
           /// printRank �� �ּҰ��� �ѱ�� ���� ���̴�
           /// ��� ����� 5,2,1,4,3 ���� ���� ������
           /// 2.2 ������� �����꿡�� ó���� ���̴�.
        
        int [] banRank = new int [name.length];
        int [] totalSort = new int [name.length];
        int [] banSort = new int [name.length];
        
        
        
        
        String [] grade = new String [name.length];
        String [] gradeIndex = {
        		"��","��","��","��","��","��",
				"��","��","��","��","��"
        };
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("��¹��: 1. ��ü���, 2.�ݺ����");
        
        System.out.print("�Է�:");
        
        int kind = sc.nextInt();
        
        
        ///2. �����
        //2.1 �ʱ� ���� ���
      
        ///19... for���� ���� ----> �л��� �ο��� ��ŭ ������.
        for (int i = 0; i < name.length; i++) {
        //19���� ���� ��ȣ����         name.length:5
        	  // 1. i =0    2. 0<5
        	                 //��� :true
        	                           //6. i++ => i:1�� ��ȯ
        	              //7   1<5
                                 //��� :true
        	
			sum[i]= jum1[i]+jum2[i]+jum3[i];
			//3. sum[0](�嵿���� �հ�) = ����[0](20)+����[0](15)+����[0](65)
			  //100
			
			//8. sum[1](�峲���� �հ�) = ����[1](85)+����[1](80)+����[1](85)
			  //250
			
			avg[i] = sum[i]/3;
			//4. 
			grade[i] = gradeIndex[avg[i]/10];
			//5.
		}
        
        ///2.2 ��� ���

		for (int i = 0; i < name.length; i++) {
        	totalRank[i]=1;
        	banRank[i]=1;
        	
        	if(ban[i]==2)
        		banSort[i]=2;
        	for (int j = 0; j < name.length; j++) {
				if(avg[i]<avg[j] )
				{
					totalRank[i]++;
					totalSort[i]++;
					
					if(ban[i]==ban[j])
					{
						banRank[i]++;
						banSort[i]++;
					}
				}
			}
        }
    	   
		int [] printSort= totalSort;
        int [] printRank = totalRank;
    	switch(kind)
    	{
    		case 2:
    			printRank = banRank;
    			printSort = banSort;
    			break;
    	}
	        
	        ///3. ��º�
	        
				
			
        for (int r = 0; r <name.length; r++) {
			
	        for (int i = 0; i < name.length; i++) {
	        	String str = 
	        			ban[i]+"\t"+
	        			name[i]+"\t"+
	        			jum1[i]+"\t"+
	        			jum2[i]+"\t"+
	        			jum3[i]+"\t"+
	        			sum[i]+"\t"+
	        			avg[i]+"\t"+
	        			grade[i]+"\t"+
	        			printRank[i]+"\t"+
	        			totalRank[i]+"\t"+
	        			banRank[i]+"\t"+"\t"+
	        			printSort[i]+"\t"+
	        			totalSort[i]+"\t"+
	        			banSort[i]
	        			;
	        	
	        	if(r == printSort[i])
	        	System.out.println(str);
	        }
        }
    }
		
	

}
