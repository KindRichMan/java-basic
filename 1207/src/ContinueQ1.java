import java.util.Scanner;

public class ContinueQ1 {

	public static void main(String[] args) {
		        //1부터 n까지 총합을 구하되 홀수끼리만 더한
				// 총합을 구하는 구문을 작성해주세요.
				//conftinue문을 반드시 사용하는 로직으로 작성해주세요.
				//n은 스캐너로 입력받습니다.
				
				// 1. 정수 입력받기.
		     Scanner scan = new Scanner(System.in);
		     System.out.println("목표 정수를 입력 해주세요.");
		     int goal = scan.nextInt();
		     
		     
		     // 반복문 만들기
		     int total= 0;
		     int count = 0;
		     while(count < goal ) {
		    	count += 1;
		    	//count가 짝수면 스킵(%, 짝수는 몇으로 나눴을대 나머지가 0인 수?)
		    	
		    	if(count % 2 == 0 ) {
		    		continue;
		    	}
		    	
		    	total += count;
		    	System.out.println("현재 " + count +"까지 더했습니다.");
		    	System.out.println("총합은 " + total +"입니다.");
		     }

	}}


