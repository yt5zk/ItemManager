package com.itemmanager;

import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    ItemService itemService;

    @RequestMapping(method = RequestMethod.GET)
    public Map getItem() {

        List<Item> items = itemService.readAll();

        Map<String, Object> res = new HashMap<>();
        res.put("response", items);
        return res;
    }
}
