package ro.ase.cts.prototype;

public class WoodBlock extends BuildingBlock {
    private byte[] texture;

    public WoodBlock() {
        System.out.println("Loading texture...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        texture = new byte[]{10, 20, 30};
    }

    @Override
    public void render() {
        System.out.printf("Rendering wood block at %d %d %d", getX(), getY(), getZ());
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        WoodBlock copy = (WoodBlock) super.clone();
        copy.texture = new byte[texture.length];
        for (int i = 0; i < texture.length; i++) {
            copy.texture[i] = texture[i];
        }
        return copy;
    }
}
