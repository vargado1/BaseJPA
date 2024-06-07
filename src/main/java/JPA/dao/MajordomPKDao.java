package JPA.dao;

import JPA.entities.Majordom;
import JPA.entities.MajordomPK;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class MajordomPKDao extends BaseDao<MajordomPK>{

    public MajordomPKDao() {
            super(MajordomPK.class);
        }

        // Setter pre nastavenie objektu typu MajordomPK
        public void setMajordomPK(MajordomPK majordomPK) {
            EntityManager em = getEm();
            super.entity = em.find(MajordomPK.class, majordomPK);
        }
}
