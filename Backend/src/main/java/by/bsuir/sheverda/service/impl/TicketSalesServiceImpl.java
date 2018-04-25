package by.bsuir.sheverda.service.impl;

import by.bsuir.sheverda.converter.TicketSalesConverter;
import by.bsuir.sheverda.dao.TicketSalesObservationDAO;
import by.bsuir.sheverda.entity.TicketSales;
import by.bsuir.sheverda.model.TicketSalesObservation;
import by.bsuir.sheverda.service.ForecastService;
import by.bsuir.sheverda.service.TicketSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketSalesServiceImpl implements TicketSalesService {

    @Autowired
    private ForecastService forecastService;
    @Autowired
    private TicketSalesObservationDAO ticketSalesObservationDAO;
    @Autowired
    private TicketSalesConverter ticketSalesConverter;

    @Override
    public List<TicketSalesObservation> getObservations() {
        return convert(ticketSalesObservationDAO.getObservations());
    }

    @Override
    public List<TicketSalesObservation> getTicketSalesForecast() {
        return forecastService.getForecast(convert(ticketSalesObservationDAO.getObservations()));
    }

    private List<TicketSalesObservation> convert(List<TicketSales> ticketSales) {
        List<TicketSalesObservation> ticketSalesObservations = new ArrayList<>(ticketSales.size());
        for (TicketSales ticketSalesObj : ticketSales) {
            ticketSalesObservations.add(ticketSalesConverter.convertToModel(ticketSalesObj));
        }
        return ticketSalesObservations;
    }
}
