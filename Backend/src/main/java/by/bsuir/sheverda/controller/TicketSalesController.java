package by.bsuir.sheverda.controller;

import by.bsuir.sheverda.model.TicketSalesObservation;
import by.bsuir.sheverda.service.TicketSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/ticket-sales")
public class TicketSalesController {

    @Autowired
    private TicketSalesService ticketSalesService;

    @GetMapping("/observations")
    public ResponseEntity<List<TicketSalesObservation>> getObservations() {
        return ResponseEntity.ok(ticketSalesService.getObservations());
    }

    @GetMapping("/forecast")
    public ResponseEntity<List<TicketSalesObservation>> getForecast() {
        return ResponseEntity.ok(ticketSalesService.getTicketSalesForecast());
    }
}
