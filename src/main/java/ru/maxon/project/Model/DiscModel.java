package ru.maxon.project.Model;

/**
 * Created by Maxon on 19.01.2017.
 */
public class DiscModel {
   private int kod;
   private String nameDisc;
   private String nameKaf;
   private int rang;

    public DiscModel(int kod, String nameDisc, String nameKaf, int rang) {
        this.kod = kod;
        this.nameDisc = nameDisc;
        this.nameKaf = nameKaf;
        this.rang = rang;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getNameDisc() {
        return nameDisc;
    }

    public void setNameDisc(String nameDisc) {
        this.nameDisc = nameDisc;
    }

    public String getNameKaf() {
        return nameKaf;
    }

    public void setNameKaf(String nameKaf) {
        this.nameKaf = nameKaf;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }
}
