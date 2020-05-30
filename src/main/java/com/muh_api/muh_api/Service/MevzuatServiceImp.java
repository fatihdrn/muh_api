package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.DAO.MevzuatDAOImp;
import com.muh_api.muh_api.Entity.Mevzuat1;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MevzuatServiceImp implements MevzuatService{

    private MevzuatDAOImp mevzuatDAOImp;

     public MevzuatServiceImp(MevzuatDAOImp themevzuatDAOImp){
         mevzuatDAOImp=themevzuatDAOImp;
     }
    @Override
    @Transactional
    public void mevzuatEkle(Mevzuat1 mevzuat1) {
        mevzuatDAOImp.mevzuatEkle(mevzuat1);
    }

    @Override
    @Transactional
    public void mevzuatDelete(int id) {
        mevzuatDAOImp.mevzuatDelete(id);
    }

    @Override
    @Transactional
    public List<Mevzuat1> findMevzuats() {
        return mevzuatDAOImp.findMevzuats();
    }
}
