package string1;

import java.util.Arrays;
import java.util.Scanner;

public class string05P399 {

	public static void main(String[] args) {
		// .length()와 charAt()을 활용해 입력된 전체 문자열을
		// 한 글자씩 한 줄 씩 처리하는 로직을 작성해보세요.
		// 문자열은 Scanner로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str= scan.nextLine();
		
		for(int i =0; i < str.length(); i++) {//length는 입력한 문자열에 숫자부여
			System.out.println(str.charAt(i));//chatAt()는 부여한 숫자를 반복문에 맞춰 하나씩 뽑아준다.
	}
	}
}
