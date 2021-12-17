package 연습;

import java.util.Scanner;

public class 연습break문6강1시간 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수의 총합이 몇 이상이 되면 종료하시겠습니까?");
		int goal = scan.nextInt();
		//바퀴수(1바퀴 2바퀴 3바퀴...형식으로1부터 시작)
		int count = 1;
		int total = 0;
		while(true) {
			total += count;
			System.out.println("1부터" +count + "까지의 총합은 :"+total+ "입니다.");
			if(total >= goal) {
				System.out.println("목표값:" + goal);
				System.out.println("총합:" + total);
				System.out.println("몇까지 더했나?:" + count);
				break;
			}
		}
		

	}

}
