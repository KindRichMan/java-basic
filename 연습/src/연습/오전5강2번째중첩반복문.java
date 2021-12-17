package 연습;

public class 오전5강2번째중첩반복문 {
    public static void main(String[] args) {
    	// 피라미드형 별을 찍어보겠습니다.
    			// 아래와 같은 별을 찍을수 있도록 코드를 작성해주세요.
    			//     *
    			//    **
    			//   ***
    			//  ****
    			// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
    			// 힌트 : 띄어쓰기를 3/2/1개 순으로 적는 반복문 하나와
    			//       *을 1/2/3/4개순으로 적는 반복문 하나 해서
    			//       i반복문내부에 j, k 총 2개의 반복문이 추가로 돕니다.
    			
    			// 줄수를 담당하는 i 반복문은 4바퀴 돌게 만듭니다.
    	    for(int a = 0; a < 4; a++ ) {
    	    	for(int b = 0; b < 4-a-1; b++) {
    	    		System.out.print(" ");
    	    		}
                   for(int c = 0; c < a+1; c++ ){
                   System.out.print("*");
    	    }
    	    System.out.println();
    }
    
    }
    }
