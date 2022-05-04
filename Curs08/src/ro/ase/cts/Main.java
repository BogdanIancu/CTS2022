package ro.ase.cts;

import ro.ase.cts.decorator.CherryDecorator;
import ro.ase.cts.decorator.ChocolateCake;
import ro.ase.cts.decorator.SprinklesDecorator;
import ro.ase.cts.flyweight.FootballFan;
import ro.ase.cts.flyweight.Position;
import ro.ase.cts.flyweight.Spectator;
import ro.ase.cts.flyweight.SpectatorFactory;

public class Main {

    public static void main(String[] args) {
        SpectatorFactory factory = new SpectatorFactory();
        Spectator fan1 = factory.getSpectator("man1");
        fan1.display(new Position(23, 25, 1, 180));

        Spectator fan2 = factory.getSpectator("woman1");
        fan2.display(new Position(10, 10, 5, -180));

        Spectator fan3 = factory.getSpectator("man1");
        FootballFan footballFan = (FootballFan)fan3;
        footballFan.setTeam("Concordia Chiajna");
        fan3.display(new Position(0, 0, 0, 0));
        fan1.display(new Position(0, 0, 0, 0));

        ChocolateCake chocolateCake = new ChocolateCake();
        SprinklesDecorator sprinklesDecorator =
                new SprinklesDecorator(chocolateCake);
        CherryDecorator cherryDecorator =
                new CherryDecorator(sprinklesDecorator);
        cherryDecorator.bake();
        sprinklesDecorator.prepare();
        cherryDecorator.addCherryOnTop();
    }
}
