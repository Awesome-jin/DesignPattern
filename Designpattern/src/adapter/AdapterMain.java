package adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		// NewSystem의 경우, 상속도 받았고 Implements도 했기 때문에 그냥 원래 하던 방법으로 생성자 만들기
		NewSystem news = new NewSystem();
		news.legacyProcess();
		news.process();
		
		//(결론) 시간이 지나며 기존의 개념을 바꿔버려야 할 때, 사용하게 되는 방법
	}

}
