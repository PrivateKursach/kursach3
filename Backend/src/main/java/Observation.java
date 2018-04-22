import java.time.OffsetDateTime;

/**
 * @author Uladzislau Kastsevich
 */
public class Observation {

  private OffsetDateTime date;
  private double value;

  public Observation() {
  }

  public Observation(OffsetDateTime date, double value) {
    this.date = date;
    this.value = value;
  }

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

}
