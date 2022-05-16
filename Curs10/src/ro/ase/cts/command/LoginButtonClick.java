package ro.ase.cts.command;

public class LoginButtonClick implements ButtonClick {
    private Backend backend;

    public LoginButtonClick(Backend backend) {
        this.backend = backend;
    }

    @Override
    public void execute() {
        backend.login();
    }
}
