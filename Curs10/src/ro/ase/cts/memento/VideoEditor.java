package ro.ase.cts.memento;

public class VideoEditor {
    private EditHistory editHistory = new EditHistory();
    private Video video;

    public VideoEditor(String videoName) {
        video = new Video(videoName);
    }

    public void save() {
        editHistory.save(video);
    }

    public void undo() {
        video = editHistory.getLatestSave();
    }

    public void edit(int seconds) {
        video.setLength(video.getLength() + seconds);
    }

    public void getStatus() {
        System.out.println("Current length: " + video.getLength());
    }
}
