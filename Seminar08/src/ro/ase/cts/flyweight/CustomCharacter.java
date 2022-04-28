package ro.ase.cts.flyweight;

public class CustomCharacter implements TextCharacter{
    private Character character;
    private String font;
    private int size;

    public CustomCharacter() {
    }

    public CustomCharacter(Character character, String font, int size) {
        this.character = character;
        this.font = font;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void display(Position position) {
        System.out.println("Displaying character " + character + " with font " + font +" and size "+size + " at position " +
                position.getLine() + ":" + position.getColumn());
    }
}
