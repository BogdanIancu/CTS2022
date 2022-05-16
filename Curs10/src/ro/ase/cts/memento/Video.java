package ro.ase.cts.memento;

public class Video implements Cloneable {
    private String name;
    private int length;
    //...

    public Video(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Video copy = (Video)super.clone();
       copy.name = name;
       copy.length = length;
       return copy;
    }
}
