package templete;

import java.util.ArrayList;
import java.util.List;

public class UnitMain {

	public static void main(String[] args) {
		
		// 템플릿 메소드 패턴이 적용된 클래스의 인스턴스를 만들기
		Unit unit = new UnitImpl(); // 변수는 인터페이스 이름을 사용하고, 생성자는 클래스 이름을 사용한다!
		
		// 리스트를 생각해보면 된다
		List<String>list = new ArrayList<String>(); // 인터페이스<자료형>객체명 = 생성자는 List를 상속받은 ArrayList<자료형>(); 
		
		unit.attack();
		unit.move();

	}

}
