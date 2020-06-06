package com.muh_api.muh_api.Entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="kitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="yazar")
    @NotNull
    private String yazar;
    @Column(name="ad")
    @NotNull
    private String ad;
    @Column(name="link")
    @NotNull
    private String link;

    @Column(name="fiyat")
    @NotNull
    private float fiyat;

    @Column(name="image")
    @NotNull
    @Lob
    private String image;



    public Kitap(){};
    public Kitap(int id,String yazar,String ad,String link,float fiyat,String image){
        this.id=id;
        this.ad=ad;
        this.yazar=yazar;
        this.link=link;
        this.fiyat=fiyat;
        this.image=image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
