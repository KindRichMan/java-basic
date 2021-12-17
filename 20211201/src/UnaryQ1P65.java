
public class UnaryQ1P65 {

	public static void main(String[] args) {
		// int a에 15를 담은 다음 전위 -> 후위 순으로 -- Unary01처럼 사용해서
		// 1씩 차감하고, 콘솔에 찍는것을 반복해주세요.
		//단, 실행 로직은 Unary01에서 그랬든 주석으로 하단에 풀어서 작성까지 해주세요.
		
		int a = 15;
        System.out.println(a--);
        // a값을 콘솔에 찍음.sysout(a(15)) 
        // a값에서 1차감 후 저장. a = a(1) - 1 
        System.out.println(a);
        System.out.println(--a);
        //1. a값을 먼저 1 차감 후 시킴 : a = a(14) - 1
        //증가된 a값을 콘솔에 찍음 : sysout(a(13))
        System.out.println(a);
	}
	
	

}
