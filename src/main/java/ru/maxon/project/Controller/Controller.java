package ru.maxon.project.Controller;

import ru.maxon.project.Model.StartModel;
import ru.maxon.project.Util.Queries;


import java.sql.Date;

/**
 * Created by Maxon on 11.01.2017.
 */
public class Controller {

    private StartModel startModel;
    public Controller() {

    }

    public void setStartModel(StartModel startModel) {
        this.startModel = startModel;
    }

    public StartModel getStartModel() {
        return startModel;
    }


    public String[] getSemArray()
    {
        return Queries.getNameSem();
    }

    public void setAll(Date date1,Date date2,String sem)
    {
        startModel.setStartDateOfWork(date1);
        startModel.setEndDateOfWork(date2);
        Queries.fillAll(startModel,sem);
    }


    public String getModelSem() {
        return startModel.getSem();
    }

    public String getModelYear() {
        return startModel.getYear();
    }

    public String getModelSemNumber() {
        return String.valueOf(startModel.getSemNumber());
    }

    public String getModelSemStart() {
        return String.valueOf(startModel.getStartSem());
    }

    public String getModelSemEnd() {
        return String.valueOf(startModel.getEndSem());
    }

    public String getModelStartDateOfWork() {
        return String.valueOf(startModel.getStartDateOfWork());
    }

    public String getModelEndDateOfWork() {
        return String.valueOf(startModel.getEndDateOfWork());
    }

    //public
}
