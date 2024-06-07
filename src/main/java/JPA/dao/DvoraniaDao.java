package JPA.dao;

import JPA.entities.Dvorania;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class DvoraniaDao extends BaseDao<Dvorania>{
    public DvoraniaDao() {
        super(Dvorania.class);
    }

    // Metóda na vytvorenie novej Dvorany
    public void createDvorana(Dvorania dvorania) {
        EntityManager entityManager = getEm();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(dvorania);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

}
