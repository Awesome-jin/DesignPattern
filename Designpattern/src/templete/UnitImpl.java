package templete;

public class UnitImpl implements Unit {
	
	// 네이밍 상식. InfterfaceImple : 인터페이스 구현하는 페이지
	// 네이밍 상식2. ClassEx : 상속받은 클래스 
	
	// task2. 인터페이스에 메소드 정리가 끝났으면 인터페이스 구현을 위해 여기서 실제 스크립트 작성
	
	@Override
	public void attack() {
		System.out.println("공격");
	}

	@Override
	public void move() {
		System.out.println("이동");
	}

}
