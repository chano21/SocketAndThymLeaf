package crazypco.start.main.resttest; 

import java.util.logging.Level;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.JavaScriptEngine; 

public class FaceBook { 

public static void main(String[] args) throws Exception { 
String id = "821029391943"; // 네이버 아이디를 입력하세요.
String password = "sky2121";  // 네이버 비밀번호를 입력하세요.

WebClient webClient = new WebClient(BrowserVersion.FIREFOX_52); 
webClient.setJavaScriptEngine(new JavaScriptEngine(webClient));
java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF); // 중간 로그를 보이지 않도록 함 
webClient.getOptions().setThrowExceptionOnScriptError(false); // 자바 script 오류시 처리 하도록 수정 

HtmlPage page = webClient.getPage("http://www.facebook.com"); // 네이버로 로그인 페이지로 이동 
System.out.println(page);
webClient.close();
/*
HtmlTextInput inputId = (HtmlTextInput) page.getFirstByXPath("//input[@id='email']"); // ID 입력 필드
HtmlPasswordInput inputPassword = (HtmlPasswordInput) page.getFirstByXPath("//input[@id='pass']"); // 암호 입력 필드 
HtmlSubmitInput inputSubmit = (HtmlSubmitInput) page.getFirstByXPath("//form[@id='login_form']/div/button"); // 로그인버튼 

inputId.setText(id); // ID 입력
inputPassword.setText(password); // 비밀번호 입력
inputSubmit.click(); // 로그인 버튼 클릭
} 

{ 
HtmlPage page2 = webClient.getPage("https://www.facebook.com/"); // 네이버로 블로그 페이지로 이동 
System.out.println(page2.getBody().toString());

List<?> titles = page2.getByXPath("//*[@id=\"cmt_list\"]/li[1]/div/p/span[2]"); // 이웃소식 목록 필드
for (Object aaa : titles) { // 이웃 목록을 하나씩 처리
HtmlAnchor title = (HtmlAnchor) aaa; 
System.out.println(title.getTextContent()); // 이웃소식 출력 
}*/ 
} 


}
