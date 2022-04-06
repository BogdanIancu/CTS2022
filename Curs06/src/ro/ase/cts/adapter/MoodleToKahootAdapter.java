package ro.ase.cts.adapter;

public class MoodleToKahootAdapter extends Kahoot {
    private Moodle moodle;

    public MoodleToKahootAdapter(Moodle moodle) {
        this.moodle = moodle;
    }

    @Override
    public void displayQuestion() {
        moodle.displayText("Question 1");
    }
}
