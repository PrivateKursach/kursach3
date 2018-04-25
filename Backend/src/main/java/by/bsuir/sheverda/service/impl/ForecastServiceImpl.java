package by.bsuir.sheverda.service.impl;

import by.bsuir.sheverda.model.TicketSalesObservation;
import by.bsuir.sheverda.service.ArimaModelService;
import by.bsuir.sheverda.service.ForecastService;
import by.bsuir.sheverda.service.TimeSeriesService;
import com.github.signaflo.timeseries.TimeSeries;
import com.github.signaflo.timeseries.forecast.Forecast;
import com.github.signaflo.timeseries.model.arima.Arima;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForecastServiceImpl implements ForecastService {

    @Autowired
    private ArimaModelService arimaModelService;
    @Autowired
    private TimeSeriesService timeSeriesService;

    @Override
    public List<TicketSalesObservation> getForecast(List<TicketSalesObservation> observations) {
        Arima arimaModel = arimaModelService.getArimaModel(observations);
        Forecast forecast = arimaModel.forecast(24, 0.001);
        return timeSeriesService.getObservations(forecast.pointEstimates());
    }
}
