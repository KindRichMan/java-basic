package 연습;

public class Item {
	public int num;
	public Item(int n) {
		num = n;
		System.out.println(num +"번 객체 생성.");
	}
	
	protected void finalize() {
		System.out.println(num + "객체삭제.");
	}

}
