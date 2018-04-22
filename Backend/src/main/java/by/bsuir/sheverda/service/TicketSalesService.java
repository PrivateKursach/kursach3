package by.bsuir.sheverda.service;

import by.bsuir.sheverda.model.TicketSalesObservation;

import java.util.List;

public interface TicketSalesService {
    List<TicketSalesObservation> getObservations();
    List<TicketSalesObservation> getTicketSalesForecast();
}
