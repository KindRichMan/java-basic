package math1;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 3/1확률로 가위, 바위, 보를 부여받으며
		// 같은 요소가 나오면 무승부입니다.
		// 가위 바위 보를 뽑는 부분부터 작성해주세요.
		// 같은 요소가 나오면 무승부입니다.
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서
		// 조건식에 ||을 사용합니다.
		// 0 = 가위, 1 = 바위, 2 = 보
		int myValue = (int)(Math.random()* 3);
		int comValue = (int) (Math.random()*3);
		
		if (myValue == 0 && comValue == 2) {
			    System.out.println("내가 이겼습니다.");
			    System.out.println("내가 낸 것 : 가위" );
			    System.out.println("컴퓨터가 낸것 : 보");
	
		}else if(myValue == 0 && comValue == 1) {
			    System.out.println("내가 졌습니다.");
			    System.out.println("내가 낸 것 : 가위" );
			    System.out.println("컴퓨터가 낸것 : 바위");
			
				}else if(myValue == 1 && comValue == 0) {
			    System.out.println("내가 이겼습니다.");
			    System.out.println("내가 낸 것 : 바위");
			    System.out.println("컴퓨터가 낸것 : 가위");
			
				}else if(myValue == 1 && comValue == 2) {
			    System.out.println("내가 졌습니다.");
			    System.out.println("내가 낸 것 : 바위");
			    System.out.println("컴퓨터가 낸것 : 보" );
		
		
			}   else if(myValue == 2 && comValue == 0) {
		  	    System.out.println("내가 졌습니다");
			    System.out.println("내가 낸 것 : 보");
			    System.out.println("컴퓨터가 낸것 : 가위");
			}else if(myValue == 2 && comValue == 1) {
			    System.out.println("내가 이겼습니다.");
			    System.out.println("내가 낸 것 : 보");
		     	System.out.println("컴퓨터가 낸것 : 바위");
			
		
			
			}else if (comValue == 0 && myValue == 2) {
			    System.out.println("컴퓨터가 이겼습니다.");
			    System.out.println("내가 낸 것 : 가위" );
			    System.out.println("컴퓨터가 낸것 : 보");
		}else if(comValue == 0 && myValue == 1) {
			    System.out.println("컴퓨터가 졌습니다.");
			    System.out.println("내가 낸 것 : 가위" );
			    System.out.println("컴퓨터가 낸것 : 바위" );
			
				}else if(comValue == 1 && myValue == 0) {
			    System.out.println("컴퓨터가 이겼습니다.");
			    System.out.println("내가 낸 것 : 바위");
			    System.out.println("컴퓨터가 낸것 : 가위");
				}else if(comValue == 1 && myValue == 2) {
			    System.out.println("컴퓨터가 졌습니다.");
			    System.out.println("내가 낸 것 : 바위");
			    System.out.println("컴퓨터가 낸것 : 보" );
		
		
			}   else if(comValue == 2 && comValue == 0) {
		  	    System.out.println("컴퓨터가 졌습니다");
			    System.out.println("내가 낸 것 : 보");
			    System.out.println("컴퓨터가 낸것 : 가위");
			}else if(comValue == 2 && comValue == 1) {
			    System.out.println("컴퓨터가 이겼습니다.");
			    System.out.println("내가 낸 것 : 보");
		     	System.out.println("컴퓨터가 낸것 : 바위");
			}else if(myValue == comValue){
				System.out.println("비겼습니다.");
			}
		}
	}


