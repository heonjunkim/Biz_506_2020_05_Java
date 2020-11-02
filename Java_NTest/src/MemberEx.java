

/*
 * Java에서는 모든 기본파일을 클래스라고 한다.
 * Java에서 코딩을 시작하면 제일 먼저 클래스를 생성하고
 * 클래스에 진입점 method를 생성하여야 코드를 실행해볼수 있게 된다.
 * 클래스만 작성된 상태에서 진입 method가 없으면 스스로 아무런 코드도 실행할 수 없다.
 */
public class MemberEx {
	/*
	 * 진입점 method는 클래스를 컴파일하고 run 했을때 java의 가상머신이 
	 * 제일먼저 호출하는 method이고 그 문법이 정해져 있다.
	 * 
	 * args 배열은 현재 클래스를 cmd 창에서 실행할때 
	 * java MemberEx 문자열 형식으로 명령을 입력하면 
	 * 클래스 뒤에 따라오는 문자열이 args변수에 담겨서 진입점 main method로 전달이 된다.
	 * 
	 */
	public static void main(String[] args) {	
//		System.out.println(args[0]);
		System.out.println("여기는 클래스 진입점 method 입니다");
		
	}

}
