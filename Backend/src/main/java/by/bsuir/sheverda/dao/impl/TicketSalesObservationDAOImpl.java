package by.bsuir.sheverda.dao.impl;

import by.bsuir.sheverda.dao.TicketSalesObservationDAO;
import by.bsuir.sheverda.entity.TicketSales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TicketSalesObservationDAOImpl implements TicketSalesObservationDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TicketSales> getObservations() {
        return entityManager.createQuery("select ts from TicketSales ts", TicketSales.class).getResultList();
    }
}
