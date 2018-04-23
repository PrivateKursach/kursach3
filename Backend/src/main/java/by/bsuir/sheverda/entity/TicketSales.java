package by.bsuir.sheverda.entity;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "ts_ticket_sales")
public class TicketSales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "observation_date")
    private OffsetDateTime observationDate;

    @Column(name = "number_of_tickets")
    private Integer numberOfTickets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(OffsetDateTime observationDate) {
        this.observationDate = observationDate;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
