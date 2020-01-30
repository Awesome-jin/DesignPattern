package singleton;

public class Singleton {

	//싱글톤 패턴을 적용하기
	
	//생성자를 private으로 만든다.
	private Singleton() {};
	
	// 자신의 자료형과 동일한 자료형의 static 변수를 생성
	private static Singleton obj;
	
	//obj가 null일때만 인스턴스를 생성하고 리턴하는 메소드를 static으로 생성
	public static Singleton sharedInstance() {
		if(obj==null) {
			obj = new Singleton();
		}
		return obj;
	}
	
}
