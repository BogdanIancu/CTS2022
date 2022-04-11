package ro.ase.cts.proxy;

public class WebSite implements WebAddress {
    @Override
    public void navigate(String url) {
        System.out.println("Displaying page: " + url);
    }
}
