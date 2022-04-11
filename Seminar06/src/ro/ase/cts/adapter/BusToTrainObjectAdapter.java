package ro.ase.cts.adapter;

import ro.ase.cts.adapter.exceptions.NoSeatsAvailableException;

public class BusToTrainObjectAdapter extends TrainTicketBooking {
    BusTicketBooking busTicketBooking;

    public BusToTrainObjectAdapter(BusTicketBooking busTicketBooking) {
        this.busTicketBooking = busTicketBooking;
    }

    @Override
    public boolean reserveSeat(int row, int seat) {
        try {
            busTicketBooking.occupySeat();
            return true;
        } catch (NoSeatsAvailableException e) {
            e.printStackTrace();
            return false;
        }
    }
}
