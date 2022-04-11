package ro.ase.cts.proxy;

import java.util.Arrays;
import java.util.List;

public class WebSiteProxy implements WebAddress {
    private List<String> blackList = Arrays.asList("http://casapariurilor.ro", "http://utorrent.com");
    private WebSite webSite;

    public WebSiteProxy(WebSite webSite) {
        this.webSite = webSite;
    }

    @Override
    public void navigate(String url) {
        if(blackList.contains(url)) {
            System.out.println("Couldn't display the web page");
        } else {
            webSite.navigate(url);
        }
    }
}
