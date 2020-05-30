package com.muh_api.muh_api.Controller;

import com.muh_api.muh_api.Entity.Mevzuat1;
import com.muh_api.muh_api.Service.MevzuatServiceImp;
import com.muh_api.muh_api.configuration.UserAuthService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MevzuatController {

    private MevzuatServiceImp mevzuatServiceImp;
    public MevzuatController(MevzuatServiceImp themevzuatServiceImp){
        mevzuatServiceImp=themevzuatServiceImp;
    }
    @CrossOrigin
    @PostMapping("/mevzuat")
    public void mevzuatEkle(@RequestBody Mevzuat1 mevzuat1){
        Date date = new Date();
        mevzuat1.setDate(date);
        mevzuatServiceImp.mevzuatEkle(mevzuat1);
    }
    @CrossOrigin
    @GetMapping("/mevzuat")

    public List<Mevzuat1> getMevzuats(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.getName());
        return mevzuatServiceImp.findMevzuats();
    }

    @CrossOrigin
    @DeleteMapping("/mevzuat/{id}")
    public void delete(@PathVariable int id) {
        mevzuatServiceImp.mevzuatDelete(id);
    }
}
