package com.biz.student.domain;

import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImplV1;
import com.biz.student.service.StudentServiceImplV5;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService sService = new StudentServiceImplV5();
		while(true) {
			if(!sService.input()) {
				
				}
				break;
			}
			sService.studentList();
		}
	

}
