package ro.ase.cts.adapter;

public class TrainTicketBooking implements AbstractTrainTicketBooking {
    private boolean[][] seats = new boolean[10][4];

    @Override
    public boolean reserveSeat(int row, int seat) {
        if (!seats[row - 1][seat - 1]) {
            seats[row - 1][seat - 1] = true;
            return true;
        }
        return false;
    }
}
