package 연습;

public class Main_Weptoon {

	public static void main(String[] args) {
		Weptoon p1 = new Weptoon("하늘에서 왔다","오현아");
		p1.getInfo();
		
		//업로드하기
		p1.uploadWebtoon();
		p1.getInfo();
		p1.uploadWebtoon();
		p1.getInfo();
		p1.uploadWebtoon();
		p1.getInfo();
		p1.uploadWebtoon();
		p1.getInfo();
		p1.uploadWebtoon();
		p1.getInfo();
		p1.uploadWebtoon();

	
	    //완결여부 생성(false에서 true로 변경)
	     p1.completeWeptoon();
	     p1.getInfo();
	 } 

}
