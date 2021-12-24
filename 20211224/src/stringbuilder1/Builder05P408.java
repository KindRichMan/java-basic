package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		// 문자열은 "abcdefghijklmnopqrstuvwxyz"입니다.
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		System.out.println(a);
		
		for(int i = 0; i < a.length(); i++) {
			// for(int i = 0; i < a.length(); i+=3){
			// if(i % 3 ==0) {
			// a.deleteCharAt(i);
			if(i % 3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
		
		

	}

}
