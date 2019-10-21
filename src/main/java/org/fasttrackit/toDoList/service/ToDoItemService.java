package org.fasttrackit.toDoList.service;

import org.fasttrackit.toDoList.domain.ToDoItem;
import org.fasttrackit.toDoList.persistance.ToDoItemRepository;
import org.fasttrackit.toDoList.transfer.CreateToDoItemRequest;
import org.fasttrackit.toDoList.transfer.UpdateToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {
    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    public void createToDoItem(CreateToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating to-do-item: "+ request);
        toDoItemRepository.createToDoItem(request);
    }
    public void updateToDoItem(long id, UpdateToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Updating to-do-item: "+ request);
        toDoItemRepository.updateToDoItem(id, request.isDone());
    }
    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting item: "+id);
        toDoItemRepository.deleteToDoItem(id);
    }
     public List<ToDoItem> getToDoItems() throws SQLException, IOException, ClassNotFoundException {
         System.out.println("Retrieving to-do-item...");
         return toDoItemRepository.getToDoItems();
     }
}
