package adapter;

public class NewSystem extends OldSystem implements Target{ //Old로부터 상속을 받은 NewSystem 클래스

	/*@Override 
	★이게 흔한 오버라이딩 : 상위 클래스의 메소드를 호출을 해놓고 기능을 더 추가!
	public void process() {
		super.process();
		System.out.println("기능 추가");
	}
	*/
	
	@Override   
	public void process() {
		System.out.println("그냥 새로운 기능으로 사용");
	}
	
	@Override
	public void legacyProcess() {
		super.process();
	}
	
}
