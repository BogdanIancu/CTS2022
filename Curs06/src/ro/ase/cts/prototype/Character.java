package ro.ase.cts.prototype;

public abstract class Character implements Cloneable {
    private String name = "";
    private Texture texture = new Texture();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Character copy = (Character) super.clone();
        copy.name = name;
        copy.texture = (Texture) texture.clone();
        return copy;
    }

    public abstract void render();
}
