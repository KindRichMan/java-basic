import java.util.Scanner;

public class 연습1 {
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("성적을 입력해주세요.");
        int s = scan.nextInt();
        
        if(s  >= 95) {
        	System.out.println("A+입니다.");
        } else if (s >= 90) {
        	System.out.println("A0입니다.");
        } else if (s >= 85 ) {
        	System.out.println("B+입니다.");
        } else if (s >= 80) {
        	System.out.println("B0입니다.");
        } else if (s >= 75) {
        	System.out.println("C+입니다.");
        }	else if (s >= 70) {
        	System.out.println("C0입니다.");
        }	else {
        		System.out.println("꽝입니다.");
        	}
        	
                }
   }

