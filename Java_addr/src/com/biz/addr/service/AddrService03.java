package com.biz.addr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.addr.domain.AddrVO;

public class AddrService03 {
	
	private List<AddrVO> addrList;

	private Scanner scan; // = new Scanner(System.in);

	public AddrService03() {
		addrList = new ArrayList<AddrVO>();
		scan = new Scanner(System.in);
	}
	/*
	 * 현재 코드는 main에서 지정된 for 반복문의 개수만큼 입력을 수행해야 한다.
	 * 만약 입력하는 도중 입력을 중단하고 싶을때 중단할 수 있도록 코드를 개선하자
	 * 
	 * 입력하는 도중 이름항목에 대신 END 문자열을 입력하면
	 * 입력을 중단한다.
	 */
	public boolean inputAddr() {
		
		System.out.print("이름(중단:END) >>"); // 문자열은 항상 두개의 그룹 어디에 저장할지 상황마다 틀리다. 번지수가 틀리다 문자열은 별도의 메서드가 있다 같냐틀리냐를 따질수 있는.
		String strName = scan.nextLine();
		System.out.println("입력값" + strName);
		// 만약 이름을 입력할때 문자열 END를 입력하면
		// 더이상 진행하지 말고 false return 하고 method를 중단하라
		// if strName == "END:)) { >>>> 위험한 코드 상당히 ~!!
		if(strName.equals("END")) {
			return false;
		} // 상당히 위험한 코드!!!!!!!!!!!
		
		
		System.out.print("전화번호 >>");
		String strTel = scan.nextLine();
		
		System.out.print("주소 >>");
		String strAddr = scan.nextLine();
		
		System.out.print("나이 >>");
		String strAge = scan.nextLine();
		int intAge = 0;
		try {
			intAge = Integer.valueOf(strAge);
		} catch (Exception e) {
			System.out.println("나이는 숫자만 가능합니다.");
			System.out.println("나이 입력이 잘못되어 0으로 임시 저장합니다.");
		}
		
		System.out.print("관계 >>");
		String strNet = scan.nextLine();
		
		
		
		AddrVO addrVO = new AddrVO();
		addrVO.setName(strName);
		addrVO.setTel(strTel);
		addrVO.setAddr(strAddr);
		addrVO.setAge(intAge);
		addrVO.setNet(strNet);
		addrList.add(addrVO);
		
		return true;
	}

	public void addrList() {
		System.out.println("==============================");
		System.out.println("주소록");
		System.out.println("------------------------------");
		System.out.println("이름\t전화번호\t주소\t나이\t관계");
		
		// i < 5 로 설정을 하게 되면
		// 5명의 주소록을 표시할때는 문제가 없으나
		// 만약 주소록 데이터의 개수가 변경되면 문제를 일으킨다.
		// addList 개수를 별도의 변수에 담고
		int addrSize = addrList.size();
		
		// 개수만큼 반복문을 수행하도록 변경
		for(int i = 0;  i< addrSize; i++) {
			
			AddrVO vo = addrList.get(i);
			System.out.printf(vo.getName() + "\t");
			System.out.printf(vo.getTel() + "\t");
			System.out.printf(vo.getAddr() + "\t");
			System.out.printf(vo.getAge() + "\t");
			System.out.printf(vo.getNet() + "\n");
			
		}
		
	}

}
