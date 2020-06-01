package com.biz.classis.service;

import com.biz.classis.model.ScoreVO;

/*
 * method의 중복정의
 * method overloading 
 * method의 매개변수가 다르면 같은이름의 method를 
 * 한 클래스내에서 중복정의하여 사용할수 있다. 
 * 
 * 
 * java 이전의 언어에서는
 * 클래스를 모듈이라는 이름으로 불렀는데
 * 1개의 모듈, 1개의 파일내에서는
 * 같은 이름의 method(함수)를 정의 할 수 없었다.
 * 
 * java에서는 method의 매개변수 개수가 다르면 
 * 같은 이름의 method를 사용할수 있다.
 * 호출하는 곳에서 매개변수 전달을 다르게 수행하면
 * 자동으로 method가 연결되어 코드가 수행된다.
 * 
 * 또한
 * method의 매개변수 개수가 같은경우라도
 * 매개변수의 type이 다르면 이름이 같은 method를 정의할 수 있다.
 */

public class ScoreService {
	
	public int sum() {
		
		return 0;
	}
	//Score클래스를 매개변수로 받은 method
	public int sum(ScoreVO score) {
		/*
		 * method의 매개변수 전달
		 * 전달하고자 하는 매개변수가 몇개 안될때는
		 * 매개변수를 잘못 전달하여 발생하는 문제가 별로 없다.
		 * 하지만 매개변수의 개수가 많아지면
		 * 값이 뒤바뀔수도 있고, 경우에 따라 누락되거나,
		 * 중복 등 잘못전달 될수 있다.
		 * 
		 * 이럴때 매개변수를 담을 클래스를 만들고 
		 * 인스턴스를 생성한 후 인스턴스의 맴버변수에 값을 담고
		 * 인스턴스를 매개변수로 전달하면
		 * 1개의 매개변수만으로 코드를 해결할 수있다.
		 * 
		 * 클래스를 만들고 인스턴스를 생성하는 절차가 번거롭기는 하지만
		 * 그만큼 오류가 발생할 확률이 낮은 코드 작성이 가능하다.
		 */
		int sum =score.getIntKor();
		sum += score.getIntEng();
		sum += score.getIntMath();
		sum += score.getIntMusic();
		sum += score.getIntArt();
		sum += score.getIntSci();
		
		score.setIntSum(sum);
		score.setIntAvg(sum / 6);
		return sum;
		
		
		
		
	}
	
	public int sum(int kor, int eng, int math, int music, int art, int sci) {
		int sum = kor + eng + math + music + art + sci;
		return sum;
	}
	
	public float sum(float kor, float eng, float math) {
		float sum = kor + eng + math;
		return sum;
	}

	
	
	public int sum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
	
	public int sum(int kor, int eng) {
		return kor + eng;
	}
	
	public float sum(int kor, float eng) {
		return kor + eng;
	}
	public float sum(float kor, int eng ) {
		return kor + eng;
	}
	


	
}
