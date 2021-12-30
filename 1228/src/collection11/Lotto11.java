package collection11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto11 {

	public static void main(String[] args) {
	
		List<Integer> lotto = new ArrayList<>();
		
		int getNum = 0;
		
		while(lotto.size()!= 6) {
			getNum=(int)(Math.random()*45)+1;
			
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		Collections.sort(lotto);
		System.out.println("추첨된 번호:" + lotto);
		
		

	}

}
