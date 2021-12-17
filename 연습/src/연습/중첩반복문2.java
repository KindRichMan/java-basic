package 연습;

import java.util.Scanner;

public class 중첩반복문2 {
       public static void main(String[] args) {
    	// Scanner로 정수를 입력받게 해 주세요.
   		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
   		// 중첩 반복문을 작성해주세요.
   		// ex) 3입력시
   		// ***
   		// ***
   		// ***과 같이 출력
   		// 가로줄 출력시 system.out.print("*");을
   		// 다음줄로 내릴 때만 system.out.println(); 을 씁니다.
    	   Scanner scan = new Scanner(System.in);
    	   System.out.println("한변의 너비를 입력해주세요.");
    	   int count = scan.nextInt();
    	   // i for문 내부에서 println을 실행하므로 세로 길이를 담당
    	   for(int a = 0; a < count; a++) {
    		  // j for문 내부에서 print를 이용해 별을 일렬로 나열시키므로 가로길이를 담당
    		   for(int b = 0; b < count; b++) {
    		   System.out.print("*");
    	   }
    		   System.out.println();
	}}
}
