package com.example.apitask.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.apitask.model.Item;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long currentId = 1L;

    // Add item
    public Item addItem(Item item) {
        item.setId(currentId++);
        items.add(item);
        return item;
    }

    // Get item by ID
    public Item getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    //Get all items
    public List<Item> getAllItems() {
    return items;
}

}
