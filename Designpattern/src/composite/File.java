package composite;

public class File implements Entry {

	// 파일 이름을 저장할 변수
	private String name;
	
	// 대입 받아서 생성자를 만들어보기
	public File(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Entry entry) {
		System.err.println("You can't add a file nor directory on the file");
	}

	@Override
	public void remove() {
		System.out.println(name +" 이/가 삭제 되었습니다.");
	}

	@Override
	public void rename(String name) {
		this.name=name;
	}

}
