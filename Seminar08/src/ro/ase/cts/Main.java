package ro.ase.cts;

import ro.ase.cts.decorator.Car;
import ro.ase.cts.decorator.CarWithAlarm;
import ro.ase.cts.decorator.CarWithSportSeats;
import ro.ase.cts.flyweight.CustomCharacter;
import ro.ase.cts.flyweight.CustomCharacterFactory;
import ro.ase.cts.flyweight.Position;
import ro.ase.cts.flyweight.TextCharacter;
import ro.ase.cts.proxy.AuthenticationProxy;
import ro.ase.cts.proxy.AuthenticationService;
import ro.ase.cts.proxy.WebSiteAuthentication;
import ro.ase.cts.proxy.exceptions.TooManyBadLoginsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthenticationService authenticationService = new AuthenticationProxy(new WebSiteAuthentication());
        boolean isValidLogn = false;
        while (!isValidLogn) {
            System.out.println("username: ");
            String username = scanner.nextLine();
            System.out.println("password: ");
            String password = scanner.nextLine();
            try {
                isValidLogn = authenticationService.login(username, password);
            }catch (TooManyBadLoginsException e){
                System.out.println("Too many bad logins");
                break;
            }
            System.out.println(isValidLogn ? "Succes" : "Denied");
        }
        CustomCharacterFactory customCharacterFactory = new CustomCharacterFactory();
        TextCharacter textCharacterA = customCharacterFactory.getCharacter('a');
        textCharacterA.display((new Position(1,2)));
        TextCharacter textCharacterB = customCharacterFactory.getCharacter('b');
        textCharacterB.display((new Position(1,3)));
        TextCharacter textCharacterA1 = customCharacterFactory.getCharacter('a');
        CustomCharacter customCharacter = (CustomCharacter) textCharacterA1;
        customCharacter.setSize(14);
        textCharacterA1.display((new Position(1,4)));
        textCharacterA.display((new Position(1,2)));

        Car car = new Car();
        car.start();

        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.pressAlarmButton();
        carWithAlarm.stop();

        CarWithSportSeats carWithSportSeats = new CarWithSportSeats(carWithAlarm);
        carWithSportSeats.setSeatsProducer("Recaro");

    }
}
