package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.DAO.KitapDAO;
import com.muh_api.muh_api.DAO.MakaleDAO;
import com.muh_api.muh_api.Entity.Kitap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class KitapServiceImpl implements KitapService {

    @Autowired
    private KitapDAO kitapDAO;
    @Override
    @Transactional
    public void kitapEkle(Kitap kitap) {
        kitapDAO.kitapEkle(kitap);
    }

    @Override
    @Transactional
    public void kitapDelete(int id) {
kitapDAO.kitapDelete(id);
    }

    @Override
    @Transactional
    public List<Kitap> findKitaps() {
        return kitapDAO.findKitaps();
    }
}
