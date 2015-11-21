package com.example.noamrom.todolist;

import java.util.List;

/**
 * Created by Noam Rom on 20/11/2015.
 */
public class TaskController implements ITaskController {


    private IDataAccess dao;

    public TaskController() {
        this.dao = new MockDAO();
    }

    @Override
    public List<TaskItem> getTasks() {
        return dao.GetTasks();
    }


}
