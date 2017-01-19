package ru.maxon.project.Model;

/**
 * Created by Maxon on 18.01.2017.
 */
public class KafModel {

    private String kod;
    private String name;
    private String rang;

    public KafModel(String kod, String name, String rang) {
        this.kod = kod;
        this.name = name;
        this.rang = rang;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
}
