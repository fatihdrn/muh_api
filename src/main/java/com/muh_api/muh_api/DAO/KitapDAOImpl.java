package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.Kitap;
import com.muh_api.muh_api.Entity.Makale;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class KitapDAOImpl implements KitapDAO {
    private EntityManager entityManager;
    @Autowired
    public KitapDAOImpl (EntityManager theentityManager){
        entityManager=theentityManager;
    }

    @Override
    public void kitapEkle(Kitap kitap) {
        Session currentSession =entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(kitap);
    }

    @Override
    public void kitapDelete(int id) {
        Session currentSession =entityManager.unwrap(Session.class);
        System.out.println(id);
        Query que1=currentSession.createQuery("delete from Kitap where id=:id");
        que1.setParameter("id",id);
        que1.executeUpdate();

    }

    @Override
    public List<Kitap> findKitaps() {
        Session currentSession=entityManager.unwrap(Session.class);
        Query<Kitap> theQuery=currentSession.createQuery("from Kitap order by id desc", Kitap.class);

        List<Kitap> kitaps =theQuery.getResultList();
        return kitaps;
    }
}
