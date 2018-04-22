import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Uladzislau Kastsevich
 */
public class ObservationsLoader {

  public List<Observation> loadObservations() {
    List<Observation> observations = new ArrayList<>();
    OffsetDateTime startDate = OffsetDateTime.now().minusMonths(3);
    for (int i = 0; i < 100; i++) {
      OffsetDateTime observationDate = startDate.plusDays(i);
      observations.add(new Observation(observationDate, (double) i));
    }
    return observations;
  }

}
