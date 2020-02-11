package com.itemmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemMapper itemMapper;

    public List<Item> readAll() {
        return itemMapper.readAll();
    }

}
