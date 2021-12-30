import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto3 {

	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		int getNum = 0;
		while(lotto.size()!= 6) {
			getNum=(int)(Math.random()*45)+1;
			if(!lotto.contains(getNum)) {
			 	lotto.add(getNum);
			
		}}
		Collections.sort(lotto);
		System.out.println("추첨된 번호 :" + lotto);
		
		List<Integer> goodlotto= new ArrayList<>();
		int getNum1= 0;
		int count=0;
		while(!lotto.equals(goodlotto)) {
			goodlotto.clear();
		
			while(goodlotto.size()!= 6) {
				getNum1=(int)(Math.random()*45)+1;
				if(!goodlotto.contains(getNum1)) {
					goodlotto.add(getNum1);
				}
					}
			Collections.sort(goodlotto);
			System.out.println(""+ lotto + goodlotto);
			count++;
			
					}
		System.out.println("                  내가 구매한 횟수 :" + count);
		}}
