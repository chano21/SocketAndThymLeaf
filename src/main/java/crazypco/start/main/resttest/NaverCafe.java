package crazypco.start.main.resttest;
/*package crazypco.start.resttest;

public class NaverCafe {
    
    private static final String URL_LOGIN 
            = "http://static.nid.naver.com/login.nhn"
                    + "?svc=wme&amp;amp;url=http%3A%2F%2F"
                    + "www.naver.com&amp;amp;t=20120425";
    private static final String URL_WT_CAFE
            = "http://cafe.naver.com/bodygood";
    
    private WebClient webClient;
    private HtmlPage currPage;
    
    public NaverCafe(String naverId, String naverPw) throws Exception {
        webClient = new WebClient(BrowserVersion.FIREFOX_24);
        webClient.waitForBackgroundJavaScript(5000);
        if(!login(naverId, naverPw))
            throw new Exception("cannot login with the id and pw");
    }
    
    private boolean login(String naverId, String naverPw) throws Exception {
        currPage = webClient.getPage(URL_LOGIN);
        
        HtmlForm form = currPage.getFormByName("frmNIDLogin");
        HtmlTextInput inputId = form.getInputByName("id");
        HtmlPasswordInput inputPw = (HtmlPasswordInput)form.getInputByName("pw");
        HtmlImageInput button = (HtmlImageInput)form
                .getByXPath("//input[@alt='로그인']").get(0);

        inputId.setValueAttribute(naverId);
        inputPw.setValueAttribute(naverPw);
        currPage = (HtmlPage)button.click();
        return !currPage.asText().contains("Naver Sign in");
    }
    
    @SuppressWarnings("unchecked")
    public Category[] getCategoryList() throws Exception {
        currPage = webClient.getPage(URL_WT_CAFE);
        List<Category> catList = new ArrayList<>();
        
        List<HtmlElement> as = (List<HtmlElement>)currPage
                .getByXPath("//ul[@id='group103' or @id='group105']/li/a");
        for(HtmlElement a : as) {
            HtmlAnchor $a = (HtmlAnchor)a;
            Category cat = new Category();
            cat.name = $a.getTextContent();
            cat.url  = $a.getHrefAttribute();
            catList.add(cat);
        }
        return catList.toArray(new Category[0]);
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("NAVER_ID : ");
        String naverId = stdin.readLine();
        System.out.print("NAVER_PW : ");
        String naverPw = stdin.readLine();
        stdin.close();
        
        NaverCafe naver = new NaverCafe(naverId, naverPw);
        Category[] catList = naver.getCategoryList();
        for(Category cat : catList) {
            System.out.println(cat.name);
            System.out.println(cat.url);
        }
    }

}



class Category {
    public String name;
    public String url;
}

*/