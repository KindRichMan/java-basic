package 연습;

public class 중첩반복문연습1 {
    public static void main(String[] args) {
    	// 2단부터 9단, 시작은 몇부터?
    	// 구구단은 2~9단까지 출력하게 됩니다.
    	// 중첩 반복문을 사용해서 작성해주세요.
    	// 바깥쪽 반복문(int i)는 2~9까지 반복하게 해 주시고
    	// 안쪽 반복문은(int j) 1~9까지 반복하게 해주세요.
    	// i*j를 출력하게 하면 됩니다.
    	for (int i= 2; i < 20; i++) {
    		//1~9까지 곱하기.
    		for (int j = 1; j < 20; j++) {
    			// i*j= 결과값
    			System.out.println(i +"*" + j + "=" +i*j );
    		}
    		//1~9까지 ㄷ ㅏ돌고 나서 아래쪽에 구분선 깔기
    		System.out.println("=========");
    	}
	} 
}
