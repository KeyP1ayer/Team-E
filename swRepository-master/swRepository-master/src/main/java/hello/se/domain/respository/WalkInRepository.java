package hello.se.domain.respository;

import hello.se.domain.DBdata.WalkIn;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;

@Repository
public class WalkInRepository {
    @PersistenceContext
    EntityManager em;

    public WalkIn save() {
        WalkIn walkIn = new WalkIn();
        walkIn.setOid(1);
        walkIn.setCovers(2);
        walkIn.setDate(LocalDateTime.now());
        walkIn.setTime(LocalDateTime.now());
        walkIn.setTable_id(1);

        em.persist(walkIn);
        return walkIn;
    }

    public WalkIn findWalkIn(int oid) {
        return em.find(WalkIn.class, oid);
    }
}
