package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.Mevzuat1;
import com.muh_api.muh_api.Entity.Vergi;

import java.util.List;

public interface VergiDAO {
    void vergiEkle(Vergi vergi);
    void vergiDelete(int id);
    List<Vergi> findVergis();
}
