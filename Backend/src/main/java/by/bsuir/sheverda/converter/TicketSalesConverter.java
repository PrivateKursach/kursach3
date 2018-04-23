package by.bsuir.sheverda.converter;

import by.bsuir.sheverda.entity.TicketSales;
import by.bsuir.sheverda.model.TicketSalesObservation;

public interface TicketSalesConverter {
    TicketSalesObservation convertToModel(TicketSales ticketSales);
}
