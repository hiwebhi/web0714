package Day05;

public class Day05_1 {

public static void main(String[] args) {
	
    //반복문 [조건에 따른 반복실행]
	  // for , while, do~while
	  //1.for : 어디서부터 어디까지 어떻게 증가하면서 반복실행
	     //for (초기값, 조건문, 증감식){ 실행문;}
	  //2.for 중첩
	      //for1(){for2(){for3(){}  } }
	          //총 실행횟수 : for1 실행횟수* for2 실행횟수 * for3 실행횟수
	
		//예1)
		for (int i =0; i<10; i++) {
				//1.초기값(int i=0): for 시작변수의 값
			    //2.조건문(i<10) : true이면 반복문 실행 아니면[false] 실행x
			    //3.증감식(i++//i=i+1//i+=3 3씩 증가) :변수의 증감단위
				System.out.print(i+" ");
				///i=0일때 조건:T  반복실행:O
				//증감식[i+1] i=1일때 조건: t 반복실행 O
				//증감식[i+1] i=2일때 조건: t 반복실행 O
				//~~~~~~~~~~~~~~~~~~
				//증감식[i+1] i=10일때 조건: f 반복종료
			
	
				}
		
	    System.out.println("\n------------------");
	    //예2) 1~50까지 출력
	    for (int 변수=1; 변수<=50; 변수++) {System.out.println(변수);}
	    //예3)1~50까지 3씩 증가
	    for (int i=1;i<=50;i+=3) {System.out.println(i+" ");}
	    
	    System.out.println("\n------------------");
	    //예4) 1~50까지 누적합계
	    int 누적합계=0; //누적값을 저장할 변수
	    for (int i=1;i<=50;i++) {누적합계+=i;}
	    System.out.println("1~50까지 누적합계:"+누적합계);
	    
	    System.out.println("\n------------------");
	    //예5)1~50까지 7의배수 누적합계
	    int 누적합계2=0;
	    for (int i=0; i<=50; i+=7) {누적합계2+=i;}
	    System.out.println("1~50까지 7배수들의 누적합계:"+누적합계2);
	    /////////////////////////////////
	    int 누적합계3=0;
	    for(int i=1;i<=50;i++) {if(i%7==0)누적합계3+=i;}
	    System.out.println("1~50까지 7배수들의 누적합계:"+누적합계3);
	    
	    System.out.println("\n------------------");
	    //예6) 2단 구구단 [2단:상수  곱:변수]
	    for(int 곱=1; 곱<=9; 곱++) {
	    	//곱 변수는 1부터 9이하까지 1씩 증가하면서 반복실행[9번실행]
	    	System.out.println("2X"+곱+"="+(2*곱));
	    }
	    System.out.println("\n------------------");
	    
	 //for 중첩
	    for (int i=0; i<=5; i++) {
	    	System.out.println("i의 위치:"+i);
	    	for(int j=0;j<=5;j++) {
	    		System.out.println("---j의 위치:"+j+"그리고 현재 i:"+i);
	    	}
	    }
	    	//i가 1번 실행마다 j는 5번 실행
	      	//i는 총 5번 실행=>j는 25번 실행
	    
	    //예7)2~15단까지 구구단
	    for(int 단=2; 단<=15;단++) {
	    	System.out.println("----"+단+" 단 결과");
	    	for(int 곱=1; 곱<=9; 곱++) {
	    		System.out.println(단+"X"+곱+"="+(단*곱));
	    	}
	    }
	   
	    		
	    
     }



}
