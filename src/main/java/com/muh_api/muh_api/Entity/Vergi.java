package com.muh_api.muh_api.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="vergi")
public class Vergi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="ad")
    private String ad;

    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name="date")
    private Date date;
    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name="date1")
    private Date date1;

    public  Vergi(){

    }
    public Vergi(int id,String ad,Date date,Date date1){
        this.id=id;
        this.ad=ad;
        this.date=date;
        this.date1=date1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Date getDate() {
        return date;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
