package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverMovie3 {
	public static void main(String[] args) throws IOException {
		int page =1;
		
		String pageValue = "";
		String prepageValue ="";
		String content = "";
		String score = "";
		String writer = "";
		String regdate = "";
		
		while(true) {
			String url = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=189633&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page="+page;
			Document doc = Jsoup.connect(url).get();
			pageValue =doc.select("input").get(4).attr("value");
			
			Elements comment = doc.select("div.score_result > ul > li");
			if(!pageValue.equals(prepageValue)) {
				prepageValue = pageValue;
			} else {
				break;
			}
			
			for(Element one : comment) {
				 content = one.select("div.score_reple > p").text();
				 score = one.select("div.star_score > em").text();
				
				
				
			}
			 
			 
		}
      						
		
	
        				
		
		// 페이지네이션 돌면서 1페이지부터 끝까지
		// 영화내용 평점 작성자 작성일자 수집

		
	}
}
