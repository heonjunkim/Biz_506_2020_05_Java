package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {
	protected List<ScoreVO> scoreList;
	protected List<StudentVO> studentList;
	
	
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		
	}

	@Override
	public void intputStudent() {
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		
		
		try {
			
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				
				String[] student = reader.split(":"); 
				
				StudentVO sAO = new StudentVO();
				sAO.setNum(student[SplitPos.STUDENT.ST_NUM]);
				sAO.setName(student[SplitPos.STUDENT.ST_NAME]);
				sAO.setGrade(Integer.valueOf(SplitPos.STUDENT.ST_GRADE));
				sAO.setDept(student[SplitPos.STUDENT.ST_DEPT]);
				
				studentList.add(sAO);
				
			}
			buffer.close();
			fileReader.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	@Override
	public void inputScore() {
		String scoreFile = "src/com/biz/student/exec/Score1.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		
		
		try {
			
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			while(true) {
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				
				String[] students = reader.split(":"); 
				
				ScoreVO sVO = new ScoreVO();
				sVO.setNum(students[SplitPos.SCORE.SC_NUM]);
				sVO.setKor(Integer.valueOf(students[SplitPos.SCORE.SC_KOR]) );
				sVO.setEng(Integer.valueOf(students[SplitPos.SCORE.SC_ENG]) );
				sVO.setMath(Integer.valueOf(students[SplitPos.SCORE.SC_MATH]) );
				scoreList.add(sVO);
				
			}
			buffer.close();
			fileReader.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

		
		
		
		
		
		

		
	}

	@Override
	public void calcSum() {
		for(ScoreVO sVO : scoreList) {
			int sum = sVO.getKor();
			sum += sVO.getEng();
			sum += sVO.getMath();
			sVO.setSum(sum);
			
		}

		
	}

	@Override
	public void calcAvg() {
		for(ScoreVO sVO : scoreList) {
			float sum = (float)sVO.getSum();
			float avg =  sum / 3;
			sVO.setAvg(avg);
			
		}

		
	}

	@Override
	public void scoreList() {
		
		System.out.println("==============================================");
		System.out.println("성적 일람표");
		System.out.println("==============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		
		// data의 join
		// scoreList, studentList Join 해서 데이터를 출력하는 모드
		for(ScoreVO sVO : scoreList) {
			
			System.out.print(sVO.getNum() + "\t" );
			
			// 이름
			// score의 학번으로 studentList에서 찾기
			for(StudentVO stVO : studentList) {
				
				// 학번이 같은 학생의 정보를 찾았으면
				if(sVO.getNum().equals(stVO.getNum())) {
					System.out.print(stVO.getName() + "\t");
					break;
				}
				
				
			}
			System.out.print(sVO.getKor()  +"\t" );
			System.out.print(sVO.getEng()+"\t" );
			System.out.print(sVO.getMath()+"\t" );
			System.out.print(sVO.getSum()+"\t" );
			System.out.printf("%5.2f\n", sVO.getAvg());
		}
		System.out.println();

		
	}
	
	
	
	

}
