package com.itemmanager;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMapper {
    @Select("SELECT id, name FROM item")
    List<Item> readAll();
}
