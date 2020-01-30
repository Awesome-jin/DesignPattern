package composite;

public class CompositeMain {

	public static void main(String[] args) {
		File f1 = new File("파일1");
		File f2 = new File("파일2");
		File f3 = new File("파일3");
		File f4 = new File("파일4");
		File f5 = new File("파일5");
		
		Directory subDirectory = new Directory("하위 디렉토리");
		subDirectory.add(f1);
		subDirectory.add(f2);
		
		Directory superD = new Directory("상위 디렉토리");
		superD.add(f3);
		superD.add(subDirectory); // 여기까지하면 하위디렉토리 변수까지 f1,f2,f3가 다 들어가 있을 것.
		superD.remove(); //이 remove는 Directory 생성자에 딸린 메소드니까 아까 iterator로 다 지우는 명령어
		
		//자료형 이름 출력
		/*
		System.out.println(superD.getClass().getName());
		Entry entry = new Directory("디렉토리");
		System.out.println(entry.getClass().getName());
		*/
	}

}
