package injection;

public class InjectionMain {

	public static void main(String[] args) {
		Injection injection = new Injection("JavaScript");
		injection.setDiff2("Spring");
		injection.disp();
		
		injection = new Injection("Frontend");
		injection.disp(); //생성자는 있는데 setDiff2를 호출 안해서 diff2가 null인 상황.
	}

}
