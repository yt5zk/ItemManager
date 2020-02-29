package com.itemmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    ItemService itemService;

    // Create
    @PostMapping("")
    public Map create(@RequestBody Item item) {
        int number = itemService.create(item);

        Map<String, Object> res = new HashMap<>();
        res.put("data", number);
        return res;
    }
    // Update
    @PutMapping("")
    public Map update(@RequestBody Item item) {
        int number = itemService.update(item);

        Map<String, Object> res = new HashMap<>();
        res.put("data", number);
        return res;
    }
    // Read
    @GetMapping("/{id}")
    public Map read(@PathVariable("id") int id) {

        Item item = itemService.read(id);

        Map<String, Object> res = new HashMap<>();
        res.put("data", item);
        return res;
    }
    // Delete
    @DeleteMapping("/{id}")
    public Map delete(@PathVariable("id") int id) {
        int number = itemService.delete(id);

        Map<String, Object> res = new HashMap<>();
        res.put("data", number);
        return res;
    }

}
