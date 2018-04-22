package by.bsuir.sheverda.service;

import by.bsuir.sheverda.model.TicketSalesObservation;
import com.github.signaflo.timeseries.TimeSeries;

import java.util.List;

public interface ForecastService {
    TimeSeries getForecast(List<TicketSalesObservation> observations);
}
