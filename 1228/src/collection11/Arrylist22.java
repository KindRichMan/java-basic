package collection11;

import java.util.ArrayList;
import java.util.List;

public class Arrylist22 {

	public static void main(String[] args) {
		        // 여러분들이 직접 String 자료를 가변적으로 받을 수 있는
				// ArrayList를 만들어주시고 안쪽에 자료로
				// "사과". "딸기", "망고", "블루베리", "파인애플"을 넣어주세요.
				// 자료가 적재된 ArraysList를 콘솔에 적어주세요.package collection11;
		List<String> list1 = new ArrayList<>();
		list1.add("사과");		
		list1.add("딸기");		
		list1.add("망고");		
		list1.add("블루베리");		
		list1.add("파인애플");	
		System.out.println(list1 );
		
		System.out.println(list1.contains("사과"));
		System.out.println(list1.contains("복숭아"));
		
		System.out.println(list1.get(1));
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		
		List<String> list2 = new ArrayList();
		System.out.println(list2.size());
		System.out.println(list2.isEmpty());
		


	}

}
