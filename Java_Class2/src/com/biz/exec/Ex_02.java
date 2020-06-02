package com.biz.exec;

import com.biz.model.AddressVO;
import com.biz.service.AddrServiceV1;

public class Ex_02 {
	
	public static void main(String[] args) {
		
		AddressVO[] address = new AddressVO[5];
		
		address[0] = new AddressVO();
		address[1] = new AddressVO();
		address[2] = new AddressVO();
		address[3] = new AddressVO();
		address[4] = new AddressVO();
		
		for(int i =0; i < address.length; i++) {
			address[i] = new AddressVO();
		}


		
		
		address[0].setName("이몽룡");
		address[0].setAddr("서울");
		address[0].setTel("010-111");
		address[0].setAge(11);
		
		address[1].setName("성춘향");
		address[1].setAddr("광주");
		address[1].setTel("010-222");
		address[1].setAge(22);
		
		address[2].setName("홍길동");
		address[2].setAddr("부산");
		address[2].setTel("010-333");
		address[2].setAge(33);
		
		
		address[3].setName("임꺽정");
		address[3].setAddr("울산");
		address[3].setTel("010-444");
		address[3].setAge(44);
		

		address[4].setName("임사홍");
		address[4].setAddr("대전");
		address[4].setTel("010-555");
		address[4].setAge(55);
		
		AddrServiceV1 addrService = new AddrServiceV1();
		// 배열을 매개변수에 통해 method에게 전달할때는 이름만 붙여주면 된다.
		addrService.AddrList(address);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		
		
		
	
		
		
		
		
		
		
	}
	


}
