package com.muh_api.muh_api.Entity;

import javax.persistence.*;

@Entity
@Table(name="tokens")
public class Tokens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id")
    private int id;
    @Column(name="token")
    private String token;
    @Column(name="tip")
    private int tip;

    public Tokens(){

    }
    public Tokens(int id, String token, int tip){
        this.id=id;
        this.token=token;
        this.tip=tip;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}
