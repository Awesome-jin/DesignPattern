package injection;

public class Injection {

	// 모든 인스턴스가 "Java"를 저장해서 사용한다고 해보자.
	private String common;
	private String diff1;
	private String diff2;
	
	// 생성자를 이용한 주입 방법 (생성자를 만들면서 동시에 값을 주입해버림)
	public Injection(String diff1) {
		common = "Java";
		this.diff1 = diff1;
	}
	
	// setter를 이용한 방법
	public void setDiff2(String diff2) {
		this.diff2 = diff2;
	}
	
	// 서버 프로그램을 할 때는, 처음부터 값이 무조건 있는 생성자 방법을 추천
	// 클라이언트 프로그래밍을 한다 그러면 속도가 느려도 필요할 때 만드는게 나음!
	public void disp() {
		System.out.println(common.toUpperCase());
		System.out.println(diff1.toUpperCase());
		System.out.println(diff2.toUpperCase());
	}
	
}
