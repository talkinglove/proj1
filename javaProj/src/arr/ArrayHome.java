package arr;

import java.util.Scanner;

public class ArrayHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////1. �Էº�
		String [] name = {
				"�嵿��","�峲��","�弭��","���߰�","�ϵνŰ�"};
		int [] ban = {2,1,2,1,2};
		int [] jum1 = {20,85,95,70,65};
        int [] jum2 = {15,80,100,55,90};
        int [] jum3 = {65,85,80,75,80};
        
        int [] sum = new int [name.length];
        int [] avg = new int [name.length];
        int [] rank = new int [name.length];
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
        for (int i = 0; i < name.length; i++) {
			sum[i]= jum1[i]+jum2[i]+jum3[i];
			avg[i] = sum[i]/3;
			grade[i] = gradeIndex[avg[i]/10];
		}
        
        ///2.2 ��� ���
        
        
        switch(kind)
        {
        	case 1:
        		for (int i = 0; i < name.length; i++) {
    	        	rank[i]=1;
    	        	for (int j = 0; j < name.length; j++) {
    					if(avg[i]<avg[j] )
    						rank[i]++;
    				}
    	        }
    	        
    	        ///3. ��º�
    	       
    				
    			
    		        for (int r = 1; r <=name.length; r++) {
    					
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
    			        			rank[i];
    			        	
    			        	if(r == rank[i])
    			        	System.out.println(str);
    			        }
    		        }
    	        
    	        break;
        		
        		
        		
        		
        	case 2:
	        for (int i = 0; i < name.length; i++) {
	        	rank[i]=1;
	        	for (int j = 0; j < name.length; j++) {
					if(avg[i]<avg[j] && ban[i]==ban[j])
						rank[i]++;
				}
	        }
	        
	        ///3. ��º�
	        for (int b = 1; b <=2; b++) {
				
			
		        for (int r = 1; r <=name.length; r++) {
					
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
			        			rank[i];
			        	
			        	if(ban[i]==b && r == rank[i])
			        	System.out.println(str);
			        }
		        }
	        }
		}
	}

}
