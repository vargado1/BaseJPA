package JPA.dao;

import JPA.entities.AkcieNaHradeAleboZamku;
import JPA.entities.HradAleboZamok;

import java.util.List;

public class HradAleboZamokDao extends BaseDao<HradAleboZamok>{
    public HradAleboZamokDao() {
        super(HradAleboZamok.class);
    }
    public HradAleboZamok findByName(String name) {
        List<HradAleboZamok> resultList = em.createQuery("SELECT h FROM HradAleboZamok h WHERE h.nazov = :name", HradAleboZamok.class)
                .setParameter("name", name)
                .setMaxResults(1)
                .getResultList();

        return resultList.isEmpty() ? null : resultList.get(0);
    }

    public List<AkcieNaHradeAleboZamku> findAkcieByHrad(int hradId) {
        String jpql = "SELECT a FROM HradAleboZamok h JOIN h.akcie a WHERE h.idHrad = :hradId";
        return em.createQuery(jpql, AkcieNaHradeAleboZamku.class)
                .setParameter("hradId", hradId)
                .getResultList();
    }
}
