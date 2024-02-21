package com.example.minecraftapi.Repository;

import com.example.minecraftapi.Model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
