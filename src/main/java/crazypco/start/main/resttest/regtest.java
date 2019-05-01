package crazypco.start.main.resttest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regtest {
	public static void main(String args[]) {
		
//String contents="<a href=\"/story.php?story_fbid=2861703090626919&amp;id=374726359324617&ampasdfsadf;";
		
		String contents= "data-nt=\"FB:TEXT4\">4월 8일</div>";
		//String contents= ">4월 8일<";
		


		 Pattern p = Pattern.compile("data-nt=\"FB:TEXT4\">(.*)</div>");
//Pattern p = Pattern.compile("<a href=\"\\S+&amp+");
	  Matcher m = p.matcher(contents);
		  
			  System.out.println("테스트해보기");
			  
		  while(m.find()) {
			  System.out.println(m.group(1));
			  
		  }
		  
		
	}
}
