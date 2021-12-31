import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lotto123 {

	public static void main(String[] args) {
		         // 로또복권 당첨 시뮬레이트를 만들어주세요.
				// 1. 당첨번호 6개를 뽑습니다.
				// 2. 추첨번호 6개를 뽑습니다.
				// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지.
				// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
				// 이어서  비교해서 일치여부 검사.
		
		List<Integer> lotto = new ArrayList<>();
		int getNum = 0;
		int count =0;
		while(lotto.size()!=6) {
			getNum = (int)(Math.random()*45)+1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
				}
			}	
		Collections.sort(lotto);
		//System.out.println("추첨된 번호 :" + lotto);
		
		List<Integer> lucklotto = new ArrayList<>();
		int getNum1 = 0;
		while(!lotto.equals(lucklotto)) {
			lucklotto.clear();
		
			while(lucklotto.size()!=6) {
				getNum1= (int)(Math.random()*45)+1;
				if(!lucklotto.contains(getNum1)) {
				lucklotto.add(getNum1);
				}
			}
			Collections.sort(lucklotto);
			System.out.println("" + lotto + lucklotto);
			
			count++;
}

			System.out.println("내가 구매한 복권횟수: " + count);
		
	
	}}
