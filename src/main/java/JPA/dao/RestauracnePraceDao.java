package JPA.dao;

import JPA.entities.RestauracnePrace;

import java.util.Date;
import java.util.List;

public class RestauracnePraceDao extends BaseDao<RestauracnePrace> {

    public RestauracnePraceDao() {
        super(RestauracnePrace.class);
    }

     public List<RestauracnePrace> findPraceByDatum(Date datum) {
         return em.createQuery("SELECT p FROM RestauracnePrace p WHERE p.datumZaciatku = :datum", RestauracnePrace.class)
                  .setParameter("datum", datum)
                  .getResultList();
     }
}