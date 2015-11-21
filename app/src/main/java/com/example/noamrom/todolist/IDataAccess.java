package com.example.noamrom.todolist;

import java.util.List;

/**
 * Created by Noam Rom on 20/11/2015.
 */
public interface IDataAccess {
    List<TaskItem> GetTasks();
}
