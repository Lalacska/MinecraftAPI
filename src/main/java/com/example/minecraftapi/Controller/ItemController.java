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


    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    Item getItemById(@PathVariable int id){
        return itemService.getItemById(id);
    }

    @PostMapping
    void createItem(@RequestBody Item item){
        itemService.createItem(item);
    }

    @PutMapping
    void updateItemById(@RequestBody Item updItem){
        itemService.updateById(updItem);
    }

    @DeleteMapping("/{id}")
    void deleteItemById(@PathVariable int id){
        itemService.deleteItemById(id);
    }

}
