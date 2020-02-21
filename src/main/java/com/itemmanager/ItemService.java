package com.itemmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemMapper itemMapper;

    public List<Item> readItems() {
        return itemMapper.readItems();
    }

    public String readItemName(int id) {
        return itemMapper.readItemName(id);
    }

    public int createItem(String name) {
        return itemMapper.createItem(name);
    }

}
