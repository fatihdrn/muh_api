package com.muh_api.muh_api.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="mevzuat1")
public class Mevzuat1 {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name = "baslik")
    @Lob
    @NotNull
    private String baslik;
    @Column(name="paragraf")
    @Lob
    @NotNull
    private String paragraf;
    @Column(name="image")
    @Lob
    @NotNull
    private String image;

    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name="date")
    @NotNull
    private Date date;

    public Mevzuat1(){

    }
     public Mevzuat1(int id, String baslik, String paragraf, String image, Date date){
        this.id=id;
        this.baslik=baslik;
        this.paragraf=paragraf;
        this.date=date;
        this.image=image;
     }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getParagraf() {
        return paragraf;
    }

    public void setParagraf(String paragraf) {
        this.paragraf = paragraf;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
