package by.bsuir.sheverda.service.impl;

import by.bsuir.sheverda.model.TicketSalesObservation;
import by.bsuir.sheverda.service.TimeSeriesService;
import com.github.signaflo.timeseries.TimePeriod;
import com.github.signaflo.timeseries.TimeSeries;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TimeSeriesServiceImpl implements TimeSeriesService {

    @Override
    public TimeSeries getTimeSeries(List<TicketSalesObservation> observations) {
        List<OffsetDateTime> observationDates = new ArrayList<>(observations.size());
        double[] observationValues = new double[observations.size()];
        Iterator<TicketSalesObservation> observationIterator = observations.iterator();
        for (int i = 0; observationIterator.hasNext(); i++) {
            TicketSalesObservation observation = observationIterator.next();
            observationDates.add(observation.getObservationDate());
            observationValues[i] = observation.getNumberOfTickets();
        }
        return TimeSeries.from(TimePeriod.oneMonth(), observationDates, observationValues);
    }

    @Override
    public List<TicketSalesObservation> getObservations(TimeSeries timeSeries) {
        List<OffsetDateTime> observationDates = timeSeries.observationTimes();
        double[] observationValues = timeSeries.asArray();
        List<TicketSalesObservation> ticketSalesObservations = new ArrayList<>(observationDates.size());
        Iterator<OffsetDateTime> observationDatesIterator = observationDates.iterator();
        for (int i = 0; observationDatesIterator.hasNext(); i++) {
            ticketSalesObservations.add(new TicketSalesObservation(
                    observationDatesIterator.next(),
                    observationValues[i]
            ));
        }
        return ticketSalesObservations;
    }
}
