package com.biz.addr.exec;

import com.biz.addr.service.AddrService03;

public class AddrEx_03 {
	public static void main(String[] args) {
		
		AddrService03 addrService = new AddrService03();
		
		for(int i = 0; i < 100; i++) { 
			boolean ret = addrService.inputAddr();
			if(ret == false) {  // 만약 알이티가 폴스이면 브레이크문으로 중단하라
				break;
			}
		}
		System.out.println("입력 종료");
		
		
		
		
	}

}
