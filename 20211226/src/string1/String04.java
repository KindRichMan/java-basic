package string1;

public class String04 {

	public static void main(String[] args) {
		String name = "김수한무 거붕이와 두루미 삼천갑자 동박삭 치치카포 사리사리센터";
		System.out.println(name.length());
		
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		report = report.replace("김영수", "박문수");
		System.out.println(report);

	}

}
