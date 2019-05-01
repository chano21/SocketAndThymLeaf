package crazypco.start.main.crawl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DriverInfo {

	@Value("${chrome.driver.location}")
	private String chromelocation;

	@Value("${facebook.id}")
	private String facebookid;

	@Value("${facebook.password}")
	private String facebookpassword;

	public String getInstagramid() {
		return instagramid;
	}

	public void setInstagramid(String instagramid) {
		this.instagramid = instagramid;
	}

	public String getInstagrampassword() {
		return instagrampassword;
	}

	public void setInstagrampassword(String instagrampassword) {
		this.instagrampassword = instagrampassword;
	}

	public String getNaverid() {
		return naverid;
	}

	public void setNaverid(String naverid) {
		this.naverid = naverid;
	}

	public String getNaverpassword() {
		return naverpassword;
	}

	public void setNaverpassword(String naverpassword) {
		this.naverpassword = naverpassword;
	}

	@Value("${instagram.id}")
	private String instagramid;

	@Value("${instagram.password}")
	private String instagrampassword;

	@Value("${naver.id}")
	private String naverid;

	@Value("${naver.password}")
	private String naverpassword;

	public String getChromelocation() {
		return chromelocation;
	}

	public void setChromelocation(String chromelocation) {
		this.chromelocation = chromelocation;
	}

	public String getFacebookid() {
		return facebookid;
	}

	public void setFacebookid(String facebookid) {
		this.facebookid = facebookid;
	}

	public String getFacebookpassword() {
		return facebookpassword;
	}

	public void setFacebookpassword(String facebookpassword) {
		this.facebookpassword = facebookpassword;
	}

	@Override
	public String toString() {
		return "DriverInfo [chromelocation=" + chromelocation + ", facebookid=" + facebookid + ", facebookpassword="
				+ facebookpassword + ", instagramid=" + instagramid + ", instagrampassword=" + instagrampassword
				+ ", naverid=" + naverid + ", naverpassword=" + naverpassword + "]";
	}

}
