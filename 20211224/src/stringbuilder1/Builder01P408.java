package stringbuilder1;

public class Builder01P408 {

	public static void main(String[] args) {
		// StringBuilder는 String클래스와의 로직차이로 인해
		// 속도 개선이 되었습니다. 일부 기능은 String의 기능과 겹칩니다.
		StringBuilder a = new StringBuilder("abefg");
		//2번 이후의 모든 자료를 다 1칸씩 뒤로 밀고 확보된 공간에 "cd"입력
		a.insert(2, "cd");//****삭제가 아니라 뒤로 밀어주고 사이에 글씨를 넣는 것이다.***중요함*****

	}//****************************중요함******************

}
