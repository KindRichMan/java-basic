package collection11;

import java.util.ArrayList;
import java.util.List;

public class ArraysList11111 {

	public static void main(String[] args) {
		// List는 생성자료형으로 ArraysList, LinkedList를 받을 수 있고
		// 기본적으로는 ArraysList를 쓰게 됩니다.
		// java.util의 List나 ArraysList를 사용할 수 있습니다.
		
		// List는 생성시 List<자료형> 을 적어넣어 해당 자료형을
		// 가변 길이 배열형태로 받아줄 수 있습니다.
		// <>사이에는 기본형자료(int, double, boolean 등)은 올 수 없습니다.
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이는 가변적)
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1, 100);//추가
		System.out.println(list1);
		list1.set(1, 99);//교체 
		System.out.println(list1);

	}

}
