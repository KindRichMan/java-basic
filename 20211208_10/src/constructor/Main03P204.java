package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		Webtoon a =new Webtoon("착한부자 무달", "김무환");
		a.getInfo();
		
		a.uploadWebtoon();
		a.uploadWebtoon();
		a.uploadWebtoon();
		a.uploadWebtoon();
		a.uploadWebtoon();
		
		a.getInfo();
		a.uploadWebtoon();
		
		//완결여부	 생성(false에서 true로 변경)
		
		a.completeWebtoon();
		a.getInfo();
	}

}
