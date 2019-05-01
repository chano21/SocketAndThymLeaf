package crazypco.start.main.resttest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Naver {

	public static void main(String[] args) throws ParseException, IOException, InterruptedException {
				
		// 키값 추출
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet postKey = new HttpGet("http://nid.naver.com/login/ext/keys.nhn");
		//HttpGet postKey = new HttpGet("https://nid.naver.com/login/ext/keys_js3.nhn");
		
		HttpResponse hrs = httpClient.execute(postKey);
		
		String keyPage = EntityUtils.toString(hrs.getEntity());
		String[] keyPageArray = keyPage.split(",");
		
		String loginKey = keyPageArray[1];
		System.out.println("로그인테스트 : " + loginKey);
		//System.out.println(loginKey);System.exit(0);
		
		// 2번쨰 열기		
		DefaultHttpClient httpLoginClient = new DefaultHttpClient();
		
		HttpPost post = new HttpPost("https://nid.naver.com/nidlogin.login");
		post.setHeader("Referer", "http://kin.naver.com/index.nhn");
		post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0");		
		
		List<NameValuePair> param = new ArrayList<NameValuePair>();
		param.add(new BasicNameValuePair("id", ""));
		param.add(new BasicNameValuePair("pw", ""));
		param.add(new BasicNameValuePair("encpw", "56bf19b28cfb77eec4cec303803284b4f33eeb98f2badeb68542c00e0f3a842699dfe61c7ecb70510a729db19521c0f40cd02f3b4bbeeef1e82824f90d3da7df5a2f301d46580ea853bc7a6158bb97cbd5cbde4e155804df74298ec4443bf8b011cfbe08a500af74189d05c6e99f4c2a98efa6790e33634433fdf278b0e2bb30"));
		param.add(new BasicNameValuePair("encnm", loginKey));
		param.add(new BasicNameValuePair("enctp", "1"));
		param.add(new BasicNameValuePair("locale", "ko_KR"));
		param.add(new BasicNameValuePair("url", "http://kin.naver.com/index.nhn"));
		param.add(new BasicNameValuePair("smart_LEVEL", "1"));
		param.add(new BasicNameValuePair("bvsd", "{\"uuid\":\"da68e9e6-86e2-4417-a507-f6ad83329f27-0\",\"encData\":\"N4IghiBcICZgbADgKYE5nwLSPsgTJgCyECMA7JmAKwAMFAZvGDIgMyt6r14U0gA0IAEZQQJAHStxhASADGUemAA2AZ2SCYUANqgAlqL1bBESNoC6gkZFCntIGvzkALMADsA9njwhLwqDQAvoIK0LJa0C7uXj6CyIoq6oL0CWrIwfqiAA4A7rJ2fta2Og6ChQHB8qLh1XFQAC4ATgCuGiApkEppgX7xNuBQxZDEhFZQIyHjxJVFA8PEY-OjVUuBlR1Dm3MT-kuTq4tDO9Y7oSNrh3NHC7unU4Qzg9s3Jzdn0xcgAOZPdg4APiR-phWIDZDRAcCqGDBBCgUQYQD4YR-rEkcCUSRwZCEWi4RjEfiEVjYTjQST0ZgyISyajsfDQXxSci6czgeT6eyaQzucC8P8mZTQXjaRSiRy2cTOSDeVTZfyRTzBeLZRKhfKNcqcfytfD+WLUXyafzMPrsRCZVqLTrpUCDXrZUDdUbnTL7cCnZy4dKbZLPX6BbbNV7HYGA67-QCTZGiXbsdGwwCUZgYzi46TUAKaRbUyR4B7ExCdTTk7ms+6U4X-qXed7w0GDQn3XXKWWW0Tfej22nQxW2734wWDTmq-D063QxHWVGjX3Jw2FwG53OpxXhUGtQmRdbR+XpYyQxXO7GB5Lj-9QZXh0ON+aC66zaSEw-jTf60vb++J86i4PTVXn0PbF80rK172xRkSxrXVoVAz8ZxzeD8UQr9kI9EMUz-E1FSzTC2RQrt0KfAs8IBCECLQ0iTyoyEKIvXDt3A-CiMIminRYotcJXDDmw4w06PYtiuIg4TiIE0SAUgmipINKScP7aSJMog0UTo4saNUvj1NkpTq10u0qxk+lBMbTS2JM7EzPtci+KskSBIs0l8wE7TsWhOjnL4vNdOpOjoMs-TAKfVyn3crT-NJGyaNQMKaLwEg7IzEDIyBeBWDCn9E31bzyN8RYyBIPB9ioKhUE0KBWEIMqQD6VgSBoGLkgqQQACtxjIarnFERBEEIVgwDwRAYDkVhUHIMAUBgeASCEXrWDkKg8DqkgMEQWQDH6UwQAAWQ8AAvPRlGUMAAHoqHEGgAAIAAoAHU9DcGAPByVRLoAOQAFUu+BxBIABuS77rceBCABgAPEGAEpLoAQSyLJlGQW7kCEABpPR6jO1gyEkeAbtRgAJD7toAGX4S7lD0ABrZBLoAcWQOQqY8aGAGFnEaDwAFtkBOsgpBoXG2F+mhWEugBlMAlEaPQsZx1h4FkawQGZzBUYAJVkUI8GWCJEDqSASCa4ZBB+MwSFQPBHHqxAaD8Lrzct62aEIO3BA2zAqFd1qoCNlXfcEZQA5APbg650RmjcKnPByNxZDj6AgY4WQPAjqOY7jkw-nZzmecugAFAARAAxAvlGaL4HsgSB848Rp6jAIREcuwuPDkZoebcepLuLuuubAepq7AeHKbkAe9A8NwTrBzAvg8DwvkRzAXFz5BMCyGB6AAPw3lJBBz7naaL0uADU9GQHJkEaauh5HvQx-qCep93nfN9kN7x4AN1p1nKeQLub6QGHgje+49J7T0wG4MAchlBb34MA0eYCp4zyyFAmBW88ogCyKIEqJVOBgBoPVGg9BUCb0IPFGgiA5CWzkDrVAhA5AwAYbIAAjqIAqbBRYuzIPQBWVUaBCGQDwqgQ0FZ4BYP1GAJBjAgEaKIOm89F60wAJJuDkOILeMM3p0xJgAURum9E+yjC7KJhvTZAvdGhyFpnTD6AANS6qB4BXULnoRojN6isELiQEgl1P6qAAPpUACVdLIgTgk0EhrIVQqQkggHqLEtozREmCE-ikkAeROiJDaGDHQjguhJAKcgPwABPEoMMZYqFkBUvQKhLoACFjpM2qZU5Q70wCNE5nkQQ9T55U1hl3PQLDmgQB6X0-ubhLoAHllAwAlvUEpiNZCsxUHoIQMtllgC5us2pmztmVMuttAeXV97-3qM0RoZTTldwuSU+mHh6jOHvsss5tyJYuHnsoIQfTlnc3vhLdwr1tri1+W4VQHhjoxP3h4C5585HQthVfd6F9ZB0w6VsyeMiGZ10rqMkABNkDKG-o-MeshlFcyyNAhJggSbNDkEYMADSZZfGcNSkAtL6VwEuiso6egviNGHs4K57K6UMu5ZPcFSyaWiq5cXMAuTpWcsZQTdwMAcgy0fm4H4iqxWSzBbIDlurAWXQ+iUrIF8NVXwNTKxlerXoAFU3D3w8DAeIghtr305uC+g3c7USyvnoPeO1J4PLNT-Ouqg9CfzxcC+5jznnuvFgXBR8aFCJsuurZA9Ar7-2sQCsF-qZZBtjX68WAbi1JrLUW2Q+cVDj08JdEmD1Q3mtkGWueR8ZZdzbcgDt7yZZZDZe2jwtN7XKJ7X2sdja+WsonSOy6U6y1czWRCmRw7R3KIliU7ZELZAfTAM4bmeKPp6B5lCkAJ6z3IpyBmo9mcL3uKEHS5wyBu7AtkCfK+cAoGyCBl8GAD0vjnr-QBrVr00QgcA69Vgvg1hAA\"}"));
		
		post.setEntity(new UrlEncodedFormEntity(param));
		
		HttpResponse httpLoginPost = httpLoginClient.execute(post);		
	
		System.out.println(EntityUtils.toString(httpLoginPost.getEntity()));
		for(Header headers : httpLoginPost.getAllHeaders()){
			System.out.println(headers);
		}
		
	}

}