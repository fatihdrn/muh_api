package com.muh_api.muh_api.Controller;

import com.muh_api.muh_api.Entity.Makale;
import com.muh_api.muh_api.Entity.Vergi;
import com.muh_api.muh_api.Service.MakaleService;
import com.muh_api.muh_api.Service.VergiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VergiController {

    @Autowired
    private VergiService vergiService;

    @CrossOrigin
    @PostMapping("/vergi")
    public void vergiEkle(@RequestBody Vergi vergi){

       System.out.println(vergi.getDate());
        vergiService.vergiEkle(vergi);
    }
    @CrossOrigin
    @GetMapping("/vergi")
    public List<Vergi> getVergis(){
        return vergiService.findVergis();
    }

    @CrossOrigin
    @DeleteMapping("/vergi/{id}")
    public void deleteVergi(@PathVariable int id) {
        System.out.println(id);
        vergiService.vergiDelete(id);
    }
}
