package crazypco.start.main.service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;

import javax.xml.transform.Result;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RestServcie {

    private static RestTemplate getRestTempalte() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setReadTimeout(1000 * 60 * 5);  // 5분
        factory.setConnectTimeout(5000);
        RestTemplate restTemplate = new RestTemplate(factory);
        return restTemplate;
    }

    public static String Get(String downloadUrl) {
        RestTemplate restTemplate = getRestTempalte();
        URI uri = UriComponentsBuilder.fromHttpUrl(downloadUrl).build().toUri();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }
   /* public static String Post(String downloadUrl) {
        RestTemplate restTemplate = getRestTempalte();
        URI uri = UriComponentsBuilder.fromHttpUrl(downloadUrl).build().toUri();
        return result;
    }*/

  /*  public String Get(String url) throws UnsupportedEncodingException {
        RestTemplate restTemplate = getRestTempalte();
        URI uri = UriComponentsBuilder.fromHttpUrl(url)
        			.build().toUri();
        		//newInstance().scheme("http").host("naver.com")
        	       
         
        URI uri = UriComponentsBuilder.newInstance().scheme("http").host("naver.com")
        		
               .path("/cgi/{type}")
                .queryParam("path", file.getDownloadUrl())
                .queryParam("realname", file.getName())
                .queryParam("servicecode", file.getServiceCode())
                .queryParam("useragent", file.getUserAgent())
                .queryParam("charset", file.getCharset())
                .queryParam("format", file.getOption())
                .build().expand(file.getType())
                .encode()
                .toUri();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }*/
}