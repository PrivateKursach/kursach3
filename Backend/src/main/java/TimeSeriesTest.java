import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import com.github.signaflo.timeseries.TimeSeries;
import com.github.signaflo.timeseries.model.arima.Arima;

/**
 * @author Uladzislau Kastsevich
 */
public class TimeSeriesTest {

  public static void main(String[] args) {
    TimeSeriesBuilder timeSeriesBuilder = new TimeSeriesBuilder();
    ArimaModelBuilder arimaModelBuilder = new ArimaModelBuilder();
    ForecastCreator forecastCreator = new ForecastCreator();

    TimeSeries timeSeries = timeSeriesBuilder.loadTimeSeries();
    Arima arimaModel = arimaModelBuilder.buildArimaModel(timeSeries);
    TimeSeries forecast = forecastCreator.createForecast(arimaModel);
    List<OffsetDateTime> forecastDates = forecast.observationTimes();
    double[] forecastValues = forecast.asArray();
    System.out.println(forecastDates);
    System.out.println(Arrays.toString(forecastValues));
  }

}
