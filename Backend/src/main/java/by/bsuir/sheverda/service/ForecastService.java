package by.bsuir.sheverda.service;

import by.bsuir.sheverda.model.TicketSalesObservation;
import com.github.signaflo.timeseries.TimeSeries;

import java.util.List;

public interface ForecastService {
    List<TicketSalesObservation> getForecast(List<TicketSalesObservation> observations);
}
