package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.DAO.MakaleDAO;
import com.muh_api.muh_api.DAO.MakaleDAOImpl;
import com.muh_api.muh_api.Entity.Makale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.List;

@Service
public class MakaleServiceImpl implements MakaleService {
    @Autowired
    private MakaleDAO makaleDAO;
    @Override
    @Transactional
    public void makaleEkle(Makale makale) {
        makaleDAO.makaleEkle(makale);
    }

    @Override
    @Transactional
    public void makaleDelete(int id) {
        System.out.println(id);
        makaleDAO.makaleDelete(id);
    }

    @Override
    @Transactional
    public List<Makale> findMakales() {
        makaleDAO.findMakales();
        return  makaleDAO.findMakales();
    }
}
