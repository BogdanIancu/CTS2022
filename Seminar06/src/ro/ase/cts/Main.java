package ro.ase.cts;

import ro.ase.cts.adapter.*;
import ro.ase.cts.builder.FoodItem;
import ro.ase.cts.builder.FoodItemBuilderV2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FoodItem pizza = new FoodItem.FoodItemBuilder().addName("Salam").addPrice(22).addExpirationDate(LocalDate.now().plusDays(1)).build();
        System.out.println(pizza);

        FoodItem burger = new FoodItemBuilderV2().addName("Cheesburger").addPrice(12).addProducer("McDonalds").setIsVegan(false).build();
        System.out.println(burger);


        //--------------------------------------
        AbstractTrainTicketBooking trainTicketBooking = new TrainTicketBooking();
        BusTicketBooking busTicketBooking = new BusTicketBooking(30);
        boolean result = trainTicketBooking.reserveSeat(1, 1);
        System.out.println(result);

        //Class adapter
        trainTicketBooking = new BusToTrainClassAdapter(30);

        result = trainTicketBooking.reserveSeat(1, 1);
        System.out.println(result);

        //Object adapter
        trainTicketBooking = new BusToTrainObjectAdapter(busTicketBooking);

        result = trainTicketBooking.reserveSeat(2, 2);
        System.out.println(result);
    }
}
