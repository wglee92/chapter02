package person;

public class Student extends Person {
	void test() {
		//protected는 자식에서 접근 가능
		age = 10;
		
		//default는 같은 패키지에서만 접근 가능
		height = 140;

	}
}
