package ru.maxon.project.Model;

import ru.maxon.project.View.StartFrame;

import java.sql.Date;

/**
 * Created by Maxon on 11.01.2017.
 */
public class Model {
    private int id;
    private String sem;
    private StartFrame frame;
    private Date startSem;
    private Date endSem;
    private Date startDateOfWork;
    private Date endDateOfWork;
    private String year;
    private int semNumber;

    public Model() {
    }




    public StartFrame getFrame() {
        return frame;
    }

    public void setFrame(StartFrame frame) {
        this.frame = frame;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public Date getStartDateOfWork() {
        return startDateOfWork;
    }

    public void setStartDateOfWork(Date startDateOfWork) {
        this.startDateOfWork = startDateOfWork;
    }

    public Date getEndDateOfWork() {
        return endDateOfWork;
    }

    public void setEndDateOfWork(Date endDateOfWork) {
        this.endDateOfWork = endDateOfWork;
    }

    public Date getStartSem() {
        return startSem;
    }

    public void setStartSem(Date startSem) {
        this.startSem = startSem;
    }

    public Date getEndSem() {
        return endSem;
    }

    public void setEndSem(Date endSem) {
        this.endSem = endSem;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSemNumber() {
        return semNumber;
    }

    public void setSemNumber(int semNumber) {
        this.semNumber = semNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", sem='" + sem + '\'' +
                ", startSem=" + startSem +
                ", endSem=" + endSem +
                ", startDateOfWork=" + startDateOfWork +
                ", endDateOfWork=" + endDateOfWork +
                ", year='" + year + '\'' +
                ", semNumber=" + semNumber +
                '}';
    }
}
