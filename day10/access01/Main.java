package day10.access01;

public class Main {

	public static void main(String[] args) {
		// Parent를 상속받은 Child 내부의 자료 조회
		Child c = new Child();
		// 1. public 자료
		System.out.println(c.a);
		// 2. protected 자료
		// 현재 Main.java와 같은 패키지 내부에 Parent, Child가 있으므로
		// protected 접근 가능
		System.out.println(c.b);
		// 3. private 자료  // 접근 불가능.
		//System.out.println(c.c);
		
		// 4. default 자료
		System.out.println(c.d);

	}

}
