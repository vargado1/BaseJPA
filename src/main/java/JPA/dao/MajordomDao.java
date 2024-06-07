package JPA.dao;

import JPA.entities.Majordom;
import JPA.entities.MajordomPK;

public class MajordomDao extends BaseDao<Majordom> {
    public MajordomDao() {
        super(Majordom.class);
    }


}
