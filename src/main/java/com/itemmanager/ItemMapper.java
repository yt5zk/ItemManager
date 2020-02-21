package com.itemmanager;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMapper {

    List<Item> readItems();

    String readItemName(@Param("id") int id);

    int createItem(@Param("name") String name);
}
