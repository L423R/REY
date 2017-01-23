package ru.maxon.project.Model.slovModels;

import java.sql.Date;

/**
 * Created by Maxon on 23.01.2017.
 */
public class GroupModel {
    private String nameGr;
    private String ng;
    private Date dateOp;
    private String nameProg;
    private String napr;
    private String prof;
    private String metName;
    private Date dateCl;
    private byte xEcsp;
    private String prim;

    public GroupModel(String nameGr, String ng, Date dateOp, String nameProg, String napr, String prof, String metName, Date dateCl, byte xEcsp, String prim) {
        this.nameGr = nameGr;
        this.ng = ng;
        this.dateOp = dateOp;
        this.nameProg = nameProg;
        this.napr = napr;
        this.prof = prof;
        this.metName = metName;
        this.dateCl = dateCl;
        this.xEcsp = xEcsp;
        this.prim = prim;
    }

    public String getNameGr() {
        return nameGr;
    }

    public void setNameGr(String nameGr) {
        this.nameGr = nameGr;
    }

    public String getNg() {
        return ng;
    }

    public void setNg(String ng) {
        this.ng = ng;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public String getNameProg() {
        return nameProg;
    }

    public void setNameProg(String nameProg) {
        this.nameProg = nameProg;
    }

    public String getNapr() {
        return napr;
    }

    public void setNapr(String napr) {
        this.napr = napr;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getMetName() {
        return metName;
    }

    public void setMetName(String metName) {
        this.metName = metName;
    }

    public Date getDateCl() {
        return dateCl;
    }

    public void setDateCl(Date dateCl) {
        this.dateCl = dateCl;
    }

    public byte getxEcsp() {
        return xEcsp;
    }

    public void setxEcsp(byte xEcsp) {
        this.xEcsp = xEcsp;
    }

    public String getPrim() {
        return prim;
    }

    public void setPrim(String prim) {
        this.prim = prim;
    }
}
