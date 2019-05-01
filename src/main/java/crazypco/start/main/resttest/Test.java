package crazypco.start.main.resttest; 

import java.util.List; 
import java.util.logging.Level; 

import com.gargoylesoftware.htmlunit.WebClient; 
import com.gargoylesoftware.htmlunit.html.HtmlAnchor; 
import com.gargoylesoftware.htmlunit.html.HtmlImageInput; 
import com.gargoylesoftware.htmlunit.html.HtmlPage; 
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput; 

public class Test { 

public static void main(String[] args) throws Exception { 
String id = "chano22"; // 네이버 아이디를 입력하세요.
String password = "sky2121";  // 네이버 비밀번호를 입력하세요.

WebClient webClient = new WebClient(); 
java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF); // 중간 로그를 보이지 않도록 함 
webClient.getOptions().setThrowExceptionOnScriptError(false); // 자바 script 오류시 처리 하도록 수정 


HtmlPage page = webClient.getPage("https://nid.naver.com/nidlogin.login"); // 네이버로 로그인 페이지로 이동 

System.out.println(page);
/*
HtmlTextInput inputId = (HtmlTextInput) page.getFirstByXPath("//input[@id='id']"); // ID 입력 필드
HtmlPasswordInput inputPassword = (HtmlPasswordInput) page.getFirstByXPath("//input[@id='pw']"); // 암호 입력 필드 
HtmlSubmitInput inputSubmit = (HtmlSubmitInput) page.getFirstByXPath("//form[@id='frmNIDLogin']/fieldset/input"); // 로그인버튼 

inputId.setText(id); // ID 입력
inputPassword.setText(password); // 비밀번호 입력
inputSubmit.click(); // 로그인 버튼 클릭



HtmlPage page2 = webClient.getPage("https://section.blog.naver.com/SectionMain.nhn"); // 네이버로 블로그 페이지로 이동 

List<?> titles = page2.getByXPath("//*[@id=\"cmt_list\"]/li[1]/div/p/span[2]"); // 이웃소식 목록 필드
for (Object aaa : titles) { // 이웃 목록을 하나씩 처리
HtmlAnchor title = (HtmlAnchor) aaa; 
System.out.println(title.getTextContent()); // 이웃소식 출력 
} 
 */

webClient.close(); // 네이버와 연결 종료 
} 

}
