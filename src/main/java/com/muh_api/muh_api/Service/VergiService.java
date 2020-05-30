package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.Entity.Kitap;
import com.muh_api.muh_api.Entity.Vergi;

import java.util.List;

public interface VergiService {

    void vergiEkle(Vergi vergi);
    void vergiDelete(int id);

    List<Vergi> findVergis();
}
