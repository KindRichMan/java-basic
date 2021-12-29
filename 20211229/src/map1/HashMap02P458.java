package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("동태찌개", 7000);
		map.put("된장찌개", 6000);
		map.put("청국장", 6000);
		map.put("부대찌개", 8000);
		map.put("아구찜", 20000);
		System.out.println("동태찌개 가격 : " +map.get("동태찌개"));
		System.out.println("된장찌개 가격 : " +map.get("된장찌개"));
		System.out.println("청국장 가격 : " +map.get("청국장"));
		System.out.println("부대찌개 가격 : " +map.get("부대찌개"));
		System.out.println("아구찜 가격 : " +map.get("아구찜"));
	}

}
