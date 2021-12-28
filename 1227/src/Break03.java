
public class Break03 {

	public static void main(String[] args) {


		outter : for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단 출력.");
			for(int j = 1; j <= 9; j++) {
				if(j > 4) {
					System.out.println("5이상은 직접 알아보기");
					break outter;
				}
				System.out.println(i + "*" + j + "=" + i *j);
			}System.out.println("===========================");
		}

	}

}
