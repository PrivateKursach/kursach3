package by.bsuir.sheverda.dao.impl;

import by.bsuir.sheverda.dao.TicketSalesObservationDAO;
import by.bsuir.sheverda.model.TicketSalesObservation;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class TicketSalesObservationDAOImpl implements TicketSalesObservationDAO {

    @Override
    public List<TicketSalesObservation> getObservations() {
        List<TicketSalesObservation> observations = new ArrayList<>();
        OffsetDateTime startDate = OffsetDateTime.now().minusMonths(3);
        for (int i = 0; i < 100; i++) {
            OffsetDateTime observationDate = startDate.plusDays(i);
            observations.add(new TicketSalesObservation(observationDate, (double) i));
        }
        return observations;
    }
}
