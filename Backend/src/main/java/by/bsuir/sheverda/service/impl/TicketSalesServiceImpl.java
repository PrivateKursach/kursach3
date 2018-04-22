package by.bsuir.sheverda.service.impl;

import by.bsuir.sheverda.dao.TicketSalesObservationDAO;
import by.bsuir.sheverda.model.TicketSalesObservation;
import by.bsuir.sheverda.service.ForecastService;
import by.bsuir.sheverda.service.TicketSalesService;
import com.github.signaflo.timeseries.TimeSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TicketSalesServiceImpl implements TicketSalesService {

    @Autowired
    private ForecastService forecastService;
    @Autowired
    private TicketSalesObservationDAO ticketSalesObservationDAO;

    @Override
    public List<TicketSalesObservation> getObservations() {
        return ticketSalesObservationDAO.getObservations();
    }

    @Override
    public List<TicketSalesObservation> getTicketSalesForecast() {
        TimeSeries forecast = forecastService.getForecast(ticketSalesObservationDAO.getObservations());
        List<OffsetDateTime> forecastDates = forecast.observationTimes();
        double[] forecastValues = forecast.asArray();
        List<TicketSalesObservation> ticketSalesForecast = new ArrayList<>(forecastDates.size());
        Iterator<OffsetDateTime> forecastDatesIterator = forecastDates.iterator();
        for (int i = 0; forecastDatesIterator.hasNext(); i++) {
            ticketSalesForecast.add(new TicketSalesObservation(
                    forecastDatesIterator.next(),
                    forecastValues[i]
            ));
        }
        return ticketSalesForecast;
    }
}
