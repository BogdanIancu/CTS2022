package ro.ase.cts.adapter;

import ro.ase.cts.adapter.exceptions.NoSeatsAvailableException;

public class BusTicketBooking {
    private int nbOfSeats;

    public BusTicketBooking (int nbOfSeats) {
        this.nbOfSeats = nbOfSeats;
    }

    public void occupySeat() throws NoSeatsAvailableException {
        if(nbOfSeats > 0) {
            nbOfSeats--;
        } else {
            throw new NoSeatsAvailableException();
        }
    }
}
