package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.Kitap;
import com.muh_api.muh_api.Entity.Mevzuat1;
import com.muh_api.muh_api.Entity.Vergi;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class VergiDAOImpl implements VergiDAO {
    private EntityManager entityManager;
    @Autowired
    public VergiDAOImpl (EntityManager theentityManager){
        entityManager=theentityManager;
    }
    @Override
    @Transactional
    public void vergiEkle(Vergi vergi) {
        Session currentSession =entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(vergi);
    }

    @Override
    @Transactional
    public void vergiDelete(int id) {
        Session currentSession =entityManager.unwrap(Session.class);
        System.out.println(id);
        Query que1=currentSession.createQuery("delete from Vergi where id=:id");
        que1.setParameter("id",id);
        que1.executeUpdate();
    }

    @Override
    @Transactional
    public List<Vergi> findVergis() {
        Session currentSession=entityManager.unwrap(Session.class);
        Query<Vergi> theQuery=currentSession.createQuery("from Vergi order by id desc", Vergi.class);

        List<Vergi> vergis =theQuery.getResultList();
        return vergis;
    }
}
