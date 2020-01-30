package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Directory implements Entry {

	private String name;
	// 파일이나 Directory를 소유 할 수 있기 때문에 Entry를 여러개 저장 할 수 있는 자로규조를 소유

	List<Entry> list;

	public Directory(String name) {
		this.name = name;
		list = new ArrayList<Entry>();
	}

	@Override
	public void add(Entry entry) {
		list.add(entry);
	}

	@Override
	public void remove() {
		// Iterator를 이용해서 데이터에 접근

		Iterator<Entry> iter = list.iterator();

		while (iter.hasNext()) {
			Entry entry = iter.next();
			
			if(entry.getClass().getName().equals("composite.Directory")) {
				System.out.println("하위 디렉토리 자료도 다 삭제할까요?(삭제는 y)");
				Scanner sc = new Scanner(System.in);
				String reply = sc.nextLine();
				if(reply.equals("Y") || reply.equals("y")) {
					System.out.println("모두 삭제하겠습니다.");
				}
				else {
					System.out.println("중단합니다.");
					return;
				}
			}
			entry.remove(); //이게 Entry 클래스의 remove를 불러온것.
		}
		System.out.println("모두 삭제되었습니다.");
		// File이 있으면 File의 remove를 호출하고, Directory면 Directory의 remove를 호출 - Polymorphism
	}

	@Override
	public void rename(String name) {
		this.name = name;
	}

}
