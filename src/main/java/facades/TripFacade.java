package facades;

import dtos.TripDTO;
import entities.Trip;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class TripFacade {

    private static TripFacade instance;
    private static EntityManagerFactory emf;

    private TripFacade() {
    }

    public static TripFacade getTripFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new TripFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static List<TripDTO> getAllTrips() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Trip> trip = em.createQuery("select t from Trip t", Trip.class);
        List<Trip> trips = trip.getResultList();
        return TripDTO.getDtos(trips);

    }

}
