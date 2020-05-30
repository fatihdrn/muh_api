package com.muh_api.muh_api.Controller;

import com.muh_api.muh_api.Entity.Makale;
import com.muh_api.muh_api.Entity.Mevzuat1;
import com.muh_api.muh_api.Service.MakaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MakaleController {
    @Autowired
    private MakaleService makaleService;

    @CrossOrigin
   @PostMapping("/makale")
    public void makaleEkle(@RequestBody Makale makale){

       Date date = new Date();
       makale.setDate(date);
       makaleService.makaleEkle(makale);
   }
    @CrossOrigin
    @GetMapping("/makale")
    public List<Makale> getMakales(){
        return makaleService.findMakales();
    }

    @CrossOrigin
    @DeleteMapping("/makale/{id}")
    public void deleteMakale(@PathVariable int id) {
        System.out.println(id);
        makaleService.makaleDelete(id);
    }
}
