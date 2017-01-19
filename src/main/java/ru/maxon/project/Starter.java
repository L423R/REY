package ru.maxon.project;

import ru.maxon.project.Controller.Controller;
import ru.maxon.project.Model.StartModel;
import ru.maxon.project.View.StartFrame;

/**
 * Created by Dracula on 10.01.2017.
 */
public class Starter {
    public static void main(String[] args) {
        Controller frameListener = new Controller();
        StartModel startModel = new StartModel();
        StartFrame startFrame = new StartFrame(frameListener);
        frameListener.setStartModel(startModel);
        startModel.setFrame(startFrame);

        startFrame.setVisible(true);
    }
}
