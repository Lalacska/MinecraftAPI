package com.example.minecraftapi.Service;

import com.example.minecraftapi.Model.Item;
import com.example.minecraftapi.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//The Service interacts with the Repository for data access, and returns data or results to the Controller.
@Service
public class ItemService {

    // Injecting the ItemRepository into the service using Spring's @Autowired annotation.
    @Autowired
    ItemRepository itemRepository;

    // Method to retrieve all items from the database.
    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(item -> items.add(item));
        return items;
    }

    // Method to retrieve a specific item by its ID from the database.
    public Item getItemById(int id){
        return itemRepository.findById(id).get();
    }

    // Method to create a new item in the database.
    public void createItem(Item item){
        itemRepository.save(item);
    }

    // Method to delete a item by id in the database.
    public void deleteItemById(int id){
        itemRepository.deleteById(id);
    }

    // Method to update an existing item in the database.
    public void updateById(Item item){
        boolean exist = itemRepository.existsById(item.getId());
        if(exist){
            itemRepository.save(item);
        }
    }
}
