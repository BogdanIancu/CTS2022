package ro.ase.cts.proxy;

public class WebSiteAuthentication implements AuthenticationService{
    @Override
    public boolean login(String username, String password) {
        return ("admin".equals(username) && "admin".equals(password));
    }
}
