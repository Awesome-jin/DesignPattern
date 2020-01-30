package singleton;

public class SingleMain {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.sharedInstance();
		Singleton s2 = Singleton.sharedInstance();
		
		//해시코드를 출력해보기
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2)); // 싱글톤이라 동일함

	}

}
