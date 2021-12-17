package 연습;

import java.util.Scanner;

public class While5강3시간16분 {
    public static void main(String[] args) {
    	// ForQ5P118을 while을 사용하는 로직으로 고쳐보세요.
        // i, j변수, 조건식, 증감식 부분을 신경써서 옮겨주세요.
    	Scanner scan = new Scanner(System.in);
    	System.out.println("한 변의 너비를 엽력해주세요.");
    	int count = scan.nextInt();
    	int i = 0;
    	while (i < count)
    	{
    		int j = 0;
    		while(j < count) {
    			System.out.print("*");
    			j++;
    			
    		}
    		System.out.println();
    		i++;
    	}
    	
    	
    	
	}
}
