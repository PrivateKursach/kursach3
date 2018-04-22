package by.bsuir.sheverda.service.impl;

import by.bsuir.sheverda.model.TicketSalesObservation;
import by.bsuir.sheverda.service.ArimaModelService;
import by.bsuir.sheverda.service.TimeSeriesService;
import com.github.signaflo.timeseries.TimeSeries;
import com.github.signaflo.timeseries.model.arima.Arima;
import com.github.signaflo.timeseries.model.arima.ArimaOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArimaModelServiceImpl implements ArimaModelService {

    @Autowired
    private TimeSeriesService timeSeriesService;

    @Override
    public Arima getArimaModel(List<TicketSalesObservation> observations) {
        TimeSeries timeSeries = timeSeriesService.getTimeSeries(observations);
        ArimaOrder arimaOrder = ArimaOrder.order(1, 1, 0);
        return Arima.model(timeSeries, arimaOrder);
    }
}
