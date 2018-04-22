import com.github.signaflo.timeseries.TimeSeries;
import com.github.signaflo.timeseries.forecast.Forecast;
import com.github.signaflo.timeseries.model.arima.Arima;

/**
 * @author Uladzislau Kastsevich
 */
public class ForecastCreator {

  public TimeSeries createForecast(Arima arimaModel) {
    Forecast forecast = arimaModel.forecast(100, 0.001);
    return forecast.pointEstimates();
  }

}
