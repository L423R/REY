package ru.maxon.project.Model.slovModels;

import java.sql.Date;

/**
 * Created by Maxon on 09.02.2017.
 */
public class RaspModel {
    private int kod;
    private Date dateZ;
    private String nachZ;
    private int kolCh;
    private String tipZ;
    private String tipSt;
    private String day;
    private String nameDisc;
    private float stavka;
    private byte prOpl;
    private String prim;
    private String fio;

    public RaspModel(int kod, Date dateZ, String nachZ, int kolCh, String tipZ, String tipSt, String day, String nameDisc, float stavka, byte prOpl, String fio, String prim) {
        this.kod = kod;
        this.dateZ = dateZ;
        this.nachZ = nachZ;
        this.kolCh = kolCh;
        this.tipZ = tipZ;
        this.tipSt = tipSt;
        this.day = day;
        this.nameDisc = nameDisc;
        this.stavka = stavka;
        this.prOpl = prOpl;
        this.fio = fio;
        this.prim = prim;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public Date getDateZ() {
        return dateZ;
    }

    public void setDateZ(Date dateZ) {
        this.dateZ = dateZ;
    }

    public String getNachZ() {
        return nachZ;
    }

    public void setNachZ(String nachZ) {
        this.nachZ = nachZ;
    }

    public int getKolCh() {
        return kolCh;
    }

    public void setKolCh(int kolCh) {
        this.kolCh = kolCh;
    }

    public String getTipZ() {
        return tipZ;
    }

    public void setTipZ(String tipZ) {
        this.tipZ = tipZ;
    }

    public String getTipSt() {
        return tipSt;
    }

    public void setTipSt(String tipSt) {
        this.tipSt = tipSt;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getNameDisc() {
        return nameDisc;
    }

    public void setNameDisc(String nameDisc) {
        this.nameDisc = nameDisc;
    }

    public float getStavka() {
        return stavka;
    }

    public void setStavka(float stavka) {
        this.stavka = stavka;
    }

    public byte getPrOpl() {
        return prOpl;
    }

    public void setPrOpl(byte prOpl) {
        this.prOpl = prOpl;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim;
    }
}
