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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map read(@PathVariable("id") int id) {

        Item item = itemService.read(id);

        Map<String, Object> res = new HashMap<>();
        res.put("data", item);
        return res;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Map createItem(@RequestBody Item item) {
        int number = itemService.create(item);

        Map<String, Object> res = new HashMap<>();
        res.put("data", number);
        return res;
    }
}
