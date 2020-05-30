package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.Entity.Kitap;
import com.muh_api.muh_api.Entity.Makale;

import java.util.List;

public interface KitapService {

    void kitapEkle(Kitap kitap);
    void kitapDelete(int id);

    List<Kitap> findKitaps();
}
