package ru.maxon.project.Model.slovModels;

/**
 * Created by Maxon on 18.01.2017.
 */
public class NaprModel {

    private int kod;
    private String name;

    public NaprModel(int kod, String name) {
        this.kod = kod;
        this.name = name;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
