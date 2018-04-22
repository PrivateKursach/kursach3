package by.bsuir.sheverda.model;

import java.time.OffsetDateTime;

public class TicketSalesObservation {
    private OffsetDateTime observationDate;
    private double numberOfTickets;

    public TicketSalesObservation() {
    }

    public TicketSalesObservation(OffsetDateTime observationDate, double numberOfTickets) {
        this.observationDate = observationDate;
        this.numberOfTickets = numberOfTickets;
    }

    public OffsetDateTime getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(OffsetDateTime observationDate) {
        this.observationDate = observationDate;
    }

    public double getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(double numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
