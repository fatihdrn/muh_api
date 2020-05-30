package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.Entity.Mevzuat1;

import java.util.List;

public interface MevzuatService {

    void mevzuatEkle(Mevzuat1 mevzuat1);
    void mevzuatDelete(int id);

    List<Mevzuat1> findMevzuats();
}
