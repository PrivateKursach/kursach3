package by.bsuir.sheverda.converter.impl;

import by.bsuir.sheverda.converter.TicketSalesConverter;
import by.bsuir.sheverda.entity.TicketSales;
import by.bsuir.sheverda.model.TicketSalesObservation;
import org.springframework.stereotype.Component;

@Component
public class TicketSalesConverterImpl implements TicketSalesConverter {

    @Override
    public TicketSalesObservation convertToModel(TicketSales ticketSales) {
        TicketSalesObservation ticketSalesObservation = new TicketSalesObservation();
        ticketSalesObservation.setObservationDate(ticketSales.getObservationDate());
        ticketSalesObservation.setNumberOfTickets(ticketSales.getNumberOfTickets());
        return ticketSalesObservation;
    }
}
