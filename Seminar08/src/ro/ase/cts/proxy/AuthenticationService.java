package ro.ase.cts.proxy;

public interface AuthenticationService {
    boolean login(String username, String password);
}
