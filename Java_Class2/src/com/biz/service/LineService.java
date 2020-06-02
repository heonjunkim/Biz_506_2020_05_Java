package com.biz.service;
public class LineService {
	
	
	
	public String single(int num) {
		
		
		// 문자열변수를 선언하고
		// 값을 clear
		String line = "";
		for(int i =0; i <num; i ++) {
			
			line += "-";
		}
		return line;
	}
	
	
	
            public String do_line(int num) {
            	  String line  = "" ;
                  
                  
          		for(int i =0; i <num; i ++) {
          			line += "=";
          		}

          		
          		return line;
	
           }
		
		// 문자열변수를 선언하고
		// 값을 clear}


            


}








