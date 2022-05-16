package ro.ase.cts.command;

public class RegisterButtonClick implements ButtonClick {
    private Backend backend;

    public RegisterButtonClick(Backend backend) {
        this.backend = backend;
    }

    @Override
    public void execute() {
        backend.register();
    }
}
