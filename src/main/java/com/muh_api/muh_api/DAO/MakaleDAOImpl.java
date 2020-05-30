package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.Makale;
import com.muh_api.muh_api.Entity.Mevzuat1;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MakaleDAOImpl implements MakaleDAO {

    private EntityManager entityManager;
    @Autowired
    public MakaleDAOImpl (EntityManager theentityManager){
        entityManager=theentityManager;
    }

    @Override
    public void makaleEkle(Makale makale) { Session currentSession =entityManager.unwrap(Session.class);
        System.out.println(makale.getId());
       currentSession.saveOrUpdate(makale);
    }

    @Override
    public void makaleDelete(int id) {
        Session currentSession =entityManager.unwrap(Session.class);
        System.out.println(id);
        Query que1=currentSession.createQuery("delete from Makale where id=:id");
        que1.setParameter("id",id);
        que1.executeUpdate();
    }

    @Override
    public List<Makale> findMakales() {
        Session currentSession=entityManager.unwrap(Session.class);
        Query<Makale> theQuery=currentSession.createQuery("from Makale order by id desc", Makale.class);

        List<Makale> makales =theQuery.getResultList();
        return makales;
    }


}
