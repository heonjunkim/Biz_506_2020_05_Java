package com.biz.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx {
	
	public static void main(String[] args) throws IOException {
		
		String fileName= "data.txt";
		/*
		 * text 파일읽기
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		try {
			/*
			 * 선언된 객체를 생성(초기화) 하기
			 * 파일 읽기, 쓰기와 관련된 클래스들은 반드시 예외처리를 해주어야 한다.
			 * try catch블럭으로 감싸서 발생할 수 있는 exception을 처리할 수 있도록
			 * 문법에 정해져 있다.
			 * 객체를 선언하는 곳과 생성하는 곳을 분리해서 코딩한다.
			 */
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			while(true) {
				/*
				 * 무한 반복문에서 text파일의 라인을 읽은후
				 * Console에 표시하는데
				 * 이상황에서 만약 text파일을 모두 읽어 버렸다면
				 * Console에는 null 값이 계속 반복해서 출력된다.
				 */
				reader = buffer.readLine();
				/*
				 * text의 파일의 라인을 읽은 후
				 * 읽힌 값이 null인가 를 확인하여 반복문을 중단해 주어야 한다. 
				 */
				
				if(reader == null) {
					break;
				}
				System.out.println(reader);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
