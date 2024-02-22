package com.example.minecraftapi.Controller;

import com.example.minecraftapi.Model.Item;
import com.example.minecraftapi.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/minecraft")
public class ItemController {

    @Autowired
    ItemService itemService;


    // Get all items
    @GetMapping
    public List<Item> getAllItems(){
        // Call the service to retrieve all items from the database
        return itemService.getAllItems();
    }

    // Get item by id
    @GetMapping("/{id}")
    Item getItemById(@PathVariable int id){
        return itemService.getItemById(id);
    }

    // Create a new item
    @PostMapping
    void createItem(@RequestBody Item item){
        itemService.createItem(item);
    }

    // Update an existing item
    @PutMapping
    void updateItemById(@RequestBody Item updItem){
        itemService.updateById(updItem);
    }

    // Delete an item by ID
    @DeleteMapping("/{id}")
    void deleteItemById(@PathVariable int id){
        itemService.deleteItemById(id);
    }

}
