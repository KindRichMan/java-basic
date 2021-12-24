package string1;

import java.util.Scanner;

public class String10티쳐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "abc123";
		String pw = "aaaaaaa";
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력해주세요.");
		String uId = scan.nextLine();
		
		if(uId.equals(id)) {
			System.out.println("비밀번호를 입력해주세요.");
		String uPw = scan.nextLine();
		
		if(uPw.equals(uPw)) {
			System.out.println(id + "님 환영합니다.");
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		}else {
			System.out.println("그런 아이디는 없습니다.");
		}
		}

	}


