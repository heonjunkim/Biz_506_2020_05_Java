package naver;

import java.io.IOException;		


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;





// base 사이트로 가서 전체 페이지의 소스코드를 가져옴
// 베이스가 일반메서드면 스태틱안부텨도됨 
// 스태틱에서는 스태틱 변수만 가능



public class NaverFinance {
	static String base = "https://finance.naver.com/item/frgn.nhn?code=005930&page=1";
	
	public static void main(String[] args) throws IOException{
		
		Document doc = Jsoup.connect(base).get();
		
		Elements line = doc.select("table.type2 > tbody > tr");
		System.out.println(line.size());
		int count = 0;
		for(Element element : line) {
			Elements tds = element.select("td");
			if(tds.size() == 9) {
				System.out.println("======================");
				String regdate = tds.get(0).text();
				System.out.println("날짜: " +regdate);
				
				String price = tds.get(1).text();
				System.out.println("종가: "+price);
				
				String yeprice = tds.get(2).text();
				System.out.println("전일비: "+yeprice);
				

				String updown = tds.get(3).text();
				System.out.println("등락률: "+ updown);
				
				String sale = tds.get(4).text();
				System.out.println("거래량: "+ sale);
				
				String centersale = tds.get(5).text();
				System.out.println("기관-순매매량: "+ centersale);

				String foreignersale = tds.get(6).text();
				System.out.println("외국인-순매매량: "+ foreignersale);
				
				String foreignerhave = tds.get(7).text();
				System.out.println("외국인-보유주수: "+ foreignerhave);
				
				String foreignerpersent = tds.get(8).text();
				System.out.println("외국인-보유율: "+ foreignerpersent);
			}
		}
		
		
		
		
		
		
		
	}
}
	
	

