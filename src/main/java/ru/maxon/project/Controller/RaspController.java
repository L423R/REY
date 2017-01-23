package ru.maxon.project.Controller;

import ru.maxon.project.Model.slovModels.DiscModel;
import ru.maxon.project.Util.Queries;

import java.util.ArrayList;

/**
 * Created by Maxon on 19.01.2017.
 */
public class RaspController {

    private DiscModel discModel;

    public <T> ArrayList<T> getArray(Class<T> clazz)
    {
        if (clazz.isInstance(DiscModel.class))
        {
            return (ArrayList<T>) Queries.getDiscArray();
        }
        return null;
    }
}
