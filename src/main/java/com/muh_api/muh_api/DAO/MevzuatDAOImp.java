package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.Mevzuat1;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MevzuatDAOImp implements MevzuatDAO {


    private EntityManager entityManager;
    @Autowired
    public MevzuatDAOImp (EntityManager theentityManager){
        entityManager=theentityManager;
    }
    @Override
    public void mevzuatEkle(Mevzuat1 mevzuat1) {
        Session currentSession =entityManager.unwrap(Session.class);
        System.out.println(mevzuat1.getId());
        currentSession.saveOrUpdate(mevzuat1);
     
    }

    @Override
    public void mevzuatDelete(int id) {
       Session currentSession =entityManager.unwrap(Session.class);
        Query que=currentSession.createQuery("delete from Mevzuat1 where id=:id");
        que.setParameter("id",id);
        que.executeUpdate();
    }

    @Override
    public List<Mevzuat1> findMevzuats(){
        Session currentSession=entityManager.unwrap(Session.class);
        Query<Mevzuat1> theQuery=currentSession.createQuery("from Mevzuat1 order by id desc", Mevzuat1.class);

        List<Mevzuat1> mevzuat1s =theQuery.getResultList();
        return mevzuat1s;
    }




}
