package Day05;

import java.util.Scanner;

public class Day05_2 {
public static void main(String[] args) {
	
       Scanner scanner = new Scanner(System.in);
       
       //for ���� �����
       //��1) �Է¹��� ������ŭ �� ���
       System.out.print("�� ����: "); int ��=scanner.nextInt();
       for(int i=1;i<=��;i++) {System.out.print("*");}
       
       System.out.println("\n------------------");

       //��2) �Է¹��� ������ŭ �� ���[* 5������ �ٹٲ�]
       System.out.print("�� ����: "); int ��2=scanner.nextInt();
       for(int i=1;i<=��2;i++) {System.out.print("* ");
       if (i%5==0) {System.out.println();}
       }
       System.out.println("\n------------------");
       
       /*��3) �Է¹��� �ٸ�ŭ ��� [for ��ø]
       
       	*		
       	**		
       	***		
       	****	
       	*****
       	
        */
       System.out.print("�� ����:"); int ��3=scanner.nextInt();
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
       System.out.println();
       System.out.print("�� ����:"); int ��4=scanner.nextInt();
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
      System.out.println();
      System.out.print("�ٰ���:"); int ��5=scanner.nextInt();
      for(int i=1;i<=��5;i++) { 
    	  for(int b=1;b<=��5-i;b++) {System.out.print(" ");}
    	      for(int s=1; s<=i;s++) {System.out.print("*");}
    	      System.out.println();
    	  }
      
       
       /*��6) �Է¹��� �ٸ�ŭ ��� 
         *****	
          ****	
           ***	
            **	
             *	
        */
      System.out.println();
      System.out.print("�ٰ���:"); int ��6=scanner.nextInt();
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
       System.out.println();
       System.out.println("�ٰ���:"); int ��7=scanner.nextInt();
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
      System.out.println(); 
      System.out.println("�ٰ���:"); int ��8=scanner.nextInt();
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
       System.out.println();
       System.out.println("�ٰ���:"); int ��9=scanner.nextInt();
       for(int i=1;i<=��9;i++) {
    	   for(int b=1;b<=i-1;b++) {System.out.print(" ");}
    	     for(int s=1;s<=��9*2-(i*2-1);s++) {System.out.print("*");}
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
       System.out.println();
       System.out.println("�ٰ���:"); int ��10=scanner.nextInt();
       for(int i=1;i<=��10/2;i++) {
    	   for (int b=1;b<=��10-i;b++) {System.out.print(" ");}
    	     for(int s=1;s<=i*2-1;s++) {System.out.print("*");}
    	       System.out.println();
       }
       for(int i=��10/2+1;i<=��10;i++) {
    	   for (int b=1;b<=i-1;b++) {System.out.print(" ");}
    	    for(int s=1;s<=��10*2-(i*2-1);s++) {System.out.print("*");}
    	     System.out.println();
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
       System.out.println();
       System.out.print("�ٰ���:");int ��11=scanner.nextInt();
       for(int i=1;i<=��11;i++) {
    	   for(int j=1;j<=��11;j++) {
    		   if(i==j) System.out.print("*");
    		   else if((i+j)==��11+1) System.out.print("*");
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
       int N = scanner.nextInt();
       int col = 0;
       int space = 2;
       
       for(int i=1; i<=N; i++) {
          for(int j=0; j<i; j++)
             System.out.print("*");
          
          for(int j=(i-1)*2; j<(N*2)-2; j++)
             System.out.print(" ");
          for(int j=0; j<i; j++)
             System.out.print("*");
          
          System.out.println();
       }
       
       for(int i=N; i<(N*2)-1; i++) {
          for(int j=col; j<N-1; j++)
             System.out.print("*");
          
          for(int j=0; j<space; j++)
             System.out.print(" ");
          
          for(int j=col; j<N-1; j++)
             System.out.print("*");
          
          System.out.println();
          col ++;
          space += 2;
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
      
       
        
      
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           sc.close();
            
           String map[] = new String[n];
           map[0] = "  *  ";
           map[1] = " * * ";
           map[2] = "*****";
            
           for (int k = 1; 3 * (int)Math.pow(2, k) <= n; ++k) {
               makeBigStar(k, map);
           }
            
           for (int i = 0; i < n; ++i) {
               System.out.println(map[i]);
           }
       }
        
       	private static void makeBigStar(int k, String map[]) {
       	    int bottom = 3 * (int)Math.pow(2, k);
       	    int middle = bottom / 2;
       	     
       	    for (int i = middle; i < bottom; ++i) {
       	        map[i] = map[i - middle] + " " + map[i -middle];
       	    }
       	     
       	    String space = "";
       	    while (space.length() < middle) {
       	        space += " ";
       	    }
       	    for (int i = 0; i < middle; ++i) {
       	        map[i] = space + map[i] + space;
       	    }
       	}
}
       



