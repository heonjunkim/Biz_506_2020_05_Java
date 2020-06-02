package com.biz.classes.service;

import com.biz.classis.model.BookVO;

public class BookService {
	
	public void bookList(BookVO[] bookList) {
		
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		System.out.println(d_line);
		System.out.println("도서목록");
	
		// 배열.length : 배열의 개수를 알려주는 변수
		for(int i =0; i< bookList.length; i ++) {
			System.out.printf("%s\t%s\t%s\t%s\t%d\n",
					bookList[i].isbn, bookList[i].title,bookList[i].auth,bookList[i].comp,bookList[i].price);
			
		}
	}
	 
	public void bookInfo(BookVO book) {
		
		System.out.printf("ISBN : %s \n", book.isbn);
		System.out.printf("도서명 : %s \n", book.title);
		System.out.printf("저자 : %s \n", book.auth);
		System.out.printf("출판사 : %s \n", book.comp);
		System.out.printf("가격 : %d \n", book.price);
		
	}

}
