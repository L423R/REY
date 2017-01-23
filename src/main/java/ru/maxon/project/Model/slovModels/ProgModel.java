package ru.maxon.project.Model.slovModels;

/**
 * Created by Maxon on 18.01.2017.
 */
public class ProgModel {
    private int kod;
    private int kodNap;
    private String name;
    private String prof;
    private String kval;
    private String formOby;
    private String srok;
    private String prim;

    public ProgModel(int kod, int kodNap, String name, String prof, String kval, String formOby, String srok, String prim) {
        this.kod = kod;
        this.kodNap = kodNap;
        this.name = name;
        this.prof = prof;
        this.kval = kval;
        this.formOby = formOby;
        this.srok = srok;
        this.prim = prim;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public int getKodNap() {
        return kodNap;
    }

    public void setKodNap(int kodNap) {
        this.kodNap = kodNap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getKval() {
        return kval;
    }

    public void setKval(String kval) {
        this.kval = kval;
    }

    public String getFormOby() {
        return formOby;
    }

    public void setFormOby(String formOby) {
        this.formOby = formOby;
    }

    public String getSrok() {
        return srok;
    }

    public void setSrok(String srok) {
        this.srok = srok;
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim;
    }
}
