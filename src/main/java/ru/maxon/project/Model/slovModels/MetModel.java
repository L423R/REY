package ru.maxon.project.Model.slovModels;

/**
 * Created by Maxon on 18.01.2017.
 */
public class MetModel {
    private String fName;
    private String lName;
    private String tName;
    private String kod;
    private String number;

    public MetModel(String kod,String fName, String lName, String tName, String number) {
        this.fName = fName;
        this.lName = lName;
        this.tName = tName;
        this.kod = kod;
        this.number = number;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
