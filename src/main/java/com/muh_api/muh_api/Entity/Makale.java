package com.muh_api.muh_api.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Table(name="makale")
@Entity
public class Makale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name="yazar")
    @NotNull
    private String yazar;

    @JsonFormat(pattern="dd-MM-yyyy")
    @Column(name="date")
    @NotNull
     private Date date;

    public Makale(){

    }
    public Makale(int id, String baslik, String paragraf, String image,String yazar,Date date){
        this.id=id;
        this.baslik=baslik;
        this.paragraf=paragraf;
        this.yazar=yazar;
        this.image=image;
        this.date=date;
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

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
