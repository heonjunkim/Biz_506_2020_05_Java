package daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie {
	public static void main(String[] args) throws IOException {
		int page = 1;
		int score = 0;
		String content = "";
		String writer = "";
		String regDt = "";
		int cnt = 0;
		while(true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page=" +page;
			Document doc =Jsoup.connect(url).get();
			Elements replyList = doc.select("div.review_info");
			
			if(replyList.size()== 0 ) {
				break;
			}
			
			
			//String content =("div.desc_review > p");
			//String writer =("div.link_profile > em");		
			//String regDt =("div.info_append > span ");
			// String score =("div.bg_star inner_star > span");
			
			for(Element one : replyList) {
				content = one.select("p.desc_review").get(0).text();
				score = Integer.parseInt(one.select("em.emph_grade").get(0).text());
				writer = one.select("em.link_profile").get(0).text();
				regDt = one.select("span.info_append").get(0).text().substring(0, 10);
				
				System.out.println("내용: " +content);
				System.out.println("평점: " +score);
				System.out.println("작성일자: " +regDt);
				System.out.println("작성자: " +writer);
				cnt += 1;
			}
			
			
			page += 1;
			
		}
		System.out.println("총" + cnt + "건 수집");
		
		
		
		
	}

}
