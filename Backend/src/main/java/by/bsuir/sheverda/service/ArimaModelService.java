package by.bsuir.sheverda.service;

import by.bsuir.sheverda.model.TicketSalesObservation;
import com.github.signaflo.timeseries.model.arima.Arima;

import java.util.List;

public interface ArimaModelService {
    Arima getArimaModel(List<TicketSalesObservation> observations);
}
