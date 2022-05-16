package ro.ase.cts.command;

public class Backend {
    public void login() {
        new Thread(() -> System.out.println("Login button clicked")).start();
    }

    public void register() {
        System.out.println("Register button clicked");
    }

    public void forgotPassword() {
        System.out.println("Forgot password button clicked");
    }
}
