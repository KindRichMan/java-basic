import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto4 {

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
		//System.out.println("" + lotto);
		
		List<Integer> lucklotto = new ArrayList<>();
		int getNum2 = 0;
		int count =0;
		while(!lotto.equals(lucklotto)) {
			lucklotto.clear();
		
		   	while(lucklotto.size()!= 6) {
				getNum2=(int)(Math.random()*45)+1;
				if(!lucklotto.contains(getNum2)) {
					lucklotto.add(getNum2);
				}
			}
			Collections.sort(lucklotto);
			System.out.println("" + lotto + lucklotto);
	count++;
	
	 }         	  System.out.println("내가 구매한 복권 횟수: " + count);
	          
	}
	
	}
