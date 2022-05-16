package ro.ase.cts.command;

public class ForgotPasswordButtonClick implements ButtonClick {
    private Backend backend;

    public ForgotPasswordButtonClick(Backend backend) {
        this.backend = backend;
    }

    @Override
    public void execute() {
        backend.forgotPassword();
    }
}
