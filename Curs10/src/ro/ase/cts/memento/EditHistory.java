package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class EditHistory {
    private List<Video> versions = new ArrayList<>();

    public void save(Video video) {
        try {
            versions.add((Video) video.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Video getLatestSave() {
        if(!versions.isEmpty()) {
            Video video = versions.get(versions.size() - 1);
            versions.remove(video);
            return video;
        }
        throw new UnsupportedOperationException();
    }
}
