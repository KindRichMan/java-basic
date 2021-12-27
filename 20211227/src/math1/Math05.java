package math1;

public class Math05 {

	public static void main(String[] args) {
		// 주사위 게임을 만들어주세요.
		// 주사위게임은 내 값은 maValue변수에, 
		// 컴퓨터값은 comBalue 변수에 값을 난수발생으로 1~6번으로 부여한 뒤
		// 값이 같다면 무승부, 아니면, 나 혹은 컴퓨터 중 승자가 누구인지 알려주는 방식입니다.
	    
		int maValue = (int)(Math.random()* 6) + 1;
		int comBalue = (int)(Math.random()* 6) + 1;
		if(maValue == comBalue){
		System.out.println("무승부 입니다.");
		System.out.println("내값 :" + maValue);
		System.out.println("컴퓨터 값 :" + comBalue);	
	}   else if (maValue < comBalue) {
		System.out.println("컴퓨터가 승리했습니다.");
		System.out.println("내값 :" + maValue);
		System.out.println("컴퓨터 값 :" + comBalue);	
	}   else {
		System.out.println("내가 승리했습니다.");
		System.out.println("내값 :" + maValue);
		System.out.println("컴퓨터 값 :" + comBalue);	
	}
	}
}