package ru.maxon.project;

import ru.maxon.project.Controller.StartFrameListener;
import ru.maxon.project.Model.Model;
import ru.maxon.project.View.StartFrame;

/**
 * Created by Dracula on 10.01.2017.
 */
public class Starter {
    public static void main(String[] args) {
        StartFrameListener frameListener = new StartFrameListener();
        Model model = new Model();
        StartFrame startFrame = new StartFrame(frameListener);
        frameListener.setModel(model);
        model.setFrame(startFrame);

        startFrame.setVisible(true);
    }
}
