package static2;

public class Asean {
	
	private int check;
	private int midTerm;
	private int finalTerm;
	
	
	private static int presentationScore = 19; 
	
	public Asean(int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm= finalTerm;
		}
	
		
	
			public void showAseanInfo() {
				System.out.println("조원의 성적.");
				System.out.println("출석 :" + check + ", 중간고사 :" + midTerm + 
						", 기말고사 :" + finalTerm + "발표 :" + presentationScore );
			}
			//private static은 같은 static영역에서 접근하도록 만들어야 합니다.
			public static void showPre() {
				System.out.println("ASEAN 조의 발표점수 : " + presentationScore );
			}

}
