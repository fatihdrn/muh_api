package com.muh_api.muh_api.Controller;

import com.muh_api.muh_api.Entity.Kitap;
import com.muh_api.muh_api.Entity.Makale;
import com.muh_api.muh_api.Service.KitapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class KitapController {
    @Autowired
    private KitapService kitapService;
    @CrossOrigin
    @PostMapping("/kitap")
    public void kitapEkle(@RequestBody Kitap kitap){

       kitapService.kitapEkle(kitap);
    }
    @CrossOrigin
    @GetMapping("/kitap")
    public List<Kitap> getKitaps(){
        System.out.println("asdasddas");
        return kitapService.findKitaps();


    }

    @CrossOrigin
    @DeleteMapping("/kitap/{id}")
    public void deleteMakale(@PathVariable int id) {
        System.out.println(id);
        kitapService.kitapDelete(id);
    }
}
