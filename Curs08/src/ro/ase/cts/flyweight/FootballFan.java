package ro.ase.cts.flyweight;

public class FootballFan implements Spectator {
    private byte[] texture;
    private int height;
    private String team;
    //...

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void display(Position position) {
        System.out.println("Displaying fan for team " +
                team + " at: " +
                position.getX() + ", " + position.getY() +
                ", " + position.getZ() + " rotated at " +
                position.getRotation());
    }
}
