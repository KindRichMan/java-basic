
public class ForQ4P117 {

	public static void main(String[] args) {
		// 2단부터 9단, 시작은 몇부터?
		for (int i =2; i < 10; i++) {
			//1~9까지 곱하기.
			for (int j = 1; j < 10; j++) {
				//i * j = 결과값
				System.out.println(i + "*" + j + "=" +i*j);
			}
			//1~9까지 다 돌고 나서 아래쪽에 구분선 깔기.
			System.out.println("============");
		}
		}

}
