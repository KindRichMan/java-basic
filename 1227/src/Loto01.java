import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loto01 {

	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		int getNum= 0;
		while(lotto.size()!=6) {
			getNum=(int)(Math.random()*45)+1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		         Collections.sort(lotto);
		         System.out.println("개표 번호 :" + lotto);
	                 

                    List<Integer> lucklotto = new ArrayList<>();
                    int getNum1 =0;
                     int count =0;
	               while(!lotto.equals(lucklotto)) {
	            	   lucklotto.clear();
	               
                     while(lucklotto.size()!=6) {
	                    	getNum1=(int)(Math.random()*45)+1;
	                    	if(!lucklotto.contains(getNum1)) {
	                    		lucklotto.add(getNum1);
	                    	}
	                    }
	                    Collections.sort(lucklotto);
	                    System.out.println(""+lotto + lucklotto);
                      count++;
	}
	                      System.out.println("구매한 복권수량: " + count);
	}
              }      	
                    	
                    