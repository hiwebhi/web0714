package Day05;

import java.util.Scanner;

public class Day05_2 {
public static void main(String[] args) {
	
       Scanner scanner = new Scanner(System.in);
       
       //for 으로 별찍기
       //별1) 입력받은 정수만큼 별 출력
       System.out.print("별 개수: "); int 별=scanner.nextInt();
       for(int i=1;i<=별;i++) {System.out.print("*");}
       
       System.out.println("\n------------------");

       //별2) 입력받은 정수만큼 별 출력[* 5개마다 줄바꿈]
       System.out.print("별 개수: "); int 별2=scanner.nextInt();
       for(int i=1;i<=별2;i++) {System.out.print("* ");
       if (i%5==0) {System.out.println();}
       }
       System.out.println("\n------------------");
       
       /*별3) 입력받은 줄만큼 출력 [for 중첩]
       
       	*		
       	**		
       	***		
       	****	
       	*****
       	
        */
       System.out.print("줄 개수:"); int 줄3=scanner.nextInt();
       for(int i=1;i<=줄3;i++) { 
    	   for(int s=1;s<=i;s++) {System.out.print("*");}
    	   System.out.println();
       }
       /*별4) 입력받은 줄만큼 출력
        *****	
        ****	
        ***		
        **		
        * 
        
        */
       System.out.println();
       System.out.print("줄 개수:"); int 줄4=scanner.nextInt();
       for(int i=1;i<=줄4;i++) {
    	   for(int s=1;s<=줄4-i+1;s++) {System.out.print("*");}
    	   System.out.println();
       }
       
       
       
       /*별5) 입력받은 줄만큼 출력 [ for 3번 ] 
        									
	    *	
       **	
      ***	
     ****	
	*****
        */
      System.out.println();
      System.out.print("줄개수:"); int 줄5=scanner.nextInt();
      for(int i=1;i<=줄5;i++) { 
    	  for(int b=1;b<=줄5-i;b++) {System.out.print(" ");}
    	      for(int s=1; s<=i;s++) {System.out.print("*");}
    	      System.out.println();
    	  }
      
       
       /*별6) 입력받은 줄만큼 출력 
         *****	
          ****	
           ***	
            **	
             *	
        */
      System.out.println();
      System.out.print("줄개수:"); int 줄6=scanner.nextInt();
      for(int i=1;i<=줄6;i++) {
    	  for(int b=1;b<=i-1;b++) {System.out.print(" ");}
    	    for(int s=1;s<=줄6-i+1;s++) {System.out.print("*");}
    	      System.out.println();
      }
      
      
      /*별7) 입력받은 줄만큼 출력
       	*		
       ***		
	  *****		
	 *******	
	*********
       */
       System.out.println();
       System.out.println("줄개수:"); int 줄7=scanner.nextInt();
       for(int i=1;i<=줄7;i++) {
    	   for(int b=1;b<=줄7-i;b++) {System.out.print(" ");}
    	     for(int s=1;s<=i*2-1;s++) {System.out.print("*");}
    	       System.out.println();
       }
      
      
     /*별8) 입력받은 줄만큼 출력
        1
       222
      33333
     4444444
      */
      System.out.println(); 
      System.out.println("줄개수:"); int 줄8=scanner.nextInt();
      for(int i=1;i<=줄8;i++) {
    	  for(int b=1;b<=줄8-i;b++) {System.out.print(" ");}
    	     for(int s=1;s<=i*2-1;s++) {System.out.print(i);}
    	        System.out.println();     
      }
       
     /*별9) 입력받은 줄만큼 출력
    *********	
	 *******	
	  *****		
	   ***		
	    *	
      */
       System.out.println();
       System.out.println("줄개수:"); int 줄9=scanner.nextInt();
       for(int i=1;i<=줄9;i++) {
    	   for(int b=1;b<=i-1;b++) {System.out.print(" ");}
    	     for(int s=1;s<=줄9*2-(i*2-1);s++) {System.out.print("*");}
    	        System.out.println();
       }
       
       /*별10) 입력받은 줄만큼 출력
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
       System.out.println("줄개수:"); int 줄10=scanner.nextInt();
       for(int i=1;i<=줄10/2;i++) {
    	   for (int b=1;b<=줄10-i;b++) {System.out.print(" ");}
    	     for(int s=1;s<=i*2-1;s++) {System.out.print("*");}
    	       System.out.println();
       }
       for(int i=줄10/2+1;i<=줄10;i++) {
    	   for (int b=1;b<=i-1;b++) {System.out.print(" ");}
    	    for(int s=1;s<=줄10*2-(i*2-1);s++) {System.out.print("*");}
    	     System.out.println();
       }
       
       
       /*별11) 입력받은 줄만큼 출력 [ 입력받은 행/열 동일 ] 
    *     *		
	 *   *		
	  * *		
	   *		
      * *		
     *   *		
    *     *	
       
        */
       System.out.println();
       System.out.print("줄개수:");int 줄11=scanner.nextInt();
       for(int i=1;i<=줄11;i++) {
    	   for(int j=1;j<=줄11;j++) {
    		   if(i==j) System.out.print("*");
    		   else if((i+j)==줄11+1) System.out.print("*");
    		   else System.out.print(" ");
    	   }
    	   System.out.println();
       }
       
       /*별문제12 : 입력받은 줄만큼 출력
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
       
       /*별문제13 : 입력받은 줄만큼 출력
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
       



