package com.example.minecraftapi.Service;

import com.example.minecraftapi.Model.Item;
import com.example.minecraftapi.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(item -> items.add(item));
        return items;
    }

    public Item getItemById(int id){
        return itemRepository.findById(id).get();
    }

    public void createItem(Item item){
        itemRepository.save(item);
    }

    public void deleteItemById(int id){
        itemRepository.deleteById(id);
    }

    public void updateById(Item item){
        boolean exist = itemRepository.existsById(item.getId());
        if(exist){
            itemRepository.save(item);
        }
    }
}
