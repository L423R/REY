package ru.maxon.project.Model.slovModels;

/**
 * Created by Maxon on 23.01.2017.
 */
public class StavkiModel {
    private String nameStav;
    private String izm;
    private String npr;
    private int stavkaSpec;
    private int stavkaMag;
    private String prim;

    public StavkiModel(String nameStav, String izm, String npr, int stavkaSpec, int stavkaMag, String prim) {
        this.nameStav = nameStav;
        this.izm = izm;
        this.npr = npr;
        this.stavkaSpec = stavkaSpec;
        this.stavkaMag = stavkaMag;
        this.prim = prim;
    }


    public String getNameStav() {
        return nameStav;
    }

    public void setNameStav(String nameStav) {
        this.nameStav = nameStav;
    }

    public String getIzm() {
        return izm;
    }

    public void setIzm(String izm) {
        this.izm = izm;
    }

    public String getNpr() {
        return npr;
    }

    public void setNpr(String npr) {
        this.npr = npr;
    }

    public int getStavkaSpec() {
        return stavkaSpec;
    }

    public void setStavkaSpec(int stavkaSpec) {
        this.stavkaSpec = stavkaSpec;
    }

    public int getStavkaMag() {
        return stavkaMag;
    }

    public void setStavkaMag(int stavkaMag) {
        this.stavkaMag = stavkaMag;
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim;
    }
}
