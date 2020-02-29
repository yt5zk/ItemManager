package com.itemmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemMapper itemMapper;

    public int create(Item item) {
        return itemMapper.create(item);
    }
    public int update(Item item) {
        return itemMapper.update(item);
    }
    public Item read(int id) {
        return itemMapper.read(id);
    }
    public int delete(int id) {
        return itemMapper.delete(id);
    }
}
