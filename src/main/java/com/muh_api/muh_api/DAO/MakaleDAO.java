package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.Makale;
import com.muh_api.muh_api.Entity.Mevzuat1;

import java.util.List;

public interface MakaleDAO {

    void makaleEkle(Makale makale);
    void makaleDelete(int id);
    List<Makale> findMakales();
}
