package Day05;

import java.util.Scanner;

public class Day05_����������2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
       //for ���� �����
       //��1) �Է¹��� ������ŭ �� ��� 
       System.out.println("\n------------------");
       System.out.print("�� ����:");int ��1=scanner.nextInt();
       for(int i=0;i<��1;i++) System.out.print(" * ");

       //��2) �Է¹��� ������ŭ �� ���[* 5������ �ٹٲ�] 
       System.out.println("\n------------------");
       System.out.print("�� ����:"); int ��2=scanner.nextInt();
       for(int i=0;i<��2;i++) {
    	   System.out.print(" * ");
    	   if(i%5==4) System.out.println();
       }
       
       /*��3) �Է¹��� �ٸ�ŭ ��� [for ��ø]
       
       	*		
       	**		
       	***		
       	****	
       	*****
       	
        */
       System.out.println("\n------------------");
       System.out.print("�ټ�:"); int ��3=scanner.nextInt();
       for(int i=1;i<=��3;i++) {
    	   for(int s=1;s<=i;s++) {System.out.print("*");}
    	   System.out.println();
       }
       
       /*��4) �Է¹��� �ٸ�ŭ ���
        *****	
        ****	
        ***		
        **		
        * 
        
        */
       
       System.out.println("\n------------------");
       System.out.print("�ټ�:");int ��4=scanner.nextInt();
       for(int i=1;i<=��4;i++) {
    	   for(int s=1;s<=��4-i+1;s++) {System.out.print("*");}
    	   System.out.println();
       }
       
       
       
       /*��5) �Է¹��� �ٸ�ŭ ��� [ for 3�� ] 
        									
	    *	
       **	
      ***	
     ****	
	*****
        */
     
       System.out.println("\n------------------");
       System.out.print("�ټ�:"); int ��5=scanner.nextInt();
       for(int i=1;i<=��5;i++) {
    	   for(int b=1;b<=��5-i;b++) {System.out.print(" ");}
    	   		for(int s=1;s<=i;s++) {System.out.print("*");}
       System.out.println();
       }
    	      
    	
       
       /*��6) �Է¹��� �ٸ�ŭ ��� 
         *****	
          ****	
           ***	
            **	
             *	
        */
      
       System.out.println("\n------------------");
       System.out.print("�ټ�:"); int ��6=scanner.nextInt();
       for(int i=1;i<=��6;i++) {
    	   for(int b=1;b<=i-1;b++) {System.out.print(" ");}
    	   		for(int s=1;s<=��6-i+1;s++) {System.out.print("*");}
       System.out.println();
       }
      
      /*��7) �Է¹��� �ٸ�ŭ ���
       	*		
       ***		
	  *****		
	 *******	
	*********
       */
       System.out.println("\n------------------");
       System.out.print("�ټ�:"); int ��7=scanner.nextInt();
       for(int i=1;i<=��7;i++) {
    	   for(int b=1;b<=��7-i;b++) {System.out.print(" ");}
    	   		for(int s=1;s<=i*2-1;s++) {System.out.print("*");}
       System.out.println();
       }
      
      
     /*��8) �Է¹��� �ٸ�ŭ ���
        1
       222
      33333
     4444444
      */
       System.out.println("\n------------------");
       System.out.print("�ټ�"); int ��8=scanner.nextInt();
       for(int i=1;i<=��8;i++) {
    	   for(int b=1;b<=��8-i;b++) {System.out.print(" ");}
    		   for(int s=1;s<=i*2-1;s++) {System.out.print(i);}
    	System.out.println();		   
       }
       
     /*��9) �Է¹��� �ٸ�ŭ ���
    *********	
	 *******	
	  *****		
	   ***		
	    *	
      */
       System.out.println("\n------------------");
      System.out.print("�ټ�:"); int ��9=scanner.nextInt();
      for(int i=1;i<=��9;i++) {
    	  for(int b=1;b<=i-1;b++) {System.out.print(" ");}
    	  		for(int s=1;s<=��9*2-(i*2-1);s++) { System.out.print("*");}
    System.out.println();
      }
       
       /*��10) �Է¹��� �ٸ�ŭ ���
        *
       ***
      *****
	 *******
	*********
	 *******
	  *****
	   ***
	    *
	    
        */
       System.out.println("\n------------------");
       System.out.print("�ټ�:"); int ��10=scanner.nextInt();
       
       if(��10%2==1) {
		       for(int i=1;i<=��10/2+1;i++) {
		    	   for(int b=1;b<=��10/2+1-i;b++) {System.out.print(" ");}
		    	   		for(int s=1;s<=i*2-1;s++) {System.out.print("*");}
		       System.out.println();
		       }
		       for(int i=1;i<=��10/2;i++) {
		    	   for(int b=1;b<=i;b++) {System.out.print(" ");}
		    	   		for(int s=1;s<=��10-i*2;s++) {System.out.print("*");}
		    	System.out.println();
		       }
       }
       else {
    	   for(int i=1;i<=��10/2;i++) {
	    	   for(int b=1;b<=��10/2-i;b++) {System.out.print(" ");}
	    	   		for(int s=1;s<=i*2-1;s++) {System.out.print("*");}
	       System.out.println();
	       }
	       for(int i=1;i<=��10/2;i++) {
	    	   for(int b=1;b<=i-1;b++) {System.out.print(" ");}
	    	   		for(int s=1;s<=��10-(i*2-1);s++) {System.out.print("*");}
	    	System.out.println();
	       }
       }
       /*��11) �Է¹��� �ٸ�ŭ ��� [ �Է¹��� ��/�� ���� ] 
    *     *		
	 *   *		
	  * *		
	   *		
      * *		
     *   *		
    *     *	
       
        */
       System.out.println("\n------------------");
       System.out.print("�ټ�:"); int ��11=scanner.nextInt();
       for(int i=1;i<=��11;i++) {
    	   for (int j=1;j<=��11;j++) {
    		   if(i==j) System.out.print("*");
    		   else if((i+j==��11+1)) System.out.print("*");
    		   else System.out.print(" ");
    	   }
      System.out.println();
    	   }
       
       /*������12 : �Է¹��� �ٸ�ŭ ���
    *        *
	**      **
	***    ***
	****  ****
	**********
	****  ****
	***    ***
	**      **
	*        *
        */
       System.out.println("\n------------------");
       System.out.print("�ټ�:"); int ��12=scanner.nextInt();
       for(int i=1;i<=��12;i++) {
    	   for(int j=1;j<=��12+1;j++) {
    		   if(i==1 && j>=2 && j<=9) System.out.print(" ");
    		   else if(i==2 && j>=3 && j<=8) System.out.print(" ");
    		   else if(i==3 && j>=4 && j<=7) System.out.print(" ");
    		   else if(i==4 && j>=5 && j<=6) System.out.print(" ");
    		   else if(i==6 && j>=5 && j<=6) System.out.print(" ");
    		   else if(i==7 && j>=4 && j<=7) System.out.print(" ");
    		   else if(i==8 && j>=3 && j<=8) System.out.print(" ");
    		   else if(i==9 && j>=2 && j<=9) System.out.print(" ");
    		   else System.out.print("*");}
    	    
    	   System.out.println();
       }
       
       
      
       /*������13 : �Է¹��� �ٸ�ŭ ���
                       *                        
                      * *                       
                     *****                      
                    *     *                     
                   * *   * *                    
                  ***** *****                   
                 *           *                  
                * *         * *                 
               *****       *****                
              *     *     *     *               
             * *   * *   * *   * *              
            ***** ***** ***** *****             
           *                       *            
          * *                     * *           
         *****                   *****          
        *     *                 *     *         
       * *   * *               * *   * *        
      ***** *****             ***** *****       
     *           *           *           *      
    * *         * *         * *         * *     
   *****       *****       *****       *****    
  *     *     *     *     *     *     *     *   
 * *   * *   * *   * *   * *   * *   * *   * *  
***** ***** ***** ***** ***** ***** ***** *****	   
        */
       System.out.println("\n------------------");     
       
       
       
}
}

