import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.github.signaflo.timeseries.TimePeriod;
import com.github.signaflo.timeseries.TimeSeries;

/**
 * @author Uladzislau Kastsevich
 */
public class TimeSeriesBuilder {

  private ObservationsLoader observationsLoader = new ObservationsLoader();

  public TimeSeries loadTimeSeries() {
    List<Observation> observations = observationsLoader.loadObservations();
    for (Observation observation : observations) {
      System.out.println(observation.getDate() + " " + observation.getValue());
    }
    List<OffsetDateTime> observationDates = new ArrayList<>(observations.size());
    double[] observationValues = new double[observations.size()];
    Iterator<Observation> observationIterator = observations.iterator();
    for (int i = 0; observationIterator.hasNext(); i++) {
      Observation observation = observationIterator.next();
      observationDates.add(observation.getDate());
      observationValues[i] = observation.getValue();
    }
    return TimeSeries.from(TimePeriod.oneDay(), observationDates, observationValues);
  }
}
