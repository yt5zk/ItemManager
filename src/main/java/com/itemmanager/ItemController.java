package com.itemmanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("item")
public class ItemController {
    @RequestMapping(method = RequestMethod.GET)
    public Map getItem() {
        List<Item> items = new ArrayList<>();
        Item item = new Item();
        item.setId(1);
        item.setName("Backpack");
        items.add(item);

        Map<String, Object> res = new HashMap<>();
        res.put("response", items);
        return res;
    }
}
