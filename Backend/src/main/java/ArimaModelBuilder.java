import com.github.signaflo.timeseries.TimeSeries;
import com.github.signaflo.timeseries.model.arima.Arima;
import com.github.signaflo.timeseries.model.arima.ArimaOrder;

/**
 * @author Uladzislau Kastsevich
 */
public class ArimaModelBuilder {

  public Arima buildArimaModel(TimeSeries timeSeries) {
    ArimaOrder arimaOrder = ArimaOrder.order(1, 1, 0);
    return Arima.model(timeSeries, arimaOrder);
  }
}
