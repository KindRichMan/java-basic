import java.util.Scanner;

public class BreakQ01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
			int goal = scan.nextInt();
			
			int count = 1;
			int total = 0;
			while(true) {
				   total += count ;
				System.out.println("1부터"+ count +  "까지의 총합은 :" + total  +"입니다.");
				if(total >= goal) {
					System.out.println("목표값 :" + goal);
					System.out.println("총 합 :" + total);
					System.out.println("몇 까지 더했나? :" + count);
					break;
				}
	                	count++;
			}
		

	}

}
