package ro.ase.cts.proxy;

import ro.ase.cts.proxy.exceptions.TooManyBadLoginsException;

public class AuthenticationProxy implements  AuthenticationService{
    private WebSiteAuthentication webSiteAuthentication;
    private int counter = 0;

    public AuthenticationProxy (WebSiteAuthentication webSiteAuthentication) {
        this.webSiteAuthentication=webSiteAuthentication;
    }

    @Override
    public boolean login(String username, String password) {
        counter++;
        if(counter > 4){
            throw new TooManyBadLoginsException();
        }
        boolean result = webSiteAuthentication.login(username,password);
        if(result) {
            counter = 0;
            return true;
        }
        return false;
    }
}
