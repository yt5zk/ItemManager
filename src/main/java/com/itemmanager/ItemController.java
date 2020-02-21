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

    @RequestMapping(method = RequestMethod.GET)
    public Map readItems() {

        List<Item> items = itemService.readItems();

        Map<String, Object> res = new HashMap<>();
        res.put("data", items);
        return res;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map readItemName(@PathVariable("id") int id) {

        String name = itemService.readItemName(id);

        Map<String, Object> res = new HashMap<>();
        res.put("data", name);
        return res;
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.POST)
    public Map createItem(@PathVariable("name") String name) {
        int number = itemService.createItem(name);

        Map<String, Object> res = new HashMap<>();
        res.put("data", number);
        return res;
    }
}
