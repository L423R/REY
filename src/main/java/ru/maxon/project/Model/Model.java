package ru.maxon.project.Model;

import ru.maxon.project.View.StartFrame;

import java.sql.Date;

/**
 * Created by Maxon on 11.01.2017.
 */
public class Model {
    private String semestr;
    private StartFrame frame;
    private Date startDate;
    private Date endDate;

    public Model() {
    }




    public StartFrame getFrame() {
        return frame;
    }

    public void setFrame(StartFrame frame) {
        this.frame = frame;
    }

    public String getSemestr() {
        return semestr;
    }

    public void setSemestr(String semestr) {
        this.semestr = semestr;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
