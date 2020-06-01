package com.biz.classis;

import com.biz.classis.model.Address;

public class ClassEx_04 {
	
	public static void main(String[] args) {
		Address address = new Address();
		
		// city 변수는 private 이기 때문에
		// 인스턴스를 통해서 직접 접근불가		
		// address.city = "광주광역시"
		
		
		// city 변수에 값을 저장하기 위한
		// setter method()에게 값을
		// 저장해 달라고 요청
		address.setCity("광주광역시");
		
		// city 변수에서 값을 읽기 위한
		// getter method()를 사용하여
		// 값을 가져오기
		String city = address.getCity(); 
		
		address.setCity("서울특별시");
		System.out.println(city);
		
		
	}
	


}
