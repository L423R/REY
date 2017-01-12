package ru.maxon.project.Controller;

import ru.maxon.project.Model.Model;
import ru.maxon.project.Util.Queries;


import java.sql.Date;

/**
 * Created by Maxon on 11.01.2017.
 */
public class Controller {

    private Model model;
    public Controller() {

    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }


    public String[] getSemArray()
    {
        return Queries.getNameSem();
    }

    public void setAll(Date date1,Date date2,String sem)
    {
        model.setStartDateOfWork(date1);
        model.setEndDateOfWork(date2);
        Queries.fillAll(model,sem);
    }


    public String getModelSem() {
        return model.getSem();
    }

    public String getModelYear() {
        return model.getYear();
    }

    public String getModelSemNumber() {
        return String.valueOf(model.getSemNumber());
    }

    public String getModelSemStart() {
        return String.valueOf(model.getStartSem());
    }

    public String getModelSemEnd() {
        return String.valueOf(model.getEndSem());
    }

    public String getModelStartDateOfWork() {
        return String.valueOf(model.getStartDateOfWork());
    }

    public String getModelEndDateOfWork() {
        return String.valueOf(model.getEndDateOfWork());
    }
}
