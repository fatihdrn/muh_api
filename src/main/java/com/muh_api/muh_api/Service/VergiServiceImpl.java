package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.DAO.KitapDAO;
import com.muh_api.muh_api.DAO.VergiDAO;
import com.muh_api.muh_api.Entity.Vergi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VergiServiceImpl implements VergiService {

    @Autowired
    private VergiDAO vergiDAO;
    @Override
    public void vergiEkle(Vergi vergi) {
        vergiDAO.vergiEkle(vergi);
    }

    @Override
    public void vergiDelete(int id) {
vergiDAO.vergiDelete(id);
    }

    @Override
    public List<Vergi> findVergis() {

        return vergiDAO.findVergis();
    }
}
