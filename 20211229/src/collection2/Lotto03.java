package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이트를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지.
		// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서  비교해서 일치여부 검사.
			List<Integer> lotto = new ArrayList<>();
		
		int getNum = 0;
		while(lotto.size()!= 6) {
			getNum=(int)(Math.random()*45) + 1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}	
		}
		     Collections.sort(lotto);
		    //System.out.println("추첨된 번호 :" + lotto); 
		
		    List<Integer> lotto2 = new ArrayList<>();
		    int winNum = 0;
		    //아래 6개 뽑고 비교하는 부분을 반복문으로 처리해야합니다.
		    // 조건식은 당첨인 경우 탈출로 해주시면 됩니다.
		 // 저의 경우는 반복문 진입 전에 int count = 0; 을 만들어놓고
		    int count = 0;
		    while(!lotto.equals(lotto2)) {//로또와 로또2와 다르다면
		    	//6개가 이미 뽑혀있는 상황이라면 당첨번호를 어떻게 해 줘야 할지?
		          lotto2.clear();
		    	 while(lotto2.size()!=6) {
					winNum=(int)(Math.random()*45) + 1;
					
					if(!lotto2.contains(winNum)) {
						lotto2.add(winNum);
						
					}
		         }
		             Collections.sort(lotto2);
		     		System.out.println("" + lotto + lotto2); 
		     		// 모든 로직이 끝난 시점이 번호를 1세트 뽑은 지점임
		     		// 그러므로 모든 로직이 다 끝나고 마지막에 1 더해줌.
		     		// 반복문이 한 바퀴 돌 때 마다 count++;를 이용해 1씩 증가시켜놓고
		     		count++;
	}        
		    // 탈출 후에 콘솔에 최종 횟수만 찍히도록 합니다.
		    // 반복문이 몇 바퀴 돌았는지 카운팅하는 로직을 위에 추가해주세요.
		    System.out.println("구매한 로또복권의 개수 :" + count);
	                  
		             
		              
		              
		              
} 

}

